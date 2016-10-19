Student class :
--------------------

package Package55;

public class Student {
	private int rollNo;
	private String name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
}

--------------------------------------------------------------------------------------------------

Project class :
--------------------

package Package;

import java.util.ArrayList;

public class Project {
	private String title;
	private ArrayList<Student> studentGroup;

	public Project(String title) {
			super();
			this.title = title;
			this.studentGroup = new ArrayList<Student>();
		}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<Student> getStudentGroup() {
		return studentGroup;
	}

	public void setStudentGroup(ArrayList<Student> studentGroup) {
		this.studentGroup = studentGroup;
	}
	
	public void addStudent(Student s1)
	{
		this.studentGroup.add(s1);
	}

	@Override
	public String toString() {
		return "Project [title=" + title + ", studentGroup=" + studentGroup
				+ "]";
	}	
}

--------------------------------------------------------------------------------------------------

TestProject class :
--------------------

package Package;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestProject {
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
		s1 = new Student(11,"ABC");
		s2 = new Student(12,"DEF");
		s3 = new Student(13,"GHI");
		s4 = new Student(14,"PQR");
		s5 = new Student(15,"XYZ");	
	}
	
	@Test
	public void testAddStudent(){
		// create test objects
		setUp();
		//test initial size
		Project first = new Project("First");
		assertEquals(0, first.getStudentGroup().size());
		System.out.println("Size of student group:"+first.getStudentGroup().size());
		first.addStudent(s1);
		
		assertEquals(1, first.getStudentGroup().size());
		System.out.println("Size of student group:"+first.getStudentGroup().size());
		first.addStudent(s2);
		
		assertEquals(2, first.getStudentGroup().size());
		System.out.println("Size of student group:"+first.getStudentGroup().size());
		first.addStudent(s3);
		
		assertEquals(3, first.getStudentGroup().size());
		System.out.println("Size of student group:"+first.getStudentGroup().size());
		first.addStudent(s4);
		
		assertEquals(4, first.getStudentGroup().size());
		System.out.println("Size of student group:"+first.getStudentGroup().size());
		first.addStudent(s5);
		
		System.out.println(first);
	}	
	
	
	public void test() {
		fail("Not yet implemented");
	}
}

------------------------------------------------------------------------------------------------------------


OUTPUT :
--------------------

Size of student group:0
Size of student group:1
Size of student group:2
Size of student group:3
Size of student group:4
Project [title=First, studentGroup=[Student [rollNo=11, name=ABC], Student [rollNo=12, name=DEF], Student [rollNo=13, name=GHI], Student [rollNo=14, name=PQR], Student [rollNo=15, name=XYZ]]]


----------------------------------------------------------------------------------------------------------------


