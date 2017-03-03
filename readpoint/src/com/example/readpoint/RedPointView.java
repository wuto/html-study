package com.example.readpoint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class RedPointView extends FrameLayout {

	private PointF mStartPoint, mCurPoint;
	private Paint mPaint;
	private Path mPath;
	private boolean mTouch;
	private TextView mTipTextView;

	private float DEFAULT_RADIUS = 20;
	private float mRadius = DEFAULT_RADIUS;

	private ImageView exploredImageView;

	public RedPointView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public RedPointView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public RedPointView(Context context) {
		super(context);
		init();
	}

	private void init() {
		mStartPoint = new PointF(100, 100);
		mCurPoint = new PointF();

		mPaint = new Paint();
		mPaint.setColor(Color.RED);
		mPaint.setStyle(Paint.Style.FILL);

		mPath = new Path();

		LayoutParams params = new LayoutParams(
				ViewGroup.LayoutParams.WRAP_CONTENT,
				ViewGroup.LayoutParams.WRAP_CONTENT);
		mTipTextView = new TextView(getContext());
		mTipTextView.setLayoutParams(params);
		mTipTextView.setPadding(10, 10, 10, 10);
		mTipTextView.setBackgroundResource(R.drawable.tv_bg);
		mTipTextView.setTextColor(Color.WHITE);
		mTipTextView.setText("99+");

		exploredImageView = new ImageView(getContext());
		exploredImageView.setLayoutParams(params);
		exploredImageView.setImageResource(R.drawable.tip_anim);
		exploredImageView.setVisibility(View.INVISIBLE);

		addView(mTipTextView);
		addView(exploredImageView);

	}
	
	@Override
	protected void dispatchDraw(Canvas canvas) {

		canvas.saveLayer(new RectF(0, 0, getWidth(), getHeight()), mPaint,
				Canvas.ALL_SAVE_FLAG);

			if (!mTouch||isAnimStart) {
				
				mTipTextView.setX(mStartPoint.x - mTipTextView.getWidth() / 2);
				mTipTextView.setY(mStartPoint.y - mTipTextView.getHeight() / 2);
	
			} else {
			calculatePath();
			canvas.drawCircle(mStartPoint.x, mStartPoint.y, mRadius, mPaint);

			canvas.drawCircle(mCurPoint.x, mCurPoint.y, mRadius, mPaint);
			canvas.drawPath(mPath, mPaint);

			mTipTextView.setX(mCurPoint.x - mTipTextView.getWidth() / 2);
			mTipTextView.setY(mCurPoint.y - mTipTextView.getHeight() / 2);
		}

		canvas.restore();
		super.dispatchDraw(canvas);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN: {
			Rect rect = new Rect();

			int[] location = new int[2];
			mTipTextView.getLocationOnScreen(location);
			rect.left = location[0];
			rect.top = location[1];
			rect.right = mTipTextView.getWidth() + location[0];
			rect.bottom = mTipTextView.getHeight() + location[1];

			if (rect.contains((int) event.getRawX(), (int) event.getRawY())) {

				mTouch = true;
			}

		}
			break;
		case MotionEvent.ACTION_UP: {
			mTouch = false;
		}
		}
		mCurPoint.set(event.getX(), event.getY());
		postInvalidate();
		return true;
	}

	private boolean isAnimStart = false;

	private void calculatePath() {

		float x = mCurPoint.x;
		float y = mCurPoint.y;
		float startX = mStartPoint.x;
		float startY = mStartPoint.y;
		// ���ݽǶ�����ı��ε��ĸ���
		float dx = x - startX;
		float dy = y - startY;
		double a = Math.atan(dy / dx);
		float offsetX = (float) (mRadius * Math.sin(a));
		float offsetY = (float) (mRadius * Math.cos(a));

		float distance = (float) Math.sqrt(Math.pow(y - startY, 2)
				+ Math.pow(x - startX, 2));
		mRadius = DEFAULT_RADIUS - distance / 15;
		if (mRadius < 9) {
			isAnimStart = true;
			exploredImageView.setX(mCurPoint.x - mTipTextView.getWidth() / 2);
			exploredImageView.setY(mCurPoint.y - mTipTextView.getHeight() / 2);
			exploredImageView.setVisibility(View.VISIBLE);
			((AnimationDrawable) exploredImageView.getDrawable()).start();

			mTipTextView.setVisibility(View.GONE);
		}

		// ���ݽǶ�����ı��ε��ĸ���
		float x1 = startX + offsetX;
		float y1 = startY - offsetY;

		float x2 = x + offsetX;
		float y2 = y - offsetY;

		float x3 = x - offsetX;
		float y3 = y + offsetY;

		float x4 = startX - offsetX;
		float y4 = startY + offsetY;

		float anchorX = (startX + x) / 2;
		float anchorY = (startY + y) / 2;

		mPath.reset();
		mPath.moveTo(x1, y1);
		mPath.quadTo(anchorX, anchorY, x2, y2);
		mPath.lineTo(x3, y3);
		mPath.quadTo(anchorX, anchorY, x4, y4);
		mPath.lineTo(x1, y1);
	}

}
