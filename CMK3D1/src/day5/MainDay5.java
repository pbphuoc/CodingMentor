package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainDay5 {
	private static final ExamDetail[] examDetails = null;
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Semester semOne2020 = new Semester("sem012020", "2020", 1);
		Semester semTwo2020 = new Semester("sem022020", "2020", 2);
		Semester semOne2021 = new Semester("sem012021", "2021", 1);
		Semester semTwo2021 = new Semester("sem022021", "2021", 2);
		ArrayList<Semester> semesters = new ArrayList<Semester>(
				Arrays.asList(semOne2020, semTwo2020, semOne2021, semTwo2021));
		Student phuocPham = new Student("student1", "Phuoc Pham");
		ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(phuocPham));
		StudentClass class10A4 = new StudentClass("class10a4", "10A4");
		StudentClass class11A4 = new StudentClass("class11a4", "11A4");
		ArrayList<StudentClass> classes = new ArrayList<StudentClass>(Arrays.asList(class10A4, class11A4));
		AssignedClass assignedClass1 = new AssignedClass("student1", "sem012020", "class10a4");
		AssignedClass assignedClass2 = new AssignedClass("student1", "sem022020", "class10a4");
		AssignedClass assignedClass3 = new AssignedClass("student1", "sem012021", "class11a4");
		ArrayList<AssignedClass> assignedClasses = new ArrayList<AssignedClass>(
				Arrays.asList(assignedClass1, assignedClass2, assignedClass3));
		Teacher teacherNgoc = new Teacher("teacher1", "Lan Ngoc", 65000.00);
		Teacher teacherHang = new Teacher("teacher2", "Minh Hang", 65000.00);
		ArrayList<Teacher> teachers = new ArrayList<Teacher>(Arrays.asList(teacherNgoc, teacherHang));
		AssignedPrimaryTeacher assignedTeacher1 = new AssignedPrimaryTeacher("teacher1", "class10a4", "sem012020");
		AssignedPrimaryTeacher assignedTeacher2 = new AssignedPrimaryTeacher("teacher2", "class11a4", "sem012021");
		ArrayList<AssignedPrimaryTeacher> assignedTeachers = new ArrayList<AssignedPrimaryTeacher>(
				Arrays.asList(assignedTeacher1, assignedTeacher2));
		Subject math = new Subject("subject1", "Toan");
		Subject literature = new Subject("subject2", "Van");
		Subject english = new Subject("subject3", "Anh");
		ArrayList<Subject> subjects = new ArrayList<Subject>(Arrays.asList(math, literature, english));
		Examination exam15mMul1 = new Examination("exam1", "15'", 1);
		Examination exam15mMul2 = new Examination("exam2", "15'", 2);
		Examination exam45mMul2 = new Examination("exam3", "45'", 2);
		Examination examMidMul2 = new Examination("exam4", "Mid", 2);
		Examination examFinalMul3 = new Examination("exam5", "Final", 3);
		ArrayList<Examination> examinations = new ArrayList<Examination>(
				Arrays.asList(exam15mMul1, exam15mMul2, exam45mMul2, examMidMul2, examFinalMul3));
		ExamDetail examDetail1 = new ExamDetail("exam1", "student1", "sem012020", "subject1", 5.5);
		ExamDetail examDetail2 = new ExamDetail("exam2", "student1", "sem012020", "subject1", 9.0);
		ExamDetail examDetail3 = new ExamDetail("exam3", "student1", "sem012020", "subject1", 3.0);
		ExamDetail examDetail4 = new ExamDetail("exam4", "student1", "sem012020", "subject1", 8.5);
		ExamDetail examDetail5 = new ExamDetail("exam5", "student1", "sem012020", "subject1", 10.0);
		ExamDetail examDetail6 = new ExamDetail("exam1", "student1", "sem022020", "subject2", 6.5);
		ExamDetail examDetail7 = new ExamDetail("exam2", "student1", "sem022020", "subject2", 10.0);
		ExamDetail examDetail8 = new ExamDetail("exam3", "student1", "sem022020", "subject2", 9.5);
		ExamDetail examDetail9 = new ExamDetail("exam4", "student1", "sem022020", "subject2", 4.5);
		ExamDetail examDetail10 = new ExamDetail("exam5", "student1", "sem022020", "subject2", 7.5);

		ExamDetail examDetail11 = new ExamDetail("exam1", "student1", "sem012021", "subject3", 7.0);
		ExamDetail examDetail12 = new ExamDetail("exam2", "student1", "sem012021", "subject3", 2.5);
		ExamDetail examDetail13 = new ExamDetail("exam4", "student1", "sem012021", "subject3", 9.5);
		ExamDetail examDetail14 = new ExamDetail("exam5", "student1", "sem012021", "subject3", 10.0);
		ExamDetail examDetail15 = new ExamDetail("exam1", "student1", "sem022021", "subject1", 5.0);
		ExamDetail examDetail16 = new ExamDetail("exam2", "student1", "sem022021", "subject1", 8.5);
		ExamDetail examDetail17 = new ExamDetail("exam4", "student1", "sem022021", "subject1", 1.0);
		ExamDetail examDetail18 = new ExamDetail("exam5", "student1", "sem022021", "subject1", 9.0);

		ArrayList<ExamDetail> examDetails = new ArrayList<ExamDetail>(
				Arrays.asList(examDetail1, examDetail2, examDetail3, examDetail4, examDetail5, examDetail6, examDetail7,
						examDetail8, examDetail9, examDetail10, examDetail11, examDetail12, examDetail13, examDetail14,
						examDetail15, examDetail16, examDetail17, examDetail18 ));

		Student selectedStudent = getStudent(students);
		if (selectedStudent != null) {
			ArrayList<ExamDetail> details = getExamDetailByStudentID(selectedStudent.getStudentID(), examDetails);
			ArrayList<Semester> semFromExamDetail = getSemesterFromExamDetail(details, semesters);
			ArrayList<Examination> examFromExamDetail = getExaminationFromExamDetail(details, examinations);
			ArrayList<String> yearFromExam = getAllYearFromExamDetail(semFromExamDetail);
			System.out.println("Please select from the following School Year to view."
					+ selectedStudent.getStudentName() + "'s Point Sheet: ");
			System.out.println("Use comma as a seperator to input multiple years: ");

			for (String year : yearFromExam) {
				System.out.print(year + " ");
			}
			String selectedYear;
			String[] selecterdYears = null;
			boolean validInput = false;
			while (!validInput) {
				selectedYear = scanner.nextLine();
				selecterdYears = selectedYear.split(",");
				validInput = true;
				for(String year : selecterdYears)
				{
					if (!yearFromExam.contains(year)) {
						validInput = false;
						break;
					}
				}
				if(!validInput) {
					if(yearFromExam.contains(selectedYear)) {
						break;
					}
					else {
						System.out.println("Cannot find selected year in the list, please try again");
					}
				}			
			}
			System.out.println("Point Sheet");
			System.out.println("Student ID: " + selectedStudent.getStudentID() + " | Student Name: "
					+ selectedStudent.getStudentName());			
			for(String year : selecterdYears) {
				ArrayList<Semester> selectedSemester = getSemesterByYear(year, semFromExamDetail);
				ArrayList<Subject> subjFromExamDetail = getSubjectFromExamDetail(details, selectedSemester ,subjects);
				String classID = getClassIDByStudentID(selectedStudent.getStudentID(),
						selectedSemester.get(0).getSemesterID(), assignedClasses);
				StudentClass studentClass = getClassByID(classID, classes);
				String teacherID = getTeacherByClassID(classID, selectedSemester.get(0).getSemesterID(), assignedTeachers);
				Teacher primaryTeacher = getTeacherByID(teacherID, teachers);

				System.out.println("Year: " + year);
				System.out.println("Class: " + studentClass.getClassName());
				System.out.println("Primary Teacher: " + primaryTeacher.getTeacherName());
				String space = "\t";
				ArrayList<String> points = getPointBySubjectPerSemester(subjFromExamDetail, selectedSemester, details,
						examFromExamDetail, space);
				for (String row : points) {
					System.out.println(row);
				}								
			}
		}
		scanner.close();
	}

	public static Student getStudent(ArrayList<Student> students) {
		for (Student s : students) {
			System.out.println("Student ID: " + s.getStudentID() + " | Student Name: " + s.getStudentName());
		}
		while (true) {
			System.out.print("Please enter either Student ID or Student Name you want to view student's Point Sheet: ");
			String studentID = scanner.nextLine();
			for (Student s : students) {
				if (studentID.equalsIgnoreCase(s.getStudentID()) || studentID.equalsIgnoreCase(s.getStudentName())) {
					return s;
				}
			}
			System.out.println("Cannot find the entered Student ID or Student Name in our system. Please try again");
		}
	}

	public static ArrayList<ExamDetail> getExamDetailByStudentID(String studentID, ArrayList<ExamDetail> examDetails) {
		ArrayList<ExamDetail> examninations = new ArrayList<ExamDetail>();
		for (ExamDetail e : examDetails) {
			if (studentID.equalsIgnoreCase(e.getStudentID()))
				examninations.add(e);
		}
		return examninations;
	}

	public static ArrayList<Semester> getSemesterFromExamDetail(ArrayList<ExamDetail> examDetails,
			ArrayList<Semester> sems) {
		ArrayList<String> semesterIDs = new ArrayList<String>();
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		for (ExamDetail examDetail : examDetails) {
			if (!semesterIDs.contains(examDetail.getSemesterID())) {
				semesterIDs.add(examDetail.getSemesterID());
				semesters.add(getSmesterByID(examDetail.getSemesterID(), sems));
			}
		}
		return semesters;
	}

	public static ArrayList<String> getAllYearFromExamDetail(ArrayList<Semester> semesters) {
		ArrayList<String> schoolYears = new ArrayList<String>();
		for (Semester semester : semesters) {
			if (!schoolYears.contains(semester.getSchoolYear()))
				schoolYears.add(semester.getSchoolYear());
		}
		return schoolYears;
	}

	public static ArrayList<Subject> getSubjectFromExamDetail(ArrayList<ExamDetail> examDetails, ArrayList<Semester> semesters,
			ArrayList<Subject> subjs) {
		ArrayList<String> subjectIDs = new ArrayList<String>();
		ArrayList<Subject> subjects = new ArrayList<Subject>();
		for (ExamDetail examDetail : examDetails) {
			for(Semester semester : semesters) {
				if (semester.getSemesterID().equalsIgnoreCase(examDetail.getSemesterID()) && !subjectIDs.contains(examDetail.getSubjectID())) {
					subjectIDs.add(examDetail.getSubjectID());
					subjects.add(getSubjectByID(examDetail.getSubjectID(), subjs));
				}
			}
		}
		return subjects;
	}

	public static ArrayList<Examination> getExaminationFromExamDetail(ArrayList<ExamDetail> examDetails,
			ArrayList<Examination> exams) {
		ArrayList<String> examinationIDs = new ArrayList<String>();
		ArrayList<Examination> examinations = new ArrayList<Examination>();
		for (ExamDetail examDetail : examDetails) {
			if (!examinationIDs.contains(examDetail.getExamID())) {
				examinationIDs.add(examDetail.getExamID());
				examinations.add(getExaminationByID(examDetail.getExamID(), exams));
			}
		}
		return examinations;
	}

	public static Semester getSmesterByID(String semesterID, ArrayList<Semester> semesters) {
		for (Semester s : semesters) {
			if (semesterID.equalsIgnoreCase(s.getSemesterID()))
				return s;
		}
		return null;
	}

	public static Subject getSubjectByID(String subjectID, ArrayList<Subject> subjects) {
		for (Subject s : subjects) {
			if (subjectID.equalsIgnoreCase(s.getSubjectID()))
				return s;
		}
		return null;
	}

	public static Examination getExaminationByID(String examID, ArrayList<Examination> examinations) {
		for (Examination e : examinations) {
			if (examID.equalsIgnoreCase(e.getExamID()))
				return e;
		}
		return null;
	}

	public static StudentClass getClassByID(String classID, ArrayList<StudentClass> classes) {
		for (StudentClass s : classes) {
			if (classID.equalsIgnoreCase(s.getClassID()))
				return s;
		}
		return null;
	}

	public static Teacher getTeacherByID(String teacherID, ArrayList<Teacher> teachers) {
		for (Teacher t : teachers) {
			if (teacherID.equalsIgnoreCase(t.getTeacherID()))
				return t;
		}
		return null;
	}

	public static ArrayList<Semester> getSemesterByYear(String year, ArrayList<Semester> semesters) {
		ArrayList<Semester> sems = new ArrayList<Semester>();
		for (Semester semester : semesters) {
			if (year.equalsIgnoreCase(semester.getSchoolYear()))
				sems.add(semester);
		}
		return sems;
	}

	public static String getClassIDByStudentID(String studentID, String semesterID,
			ArrayList<AssignedClass> assignedClasses) {
		for (AssignedClass assignedClass : assignedClasses) {
			if (studentID.equalsIgnoreCase(assignedClass.getStudentID())
					&& semesterID.equalsIgnoreCase(assignedClass.getSemesterID())) {
				return assignedClass.getClassID();
			}
		}
		return "";
	}

	public static String getTeacherByClassID(String classID, String semesterID,
			ArrayList<AssignedPrimaryTeacher> assignedTeachers) {
		for (AssignedPrimaryTeacher assignedTeacher : assignedTeachers) {
			if (classID.equalsIgnoreCase(assignedTeacher.getClassID())
					&& semesterID.equalsIgnoreCase(assignedTeacher.getSemesterID())) {
				return assignedTeacher.getTeacherID();
			}
		}
		return null;
	}

	public static char getGrade(double point) {
		if (point >= 9)
			return 'S';
		else if (point >= 8)
			return 'A';
		else if (point >= 7)
			return 'B';
		else if (point >= 6)
			return 'C';
		else if (point >= 5)
			return 'D';
		else
			return 'F';
	}

	public static ArrayList<String> getPointBySubjectPerSemester(ArrayList<Subject> subjects,
			ArrayList<Semester> semesters, ArrayList<ExamDetail> examDetails, ArrayList<Examination> examinations,
			String space) {
		ArrayList<String> rows = new ArrayList<String>();
		int[] maxItemPerSem = new int[semesters.size()];
		for (int i = 0; i < semesters.size(); i++) {
			Semester semester = semesters.get(i);
			int maxRecordPerSubject = 0;
			for (Subject subject : subjects) {
				int count = 0;
				for (ExamDetail examDetail : examDetails) {
					if (subject.getSubjectID().equalsIgnoreCase(examDetail.getSubjectID())
							&& semester.getSemesterID().equalsIgnoreCase(examDetail.getSemesterID())) {
						++count;
					}
				}
				if (maxRecordPerSubject < count)
					maxRecordPerSubject = count;
			}
			maxItemPerSem[i] = maxRecordPerSubject;
		}
		int totalItem = 0;
		for (int i = 0; i < maxItemPerSem.length; i++) {
			totalItem += maxItemPerSem[i];
		}
		String rowSeperator = "";
		for (int i = 0; i < totalItem * 3; i++) {
			rowSeperator += "------";
		}
		rows.add(rowSeperator);
		String semesterHeader = "Mon" + space;
		for (int i = 0; i < maxItemPerSem.length; i++) {
			semesterHeader += "HK " + semesters.get(i).getSemester();
			for (int j = 1; j <= maxItemPerSem[i]; j++) {
				semesterHeader += space + space;
			}
		}
		semesterHeader += "Average";
		rows.add(semesterHeader);
		double sum = 0;
		for (Subject subject : subjects) {
			double dividend = 0;
			double divisor = 0;
			String row = subject.getSubjectName() + space;
			for (int i = 0; i < semesters.size(); i++) {
				Semester semester = semesters.get(i);
				int foundRecordCount = 0;
				for (ExamDetail examDetail : examDetails) {
					if (subject.getSubjectID().equalsIgnoreCase(examDetail.getSubjectID())
							&& semester.getSemesterID().equalsIgnoreCase(examDetail.getSemesterID())) {
						Examination examination = getExaminationByID(examDetail.getExamID(), examinations);
						row += examination.getExamName() + ": " + examDetail.getPoint() + space;
						dividend += examDetail.getPoint() * examination.getMultiplication();
						divisor += examination.getMultiplication();
						++foundRecordCount;
					}
				}
				for (int j = foundRecordCount; j < maxItemPerSem[i]; j++) {
					row += space + space;
				}
			}
			double average = Math.round(100.00 * dividend / divisor) / 100.00;
			sum += average;
			row += average;
			rows.add(row);
		}
		rows.add(rowSeperator);
		String rowAverage = "";
		for (int i = 0; i < totalItem; i++) {
			rowAverage += space + space;
		}
		double finalAverage = Math.round(100.00 * sum / subjects.size()) / 100.00;
		rowAverage += "Average: " + finalAverage;
		rows.add(rowAverage);
		String rowGrade = "";
		for (int i = 0; i < totalItem; i++) {
			rowGrade += space + space;
		}
		rowGrade += "Grade: " + getGrade(finalAverage);
		rows.add(rowGrade);
		return rows;
	}

//	public static ArrayList<Semester> getSemestersBySchoolYear(String schoolYear, Semester[] semesters) {
//		ArrayList<Semester> s = new ArrayList<Semester>();
//		for (Semester sem : semesters) {
//			if (schoolYear.equalsIgnoreCase(sem.getSchoolYear()))
//				s.add(sem);
//		}
//		return s;
//	}

//	public static Student getStudent(Student[] students, String studentID) {
//		for (Student student : students) {
//			if (studentID.equalsIgnoreCase(student.getStudentID()))
//				return student;
//		}
//		return null;
//	}
}
