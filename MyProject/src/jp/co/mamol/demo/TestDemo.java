package jp.co.mamol.demo;

import java.util.List;

import jp.co.mamol.dao.StudentDao;
import jp.co.mamol.dao.StudentDaoImpl;
import jp.co.mamol.dto.Book;
import jp.co.mamol.dto.Student;

public class TestDemo {

	public static void main(String[] args) throws Exception {

		StudentDao studentDao = new StudentDaoImpl();

		//Student 追加
				Student s = new Student();

				s.setStudent_id("S999");
				s.setName("太郎");

				studentDao.addStudent(s);

		//Student 取得
		/*		Student s2 = studentDao.findStudent("S007");

				System.out.println("学生ID：" + s2.getStudent_id() + "名前：" + s2.getName());
		*/
		//Student 削除
		//studentDao.deleteStudent("1199");

		//Student 更新

		/*		Student s3 = new Student();
				s3.setStudent_id("S007");
				s3.setName("太郎");

				studentDao.updateStudent(s3);*/

		//s3.setName("次郎");
		//studentDao.updateStudent(s3);

		//Student 全レコード取得
		/*		List<Student> studentList = studentDao.allStudent();

				for (Student temp : studentList) {

					System.out.println("ID:" + temp.getStudent_id() + " NAME:" + temp.getName());

				}*/

		//貸出中書籍取得
		List<Book> bookList = studentDao.allLendBook("S001");

		for (Book temp : bookList) {
			System.out.println("BOOK_ID" + temp.getBook_id() + " BOOK_NAME:" + temp.getBook_name());
		}
	}

}
