package jp.co.mamol.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Base {

	final String server = "192.168.0.198";
	final String port = "1521";
	final String sid = "XE";
	final String url = "jdbc:oracle:thin:@" + server + ":" + port + ":" + sid;
	final String user = "test14";
	final String password = "test14";
	final String sql = "SELECT EMPNO,ENAME,JOB,DEPTNO FROM EMP WHERE DEPTNO = '30'";

	public void test() throws Exception {

		//①ドライバ登録
		//Class.forName(ドライバ名);
		Class.forName("oracle.jdbc.driver.OracleDriver");

		//②コネクションの取得
		//引数1：接続文 引数2：ユーザ名 引数3:PW
		Connection conn = DriverManager.getConnection(url, user, password);

		//③Statementの作成
		Statement stmt = conn.createStatement();

		//④SQLの実行、ResultSetの取得
		ResultSet rest = stmt.executeQuery(sql);

		//⑤実行結果に対する処理
		while (rest.next()) {
			System.out.println(
					" 社員NO:" + rest.getString("EMPNO") +
							" 名前:" + rest.getString("ENAME") +
							" 職種:" + rest.getString("JOB") +
							" 部署No:" + rest.getString("DEPTNO"));
		}

		//⑥リソース解放
		rest.close();
		stmt.close();
		conn.close();
	}

	public static void main(String[] args) throws Exception {
		Base b = new Base();
		b.test();
	}

}
