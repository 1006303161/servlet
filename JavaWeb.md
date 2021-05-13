# JavaWeb

Java web

## 1、基本概念

### 1.1 前言：

	-  web,网页的意思 www.baiodu.com
 -  静态web
    	-  html,css
        	-  提供给所有人看的数据始终不会发生变化！
 -  动态web
    	-  提供给所有人看的数据始终会发生变化！ 每个人在不同的时间，看到的信息名各不相同！
        	-  淘宝等几乎所有的网站
        	-  技术栈：Servlet，ASP，PHP

在java中，动态web资源开发的技术统称为javaweb

## 1.2 javaweb应用程序

​	wen应用程序：可以提供浏览器访问的程序

- a.html、b.htm 这些外部资源可以被外界访问
- 你们能访问到的任何一个页面或者资源，都存在这个世界某个角落的计算机上
- URL
- 这些统一的web资源会被放在同一个文件夹下，web应用程序——>tomcat：服务器

### 1.3 静态web

### 1.4 动态web

## 2. web服务器

ASP

JSP PHP

## 3. Tomcat

### 3.1 安装tomcat

### 3.2 Tomcat的启动和配置

### 3.3 配置

常用端口

	- mysql：3306
	- http:80
	- https:443

  ```xml
 <Connector port="8080" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />
  ```

可以配置的主机名称

- 默认主机名称为： localhost->127.0.0.1
- 默认网站应用存放位置：webapps

```xml
    <Host name="www.ljf.com"  appBase="webapps"
            unpackWARs="true" autoDeploy="true">
```

#### 高难度面试题

 请你谈谈网站是如何访问的！

1. 输入一个域名：回车

2. 检查本机的C:\Windows\System32\drivers\etc\hosts 文件有没有这个域名映射。

   1. 有：直接返回对应的ip地址，这个地址中，有我们需要访问的web程序，可以直接访问

      ![image-20210512103251368](JavaWeb.assets/image-20210512103251368.png)

   2. 没有：去DNS服务器找

![image-20210512103813474](JavaWeb.assets/image-20210512103813474.png)

### 3.4 网站应有的结构

```java
--webapps: Tomcat服务器web目录
	-ROOT
	-kuangstudy: 网站的目录名
        - WEB-INF
        	-classes: java程序
                -lib 网站所依赖的jar包
        	-web.xml 网站的配置文件
        - index.html
        - static 
             -css 
                -style.css
             -js
             -img
```

## 4.HTTP

### 4.1 什么是HTTP

http(超文本传输协议) 是一个简单的请求、相应协议，它运行在TCP之上

文本：html、字符串

超文本：图片、音乐、视频等

http:

- 80

https: 安全

- 443

4.2 两个时代

 - http1.0
   	- 客户端与web建立连接后，只能获得一个web资源，断开连接

- http2.0
  - 客户端与web服务器建立连接后，可以获得多个web资源

### 4.3 HTTP请求

- 客户端---发请求(Request)---服务器

百度：

```java
Request URL: https://www.baidu.com/
Request Method: GET
Status Code: 200 OK
Remote Address: 180.101.49.11:443
Referrer Policy: strict-origin-when-cross-origin
```

- ***请求行***

1. - 请求方式主要掌握get、post
      - get请求能够携带的参数少。会有大小限制，会在浏览器的URL地址显示数据内容，不安全，但高效
      - post求能够携带的参数没有限制。大小没有限制，不会在浏览器的URL地址显示数据内容，安全，但不高效
   
2. ***消息头***

   ```
   
   accept: 告诉浏览器，它支持的数据格式
   accept-encoding: 支持哪种形式的编码 GBK UTF-8 GB2312 ISO8859-1r
   accept-language: 告诉浏览器，她的语言环境
   cache-control: 缓存控制
   connection: 告诉浏览器，请求是断开还是保持连接
   host 主机
   ```

   

### 4.4响应

- 服务器---相应---客户端

  百度：

```java
Cache-Control: private   缓存控制
Connection: keep-alive	 链接
Content-Encoding: gzip
Content-Type: text/html;charset=utf-8path=/; domain=.baidu.com
```

1. ##### 响应体

```
accept: 告诉浏览器，它支持的数据格式
accept-encoding: 支持哪种形式的编码 GBK UTF-8 GB2312 ISO8859-1r
accept-language: 告诉浏览器，她的语言环境
cache-control: 缓存控制
connection: 告诉浏览器，请求是断开还是保持连接
host 主机
Reflush: 告诉客户端，多久刷新一次
Location：让网页重新定位
```

**2. 相应状态码**

200： 请求相应成功

3××：请求重定向

	*  请求重定向 ：你重新找我给你的新的位置去

4××：找不到资源

- 资源不存在

5××：服务器代码错误 500 502:网关错误



常见面试题：

当你的浏览器地址栏输入地址并回车的一瞬间到页面能够展示出来，经历了什么？

## 5.Maven



- 有约束，不要去违反，约定大于配置



## 6.Servlet

### 6.1、Servlet简介

- Servlet就是sun公开发动态web的一门技术
- sun在这些API中提供了一个接口叫做：Servlet，如果你想开发一个Servlet程序，只需要完成两个小步骤：
  - 编写一个类，实现Servlet接口
  - 把开发好的Java类部署到Web服务器中

**把实现了Sertvlet接口的Java程序叫做，Servlet**

### 6.2 HelloServlet

Servlet接口Sun公司有两个默认的实现类：HttpServlet

1. 构建一个普通的项目，删掉里面的src目录，以后我们的学习就在这个项目里面建立model；这个空的工程就是Maven的主工程

2. Maven父子工程的理解

   1. 父项目会有一个Model

      ```xml
        <modules>
              <module>Servlet-01</module>
          </modules>
      ```

   2. 子项目会有Parent

      ```xml
          <parent>
              <artifactId>SevletTest</artifactId>
              <groupId>org.example</groupId>
              <version>1.0-SNAPSHOT</version>
          </parent>
      
      ```

      父项目中的jar包子项目可以直接使用

3. Maven环境优化
   1. 修改web.xml为最新
   2. 将maven结构搭建完整

4. 编写一个Servlet程序

   1. 编写一个普通类
   2. 实现Servlet接口，这里我们直接继承HttpServlet

   3. 代码

   ```java
   
       //犹豫get和post只是请求实现的不同方式，所以可以互相调用，业务逻辑都一样
   
       @Override
       protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   //        ServletOutputStream outputStream = resp.getOutputStream();有输入就有输出
           PrintWriter writer = resp.getWriter();//响应流
   
           super.doGet(req, resp);
       }
   
       @Override
       protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           super.doPost(req, resp);
       }
   ```

5. 编写Servlet的映射

   1. 为什么需要映射：我们写的是JAVA程序，但是要通过浏览器访问，而浏览器访问需要连接web服务器，所以我们需要在web服务中注册我们写的Servlet，还需要给他一个浏览器能够访问的路径。

   ```xml
   <?xml version="1.0" encoding="UTF-8"?>
   <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
            version="4.0"
            metadata-complete="true">
   
   <!--  注册Servlet -->
     <servlet>
       <servlet-name>hello</servlet-name>
       <servlet-class>com.ljf.servlet.HelloServlet</servlet-class>
     </servlet>
   <!--  Servlet请求路径-->
     <servlet-mapping>
       <servlet-name>hello</servlet-name>
       <url-pattern>/hello</url-pattern>
     </servlet-mapping>
   </web-app>
   ```

6. 配置tomcat

​	注意配置项目发布的路径

7. 