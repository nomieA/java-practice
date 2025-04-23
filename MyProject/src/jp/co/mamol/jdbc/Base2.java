package jp.co.mamol.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.mamol.JdbcUtils.JdbcUtils;

public class Base2 {

	String sql = "SELECT EMPNO,ENAME,JOB,DEPTNO FROM EMP WHERE DEPTNO = ? and job = ?";

	public void test() throws Exception {


		//②コネクションの取得
		//引数1：接続文 引数2：ユーザ名 引数3:PW
		Connection conn =JdbcUtils.getConnection();

		//③Statementの作成
		//Statement stmt = conn.createStatement();
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, "30");
		pstmt.setString(2, "一般職");

		//④SQLの実行、ResultSetの取得
		//ResultSet rest = stmt.executeQuery(sql);
		ResultSet rest = pstmt.executeQuery();

		//⑤実行結果に対する処理
		while (rest.next()) {
			System.out.println(
					" 社員番号:" + rest.getString("EMPNO") +
							" 名前:" + rest.getString("ENAME") +
							" 職種:" + rest.getString("JOB") +
							" 部署ID:" + rest.getString("DEPTNO"));
		}

		//⑥リソース解放
		JdbcUtils.close(rest, pstmt, conn);

	}

	public static void main(String[] args) throws Exception {
		Base2 b = new Base2();
		b.test();
	}

}
