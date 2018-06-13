public class TestCourse {
	public static void main(String[] args) {
		Course coursel = new Course("Data Structures");
		Course course2 = new Course("Database Systems");

		coursel.addStudent("Peter Jones");
		coursel.addStudent("Kim Smith");
		coursel.addStudent("Anne Kennedy");

		course2.addStudent("Peter Jones");
		course2.addStudent("MSteve Smith");

		System.out.println("Number of students in coursel:"
				+ coursel.getNumberOfStudents());
		String[]students = coursel.getStudents();
		for(int i = 0; i < coursel.getNumberOfStudents(); i++)
			System.out.print(students[i]+ ", ");

		System.out.println();
		System.out.print("Number of students in course2: " +  course2.getNumberOfStudents());
	}
}
