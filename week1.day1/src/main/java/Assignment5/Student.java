package Assignment5;

public class Student {
	String studentName="Shaikh Mohammed";
	int rollNo=132;
	String collegeName="Velammal Engg College";
	int markScored=98;
	float cgpa=92.6f;
	
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println("College Name is"+s.collegeName);
		System.out.println("Student name is"+s.studentName);
		System.out.println("Roll No is"+s.rollNo);
		System.out.println("Mark Obtained is"+s.markScored);
		System.out.println("CGPA is"+s.cgpa);
	}

}
