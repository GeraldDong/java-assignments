# Intro

本目录包含的是简化之后的初始代码，以降低作业难度。相比CS106A原来的初始代码，主要的改动有：

1. `NameSurferDatabase`的构造函数参数不再是文件，而是字符串数组，即老师将文件逐行读取进入一个数组，直接提供给学生。目的是跳过有关文件的知识。
2. `NameSurfer.java`中的`redraw`函数已经基本写好，帮助学生建立结构化的思维。
3. 相应的，写了很多函数signature和注释。
4. 另外，可以考虑加多一个捕捉textfield按回车键事件的实例代码。