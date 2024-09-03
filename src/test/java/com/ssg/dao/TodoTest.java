package com.ssg.dao;

import com.ssg.springex.jdbcex.TodoDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodoTest {
    private TodoDAO todoDAO;

    @BeforeEach //ready()를 통해서 모든 테스트 전에 TodoDAO 타입의 객체를 생성
    public void ready() {
        todoDAO = new TodoDAO();
    }
    @Test
    public void testTime() throws Exception{
        System.out.println(todoDAO.getTime());
        System.out.println(todoDAO.getTime2());
    }


}
