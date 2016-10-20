package cceow.be.it.business;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestProject {

	
	
	/*public void test() {
		fail("Not yet implemented");
	}*/
	
	Student S1, S2, S3, S4, S5;
	@Test
	public void TestProject()
	{
		Project FirstProject = new Project("FirstProject");
		assertEquals("FirstProject",FirstProject.getTitle());
		assertTrue(FirstProject.getStudentGroup()instanceof ArrayList);
		
	}
	
	public void SetUp()
	
	{
		 S1 = new Student(1, "Rekha");
		 S2 = new Student(2, "Sakshi");
		 S3 = new Student(3, "Tanvi");
		 S4 = new Student(4, "Soumya");
		 S5 = new Student(1, "Srushti");
	}

	@Test
	
	public void TestAddStudent()
	{
		this.SetUp();
	
		Project first = new Project("First");
		assertEquals(0, first.getStudentGroup().size());
		System.out.println("Size of group : "+first.getStudentGroup().size());
		first.addStudent(S1);
		
		assertEquals(1, first.getStudentGroup().size());
		System.out.println("Size of student group : "+first.getStudentGroup().size());
		first.addStudent(S2);
		
		assertEquals(2, first.getStudentGroup().size());
		System.out.println("Size of student group : "+first.getStudentGroup().size());
		first.addStudent(S3);
		
		assertEquals(3, first.getStudentGroup().size());
		System.out.println("Size of student group : "+first.getStudentGroup().size());
		first.addStudent(S4);
		
		assertEquals(4, first.getStudentGroup().size());
		System.out.println("Size of student group : "+first.getStudentGroup().size());
		first.addStudent(S5);
		//System.out.println(first);	
		first.display();
		
	}
}
