## css学习笔记2

`css` `笔记`

---

### 1、"DIV+CSS"这种叫法其实是一种不准确的叫法，是大家开始在对这种技术理解不透彻的情况下，给这种布局标准页面的方法起的名字，而标准的叫法是什么呢？ XHTML+CSS！

### 2、平时说的W3C其实是World Wide Web Consortium的缩写，中文是W3C组织或者万维网联盟，W3C这个组织是做什么的呢？

简单说，就是出网页标准的，那么由W3C组织推出的标准就被称为W3C标准或Web标准。

### 3、什么是Web标准？

      Web标准不是某一个标准，而是由W3C和其他标准化组织制定的一系列标准的集合，包含我们所熟悉的HTML、XHTML、JavaScript、以及CSS等

### 4、Web标准的目的？

      在于创建一个统一的用于Web表现层的技术标准，以便于通过不同浏览器或终端设备向最终用户展示信息内容。

### 5、采用标准好处：

* 提高页面浏览速度。使用CSS方法，比传统的Web设计方法至少节约50%以上的文件尺寸；

* 缩短改版时间，将表现（样式/外观）与内容（信息/数据）相分离。只要简单的修改几个CSS文件就可以重新设计一个有成千上万页面的站点；

* 降低网站流量的费用，带宽要求降低（代码更简洁），成本降低；

* 更容易被搜寻引擎搜索到，提高网站在百度或Google中的排名。

* 内容能被更广泛的设备所访问，包括屏幕阅读机、手持设备、搜索机器人、打印机、电冰箱等。

### 6、Web标准主要由三部分组成：结构（Structure）、表现（Presentation）和行为（Behavior）。

* 结构标准对应的主要语言是XHTL

* 表现标准对应的主要语言是CSS

* 行为标准对应的主要语言是JavaScript

制作成一个静态页面，主要用到的就是XHTML与CSS，所以制作标准页面的技术就是XHTML+CSS

### 7、web标准的好处之一是"理解表现和内容分离"---那这到底是什么意思呢？

首先必须明白一些基本概念：内容、结构、表现和行为

* 内容：就是制作者放在页面内真正想要让访问者浏览的信息；

* 结构：使内容更加具有逻辑性和易用性[类似于：1级2级标题、正文、列表等把它们称为结构]；

* 表现：用于修饰内容的外观的样式的东西称为表现；

* 行为：对内容的交互及操作效果，如通过JavaScript判断表单提交等。

### 8、网页开发的小工具----火狐浏览器中的firebug（工具—附加组件—搜索firebug—安装）。

### 9、做为Web前段工作要兼容的浏览器：IE/6/7/8/9/，火狐，谷歌，苹果等

### 10、CSS简介

      概念：CSS是Cascading Style Sheets（层叠样式表）的简称。

      CSS可以做为html，xhtml，xml的样式控制语言。

### 11、CSS语法结构

      选择符{属性：值}例如：body{font-size:12px;}

      参数说明：

            a、选择符（selector）：指明这组样式所要针对的对象。可以是一个XHTML标签，如body，h1；也可以是定义了特定的

                 ID或Class的标签，如#main选择符表示选择<div id="main">，即一个被指定了main为id的对象。

            b、属性（proprety）：选择符的样式属性，如颜色、大小、定位、浮动方式等。

            c、值（value）：是指属性的值。

            d、同时可以为一个选择符定义多个属性，每个属性之间用分号";" 分隔。

### 12、网页是否有CSS样式，测试--在浏览器中改变字体大小，看结果。

### 13、CSS定义的技巧

1. 为了将来的CSS代码优化，建议所有属性值后面都要带上分号";"。

1. 某些html标签有自己默认的CSS属性值，例如：h1标签就有自己的属性值，自动加粗显示，字号比较大。

1. 为了兼容主流的浏览器，为了统一效果建议我们在设置时，将所有元素的CSS属性，重置为标准的。

1. 不同的浏览器，有各自不同的CSS属性值---要命的，就是浏览器的兼容。

1. 就有一个比较特殊的字体想用，怎么办？--将其转为图片。分中英文字体。设置字体的顺序。将英文字体设置在前，中文在后。

1. 想让文字在垂直方向上居中，将行高设置为元素高度，行高=元素高度，文字的内容不能超过元素的宽度，也就是不能换行。

1. CSS可以重新设置，xhtml标签默认样式。

### 14、CSS控制字体

|      功能         |      语法         |
| :----------------:|:------------------:|
|    设置字号       |      font-size:12px
|    设置字色       |      color:#00000
|    设置字体       |     font-family:Arial,'宋体'
|    设置行高       |       line-height:150%        line-height:1.5em
|    设置字体的粗细 |     font-weight:normal[正常]bold[粗体]

CSS长度单位

|    相对长度单位  |    说明  |
| :----------------:|:------------------:|
|    em            |    相对于当前对象内文本的字体尺寸
|    px            |      像素(Pixel)推荐使用
|    in            |        英寸
|     cm           |       厘米
|     mm           |       毫米
|     pt           |      点(Point)

CSS颜色单位

|    颜色单位       |     说明          |
| :----------------:|:------------------:|
|    十六进制       |    如：color:#ff0000
|    颜色名称       |     如：color:red
|    三原色单位     |    如：rgb(255,0,)

一般最常用的是十六进制，三原色单位的原理【红 （r），绿（g），蓝（b）】混合而成，每个值域在0—255之间。

### 15、CSS字体使用注意事项，要尽量使用通用宋体，用大家电脑上都有的字体。

### 16、网页中加CSS的方式有4种：

* 内联式样式表：直接写在现有的标记中如：

        <p style="color:red">这里文字是红的</p>

* 嵌入式样式表：使用`<style></style>`标签嵌入到html文件的头部中`<head>`标记内， 如：

            <style type="text/css">

                 <!--body {background:white;color:black;} -->

            </style>

* 外部链接式样式表：将样式表写在一个独立的 .css文件中，然后在页面head区`<head>`标记内用`<link>`标签调用它，主要用于实现表现与结构分离,如：

        <link href="main.css" rel="stylesheet" type="text/css>

* 导入式样式表：导入式样式表与链接式样式表的功能基本相同，只是语法和动作方式略有不同，同样也将导入样式代码写在`<head>`标记内.语法：

        <style type="text/css">

             @import url("basic.css");

        </style>
导入式，会占用html文件空间， 有些浏览器，解析会有问题，浏览器会最后读取@import中内容。将多个样式文件，导入到一个样式文件中。

### 17、将CSS样式写到一个单独的文件中style.css，要使用的网页，只需要调用即可，这才是我们学习xhtml+css的核心，结构与样式分离。

### 18、CSS选择符类型

1. 标签（类型）选择符

            就是针对HTML文档中的标签（哪些html标签应用哪些CSS样式），如：p{font-size:12px;} div{background:blue;}

2. 类型选择符：可以自己定义样式，应用于一个或多个网页元素，类在网页中可以出现多次，用于定义重复的样式。类以英

           文"."开头，后面的名字自己定义，类定义后还需要在网页中加入class-类名称，加以调用。

           如：.warning{属性：值}

                  <p class="waring">   </p>

                 同时给某个元素应用多个类

                  <p class="a1 a2">  </p>

 3. ID选择符：与类基本相似，只是以英文"#"开头，因为ID具有唯一性，所以在网页中只能出现一次，用于定义只出现一次的

          样式。

          如：#main{属性：值}

                 <p id="main">  </p>

                同时给某个元素应用多个类与ID

                 <p class="a1 a2" id="a6">  </p>

               *类名或ID名不要以数字开头。

4. 通配选择符：* {属性值}，用于定义所有html元素，作用范围广泛，但是效率最低。

            *{nargin:0;padding:0}  重置所有元素的外边距与内边距，为零

5. 包含选择符（嵌套/派生）：语法e1  e2 {属性：值}，

           含义是所有被e1包含e2，

           如：table  td {属性：值}   #hearder  li  a {属性：值}

                优点就是不需要在单独为id为hearder的标签内，li 标签内的 a 标签单独定义class或者ID，CSS代码就少了、同样也优化

          了CSS代码。

                如果我们针对，某个元素中电子元素进行控制，可以使用嵌套的方式，不必再为子元素设置id，语法：父元素  子元素

          {属性：值}

6. 选择符分组（集体控制）：将同样的样式定义用于多个选择符，选择符之间用逗号分隔。如：p,div, .waring {属性：值}

7. 标签指定式选择符：如果既想使用id或class，也想同时使用标签选择符

            h1#content{} 白哦是针对所有id为content的h1标签

            h1.p1{} 表示针对所有class为p1的h1标签

8. 组合选择符：将以上选择符进行组合使用

            h1.p1,#content  h1{}

     CSS选择符作用？指定CSS样式所作用对象（范围）。

### 19、我们想针对网页中的，某一个元素或者某一些元素，设置样式---可通过不同的CSS选择符。CSS选择符就是要控制的对象。

### 20、CSS样式的特点

      a、继承

                网页中字元素，将继承父元素的样式（继承某些样式，因为有些子元素本身就有默认值，所以就不用父元素）。

                例如：要控制段落p中的文字大小，可以直接给body标记加样式。

      c、层叠

               网页中子元素定义了与父元素相同的样式，则子元素的样式将覆盖掉父元素的样式。

              后面定义的样式，会覆盖前面蒂尼的样式。
              
              
### 21、CSS样式的优先权：当样式有冲突时，听谁的？

* 四种方式的优先权：内联式[行内样式]--->内嵌式[内部式]--->链接式[外部式]--->@import导入式

            CSS优先权：就近原则

            作用范围越小，优先权越高

            离要修饰目标越近的样式优先权越高。

* 选择符优先权：行内>id>class>标签选择符

            我们可以采用 !important语法来提升重要性[优先权]

            p{
                background-color:#FFCCCC !important;IE6不支持该语句

                background-color:#66CCCC;

              }

### 22、CSS控制字体

|   功能        |    语法   |   
|:-------------:|:---------:|   
|   设置字体样式|   font-style:normal[正常] italic[斜体]
|   修饰文字     |      text-decoration:none[正常] underline[下划线] overline[上划线] line-through[删除线]
|   字符间距    |     letter-spacing:normal[默认] length[长度单位]
|   单词间距     |     word-spacing:normal[默认] length[长度单位]

CSS控制文本

|   功能     |       语法 |   
|:-------------:|:---------:| 
|   设置对象中文本缩进  |    text-indent:2em  可以为负值
|   文本水平对齐方式    |     text-align:left[左] right[右]
|   对象中空白处理     |     white-space:normal[自动换行] pre[换行和空白受保护] nowrap[强制在同一行显示]
|  文本大小写控制     |    text-transform:none[正常大小] capitalize[每个单词的第一个字母转换成大写]uppercase[转换成大写] lowercase[转换成小写]
|  元素的垂直对齐方式  |   vertical-align:sub[设置文字为下标] super[设置文字为上标] top[把元素的顶端与行中最高元素的顶端对齐] text-botton[把元素的底端与父元素字体的底端对齐]

CSS控制链接---CSS伪类

|  状态     |         语法   |  
|:-------------:|:---------:| 
|  未访问的链接    |    a:link{color:#FF0000}
|  已访问的链接   |    a:visited{color:#00FF00}
|  鼠标移动到链接上 |   a:hover{color:#FF00FF}
|   鼠标按下链接   |       a:active{color:#0000FF}

如果鼠标放上效果不起作用，请修改链接状态的顺序 L--V--H--A

自定义链接的CSS

            a.类名称:状态

              CSS伪类用于向某些选择器添加特殊的效果

              语法： 选择符:伪类名称{属性:值}

               例如：

                        a:hover{color:#FF00FF}

                       :focus设置对象在成为输入焦点（该对象的onfocus事件发生）时的样式（IE6/7不支持）

CSS伪类语法：

    元素名称:伪类名称{属性:值}

    例如：超链接的鼠标经过状态

### 23、在应用CSS样式时，一定要注意它的默认值，因为不同的浏览器它的CSS默认值不同。

### 24、CSS选择符命名

规范的命名也是web标准中的重要一项，标准的命名可以使代码更加易读，而且利于搜索引擎搜索，比如定义两个 div ，一个id

命名为“div1”，另外一个命名为“news”，肯定第二个比较容易读，而且搜索引擎抓取率要高，在团队合作中还可以大大提高工作效

率。为了达到这种效果我们就要规范化命名（语义化命名）！

关于CSS命名法，和其他的程序命名差不多，主要有三种：驼峰，帕斯卡，匈牙利法。

* 驼峰命名法：除第一个单词首字母小写外，其余所有单词首字母都大写。例如：#headerBlock, .navMenuRedButton

* 帕斯卡命名法：与驼峰相似，区别就是所有单词首字母都大写。例如：#HeaderBlock, .NavMenuRedButton

* 匈牙利命名法：是需要在名称前面加上一个或多个小写字母作为前缀。例如：#head_navigation, .red_navMenuButton

前两种比较常用，其实CSS命名就一个原则"容易理解，方便协同工作"。

页面模块的常用CSS命名

|    头：header           |        热点：hot
|:-----------------------:|:------------------:|    
|    内容：content      |            新闻：news
|    尾：footer         |           下载：download
|    导航：nav        |             广告：banner
|    侧栏：sidebar     |           页面主题：main
|    栏目：column     |           子导航：subnav
|     左中右：left center right |     子菜单：submenu
|    登录条：loginbar     |       版权：copyright
|    标志：logo       |             友情链接：friendlinks
|    页面外围控制整体布局宽度：wrapper  |       菜单：menu

### 25、CSS盒子模型

![](http://img.blog.csdn.net/20150422094810739?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvaGFuYm82MjI=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)

1. W3C组织建议把所有网页上的对象都放在一个盒子(box)中----盒子模型

2. 设计师可以通过创建定义来控制这个盒子的属性，这些对象包括段落、列表、标题、图片以及层<div>。

3. 盒子模型主要定义四个区域：内容(content)、填充(padding)、边框(boder)和边界(margin)。

    1. 盒子的内容 content

    2. 盒子的边框 border

    3. 盒子的边框与内容之间的距离称为--padding，内边框(内部丁)

    4. 多个盒子存在，盒子与盒子之间的距离称为边界--nargin，外边距(外补丁)

4. 这里的边界我们也称之为：外边距、外补丁；填充也叫：内边距、内部丁

5. 整个盒子模型在页面中所占的宽度是由：左边界+左边框+左填充+内容+右填充+右边框+右边界组成

### 26、CSS盒子的相关属性

      1)、内容属性：内容本身的宽=width，内容本身的高=height

      2)、内填充属性：内容与边界之间的距离 padding

          **在定义盒子的宽度时，要考虑到内填充、边框、边界的存在。如果增加了内填充，整个盒子的宽度值要在减去增加的内填充的值。

CSS控制元素的尺寸

|     功能      |     语法    |     
|:-------------:|:-----------:|
|     设置元素宽度|   width:100px;
|     设置元素告诉    |    height:100px;
|     设置元素某一个方向外边距|  margin-top/right/bottom/left:10px;
|     通知参数个数不同来设置元素的外边距  | margin:10px; 
|                       |   上下左右4个方向
|                       |   margin:10px 20px; 上下  左右
|                       |    margin:10px 20px 30px; 上  左右  下
|                       | margin:10px 20px 30px 40px;上  下  左  右
|     设置元素的内边距    | padding:上  右  下  左

CSS控制边框属性

|     功能      |       语法
|:-------------:|:-----------:|
|    设置边框粗细   |                                             border-top-width:12px;
|    设置边框样式    |                                            border-top-style:solid[实线] dashed[虚线]
|    设置边框颜色   |                                             border-top-color:#00000
|    设置某一边框属性的简捷方式 |                      border-边框位置:线宽 线型 颜色
|    设置某一元素四条边框属性的简捷方式[仅限于四条边框属性完全相同] |          border:线宽 线型 颜色

边框属性说明：

 CSS语法：border:border-width || border-style || border-color

根据语法，推理出它的使用方法：

如果只写border，则后面要跟着的是，三个不同的子属性，第一个  粗细   第二个 样式  第三个  颜色

边框样式：粗细为两个像素   实线  蓝色

            border：2px   solid   blue

            padding：参数简写方式

    如果一个参数时：表示上 右 下 左 四个方向

                                padding:20px;

    如果两个参数时：第一个参数表示上下，第二个表示左右

                                 padding:20px 50px;

    如果三个参数时：第一个参数表示上，第二个表示左右，第三个表示下

                                  padding:20px 30px 50px;

总结：padding参数中，如果没有值，就去对面找

### 27、注意：在使用外边距，要注意浏览器的兼容性。除了只为0的情况下，所有的非零的值后面都要加单位。

       由于各个浏览器存在着，内外边距的默认值，而且还不同。我们需要将所有浏览器的默认内外边距，都从零开始计算。为了提

高效率，用到哪些元素，就把哪些元素的默认值归零。

      CSS属性，虽然有继承的特点，但是并不是所有的属性都有继承。

### 28、关于列表的属性：（存在兼容性问题，一般：list-style:none 不要列表符号）

list-style：list-style-image---列表的图片

                 list-style-postion---列表符号位置

                 list-style-type---列表的样式

### 29、CSS小技巧

a、让盒子，水平居中。将对象的左右边界设置为auto；

b、让盒子中的内容垂直居中，设置行高=盒子的高度，但是不要换行。

### 30、CSS中的元素分类

       我们在布局页面的时候，会将HTML标签（元素）分成两种，块状元素和内联元素（我们平时用到的标签div和p就是块状元素，

链接标签a 就是内联元素），可以通过CSS修改元素的类型。

      a、块状元素：{display:block}

                  一般是其他元素的容器，可容纳内联元素和其他块状元素，块状元素排斥其他元素与其位于同一行，宽度(width)和高度

           (height)起作用。常见块状元素为div、p、body、h1~h6等。（块状元素很霸道：能设宽和高！独占一行！）

      b、内联元素{display:inline}

                内联元素只能容纳文本或者其他内联元素，它允许其他内联元素与其位于同一行，但宽度(width)和高度(height)不起作用。

            常见内联元素为a、em、span等。

            内联元素很温柔：

                   不能设宽和高！

                  不影响换行！

              （就像橡皮筋包住字）

### 31、CSS控制背景

        功能                              语法

        背景                              background:颜色 图片 平铺方式 固定方式 位置

        背景颜色                       background-color:#CCC

        背景图像                       background-image:url(背景图片的位置及全称)

        背景图像的重复方式     background-repeat:[repeat、no-repeat、repeat-x、repeat-y]

        背景图像的位置            background-position:top[left center right]   center[left center right] bottom[left center right]，x坐标 y坐标

                                                                              [第一个值水平位置，第二个值是垂直位置。左上角是0 0。单位是像素(0px 0px)]

        背景图像的依附方式     background-attachment:[scroll、fixed]

      a、背景图片默认情况下是进行水平与垂直方向上的平铺。

      b、默认背景图片在元素的左上角显示

      c、背景图片的依附方式：固定的含义，将突破固定在屏幕（可视区域）的某个位置。兼容性 IE6只有html与body两个元素支持

           这个属性值。

### 32、CSS Sprites（CSS精灵）

      制作翻转按钮效果的两种方法：

      第一种：我们需要两张图片，一张正常状态的图片，一张鼠标经过图片，做这种按钮思路就是，设置链接 a 的背景为第一张图片

                    a:hover 的背景为第二张图片
![](http://img.blog.csdn.net/20150422094730407?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvaGFuYm82MjI=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)
![](http://img.blog.csdn.net/20150422094859068?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvaGFuYm82MjI=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)
                             

      第二种：将上面两张图片合并成一张图片、设置成按钮的背景，然后将 a:hover 的背景向上移动相应的像素即可
![](http://img.blog.csdn.net/20150422094925370?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvaGFuYm82MjI=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/Center)
                   

      CSS精灵技术：主要是为了减少http请求。

### 33、CSS布局方式：

      1）、默认文档流方式

               以默认的html元素的结构顺序显示

      2）、浮动布局方式

               通过设置html元素的float属性显示

      什么是浮动？浮动（float）是CSS实现布局的一种方式，包括div在内的任何元素都可以以浮动的方式进行显示。浮动是将块元

素，霸道属性独占一行的行为取消，允许别人与他一行。浮动其实是这个块从原来的文档流模式中分离出来，它后面的对象，就视

它不存在。兼容性：当IE6父元素中的子元素的高度超过了父元素的高度，IE6 默认会把父元素的高度自动增加。

      值：

          none：不浮动

          left：对象向左浮动，而后面的内容流向对象的右侧

          right：对象向右浮动，而后面的内容流向对象的左侧

     3）、定位布局方式

           通过设置html元素的position属性显示

### 34、常用的布局效果，例如，一行并列式，就是在一行中显示几个块元素。

### 35、ul与li 默认情况下是块元素，要想让他们在一行显示，就要用到浮动。               
              
              
              
### 36、如果想让多个块显示在同一行中，可以将这些块设置成浮动，并且浮动方向相同。

### 37、清除浮动

      当元素有浮动属性时，会对其父元素或者后面的元素产生影响，会出现一个布局错乱现象，可以通过清除浮动的方法来解决，

浮动元素的影响

      浮动的清理(clear)：

          none：默认值。允许两边都可以有浮动对象

          left：不允许左边有浮动对象

          right：不允许右边有浮动对象

          both：左右两侧不允许有浮动对象

### 38、浮动浮动，先浮后动，浮动的对象，会先漂浮起来，离开原来的位置。后动，就是它后面的对象，会向它原来的位置上，动起来。

### 39、当父元素没有指定高度时，并且它的子元素有浮动时，父元素的高度不会自动增加。

### 40、清除浮动的方法

      1）、额外标签法：

            这种方法应该说是最简单的一种了，W3C建议在容器的末尾增加一个"clear:both"的元素，强迫容器适应它的高度以便装下所

       有的float元素。缺点：会增加代码。

             <div id="main">

                  <div id="left">左盒子</div>

                  <div id="right">右盒子</div>

                  <div class="clear"></div>  增加一个空div

            </div>

            <div id="footer">底部</div>

      2）、父元素使用overflow的方法：

           通过设置父元素overflow值设置为hidden，是最简单的清除浮动方法，但如果子元素使用了定位布局，就会很难实现

           *{margin:0padding:0;}

           #main,#footer{margin:0 auto;}

           #main{width:800px;background:#CCC;overflow:hidden;zoom:1;position:relative;}

           #left{width:200px;height:200px;background:blue;position:absolute;left:-100px;top:100px;}

           #right{width:300px;height:300px;background:green;float:right;}

           #footer{width:800px;height:50px;background:red;}

      3）、利用伪对象after方法：

          义一个类，使用伪对象after，控制浮动元素的影响。

          网上最流行的清除浮动代码：

              .clearFix:after{

                     clear:both;

                     display:block;

                     visibility:hidden;

                     height:0;

                     line-height:0;

                     content:"";

               }

            .clearFix{zoom:1;}/*解决IE6/7兼容问题*/

            zoom只有IE内核的浏览器支持，缩放比例

                 功能                                         语法

                 设置或检索对象的缩放比例      normal：默认值。使用对象的实际尺寸

                                                                  number：百分比|无符号浮点实数。浮点实数值为1.0或百分数为100%时相当于此属性

                                                                                 的normal值

                                                                   zoom：1解决IE6高度自适应问题

### 41、CSS中溢出的使用

      功能 ：设置当对象的内容超过其指定高度及宽度时如何管理内容

      语法 ：overflow:visible[默认值。不剪切内容也不添加滚动条]，auto[在必需时内容才会被裁切或显示滚动条]，

                                 hidden[不显示超过对象尺寸的内容]，scroll[总是显示滚动条]

### 42、定位：position

      属性：position

      描述：设置对象的定位方式

      值：static  静态定位：页面中的每一个对象的默认值。

             absolute  绝对定位：将对象从文档流中分离出来，通过设置left，right，top，bottom四个方向相对于父级对象进行绝对定

                            位。如果不存在这样的父对象，则依据body对象。

              relative  相对定位：对象不从文档流中分离，通过设置left，right，top，bottom四个方向相对于自身位置进行相对定位。

      **当使用绝对定位时，必须要有两个条件

              a、必须给父元素加定位属性，一般建议使用 position:relative；

              b、给子元素，加绝对定位position:absolute；同时要加方向属性。

### 43、相对定位与绝对定位区别

       绝对定位是父元素为基准点，进行定位。---会脱离文档流。

       相对定位是根据其自身为基准点。----离开原位置，但还占着原来的空间。

### 44、在IE6中出现双倍边距时（兼容性问题），在该对象上加上display:inline; 变成行内元素可解决该问题。



