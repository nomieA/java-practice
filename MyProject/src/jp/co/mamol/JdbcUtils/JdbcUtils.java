package jp.co.mamol.JdbcUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcUtils {

	private final static String server = "192.168.0.198";
	private final static String port = "1521";
	private final static String sid = "XE";
	private final static String url = "jdbc:oracle:thin:@" + server + ":" + port + ":" + sid;
	private final static String user = "test14";
	private final static String password = "test14";


	public static Connection getConnection() throws Exception {
		//ドライバ登録
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//コネクションの取得
		Connection conn = DriverManager.getConnection(
				url, user, password);

		return conn;
	}

	public static void close(ResultSet rest, PreparedStatement pstmt, Connection conn) throws Exception {
		if (rest != null) {
			rest.close();
		}
		if (pstmt != null) {
			pstmt.close();
		}
		if (conn != null) {
			conn.close();
		}
	};
}
