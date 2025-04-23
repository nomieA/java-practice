package jp.co.mamol.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import jp.co.mamol.JdbcUtils.JdbcUtils;
import jp.co.mamol.dto.Book;
import jp.co.mamol.dto.StudnetPractDTO;

public class StudnetPractDAOImpl implements StudnetPractDAO {

	@Override
	public boolean addStudents(StudnetPractDTO s) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		String SQL = "INSERT INTO STUDENT (STUDENT_ID, NAME) VALUES(?,?)";

		Connection conn = JdbcUtils.getConnection();

		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, s.getStudent_id());
		pstmt.setString(2, s.getName());

		int i = pstmt.executeUpdate();


		if (i != 0) {
			System.out.println(i + "行が追加しました。");
			JdbcUtils.close(null, pstmt, conn);
			conn.commit();
			return true;
		} else {
			JdbcUtils.close(null, pstmt, conn);
			System.out.println("追加失敗。");
			return false;
		}
	}

	@Override
	public StudnetPractDTO readStudents(String studint_id) throws Exception {

		String SQL = "SELECT * FROM STUDENT WHERE STUDENT_ID = ?";

		Connection conn = JdbcUtils.getConnection();

		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, studint_id);

		ResultSet rest = pstmt.executeQuery();

		rest.next();
		StudnetPractDTO s = new StudnetPractDTO();

		String sid = rest.getString("STUDENT_ID");
		s.setStudent_id(sid);

		String sn = rest.getString("NAME");
		s.setName(sn);

		JdbcUtils.close(rest, pstmt, conn);

		return s;

	}

	@Override
	public List<StudnetPractDTO> readAllStudents() throws Exception {
		ArrayList<StudnetPractDTO> sl = new ArrayList<StudnetPractDTO>();
		String SQL = "SELECT * FROM STUDENT";
		
		Connection conn = JdbcUtils.getConnection();
		
		PreparedStatement pstmt =  conn.prepareStatement(SQL);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			StudnetPractDTO s = new StudnetPractDTO();
			s.setStudent_id(rs.getString("STUDENT_ID"));
			s.setName(rs.getString("NAME"));
			sl.add(s);
		}
		
		JdbcUtils.close(rs, pstmt, conn);
		return sl;
	}

	@Override
	public List<Book> readLendBook(String studint_id) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public boolean updateStudents(StudnetPractDTO s) throws Exception {
		String SQL = "UPDATE  STUDENT SET NAME = ? WHERE STUDENT_ID=?";
		
		Connection conn = JdbcUtils.getConnection();
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, s.getName());
		pstmt.setString(2, s.getStudent_id());
		
		int i = pstmt.executeUpdate();
		
		System.out.println(i + "行が更新成功。");
		System.out.println(s.getStudent_id() + "今は" + s.getName());

		
		
		JdbcUtils.close(null,pstmt,conn);
		return true;
	}

	@Override
	public boolean removeStudents(String student_id) throws Exception {
		String SQL = "DELETE FROM STUDENT WHERE STUDENT_ID=?";

		Connection conn = JdbcUtils.getConnection();

		PreparedStatement pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, student_id);

		int i = pstmt.executeUpdate();
		if (i != 0) {
			System.out.println(i + "行が削除成功。");

			conn.commit();
			JdbcUtils.close(null, pstmt, conn);
			return true;
		} else {
			JdbcUtils.close(null, pstmt, conn);
			System.out.println("削除失敗。");
			return false;
		}
	}

}
