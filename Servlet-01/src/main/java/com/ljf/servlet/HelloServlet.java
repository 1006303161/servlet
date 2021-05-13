package com.ljf.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 类描述:
 *
 * @author leedt@dareway.com.cn
 * @version 1.0
 * @date 2021/5/13 16:53
 */
public class HelloServlet extends HttpServlet {

    //犹豫get和post只是请求实现的不同方式，所以可以互相调用，业务逻辑都一样

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ServletOutputStream outputStream = resp.getOutputStream();有输入就有输出
        PrintWriter writer = resp.getWriter();//响应流
        System.out.println("进入了doGet方法");
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
