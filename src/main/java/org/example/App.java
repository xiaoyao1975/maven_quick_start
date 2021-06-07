package org.example;

import org.apache.commons.fileupload.FileItem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 */
public class App {
    private String userName = "root";
    /**
     * 这里是你最开始刚下载mysql是输入的账号
     */
    private String password = "123456";
    /**
     * 这里是你最开始mysql设置的密码，
     */
    private String url = "jdbc:mysql://localhost:3306/database";
    private Connection connection;

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Hello World!");
        FileItem item;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("驱动加载成功！");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void DataBaseConnection() {
        // TODO Auto-generated constructor stub
        try {
            this.connection =  DriverManager.getConnection(url, userName, password);
            //把上面的三个属性传过来，应该就连接成功了，不成功的话应该就是你的账号密码不正确
            System.out.println("数据库连接成功！");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("连接失败！");
        }
    }
}
