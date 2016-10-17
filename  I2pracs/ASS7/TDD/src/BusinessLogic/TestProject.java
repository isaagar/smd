package BusinessLogic;

import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;

public class TestProject {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
		
	Student s1,s2,s3,s4,s5;
	
	@Test
	public void testProject()
	{
		Project firstProject = new Project("FirstProject");
		assertEquals("FirstProject", firstProject.getTitle());
		assertTrue(firstProject.getStudentGroup()instanceof 
				ArrayList);
	}
	
	public void setUp()
	{
		s1 = new Student(01,"Ramesh");
		s2 = new Student(02,"Suresh");
		s3 = new Student(03,"Mahesh");
		s4 = new Student(04,"Ganesh");
		s5 = new Student(05,"Umesh");	
	}
	
	@Test
	public void testAddStudent(){
		// create test objects
		setUp();
		//test initial size
		Project first = new Project("First");
		assertEquals(0, first.getStudentGroup().size());
		System.out.println("Size of student group : "+first.getStudentGroup().size());
		first.addStudent(s1);
		
		assertEquals(1, first.getStudentGroup().size());
		System.out.println("Size of student group : "+first.getStudentGroup().size());
		first.addStudent(s2);
		
		assertEquals(2, first.getStudentGroup().size());
		System.out.println("Size of student group : "+first.getStudentGroup().size());
		first.addStudent(s3);
		
		assertEquals(3, first.getStudentGroup().size());
		System.out.println("Size of student group : "+first.getStudentGroup().size());
		first.addStudent(s4);
		
		assertEquals(4, first.getStudentGroup().size());
		System.out.println("Size of student group : "+first.getStudentGroup().size());
		first.addStudent(s5);
		
		System.out.println(first);
	}	
	
	
	public void test() {
		fail("Not yet implemented");
	}
	}


