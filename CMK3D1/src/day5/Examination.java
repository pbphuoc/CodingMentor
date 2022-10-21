package day5;

public class Examination {
	private String examID;
	private String examName;
	private int multiplication;

	public Examination(String examID, String examName, int multiplication) {
		this.examID = examID;
		this.examName = examName;
		this.multiplication = multiplication;
	}

	public String getExamID() {
		return examID;
	}

	public String getExamName() {
		return examName;
	}

	public int getMultiplication() {
		return multiplication;
	}
}
