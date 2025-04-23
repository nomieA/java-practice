package jp.co.mamol.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jp.co.mamol.JdbcUtils.JdbcUtils;

public class BaseMySelf {

	private final String SQL = "INSERT INTO EMP VALUES(?,?,?,?,to_date(?,'YYYY/MM/DD'),?,?,?)";

	public void test() throws Exception {

		Connection conn = JdbcUtils.getConnection();

		PreparedStatement pstmt = conn.prepareStatement(SQL);

		pstmt.setString(1, "1099");
		pstmt.setString(2, "町田");
		pstmt.setString(3, "1001");
		pstmt.setString(4, "一般職");
		pstmt.setString(5, "2025/04/23");
		pstmt.setDouble(6, 400000.00);
		pstmt.setDouble(7, 300000.00);
		pstmt.setString(8, "20");

		int i = pstmt.executeUpdate();

		System.out.println(i + "行が追加いたしました。");

		JdbcUtils.close(null, pstmt, conn);

	}

	public static void main(String[] args) throws Exception {
		BaseMySelf b = new BaseMySelf();
		b.test();
	}

}
