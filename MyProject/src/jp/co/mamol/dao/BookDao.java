package jp.co.mamol.dao;

import java.util.List;

import jp.co.mamol.dto.Book;
import jp.co.mamol.dto.Student;

public interface BookDao {

	//書籍追加
	public void addBook(Book b) throws Exception;

	//書籍削除
	public boolean deleteBook(String book_id) throws Exception;

	//書籍検索
	public Book findBookById(String book_id) throws Exception;

	//書籍更新
	public boolean updateBook(Book b) throws Exception;

	//貸出中学生情報取得
	public Student getLendStudent(String book_id) throws Exception;

	//書籍情報一覧
	public List<Book> allBooks() throws Exception;

	//貸出中書籍情報一覧
	public List<Book> lendedBooks() throws Exception;

	//未貸出書籍情報一覧
	public List<Book> lendAbleBooks() throws Exception;

}
