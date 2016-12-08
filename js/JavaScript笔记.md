```javaScript
<button type="button" onclick="alert('Welcome!')">点击这里</button> //事件
document.write("<p>This is a paragraph</p>");//JavaScript：写入 HTML 输出
x=document.getElementById("demo")  //查找元素
x.innerHTML="Hello JavaScript";    //改变内容
x.src="/i/eg_bulboff.gif";			//改变图像
x.style.color="#ff0000";           //改变样式
if isNaN(x) {alert("Not Numeric")};  //验证用户的输入。是否是数字
```


## JavaScript简介
您可以在 HTML 文档中放入不限数量的脚本。
脚本可位于 HTML 的 <body> 或 <head> 部分中，或者同时存在于两个部分中。
通常的做法是把函数放入 <head> 部分中，或者放在页面底部。这样就可以把它们安置到同一处位置，不会干扰页面的内容。

也可以把脚本保存到外部文件中。外部文件通常包含被多个网页使用的代码。
外部 JavaScript 文件的文件扩展名是 .js。
如需使用外部文件，请在 <script> 标签的 "src" 属性中设置该 .js 文件：


请使用 document.write() 仅仅向文档输出写内容。
如果在文档已完成加载后执行 document.write，整个 HTML 页面将被覆盖：




JavaScript 对大小写敏感。
JavaScript 对大小写是敏感的。
当编写 JavaScript 语句时，请留意是否关闭大小写切换键。
函数 getElementById 与 getElementbyID 是不同的。
同样，变量 myVariable 与 MyVariable 也是不同的。



对代码行进行折行
您可以在文本字符串中使用反斜杠对代码行进行换行。下面的例子会正确地显示：
document.write("Hello \
World!");





##JavaScript 变量
与代数一样，JavaScript 变量可用于存放值（比如 x=2）和表达式（比如 z=x+y）。
    变量必须以字母开头
    变量也能以 $ 和 _ 符号开头（不过我们不推荐这么做）
    变量名称对大小写敏感（y 和 Y 是不同的变量）
提示：JavaScript 语句和 JavaScript 变量都对大小写敏感。

您可以在一条语句中声明很多变量。该语句以 var 开头，并使用逗号分隔变量即可：
var name="Gates", age=56, job="CEO";
声明也可横跨多行：
var name="Gates",
age=56,
job="CEO";


Value = undefined
在计算机程序中，经常会声明无值的变量。未使用值来声明的变量，其值实际上是 undefined。
在执行过以下语句后，变量 carname 的值将是 undefined：
var carname;


### 重新声明 JavaScript 变量
如果重新声明 JavaScript 变量，该变量的值不会丢失：
在以下两条语句执行后，变量 carname 的值依然是 "Volvo"：
var carname="Volvo";
var carname;

### JavaScript 拥有动态类型
JavaScript 拥有动态类型。这意味着相同的变量可用作不同的类型

1. JavaScript 字符串
字符串是存储字符（比如 "Bill Gates"）的变量。
字符串可以是引号中的任意文本。您可以使用单引号或双引号
您可以在字符串中使用引号，只要不匹配包围字符串的引号即可

2. JavaScript 数字
JavaScript 只有一种数字类型。数字可以带小数点，也可以不带


3. JavaScript 布尔
布尔（逻辑）只能有两个值：true 或 false。

4. JavaScript 数组
下面的代码创建名为 cars 的数组：
var cars=new Array();
cars[0]="Audi";
cars[1]="BMW";
cars[2]="Volvo";

或者 (condensed array):
var cars=new Array("Audi","BMW","Volvo");
或者 (literal array):
var cars=["Audi","BMW","Volvo"];

### JavaScript 对象
对象由花括号分隔。在括号内部，对象的属性以名称和值对的形式 (name : value) 来定义。属性由逗号分隔：
var person={firstname:"Bill", lastname:"Gates", id:5566};
上面例子中的对象 (person) 有三个属性：firstname、lastname 以及 id。
空格和折行无关紧要。声明可横跨多行：
var person={
firstname : "Bill",
lastname  : "Gates",
id        :  5566
};
对象属性有两种寻址方式：
name=person.lastname;
name=person["lastname"];

Undefined 和 Null
Undefined 这个值表示变量不含有值。
可以通过将变量的值设置为 null 来清空变量。


声明变量类型
当您声明新变量时，可以使用关键词 "new" 来声明其类型：
var carname=new String;
var x=      new Number;
var y=      new Boolean;
var cars=   new Array;
var person= new Object;
JavaScript 变量均为对象。当您声明一个变量时，就创建了一个新的对象。




## JavaScript 对象

JavaScript 中的所有事物都是对象：字符串、数字、数组、日期，等等。
在 JavaScript 中，对象是拥有属性和方法的数据。

### 属性和方法
属性是与对象相关的值。
方法是能够在对象上执行的动作。
JavaScript 中的对象
在 JavaScript 中，对象是数据（变量），拥有属性和方法。
当您像这样声明一个 JavaScript 变量时：
var txt = "Hello";
您实际上已经创建了一个 JavaScript 字符串对象。字符串对象拥有内建的属性 length。对于上面的字符串来说，length 的值是 5。字符串对象同时拥有若干个内建的方法。
属性：
txt.length=5
方法：
txt.indexOf()
txt.replace()
txt.search()
提示：在面向对象的语言中，属性和方法常被称为对象的成员。


### 创建 JavaScript 对象
JavaScript 中的几乎所有事务都是对象：字符串、数字、数组、日期、函数，等等。
你也可以创建自己的对象。
本例创建名为 "person" 的对象，并为其添加了四个属性：
实例
person=new Object();
person.firstname="Bill";
person.lastname="Gates";
person.age=56;
person.eyecolor="blue";
创建新 JavaScript 对象有很多不同的方法，并且您还可以向已存在的对象添加属性和方法。

### 访问对象的方法
您可以通过下面的语法调用方法：
objectName.methodName()




## JavaScript 函数

可以在某事件发生时直接调用函数（比如当用户点击按钮时），并且可由 JavaScript 在任何位置进行调用。
提示：JavaScript 对大小写敏感。关键词 function 必须是小写的，并且必须以与函数名称相同的大小写来调用函数。



### 带有返回值的函数
有时，我们会希望函数将值返回调用它的地方。
通过使用 return 语句就可以实现。	
在使用 return 语句时，函数会停止执行，并返回指定的值
整个 JavaScript 并不会停止执行，仅仅是函数。JavaScript 将继续执行代码，从调用函数的地方。
函数调用将被返回值取代：
var myVar=myFunction();
即使不把它保存为变量，您也可以使用返回值：
document.getElementById("demo").innerHTML=myFunction();
您可以使返回值基于传递到函数中的参数
function myFunction(a,b)
{
return a*b;
}

在您仅仅希望退出函数时 ，也可使用 return 语句。返回值是可选的






### 局部 JavaScript 变量
在 JavaScript 函数内部声明的变量（使用 var）是局部变量，所以只能在函数内部访问它。（该变量的作用域是局部的）。
您可以在不同的函数中使用名称相同的局部变量，因为只有声明过该变量的函数才能识别出该变量。
只要函数运行完毕，本地变量就会被删除。
### 全局 JavaScript 变量
在函数外声明的变量是全局变量，网页上的所有脚本和函数都能访问它。


### JavaScript 变量的生存期
JavaScript 变量的生命期从它们被声明的时间开始。
局部变量会在函数运行以后被删除。
全局变量会在页面关闭后被删除。



### 向未声明的 JavaScript 变量来分配值
如果您把值赋给尚未声明的变量，该变量将被自动作为全局变量声明。
这条语句：
carname="Volvo";
将声明一个全局变量 carname，即使它在函数内执行。


## JavaScript 运算符


### JavaScript 算术运算符
算术运算符用于执行变量与/或值之间的算术运算。
给定 y=5，下面的表格解释了这些算术运算符：
运算符 	描述 	例子 	结果
+ 	加 	x=y+2 	x=7
- 	减 	x=y-2 	x=3
* 	乘 	x=y*2 	x=10
/ 	除 	x=y/2 	x=2.5
% 	求余数 (保留整数) 	x=y%2 	x=1
++ 	累加 	x=++y 	x=6
-- 	递减 	x=--y 	x=4


### JavaScript 赋值运算符
赋值运算符用于给 JavaScript 变量赋值。
给定 x=10 和 y=5，下面的表格解释了赋值运算符：
运算符 	例子 	等价于 	结果
= 	x=y 	  	x=5
+= 	x+=y 	x=x+y 	x=15
-= 	x-=y 	x=x-y 	x=5
*= 	x*=y 	x=x*y 	x=50
/= 	x/=y 	x=x/y 	x=2
%= 	x%=y 	x=x%y 	x=0


如果把数字与字符串相加，结果将成为字符串。

## JavaScript 比较和逻辑运算符

### 比较运算符

比较运算符在逻辑语句中使用，以测定变量或值是否相等。
给定 x=5，下面的表格解释了比较运算符：
运算符 	描述 	例子
== 	等于 	x==8 为 false
=== 	全等（值和类型） 	x===5 为 true；x==="5" 为 false
!= 	不等于 	x!=8 为 true
> 	大于 	x>8 为 false
< 	小于 	x<8 为 true
>= 	大于或等于 	x>=8 为 false
<= 	小于或等于 	x<=8 为 true

如何使用
可以在条件语句中使用比较运算符对值进行比较，然后根据结果来采取行动：
if (age<18) document.write("Too young");



### 逻辑运算符

逻辑运算符用于测定变量或值之间的逻辑。
给定 x=6 以及 y=3，下表解释了逻辑运算符：
运算符 	描述 	例子
&& 	and 	(x < 10 && y > 1) 为 true
|| 	or 	(x==5 || y==5) 为 false
! 	not 	!(x==y) 为 true

### 条件运算符
JavaScript 还包含了基于某些条件对变量进行赋值的条件运算符。
语法
variablename=(condition)?value1:value2 
例子
greeting=(visitor=="PRES")?"Dear President ":"Dear ";
如果变量 visitor 中的值是 "PRES"，则向变量 greeting 赋值 "Dear President "，否则赋值 "Dear"。


## JavaScript If...Else 语句



条件语句用于基于不同的条件来执行不同的动作。
条件语
通常在写代码时，您总是需要为不同的决定来执行不同的动作。您可以在代码中使用条件语句来完成该任务。

在 JavaScript 中，我们可使用以下条件语句：

- **if 语句** - 只有当指定条件为 true 时，使用该语句来执行代码
- **if...else 语句** - 当条件为 true 时执行代码，当条件为 false 时执行其他代码
-  **if...else if....else 语句** - 使用该语句来选择多个代码块之一来执行
-  **switch 语句** - 使用该语句来选择多个代码块之一来执行

## JavaScript Switch 语句


switch 语句用于基于不同的条件来执行不同的动作。
JavaScript Switch 语句

请使用 switch 语句来选择要执行的多个代码块之一。
语法
```javasScript
switch(n)
{
case 1:
  执行代码块 1
  break;
case 2:
  执行代码块 2
  break;
default:
  n 与 case 1 和 case 2 不同时执行的代码
}
```
工作原理：首先设置表达式 n（通常是一个变量）。随后表达式的值会与结构中的每个 case 的值做比较。如果存在匹配，则与该 case 关联的代码块会被执行。请使用 break 来阻止代码自动地向下一个 case 运行。
实例

显示今日的周名称。请注意 Sunday=0, Monday=1, Tuesday=2, 等等：
```javaScript
    var day=new Date().getDay();
    switch (day)
    {
    case 0:
      x="Today it's Sunday";
      break;
    case 1:
      x="Today it's Monday";
      break;
    case 2:
      x="Today it's Tuesday";
      break;
    case 3:
      x="Today it's Wednesday";
      break;
    case 4:
      x="Today it's Thursday";
      break;
    case 5:
      x="Today it's Friday";
      break;
    case 6:
      x="Today it's Saturday";
      break;
    } 
```
efault 关键词

请使用 default 关键词来规定匹配不存在时做的事情

##  JavaScript For 循环



循环可以将代码块执行指定的次数。
JavaScript 循环

如果您希望一遍又一遍地运行相同的代码，并且每次的值都不同，那么使用循环是很方便的。

    for (var i=0;i<cars.length;i++)
    {
        document.write(cars[i] + "<br>");
    }


### 不同类型的循环

JavaScript 支持不同类型的循环：

-   for - 循环代码块一定的次数
-   for/in - 循环遍历对象的属性
-   while - 当指定的条件为 true 时循环指定的代码块
-   do/while - 同样当指定的条件为 true 时循环指定的代码块

##### For 循环

for 循环是您在希望创建循环时常会用到的工具。
下面是 for 循环的语法：
for (语句 1; 语句 2; 语句 3)
  {
  被执行的代码块
  }

语句 1 在循环（代码块）开始前执行
语句 2 定义运行循环（代码块）的条件
语句 3 在循环（代码块）已被执行之后执行
实例
    for (var i=0; i<5; i++)
    {
      x=x + "The number is " + i + "<br>";
    }
从上面的例子中，您可以看到：
Statement 1 在循环开始之前设置变量 (var i=0)。
Statement 2 定义循环运行的条件（i 必须小于 5）。
Statement 3 在每次代码块已被执行后增加一个值 (i++)。

语句 1
通常我们会使用语句 1 初始化循环中所用的变量 (var i=0)。
语句 1 是可选的，也就是说不使用语句 1 也可以。
您可以在语句 1 中初始化任意（或者多个）值：
实例:

    for (var i=0,len=cars.length; i<len; i++)
    {
    document.write(cars[i] + "<br>");
    }

同时您还可以省略语句 1（比如在循环开始前已经设置了值时）：
实例:

    var i=2,len=cars.length;
    for (; i<len; i++)
    {
    document.write(cars[i] + "<br>");
    }

语句 2
通常语句 2 用于评估初始变量的条件。
语句 2 同样是可选的。
如果语句 2 返回 true，则循环再次开始，如果返回 false，则循环将结束。

提示：如果您省略了语句 2，那么必须在循环内提供 break。否则循环就无法停下来。这样有可能令浏览器崩溃。请在本教程稍后的章节阅读有关 break 的内容。

语句 3
通常语句 3 会增加初始变量的值。
语句 3 也是可选的。
语句 3 有多种用法。增量可以是负数 (i--)，或者更大 (i=i+15)。
语句 3 也可以省略（比如当循环内部有相应的代码时）：
实例:

    var i=0,len=cars.length;
    for (; i<len; )
    {
    document.write(cars[i] + "<br>");
    i++;
    }

##### For/In 循环
JavaScript for/in 语句循环遍历对象的属性：
实例
var person={fname:"John",lname:"Doe",age:25};
    
    for (x in person)
    {
       txt=txt + person[x];
    }

您将在有关 JavaScript 对象的章节学到更多有关 for / in 循环的知识。
##### While 循环
我们将在下一章为您讲解 while 循环和 do/while 循环。



## JavaScript While 循环



只要指定条件为 true，循环就可以一直执行代码。
### while 循环

While 循环会在指定条件为真时循环执行代码块。
语法

    while (条件)
      {
      需要执行的代码
      }

实例

本例中的循环将继续运行，只要变量 i 小于 5：

    while (i<5)
      {
      x=x + "The number is " + i + "<br>";
      i++;
      }
**提示：如果您忘记增加条件中所用变量的值，该循环永远不会结束。该可能导致浏览器崩溃**

### do/while 循环

do/while 循环是 while 循环的变体。该循环会执行一次代码块，在检查条件是否为真之前，然后如果条件为真的话，就会重复这个循环。
语法

    do
      {
      需要执行的代码
      }
    while (条件);

实例

下面的例子使用 do/while 循环。该循环至少会执行一次，即使条件是 false，隐藏代码块会在条件被测试前执行：

    do
      {
      x=x + "The number is " + i + "<br>";
      i++;
      }
    while (i<5);

别忘记增加条件中所用变量的值，否则循环永远不会结束！
### 比较 for 和 while

如果您已经阅读了前面那一章关于 for 循环的内容，您会发现 while 循环与 for 循环很像。
for 语句实例
本例中的循环使用 for 循环来显示 cars 数组中的所有值：
    
    cars=["BMW","Volvo","Saab","Ford"];
    var i=0;
    for (;cars[i];)
    {
    document.write(cars[i] + "<br>");
    i++;
    }

while 语句实例

本例中的循环使用使用 while 循环来显示 cars 数组中的所有值：

    cars=["BMW","Volvo","Saab","Ford"];
    var i=0;
    while (cars[i])
    {
    document.write(cars[i] + "<br>");
    i++;
    }

## JavaScript Break 和 Continue 语句

break 语句用于跳出循环。
continue 用于跳过循环中的一个迭代。
### Break 语句

我们已经在本教程稍早的章节中见到过 break 语句。它用于跳出 switch() 语句。

break 语句可用于跳出循环。

break 语句跳出循环后，会继续执行该循环之后的代码（如果有的话）：
实例

    for (i=0;i<10;i++)
      {
      if (i==3)
        {
        break;
        }
      x=x + "The number is " + i + "<br>";
      }
由于这个 if 语句只有一行代码，所以可以省略花括号：

    for (i=0;i<10;i++)
      {
      if (i==3) break;
      x=x + "The number is " + i + "<br>";
      }
### Continue 语句

continue 语句中断循环中的迭代，如果出现了指定的条件，然后继续循环中的下一个迭代。

该例子跳过了值 3：
实例

    for (i=0;i<=10;i++)
     {
     if (i==3) continue;
      x=x + "The number is " + i + "<br>";
      }
### JavaScript 标签

正如您在 switch 语句那一章中看到的，可以对 JavaScript 语句进行标记。

如需标记 JavaScript 语句，请在语句之前加上冒号：
label:
语句

break 和 continue 语句仅仅是能够跳出代码块的语句。
语法

break labelname;

continue labelname;

continue 语句（带有或不带标签引用）只能用在循环中。
break 语句（不带标签引用），只能用在循环或 switch 中。

通过标签引用，break 语句可用于跳出任何 JavaScript 代码块：
实例

    cars=["BMW","Volvo","Saab","Ford"];
    list:
    {
    document.write(cars[0] + "<br>");
    document.write(cars[1] + "<br>");
    document.write(cars[2] + "<br>");
    break list;
    document.write(cars[3] + "<br>");
    document.write(cars[4] + "<br>");
    document.write(cars[5] + "<br>");
    }

## JavaScript 错误 - Throw、Try 和 Catch



try 语句测试代码块的错误。

catch 语句处理错误。

throw 语句创建自定义错误。
### 错误一定会发生

当 JavaScript 引擎执行 JavaScript 代码时，会发生各种错误：

可能是语法错误，通常是程序员造成的编码错误或错别字。

可能是拼写错误或语言中缺少的功能（可能由于浏览器差异）。

可能是由于来自服务器或用户的错误输出而导致的错误。

当然，也可能是由于许多其他不可预知的因素。
### JavaScript 抛出错误

当错误发生时，当事情出问题时，JavaScript 引擎通常会停止，并生成一个错误消息。

描述这种情况的技术术语是：JavaScript 将抛出一个错误。
JavaScript 测试和捕捉

try 语句允许我们定义在执行时进行错误测试的代码块。

catch 语句允许我们定义当 try 代码块发生错误时，所执行的代码块。

JavaScript 语句 try 和 catch 是成对出现的。
语法

    try
      {
      //在这里运行代码
      }
    catch(err)
      {
      //在这里处理错误
      }

实例

在下面的例子中，我们故意在 try 块的代码中写了一个错字。

catch 块会捕捉到 try 块中的错误，并执行代码来处理它。


```html
<!DOCTYPE html>
<html>
<head>
<script>
var txt="";
function message()
{
try
  {
  adddlert("Welcome guest!");
  }
catch(err)
  {
  txt="There was an error on this page.\n\n";
  txt+="Error description: " + err.message + "\n\n";
  txt+="Click OK to continue.\n\n";
  alert(txt);
  }
}
</script>
</head>

<body>
<input type="button" value="View message" onclick="message()">
</body>

</html>
```
亲自试一试
Throw 语句

throw 语句允许我们创建自定义错误。

正确的技术术语是：创建或抛出异常（exception）。

如果把 throw 与 try 和 catch 一起使用，那么您能够控制程序流，并生成自定义的错误消息。
语法

throw exception

异常可以是 JavaScript 字符串、数字、逻辑值或对象。
实例

本例检测输入变量的值。如果值是错误的，会抛出一个异常（错误）。catch 会捕捉到这个错误，并显示一段自定义的错误消息：
```javaScript 
<script>
function myFunction()
{
try
  {
  var x=document.getElementById("demo").value;
  if(x=="")    throw "empty";
  if(isNaN(x)) throw "not a number";
  if(x>10)     throw "too high";
  if(x<5)      throw "too low";
  }
catch(err)
  {
  var y=document.getElementById("mess");
  y.innerHTML="Error: " + err + ".";
  }
}
</script>

<h1>My First JavaScript</h1>
<p>Please input a number between 5 and 10:</p>
<input id="demo" type="text">
<button type="button" onclick="myFunction()">Test Input</button>
<p id="mess"></p>
```
请注意，如果 getElementById 函数出错，上面的例子也会抛出一个错误。


