package jp.co.mamol.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.mamol.JdbcUtils.JdbcUtils;
import jp.co.mamol.dto.Book;
import jp.co.mamol.dto.Student;

public class StudentDaoImpl implements StudentDao {


	@Override
	public void addStudent(Student s) throws Exception {

		//SQL文
		String sql = "INSERT INTO STUDENT(STUDENT_ID,NAME) VALUES(?,?)";

		//コネクション取得
		Connection conn = JdbcUtils.getConnection();

		//PreparedStatement取得
		PreparedStatement pstmt = conn.prepareStatement(sql);

		//パラメータ設定
		pstmt.setString(1, s.getStudent_id());
		pstmt.setString(2, s.getName());

		//SQL実行
		int i = pstmt.executeUpdate();
		System.out.println(i + "行　追加しました。");

		//コミット
		conn.commit();

		//リソース解放
		JdbcUtils.close(null, pstmt, conn);

	}

	@Override
	public Student findStudent(String student_id) throws Exception {

		//SQL文
		String sql = "SELECT STUDENT_ID,NAME FROM STUDENT WHERE STUDENT_ID = ?";

		//コネクション取得
		Connection conn = JdbcUtils.getConnection();

		//PreparedStatement取得
		PreparedStatement pstmt = conn.prepareStatement(sql);

		//パラメータ設定
		pstmt.setString(1, student_id);

		//SQL実行
		ResultSet rs = pstmt.executeQuery();

		//結果取得
		Student student = new Student();

		if (rs.next()) {
			
			student.setStudent_id(rs.getString("STUDENT_ID"));
			student.setName(rs.getString("NAME"));
			
		}

		//リソース解放
		JdbcUtils.close(rs, pstmt, conn);

		return student;
	}

	@Override
	public boolean deleteStudent(String student_id) throws Exception {

		//SQL文
		String sql = "DELETE FROM STUDENT WHERE STUDENT_ID = ?";

		//コネクション取得
		Connection conn = JdbcUtils.getConnection();

		//PreparedStatement取得
		PreparedStatement pstmt = conn.prepareStatement(sql);

		//パラメータ設定
		pstmt.setString(1, student_id);

		//SQL実行
		int result = pstmt.executeUpdate();

		//コミット
		conn.commit();

		//リソース解放
		JdbcUtils.close(null, pstmt, conn);

		if (result == 0) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public void updateStudent(Student s) throws Exception {
		//SQL文
		String sql = "UPDATE STUDENT SET NAME = ? WHERE STUDENT_ID = ?";

		//コネクション取得
		Connection conn = JdbcUtils.getConnection();

		//PreparedStatement取得
		PreparedStatement pstmt = conn.prepareStatement(sql);

		//パラメータ設定
		pstmt.setString(1, s.getName());
		pstmt.setString(2, s.getStudent_id());

		//SQL実行
		pstmt.executeUpdate();

		//コミット
		conn.commit();

		//リソース解放
		JdbcUtils.close(null, pstmt, conn);

	}

	@Override
	public List<Student> allStudent() throws Exception {

		//SQL文
		String sql = "SELECT STUDENT_ID,NAME FROM STUDENT";
		//コネクション取得
		Connection conn = JdbcUtils.getConnection();
		//PreparedStatement取得
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//SQL実行
		ResultSet rest = pstmt.executeQuery();

		List<Student> studentList = new ArrayList<Student>();

		//結果取得
		while (rest.next()) {

			Student student = new Student();

			student.setStudent_id(rest.getString("STUDENT_ID"));
			student.setName(rest.getString("NAME"));

			studentList.add(student);

		}

		//リソース解放
		JdbcUtils.close(rest, pstmt, conn);

		//結果返却
		return studentList;
	}

	@Override
	public List<Book> allLendBook(String student_id) throws Exception {

		//SQL文
		String sql = "SELECT B.BOOK_ID,B.BOOK_NAME,B.PRICE" +
				" FROM  LENDSTATUS L " +
				" INNER JOIN BOOK B ON L.BOOK_ID = B.BOOK_ID" +
				" WHERE L.STUDENT_ID = ?";

		//コネクション取得
		Connection conn = JdbcUtils.getConnection();

		//PreparedStatement取得
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, student_id);

		//SQL実行
		ResultSet rest = pstmt.executeQuery();

		List<Book> bookList = new ArrayList<Book>();

		//結果取得
		while (rest.next()) {

			Book b = new Book();
			b.setBook_id(rest.getString("BOOK_ID"));
			b.setBook_name(rest.getString("BOOK_NAME"));
			b.setPrice(rest.getDouble("PRICE"));
			bookList.add(b);

		}

		return bookList;
	}

}
