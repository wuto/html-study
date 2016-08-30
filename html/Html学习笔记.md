## Html学习笔记

`Html` `笔记`

---

### 1、html：超文本标记语言，标记：就是用来描述网页内容的一些特定符号，不是编程语言，而是一种描述性的标记语言。

### 2、制作html网页文件

     a、新建一个记事本文件，将他重命名 *.html

     b、在里面输入网页的信息内容

     c、在要修饰的内容的两侧加html标记

### 3、html标记的语法：标记分为两种：单标记、双标记

1. <标记符>没有结束的标记---单标记

        <标记名称>单一型，无属性值，如<br/>
        <标记名称 属性=“属性值”>单一型，有属性值，如<hr width="50%">

2. <开始标记> <结束标记> ---双标记

        <标记名称>  </ 标记名称>没有属性值，如<title>  </title>
        <标记名称 属性=“属性值”>  </ 标记名称>有属性值 <body bgcolor="red">  </body>

        注意：源代码中的效果，并不是浏览器最终的效果。

### 4、标记与属性、属性之间以空格分隔，属性不区分先后顺序，且属性不是必须的。

### 5、在xhtml中，规定，所有html标记都要小写，所有标记都要有关闭

     html---xhtml

     <br>---<br />

### 6、html文档结构

     所有的网页文件，通常由四对标记来构成，文档的骨架：

     <html>   标识网页文件的开始与结束，所有的html元素都要放在这对标记中

          <head>  标识网页文件的头部信息，如标题、（用于）搜索引擎的关键字等 

               <title>  标识网页文件的标题

                     标题

               </title>

          </head>

          <body>  标识网页文件的主题部分

                 正文

          </body>

     </html>

### 7、meta标记用于定义文件信息，对网页文件进行说明，便于搜索引擎查找。放置<head> </head>之间设置关键字：

     <meta name="keywords" content="value">多个关键字内容之间可以用“，”分隔

     设置描述：<meta name="description" content="value">

     设置作者：<meta name="author" content="作者名">

     设置字符集：<meta http-equiv="content-type" content="text/html;charset=gb2312>

     设置页面定时跳转：<meta http-equiv="refresh" content="2";URL=http://blog.csdn.net/hanbo622">

### 8、注释

     <!--注释内容-->

### 9、body属性

     <body bgcolor="背景颜色" background="背景图像" text="文本颜色" link="链接文本颜色" vlink="访问过的文本颜色"

 alink="激活的链接文本颜色" leftmargin="左边界" rightmargin="右边界" topmargin="上边界" bottommargin="下边界">

### 10、其实html元素、html标记、html标签都是一回事

### 11、默认情况下网页内容与浏览器边框之间有距离，有某些html元素有默认值

### 12、网页文件名，在本地可以用汉字（练习.html）将来网页文件都是保存在服务器上的，一般都用英文。

### 13、<font>标记

     <font color="文本颜色" size="字号" face="字体">文本</font>

     网页中的字体、字号一般通过CSS修饰
     
|     |    |       |        |
|:-------:| :----: |:------:  |
| 白色    | white  | \#FFFFFF | 
| 红色    | red    | \#FF0000 |
| 蓝色    | blue   | \#0000FF
| 黑色    | black  |  \#000000
| 绿色    | green  |  \#00FF00
| 灰色    | gray   |  \#999999
    

### 14、字符格式
|       |       |         |
|:-----:| :---: |
|加粗   | `<b>`文本 `</b>`|
|
| 倾斜  |  `<i>`文本`</i>`  |
|
|加强语气（加粗）|`<strong>`文本`</strong>`|
|
| 加强语气（倾斜）|`<em>`文本`</em>`|
|
| 下划线  |`<u>`文本`</u>`|
|
| 删除线 | `<s>`文本`</s>`|
|
| 上标   |`<sup>`文本`</sup>`|
|
| 下标  | `<sub>`文本`</sub>`|

15、在写html代码时：

     先写我们的控制内容的标记，例如：这内容比较重要，可以在语义上加权<strong> 关键字</strong>，这部分内容是文章网页

的主题建议使用<h1>文章标题</h>

16、网页段落文字内容----<p></p>

17、段落标记

     <p align="对齐方式"></p>

         left         左对齐（默认）

         center    居中

         right       右对齐

18、html标记之间嵌套使用，一层套一层不会出现错误，但是不能交叉嵌套

19、网页优化核心：用适合的html标记去描述网页内容

20、段落标题

     <hx align="对齐方式"> </hx>

     段落标题说明：

          x取值[1~6] hx内的文本会自动加粗显示。

          hx针对的对象是段落，而font针对的对象的任意文本

21、<br>换行（换行不换段）

22、记住写代码或者效果的演变过程

23、html中，所有的标签都必须有属性值，如果没有使用属性名。

     例如：<hr  noshade="noshade" />----xhtml

               <hr  noshade>----html

24、<hr>水平直线

     size      像素绝对设置，以数字表示，属性值越大，线越粗

                 百分比相对设置，以%表示，属性值越大，线越粗

     width    像素绝对设置，长度不会应视窗的改变而改变

                 百分比相对设置，长度会随着应视窗宽度而改变

     noshade="noshade"  实体线

25、定义一个块引用：使用文本缩进

     <blockquote> </blockquote> 说明

     cite    url    被引用的地址

26、居中标记<center>内容</center>（被废弃的标签）

27、预格式化<pre></pre> 被包围在pre元素中的文本通常保留空格和换行符，而文本也会呈现为等宽字体，一个常见应用就是用

来表示计算机的源代码。

28、特殊字符 

     空格           &nbsp

     版本号          &copy

     注册商标        &reg

      "             &quot

     &               &amp

     <               &lt

     >               &gt

29、在文本中的第一个字前直接敲空格不起作用，两个字之间敲多少空格只显示一个空格。

30、列表标记用途

     列表标记可以创建一般的无序列表、编号列表，以及定义列表三种方式，还可以在一种列表中嵌套另一种列表，便于概括显示

一系列相关的内容。

     a、无序列表<ul></ul>

           <ul type="项目符号类型"> 

                 <li type="项目符号类型">内容1</li>

                 <li>内容2</li>

           </ul>

       <li>表示一个项目；type ：disc 实圈，circle空圈，square实正方形

     b、 有序列表<ol></ol>

            <ol start="列表起点" type="项目符号类型"> 

                 <li type="项目符号类型">内容1</li>

                 <li>内容2</li>

           </ol>

     c、定义列表<dl></dl>

          <dl>

               <dt>标题1</dt>  表示一个项目

                     <dd>内容1</dd>  表示一个项目下的更详细内容的解释

                     <dd>内容2</dd>

              <dt>标题1</dt>

                     <dd>内容1</dd>

                    <dd>内容2</dd>

          </dl> 


31、Web上支持的图片格式 

      GIF（图形交换格式）：GIF格式文件最多只能保存256中颜色，该格式支持透明色，支持动画效果。

      JPEG（联合图像专家组）：该格式不支持透明色及动画，颜色可达1670万种。

      PNG（网络可移植格式）：该格式支持透明色，不支持订花，颜色从几万种至1670万种。

32、图片标记：<img src="图片路径">

      图片路径：

             a、绝对路径：提供目标文档的完整主机名称、路径信息、及文档全称

             b、相对路径：从当前文档开始的路径

                  如果当前文档和目标文档位置平行，则书写目标文档全称

                  如果当前文档和目标文档所在文件夹位置平行，则书写为文件夹名称/目标文档全称

                  如果当前文档所在文件夹和目标文档位置平行，则书写为 ../目标文档全称

            c、根相对路径：从站点根目录开始的路径，以"/"开头。

      图片标记的属性：

            属性名称        属性             值说明

            src                 URL             图片的路径

            alt                  文本             规定图片的替代文本[图片无法显示时]

            title                文本             鼠标悬停时显示的内容

            width       像素/百分比       设置图片的宽

            height      像素/百分比       设置图片的高

            border           数字             设置图象边框

            align              left                图片靠左，文字靠右

                                  right             图片靠右，文字靠左

                                  top               文字垂直居上靠

                                middle           文字垂直居中

                                bottom           文字垂直居下(默认)

          vspace           像素              定义图像顶部和底部的空白(垂直边距)

          hspace          像素              定义图像左侧和右侧的空白(水平边距)

34、某些html标记，都有默认值

       <h1> ~ <h6>内容是默认加粗

35、网页制作过程

      1）、先分析页面结构，这个页面内容大概分为那些部分

      2）、在适合的html标记中，加入页面的内容（信息）---信息载体---文字、图片

36、传统的网页布局方式-----使用table表格

      其实table表格，原来适用于保存数据的，保存这种有格式清晰的数据。

      布局思想----排版---

          a、从大向小排版

          b、从左向右排版，从上向下----按人视觉

     因为表格中可以包含任何内容，所以在使用DIV+CSS之前，网页设计师是使用表格对网页内容进行排版与布局的

37、表格标记

      <table>  </able> --定义表格

      <tr>  </tr> --定义表行

      <td>  </td> --定义表列（单元格）

      <th>  </th> --定义标题栏（文字加粗，并居中）

      表格的属性:<table>

            属性                                      用途

           <table bgcolor="">                 设置表格的背景色

           <table background="">          设置表格的背景图片

           <table border="">                  设置边框宽度，若不设置此属性，则边框宽度默认为0

           <table cellpadding="">          设置表格单元格与其内部内容之间的大小，默认为2(表格边距)

           <table cellspacing="">           设置表格单元格之间空间大小，默认为2(表格边距)

           <table bordercolor="">          设置表格边框的颜色

           <table bordercolorlight="">    设置边框亮部分颜色(当border的值大于等于1时有效)

           <table bordercolordark="">   设置边框暗部分颜色(当border的值大于等于1时有效)

           <table align=""> 设置部分的对齐方式(left=左,center=居中,right=右)

      <table>标签下的边框设置

            属性名称         属性值         说明

            frame              void            不要显示表格的边线

                                   above        只显示表格的上边线

                                   below        只显示表格的下边线

                                   hsides       只显示表格的上下边线

                                   vsides       只显示表格的左右边线

                                   lhs             只显示表格的左边线

                                   rhs            只显示表格的右边线

                               border/box    会显现出表格的所有边线

           rules               rows           只显示横行的格框线

                                  cols            只显示直行的格框线

                                  all               显示所有格框线

                                 groups         表示列组合水平部分

                                  none           不显示任何格框线

      行的属性：<tr>

             属性                       用途

             <tr width="">         设置行的宽度

             <tr height="">        设置行的高度

             <tr bgcolor="">      设置行的背景颜色

             <tr align="">          设置水平对齐方式

             <tr valign="">        设置垂直对齐方式[top、middle、bottom]

      列(单元格)的属性：<td>
              属性                         用途

            <td width="">            设置单元格的宽度

            <td height="">          设置单元格的高度

            <td bgcolor="">        设置单元格的背景颜色

            <td background=""> 设置单元格的背景图片

            <td align="">            设置单元格的水平对齐方式

      结构化格式：

           <table>

                <thead>  </thead>-------表头区

                <tbody>  </tbody>------表体区

                .............

                <tfoot>  </tfoot>--------表尾区

          </table>

      直列化格式：

          <colgoup>  </colgroup>（<col>功能完全和<colgroup>一样）

               align  ：left          靠左

                            center     靠中

                            right        靠右

              valign：top           靠上

                           middle     靠中

                           bottom    靠下

              span： 数字        直列数

             bgcolor：颜色      背景颜色

      表格的标题

             <table>

                 <caption>  </caption>

             </table>

             align：top         标题在表格上方

                        bottom   标题在表格下方

38、<center>  </center>中所有内容都居中。

39、合并单元格思想，当将多个内容合并时，就会出现多余的东西，合并单元格就是删除多余的td

      例如：有三列 3个td，当合并时，就需要删除2个

      推出一个合并删除td的公式：删除的个数=合并的个数-1

40、立体表格效果，其实就是将表格的亮边框颜色与暗边框颜色，进行对比。表格自身有边框，单元格自身也有边框。

41、细线表格效果公式：

      a、将表格自身border=0,

      b、给表格设置背景颜色=细线的颜色

      c、给表格设置单元格之间距离 = 细线粗细

42、当<td> </td>中间没有内容时，默认不显示边框，如果想看见边框，在之间加&nbsp。

43、可以通过标签嵌套实现一些复杂布局。

44、超级链接：一个网站是由多个网页组成的，网页之间都是通过链接实现互联的。

      链接的概念：实现由当前文档目标文档的一种跳转，链接重要的使用原则，必须是回路，有去有回---优化，相关链接。

      链接语法：

             <a href=链接目标 title="注释" target="打开链接窗口的形式">显示内容</a>

                    _blank在新窗口中打开

                    _self在自身窗口中打开（默认值）

                    _parent在上一级窗口中打开，框架会经常使用

                    _top在浏览器的整个窗口中打开，忽略任何框架

      链接分类：

            a、内部链接：当前文档与目标文档在同一站点内：<a href=目标文档位置及全程>

            b、外部链接：当前文档与目标文档不在同一站内：<a href=URL（网址）>

            c、E-mail链接：允许访问者向指定的地址发送邮件：<a href=mailto:电子邮件地址>    

      链接（锚点）：

            到同一网页或其他文档中的指定位置。

            创建锚点：<a name="#秒点名称">显示内容</a> 

            链接锚点：<a href="#秒点名称">显示内容</a>

      空链接：就是没有目标端点的链接。格式创建锚点：<a href="#">显示内容</a>

           例如：

               设为首页：<a href="#" onClick="this.style.behavior='url(#default#homepage)';this.sethomepage('http://www.sohu.com')">

                                 设为首页</a>

               添加收藏<a href="#" onClick="javascript:window.external.addfavorite('http://www.sohu.com','搜狐')">加入收藏夹</a>

      脚本链接：是一种特殊的链接，当单击设置脚本链接的文本或图像时，可以运行相应的JavaScript语句。

            常用到的脚本链接：

            例如：<a href="javascript:window.open('http://www.163.com')">新浪

                      关闭窗口：输入javascript:window.close()

                      打开窗口：输入javascript:window.open('文件名')
45、布局时，可以先输入一些数字，简单文字说明占位.

46、html表单标记

       表单的作用是从访问您的Web站点的用户那里获得信息。访问者可以使用诸如文本域、列表框、复选框以及单选按钮之类的表

单元素输入信息，然后单击某个按钮提交这些信息。客户端与服务器端进行信息交流的途径。

47、form标记用于创建一个表单，定义表单的开始与结束，它是一个容器，用于包含其他表单元素，例如文本框、单选框等。

表单元素必须入在form标记内才有作用。

      <form action=url（传送目标，处理表单信息的服务器端应用程序） method=处理表单数据的方法（POST/GET）如果不写

method则默认提交方式为get， name=表单名称>表单元素</form>

      POST方法可以传递大量信息

      GET方法将值附加到请求该页的URL中。适合传递少量信息（默认方式）

48、单行文本框

      <input name="文本框名称“ type="text" value="初始值" size="显示字符数" maxlength="最多容纳字符数"

      readonly="readonly"（设置为只读） disabled="disabled"（设置为不可操作）>

49、密码框

      <input name="文本框名称" type="password" value="初始值" size="显示字符数">

50、所有的表单元素都必须要放置在表单标签中<form></form>

       所有的表单元素，以<input>标签为例，必须包含两个属性

      有些表单的属性是相似的。

51、多行文本框

     

      <textarea name="多行文本框名称" cols="每行中的字符数" rows="显示的行数">初始内容</textarea>

52、单选框

     

      <input name="单选框名称" type="radio" value="提交值" checked="checked"（是否被选中）> 

53、复选框

     

      <input name="复选框名称" type="checkbox" value="提交值" checked="checked"（是否被选中）>

54、表单元素标记

      <label>标注内容</label>标签为input元素定义标注（标记）。<label>标签的for属性应当与相关元素的id属性相同

      <label for="man">男</label>

      <input type="radio" name="sex" value="男" id="man" >

55、还有一些非input元素，作为表单元素：列表框

     

      菜单式

      <select name="列表框名称">

            <option selected="selected"（哪个为初始值，就添加selected语句[只有一个] value="提交值"）>列表1</option>

            <option value="提交值">列表2</option>

      </selected>

      分组<optgroup label="分组名"> <optgroup>

56、列表框（列表式）

      <select name="列表框名称" size="显示的行数" multiple（如果允许多选，则有该命令；否则没有此命令）>

            <option value="提交值">列表1</option>

      </select>

      例如：<select name=target size=3 multiple="multiple">

                      <option value=普通朋友>普通朋友</option>

                      <option value=女朋友>女朋友</option>

                </select>

57、浏览框

     

      <input name="名称" type="file" size="显示长度">

      表单外框

            <filedset> </filedset>定义围绕表单中元素的边框

            <legend> </legend>legend元素为filedset元素定义标题

           

58、按钮

      <input type="按钮类型（reset[重置表单]）、submit[提交表单]、button[普通按钮]" name="按钮名称" value="按钮显示文本">

     

      图片按钮

            <input name="图片按钮名称" type="image" src="图片路径"> 

            

      隐藏域

             <input name="名称" type="hidden" value="提交值">

59、某些html标签有默认值，无法自身改变时，可以改变它所在的父标签的属性，从而间接改变它的属性。例如：<filedset>的宽度

60、html文件不仅可以放置普通文字与图片，还可以放置视频与音频多媒体元素。

61、FLASH动画的插入

      使用<embed>  </embed>标记插入FLASH动画

            属性              值                         说明

            src                url                         flash路径

            width            像素/百分比           flash宽度

            height           像素/百分比           flash高度

            wmode         transparent              使flash背景部分透明

      在网页中插入FLASH有两种：

            a、embed标签

            b、通过Dreamweaver自动生成代码<object>

62、flash本身的播放是需要一个插件（播放器）

63、插入背景音乐

       <bgsound src="音乐文件名及路径名" loop="循环次数"> 如：loop=-1表示无限循环

64、插入视频WMV格式

      <embed src="tmcq.wmv">  </embed>

65、滚动字幕

      <marquee>滚动的文字</marquee>

            direction="滚动方向"   left左     right右    up上     down下

            behavior="滚动方式"   scroll 一圈一圈绕着走     slide 只走一次    alternate 来回的走

            loop="滚动的循环次数"   若未指定则循环不止  （loop="infinite"）

            bgcolor="背底颜色"    width="宽度"     height="高度"

            onmouseover="this.stop()"  onmouseout="this.start()"

            scrollamount="速度" 数值越大速度越快

            scrolldelay="延时" 走一走，停一停

67、写框架时不需要写body标记

      <frameset rows="控制行数及行高" cols="控制列数及列宽" framespacing="框架间距" frameborder="是否显示框架边框

       (yes,no/1,0)" border="边框宽度" bordercolor="边框颜色">

              <frame src="被包含的文件路径及名称" name="框架名称" noresize="是否允许改变框架尺寸"(true/false) scrolling="滚动条

                显示控制"(yes/no/auto)>

      </frameset>

68、在网页之中，嵌入网页---内嵌框架----iframe

69、内嵌式框架

      <iframe src="被嵌套的网页位置及全称" width="宽度" height="高度" frameborder="是否显示边框[0/1]" scrolling="滚动条的出现

       方式[yes、no、auto]" name="框架名称"></iframe>

70、什么是XHTML？

      XHTML是The Extensible HyperText Markup Language的缩写，XHTML的中文意思是可扩展标示语言。它是HTML向XML过渡

的一个桥梁，XHTML是基于HTML的更严密、代码更整洁的HTML版本。

      DOCTYPE是document type(文档类型)的简写。主要用来说明你用的XHTML是什么版本。浏览器根据你DOCTYPE定义的DTD

(文档类型定义)来解释页面代码，并展现出来。所以，要建立符合标准的网页，DOCTYPE声明是必不可少的关键部分。

      XHTML1.0提供了三种DTD声明可供选择：

      (1)过渡的(Transitional):要求非常宽松的DTD，它允许你继续使用HTML4.01的表识(但是要符合XHTML的写法)。完整代码如下：

           <!DOCTYPE html PUBLIC"-//W3C//DTD XHTML 1.0 Transitional//EN"

           "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

      (2)严格的(Strict):要求严格的DTD，你不能使用任何表现层的表识和属性，例如<br>。完整代码如下:

          <!DOCTYPE html PUBLIC"-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

      (3)框架的(Frameset):专门针对框架页面设计使用的DTD，如果你的页面中包含有框架，需要采用这种DTD。完整代码如下:

          <!DOCTYPE html PUBLIC"-//W3C//DTD XHTML 1.0 Frameset//EN"

          "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd>

71、<span> </span>标签被用来组织文档中的行内元素。