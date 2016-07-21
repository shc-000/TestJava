package com.shc.jdbc.demo;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 * 测试使用JDBCUtil工具类来简化JDBC开发
 * @author shc
 *
 */
public class Demo11 {
	
	
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = JDBCUtil.getMysqlConn();
			
			ps = conn.prepareStatement("insert into t_user (username) values (?)");
			ps.setString(1, "chao1");
			ps.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			JDBCUtil.close(rs, ps, conn);
		}
	}
}
