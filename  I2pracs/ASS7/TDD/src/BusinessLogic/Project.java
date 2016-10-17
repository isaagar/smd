package BusinessLogic;
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
