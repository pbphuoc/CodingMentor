package day5;

public class AssignedPrimaryTeacher {
	private String teacherID;
	private String classID;
	private String semesterID;

	public AssignedPrimaryTeacher(String teacherID, String classID, String semesterID) {
		this.teacherID = teacherID;
		this.classID = classID;
		this.semesterID = semesterID;
	}

	public String getTeacherID() {
		return teacherID;
	}

	public String getClassID() {
		return classID;
	}

	public String getSemesterID() {
		return semesterID;
	}
}
