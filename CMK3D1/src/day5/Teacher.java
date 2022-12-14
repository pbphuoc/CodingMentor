package day5;

public class Teacher {
	private String teacherID;
	private String teacherName;
	private double salary;

	public Teacher(String teacherID, String teacherName, double salary) {
		this.teacherID = teacherID;
		this.teacherName = teacherName;
		this.salary = salary;
	}

	public String getTeacherID() {
		return teacherID;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public double getSalary() {
		return salary;
	}
}
