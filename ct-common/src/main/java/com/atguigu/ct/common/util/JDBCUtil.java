package com.atguigu.ct.common.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {

    private static final String MYSQL_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String MYSQL_URL = "jdbc:mysql://hadoop001:3306/ct180808?useUnicode=true&characterEncoding=UTF-8";
    private static final String MYSQL_USERNAME = "hduser";
    private static final String MYSQL_PASSWORD = "Zhubaobao0411!";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(MYSQL_DRIVER_CLASS);
            conn = DriverManager.getConnection(MYSQL_URL, MYSQL_USERNAME, MYSQL_PASSWORD);
        } catch ( Exception e ) {
            e.printStackTrace();
        }

        return conn;

    }
}
