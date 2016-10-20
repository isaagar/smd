package cceow.be.it.business;

import java.util.ArrayList;

public class Project {

	private String title;
	private ArrayList <Student> StudentGroup;
	
	public Project(String title) {
		super();
		this.title = title;
		this.StudentGroup = new ArrayList<Student>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<Student> getStudentGroup() {
		return StudentGroup;
	}

	public void setStudentGroup(ArrayList<Student> studentGroup) {
		StudentGroup = studentGroup;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Project [title=");
		builder.append(title);
		builder.append(", StudentGroup=");
		builder.append(StudentGroup);
		builder.append("]");
		return builder.toString();
	}
	
	public void display()
	{
		System.out.println("\nProject Title : "+this.title);
		for(Student s : StudentGroup)
		{
			System.out.println(s);
		}
	}

	public void addStudent(Student s1) {
		// TODO Auto-generated method stub
		
		this.StudentGroup.add(s1);
		
	}

	/*public boolean getStudentGroup() {
		// TODO Auto-generated method stub
		return false;
	}*/
	
}
