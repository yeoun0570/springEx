package com.ssg.springex.jdbcex;

import lombok.Cleanup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TodoDAO {
    String now = null;
    public String getTime() {
        try(Connection connection = ConnectionUtil.INSTANCE.getConnection();
            PreparedStatement pstmt = connection.prepareStatement("select now()");
            ResultSet rs = pstmt.executeQuery();
        ) {
            rs.next();

            now = rs.getString(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return now;
    }

    // lombok을 사용해서 위와 같은 메서드 만들기
    // lombok에 대한 의존도가 높다는 단점이 있다.
    public String getTime2() throws Exception {

        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = connection.prepareStatement("select now()");
        @Cleanup ResultSet rs = pstmt.executeQuery();

        rs.next();

        now = rs.getString(1);
        return now;
    }
}
