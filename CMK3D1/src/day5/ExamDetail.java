package day5;

public class ExamDetail {
	private String examID;
	private String studentID;
	private String semesterID;
	private String subjectID;
	private double point;

	public ExamDetail(String examID, String studentID, String semesterID, String subjectID, double point) {
		this.examID = examID;
		this.studentID = studentID;
		this.semesterID = semesterID;
		this.subjectID = subjectID;
		this.point = point;
	}

	public String getStudentID() {
		return studentID;
	}

	public double getPoint() {
		return point;
	}

	public String getExamID() {
		return examID;
	}

	public String getSemesterID() {
		return semesterID;
	}

	public String getSubjectID() {
		return subjectID;
	}
}
