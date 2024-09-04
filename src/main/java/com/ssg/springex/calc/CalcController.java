package com.ssg.springex.calc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="calcController", urlPatterns="/calc/makeResult")
public class CalcController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1"); // 파라미터 이름 대입
        String num2 = req.getParameter("num2"); // 파라미터 이름 대입

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);
        resp.sendRedirect("/index");
    }
}
