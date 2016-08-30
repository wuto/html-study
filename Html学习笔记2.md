## Html学习笔记2



---

01.HTML简介

    HTML(Hyper Text Mark-up Language超文本标记语言)，标记就是用来描述网页内容的一些特定符号，HTML不是编程语言，而是一种描述性的标记语言，用于描述网页中内容的显示方式，比如文字以什么颜色、大小来显示，这些都是利用HTML标记来实现的.
    HTML文档的创建方式: 用HTML语言创建的文档
    ·手工直接编写(例如记事本)
    ·通过图形化的HTML开发软件Dreamweaver
    ·由Web服务器上的动态网页程序生成
    标记也称为标签或元素.

02.HTML语法

    HTML最基本的语法是: <标记符>内容</标记符>
    标记符通常都是成对出现的，有一个开头标记和结束标记，结束标记只是在开头标记的前面加一个斜杠"/"，当浏览器打开html文件后，就会理解里面的标记符，然后把标记符对应的功能表达出来。例如:
    <hr width="80%" /)
    <font size="7">文字内容</font>

    制作一个html网页文件:
    ·新建一个记事本的文件，命名为 *.html
    ·在文件里面输入内容
 
    HTML标记的类型: 单标记与双标记
    ·单标记: <标记名称>
      ·单一型，无属性值: 如: <br />
      ·单一型，有属性值: 如: <hr width="80%" />
    ·双标记
      ·无属性值: <标记名称>...</标记名称> 如: <title>...</title>
      ·有属性值: <标记名称 属性="属性值">...</标记名称> 如: <font size"7">...</font>

    说明:
    ·标记与属性、属性之间以空格分隔
    ·属性不区分先后顺序，且属性不是必需的.
    ·虽然在HTML中标记不区分大小写，但在XHTML中所有标记都必须小写，所以建议所有标记都采用小写.

03.HTML文档结构

    所有的网页文件，通常由四对标记来构成文档的骨架:
    <html>
       <head>
          <title>
             标题
          <title>
       </head>
       <body>
          正文
       </body>
    </html>
    说明:
    ·<html>...</html> 标识网页文件的开始与结束，所有的html元素都要放在这对标记中.
    ·<head>...</head> 标识网页文件的头部信息，如标题、搜索引擎关键字等.
    ·<title>...</title> 标识网页文件的标题
    ·<body>...</body> 标识网页文件的主体部分

04.注释:

    注释格式: <!--注释内容-->

05.头部(head)标记

    meta标记用于定义文件信息，对网页文件进行说明，便于搜索引擎查找。放置于<head></head>之间.
    ·设置关键字: <meta name="keywords" content="value"> 多个关键字内容之间可以用","分隔.
    ·设置描述:   <meta name="description" content="value">
    ·设置作者:   <meta name="author" content="作者名">
    ·设置字符集:       <meta http-equiv="content-type" content="text/html;charset=gb2312">
    ·设置页面定时跳转: <meta http-equiv="refresh" content="2;URL=http://www.sohu.com" />

06.主体(body)标记

    <body bgcolor="背景颜色"
          background="背景图象"
          text="文本颜色"
          link="链接文本颜色"
          leftmargin="左边界"
          rightmargin="右边界"
          topmargin="上边界"
          bottommargin="下边界">
     </body>
    ·在HTML4.01中，所有body元素的"呈现属性"均不被赞成使用。
    ·在XHTML1.0 Strict DTD中，所有body元素的"呈现属性"均不被支持。

07.字符格式

    功能            标记
    加粗            <b>文本</b>
    倾斜            <i>文本</i>
    加强语气(加粗)  <strong>文本</strong>
    加强语气(倾斜)  <em>文本</em>
    下划线          <u>文本</u>
    删除线          <s>文本</s>
    上标            <sup>文本</sup>
    下标            <sub>文本</sub>
    说明
    ·如果标记的内容比较重要，可以在语义上加权
    ·文章网页的主题推荐使用<h1>...</h1>
    ·网页的段落文字推荐使用<p>...</p>

08.段落控制标记

    <hx align="对齐方式">...</hx>
    段落标题说明:
    ·x取值[1-6]
    ·hx内的文本会自动加粗显示
    ·hx针对的对象是段落，而font针对的对象是任意文本.

09.换行

    <br />: 换行(换行不换段)

10.修饰标记

    <hr />: 线条
    属性名称 属性值    说明
    size     像素      绝对设置，以数字表示，属性值越大，线越粗
             百分比    相对设置，以%表示，属性值越大，线越粗
    width    像素      绝对设置，长度不会应视窗的改变而改变
             百分比    相对设置，长度会应视窗的改变而改变
    noshade="noshade"  实体线

    在xhtml中，所有的标签都必须要用属性值，如果没有，使用属性名。
    例如: <hr noshade="noshade" />
  
11.特殊标记
    定义一个块引用: 使用文本缩进
    格式: <blockquote>...</blockquote>
    属性名称 属性值  说明
    cite     url     被引用的地址

    居中标记<center>...</center> (已废弃)

    预格式化<pre>...<pre> 不加此标记会忽略所有空格和制表符。
    常用在表示源代码.

12.XML的特殊符号(转义符号)

    空格      &nbsp;
    版权号    &copy;
    注册符号  &reg;
    "         &quot;
    &         &amp;
    <         &lt;
    >         &gt;

13.列表的标记

    列表标记可以创建一般的无序列表，编号列表，以及定义列表三种方式，还可以在一种列表中嵌套另一种列表。便于概括显示一系列相关的内容。
    利用列表可以做排行榜.
    (1)无序列表 <ul>...</ul>
      <ul type="项目符号类型">
         <li type="项目符号类型">内容1</li>
         <li>内容2</li>
         ...
      </ul>
      说明:
      <li></li>表示一个项目.
      项目符号类型:
      disc   ●
      circle ○
      square ■

    (2)有序列表 <ol>...</ol>
      <ol start="列表起点" type="项目符号类型">
         <li type="项目符号类型">内容1</li>
         <li>内容2</li>
         ...
      </ol>
      说明:
      type  1 表示以1,2,3,4来表示
            a 表示以a,b,c,d来表示
            A 表示以A,B,C,D来表示
            i 表示以i,ii,iii来表示
            I 表示以I,II,III来表示

    (3)定义列表 <dl>...</dl>
      <dl>
         <dt>标题1</dt>
            <dd>内容1</dd>
            <dd>内容2</dd>
         <dt>标题2</dt>
            <dd>内容1</dd>
            <dd>内容2</dd>
         ...
      </dl>

14.图片

    图片标记: <img src="图片的路径" />
    图片的路径:
    ·绝对路径: 提供目标文档的完整主机名称、路径信息及文档全称.
    ·相对路径: 从当前文档开始的路径.
    ·如果当前文档和目标文档位置平行，则直接书写目标文档全称.
    ·如果当前文档和目标文档所在文件夹位置平行，则书写为: 文件夹名称/目标文档全称.
    ·如果当前文档所在的文件夹和目标文档位置平行，则书写为: ../目标文档全称.
    ·根相对路径: 从站点根目录开始的路径，以"/"开头.
    图片标记属性
    属性   属性值       说明
    src    URL          图片的路径
    alt    文本         规定图片的替代文本[图片无法显示时]
    title  文本         鼠标悬停时显示的内容
    width  像素/百分比  设置图片宽
    height 像素/百分比  设置图片高
    border 数字         设置图片边框
    align  left         图片靠左，文字靠右
           right        图片靠右，文字靠左
           top          文字垂直居上靠
           middle       文字垂直居中
           bottom       文字垂直居下(默认)
    vspace 像素         定义图象顶部和底部的空白(垂直边距)
    hspace 像素         定义图象左侧和右侧的空白(水平边距)

15.表格

    因为表格中可以包含任何内容，所以在使用DIV+CSS之前，网页设计师是使用表格对网页内容进行排版与布局的.
    表格标记基本结构:
    <table>...</table>  定义表格
    <tr>...</tr>  定义表行
    <td>...</td>  定义表列(单元格)
    <th>...</th>  定义标题栏(文字加粗，居中)
    表格属性:
    <table bgcolor="">            设置表格的背景色
    <table background="">         设置表格的背景图片
    <table border="">             设置边框的宽度，若不设置此属性，则边框宽度默认为0.
    <table cellpadding="">        设置表格单元格边框与其内部内容之间空间的大小，默认为2(表格边距)
    <table cellspacing="">        设置表格单元格之间空间的大小，默认为2(单元格间距)
    <table bordercolor="">        设置表格边框的颜色
    <table bordercolorlight="">   设置表格边框亮部分的颜色(当border的值大于等于1时才有用).
    <table bordercolordark="">    设置表格边框暗部分的颜色(当border的值大于等于1时才有用).
    <table align="">              设置表格的对齐方式(left=左，center=居中，right=右).
    <table width="">              设置表格的宽度，单位用绝对像素值或总宽度的百分比.
    <td width="">                 设置单元格的宽度
    <td height="">                设置单元格的高度
    <td bgcolor="">               设置单元格的背景颜色
    <td background="">            设置单元格的背景图片
    <td align="">                 设置单元格的水平对齐方式
    <td valign="">                设置单元格的垂直对齐方式
    <td rowspan="">               设置行合并的数目
    <td colspan="">               设置列合并的数目
    <td nowarp="nowarp">          设置在单元格中不换行
    表格标签下的边框设置
    属性名称   属性值     说明
    frame      void       不要显示表格的边线
               above      只显示出表格的上边线
               below      只显示出表格的下边线
               hsides     只显示出表格的上下边线
               vsides     只显示出表格的左右边线
               lhs        只显示出表格的左边线
               rhs        只显示出表格的右边线
               border/box 显示出表格的所有线
    rules      rows       只显示出横行的格框线
               cols       只显示出直行的格框线
               all        显示全部格框线
               groups     表示列组合水平部分
               none       不显示任何格框线
    表格的结构化
    <table>
       <thead>...</thead>   ---- 表头区
       <tbody>...</tbody>   ---- 表体区
       ...
       <tfoot>...</tfoot>   ---- 表尾区
    </table>
    直列化格式(设置列单元格格式)
    <colgroup>...</colgroup>
    属性名称    属性值    说明
    align       left      靠左
                center    靠中
                right     靠右
    valign      top       靠上
                middle    靠中
                bottom    靠下
    span        数字      直列数
    bgcolor     颜色      背景颜色
    个别直列设置
    <col>功能完全和<colgroup>一样

16.超级链接

    一个网站是由多个网页组成的，网页之间都是通过链接实现相互关联的.通过链接实现由当前文档到目标文档的一种跳转.
    链接语法: <a href=链接目标 title="注释" target="打开链接窗口的形式">显示内容</a>
    打开链接窗口的形式:
    ·_blank在新窗口中打开
    ·_self在自身窗口中打开(默认值)
    ·_parent在上一级窗口中打开，框架会经常使用
    ·_top在浏览器的整个窗口中打开，忽略任何框架
    链接重要的使用原则，不许是回路，有去有回，优化，加相关链接
    链接分类:
    ·站内链接: <a href=目标文档位置及全称>
    ·站外链接: <a href=URL>
    ·E-mail链接: <a href="mailto:电子邮件地址">
    ·局部链接(锚点链接): 可以跳转到某个页面或其他文档中的指定位置.
       ·创建锚点: <a name="锚点名称">显示内容</a>
       ·链接锚点: <a href="#锚点名称">显示内容</a>
    ·空链接: <a href="#">显示内容</a>
      设为首页:
      <a href="#"
         onClick="this.style.behavior='url(#default#homepage)';
         this.sethomepage('http://www.sohu.com')">设为首页</a>
      添加收藏:
      <a href="#"
         onClick="javascript:window.external.addfavorite('http://www.sohu.com','搜狐')">加入收藏夹</a>
    ·脚本链接:
      是一种特殊的链接，当单击设置脚本链接的文本或图像时，可以运行相应的JavaScript.
      常用的脚本链接:
      <a href="javascript:window.open('http://www.163.com')">网易</a>
      关闭窗口: 输入javascript:window.close()
      打开窗口: 输入javascript:window.open('文件名')

17.表单

    表单的作用是从访问您的web站点的用户那里获得信息.访问者可以使用诸如文本域、列表框、复选框以及单选按钮之类的表单元素输入信息，然后单击某个按钮提交这些信息.是客户端与服务器交流信息的途径.
    表单标记
    form标记用于创建一个表单，定义表单的开始与结束，它是一个容器，用于包含其他表单元素，例如文本框、单选框等，表单元素必须入在form标记内才有作用.
    <form action=url(传送目标，处理表单信息的服务器端应用程序) method=处理表单数据的方法(POST/GET), name=表单名称>
       表单元素
    </form>
    属性method的值说明
    ·POST方法可以传递大量信息
    ·GET方法将附加到请求该页的URL中，适合传递少量信息(默认方式)
    ·如果没有设置method属性，默认处理表单数据的方法是GET.
    说明:
    ·所有的表单元素，都必须要放置在表单标签中<form></form>
    ·所有的表单元素，以input为例，必须包含type属性与name属性
    ·有些表单元素的属性是相似的.
    ·还有一些非input元素作为表单元素.
    常用表单元素标记
    单行文本框:
    <input name="文本框名称"
           type="text"
           value="初始值"
           size="显示字符数"
           maxlength="最多容纳字符数"
           readonly="readonly"(设置为只读)
           disabled="disabled"(设置为不可用) />
    密码框:
    <input name="文本框名称"
           type="password"
           value="初始值"
           size="显示字符数" />
    单选框:
    <input name="单选框名称"
           type="radio"
           value="提交值"
           checked="checked"(是否被选中) />
    复选框:
    <input name="复选框名称"
           type="checkbox"
           value="提交值"
           checked="checked"(是否被选中) />
    标签(标记)元素<label>:
    <label>标签(标记)内容</label>
    ·标签为input元素定义标签(标记)，<label>标签的for属性应当与相关元素的id属性相同:
    ·例: <input type="radio" name="sex" value="man" checked="checked" id="man" />
          <label for="man">男</label>
    列表框:
    (1)下拉菜单式
       <select name="列表框名称">
          <option value="提交值" selected="selected"(初始选择)>列表1</option>
          <option value="提交值">列表2</option>
          ...
       </select>
       分组: <optgroup label="分组名称"></optgroup>
       <select name="列表框名称">
          optgroup label="分组名称">
             <option value="提交值" selected="selected"(初始选择)>列表1</option>
             <option value="提交值">列表2</option>
             ...
          </optgroup>
       </select>
    (2)多行列表式
       <select name="列表框名称" size="显示的行数" multiple="multiple"(多选)>
          <opton value="提交值" selected="selected">列表1</option>
          <opton value="提交值">列表2</option>
          ...
       </select>

    浏览框
    <input name="名称" type="file" size="显示长度" />

    按钮:
    <input name="按钮名称" type="按钮类型" value="按钮显示文本" />
    ·按钮类型: submit(提交按钮)
                reset(重置按钮)
                button(普通按钮)
    图片按钮:
    <input name=""图片按钮名称 type="image" src="图片路径" />

    隐藏域:
    <input name="名称" type="hidden" value="提交值" />

    多行文本框:
    <textarea name="多行文本框名称" rows="显示的行数" cols="显示的列数" />

    表单外框:
    <fieldset>...</fieldset>: 定义围绕表单中元素的边框,用在<form>标签里面
    <legend>...</legend>: legend元素为fieldset元素定义标题.

18.多媒体.

    FLASH动画的两种方式插入方式:
    (1)使用<embed>...</embed>标记插入FLASH动画:
       <embed src="URL"
              width="宽度(像素/百分比)"
              height="高度(像素/百分比)"
              wmode="transparent"(背景透明)>
       ...
       </embed>
    (2)通过网页工具dreamweaver自动生成代码<object>

    网络流媒体视频的插入:
    <embed src="URL"
           allowFullScreen="true"
           quality="high"
           width="480"
           height="400"
           align="middle"
           allowScriptAccess="always"
           type="application/x-shockwave-flash"
    </embed>
    企业视频推广思想
    (1)上传到所有可以上传的视频网站.
    (2)在自己的企业网站中加入分享代码.

19.滚动字幕

    <marquee>滚动字幕</marquee>
    direction="滚动方向" left(左) right(右) up(上) down(下)
    behavior="滚动方向" scroll(循环滚动) slide(只滚动一次) alternate(来回滚动)
    loop="滚动的循环次数" 若未指定则循环滚动(loop="infinite")
    bgcolor="背景颜色"
    width="宽度"
    height="高度"
    onmouseover="this.stop()"
    onmouseout="this.start()"
    scrollamount="滚动速度"  数值越大速度越快
    scrolldelay="延时" (走走停停)

20.框架

    写框架(frameset)时不需要写body标记
    框架标记:
    <frameset rows="控制行数及行高"
              cols="控制列数及行宽"
              framespacing="框架间距"
              frameborder="是否显示框架边框(yes,no/1,0)"
              border="边框宽度"
              bordercolor="边框颜色">
       <frame src="被包含的文件路径及名称"
              name="框架名称"
              noresize="是否允许改变框架尺寸(true/false)"
              scrolling="滚动条显示控制(yes/no/auto)" />
    </frameset>
    框架做作流程(以左右框架为例)
    ·先做主框架文件main.html
    ·再分别制作包含文件left.html与right.html
    ·通过框架技术，将left与right包含到主框架文件main.html中，主框架文件不需要写body标记
      对每个被包含的框架指定名称:
      <frameset cols="240,*" border="100" bordercolor="blue">
         <from scr="left.html" name="left">
         <from scr="right.html" name="right">
      </frameset>
    ·如果还需要其他文件，须制作其他文件，例read.html,write.html.
    ·在被包含的框架文件中指定链接，用target属性指定要在哪个框架中打开.
      <a href="write.html" target="right">写信</a>
      <a href="read.html" target="right">写信</a>
    框架的链接操作
    ·标记<a>有一个属性target，默认是在自身窗口打开目标URL.
    ·如果链接指向的目标是一个框架中的区域，必须要给这个区域起个名称

    内嵌式框架:
    <iframe src="内嵌网页(例movie.html)"
            width="宽度(400)"
            height="高度(300)"
            frameborder="是否显示边框(0/1)"
            scrolling="滚动条的出现方式(yes,no,auto)"
            name="框架名称">
    </iframe>

21.XHTML

    XHTML(The Extensible HyperText Markup Language，可扩展标记语言)
    XHTLM是HTML向XML过渡的一个桥梁，XHTML是基于HTML的，这是更严密、代码更整洁的HTML版本.
    HTML发展:
    1999 HTML4.01
    2000 XHTML1.0
    2008 HTML5
    XHTML1.0与HTML的区别:
    ·XHTML标签必须被正确地嵌套
    ·XHTML标签必须被关闭
    ·XHTML标签名必须用小写字母
    ·XHTML属性名必须小写，必须有值，值必须加引号

22.DOCTYPE

    DOCTYPE(Document Type,文档类型)，主要用来说明你用的XHTML或者HTML是什么版本.浏览器根据你DOCTYPE定义的DTD(文档类型定义)来结实页面代码，并展现出来。所以，要建立符合标准的网页，DOCTYPE声明是必不可少的关键组成部分.
    XHTML提供的三中文档类型定义:
    (1)过渡的(Transitional): 要求非常宽松的DTD，它允许你继续使用HTML4.01的标识(但是要符合xhtml的写法).
       <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
       "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
    (2)严格的(Strict): 要求非常严格的DTD，你不能使用任何表现层的表识和属性，例如<br>.需要使用层叠样式表css.
       <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
       "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
    (3)框架的(Frameset): 专门针对框架页面设计使用的DTD，如果你的页面中包含有框架，需要采用这种DTD.
       <!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN"
       "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">



