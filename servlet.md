# Servlet
- [What is servlet?](#what-is-servlet)
- [What is difference between parameters and attributes?](#what-is-difference-between-parameters-and-attributes)
- [What is the life cycle of servlet?](#what-is-the-life-cycle-of-servlet)
- [What is the servlet mapping?](#what-is-the-servlet-mapping)

## What is servlet?
A servlet is simply a class which responds to a particular type of network request - most commonly an HTTP request. Basically servlets are usually used to implement web applications - but there are also various frameworks which operate on top of servlets (e.g. Struts) to give a higher-level abstraction than the "here's an HTTP request, write to this HTTP response" level which servlets provide.

Servlets run in a servlet container which handles the networking side (e.g. parsing an HTTP request, connection handling etc). One of the best-known open source servlet containers is Tomcat.
###### Relative links:
https://stackoverflow.com/questions/7213541/what-is-java-servlet

## What is difference between parameters and attributes?
+ ***getParameter()*** returns http request parameters. Those passed from the client to the server. For example http://example.com/servlet?parameter=1. Can only return String
+ ***getAttribute()*** is for server-side usage only - you fill the request with attributes that you can use within the same request. For example - you set an attribute in a servlet, and read it from a JSP. Can be used for any object, not just string.
###### Relative links:
+ https://stackoverflow.com/questions/5243754/difference-between-getattribute-and-getparameter

## What is the life cycle of servlet?
There are three life cycle methods of a Servlet:
+ init()
+ service()
+ destroy()
###### Relative links:
+ https://www.geeksforgeeks.org/life-cycle-of-a-servlet/

## What is the servlet mapping?
Servlet mapping specifies the web container of which java servlet should be invoked for a url given by client. It maps url patterns to servlets. When there is a request from a client, servlet container decides to which application it should forward to. Then context path of url is matched for mapping servlets.
###### Relative links:
+ https://javapapers.com/servlet/what-is-servlet-mapping/

[Home Page](README.md)
