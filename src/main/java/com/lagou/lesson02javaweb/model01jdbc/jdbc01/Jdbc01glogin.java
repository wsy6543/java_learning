package com.lagou.lesson02javaweb.model01jdbc.jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Jdbc01glogin {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //1.注册驱动 (可以省略)
        Class.forName("com.mysql.jdbc.Driver");

        //2.获取连接 connection连接对象
        String url = "jdbc:mysql://127.0.0.1:3376/db";
        Connection con = DriverManager.getConnection(url, "root", "123456");

        //打印 连接对象 com.mysql.jdbc.JDBC4Connection@7c729a55
        System.out.println(con);

        // 3获取执行平台
        Statement st = con.createStatement();

        String sql = "create table test(id int, name varchar(128), age int)";
        int i  = st.executeUpdate(sql);
        System.out.println(i);

        // 4 关闭连接
        st.close();
        con.close();


    }
}
