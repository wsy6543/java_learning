package com.lagou.lesson02javaweb.model01jdbc.jdbc01;

import java.sql.*;

public class Jdbc02Exe {
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

        String sql = "select * from jdbc_user";
        ResultSet res  = st.executeQuery(sql);


        while (res.next()){
            int id = res.getInt("id");
            String username = res.getString("username");
            String pwd = res.getString("password");
            String birthday = res.getString("birthday");
            System.out.println(id + " " + pwd + " " + username + " " + birthday + "" );
        }
        System.out.println(res);

        // 4 关闭连接
        st.close();
        con.close();
    }
}
