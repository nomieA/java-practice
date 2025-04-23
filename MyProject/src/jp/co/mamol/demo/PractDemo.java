package jp.co.mamol.demo;

import java.util.List;

import jp.co.mamol.dao.StudnetPractDAO;
import jp.co.mamol.dao.StudnetPractDAOImpl;
import jp.co.mamol.dto.StudnetPractDTO;

public class PractDemo {

	public static void main(String[] args) throws Exception {
		StudnetPractDAO sDAO = new StudnetPractDAOImpl();

		//creat a new student to db
		
		/*		StudnetPractDTO s = new StudnetPractDTO();
				
				s.setStudent_id("S999");
				s.setName("Pract");
				
				sDAO.addStudents(s);*/

		//read the new student i just created
		/*StudnetPractDTO s2 = new StudnetPractDTO();
		s2 = sDAO.readStudents("S999");
		System.out.println(s2.getStudent_id());
		System.out.println(s2.getName());*/

		//delete the new student i just created
//		sDAO.removeStudents("S999");
		
		
		
		
		
		
		

		//read all students to check if i have done it
		List<StudnetPractDTO> sl = sDAO.readAllStudents();
		for (StudnetPractDTO s3 : sl) {
			System.out.println(s3.getStudent_id()+" "+s3.getName());
		}
	}

}
