package jp.co.mamol.dao;

import java.util.List;

import jp.co.mamol.dto.Book;
import jp.co.mamol.dto.Student;

public interface StudentDao {

	//学生追加
	public void addStudent(Student s) throws Exception;

	//学生検索
    public Student findStudent(String student_id) throws Exception;

	//学生削除
	public boolean deleteStudent(String student_id) throws Exception;

	//学生更新
	public void updateStudent(Student s) throws Exception;

	//学生全取得
	public List<Student> allStudent() throws Exception;

	//貸出中書籍取得
	public List<Book> allLendBook(String student_id) throws Exception;

}
