package jp.co.mamol.dao;

import java.util.List;

import jp.co.mamol.dto.Book;
import jp.co.mamol.dto.StudnetPractDTO;

public interface StudnetPractDAO {
	
	//c
	public boolean addStudents (StudnetPractDTO s) throws Exception;
	
	//r
	public StudnetPractDTO readStudents (String studint_id) throws Exception;
	public List<StudnetPractDTO> readAllStudents () throws Exception;
	public List<Book> readLendBook (String studint_id) throws Exception;

	
	//u
	public boolean updateStudents (StudnetPractDTO s) throws Exception;
	
	//d
	public boolean removeStudents (String student_id) throws Exception;

}
