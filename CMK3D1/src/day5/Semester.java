package day5;

public class Semester {
	private String semesterID;
	private String schoolYear;
	private int semester;

	public Semester(String semesterID, String schoolYear, int semester) {
		this.semesterID = semesterID;
		this.schoolYear = schoolYear;
		this.semester = semester;
	}

	public String getSemesterID() {
		return semesterID;
	}

	public String getSchoolYear() {
		return schoolYear;
	}

	public int getSemester() {
		return semester;
	}

}
