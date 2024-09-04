package com.ssg.springex.calc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="inputController", urlPatterns="/calc/input")
public class InputController extends HttpServlet {

//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        System.out.println("InputController... doGet ...processing");
//        //내가 어떤 원하는 페이지로 이동할수 있게끔 요청을 전달해주는 클래스
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/calc/input.jsp"); //중간 경유지
//        dispatcher.forward(request,response); // forward : 할당받은 객체(request,response) 주소값을 들고다님
//    }
}
