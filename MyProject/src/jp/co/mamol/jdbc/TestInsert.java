package jp.co.mamol.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jp.co.mamol.JdbcUtils.JdbcUtils;

public class TestInsert {

	final String sql = "INSERT INTO EMP VALUES(?,?,?,?,to_date(?,'yyyy-MM-dd'),?,?,?)";

	public void test() throws Exception {
		//①ドライバ登録
		//Class.forName(ドライバ名);
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//②コネクションの取得
		//引数1：接続文 引数2：ユーザ名 引数3:PW
		Connection conn = JdbcUtils.getConnection();

		//③Statementの作成

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "2001");
		pstmt.setString(2, "USER9");
		pstmt.setString(3, "2000");
		pstmt.setString(4, "一般職");
		pstmt.setString(5, "2010-01-01");
		pstmt.setDouble(6, 200000.00);
		pstmt.setDouble(7, 300000.00);
		pstmt.setString(8, "20");

		//④SQLの実行

		int i = pstmt.executeUpdate();

		System.out.println(i + "行　追加");

		conn.commit();

		//⑥リソース解放
		JdbcUtils.close(null, pstmt, conn);

	}

	public static void main(String args[]) throws Exception {
		new TestInsert().test();
	}
}
