package com.shc.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 测试跟数据库建立连接
 * @author shc
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			//加载驱动类
			Class.forName("com.mysql.jdbc.Driver");
			long start = System.currentTimeMillis();
			//建立连接(连接对象内部其实包含了Socket对象，是一个远程的连接。比较耗时！这是Connection对象管理的一个要点！)
			//真正开发中，为了提高效率，都会使用连接池来管理连接对象！
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testShao","root","");
			long end = System.currentTimeMillis();
			System.out.println(conn);//com.mysql.jdbc.JDBC4Connection@30f1a58d
			System.out.println("建立连接，耗时："+(end-start)+"ms毫秒");
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(conn!=null){
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
