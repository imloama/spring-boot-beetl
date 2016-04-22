# spring-boot-beetl

模仿spring boot starter
主要是将默认的WebAppResourceLoader修改成了ClasspathResourceLoader，同时提供部分参数配置

可以参考spring-boot-beetl-sample项目

参数如下：

beetl.root指的是template保存在哪个目录中，默认为tempates文件夹
beetl.charset 编码
beetl.prefix 前缀
beetl.suffix 后缀

