public class Assignment {
	String assignmentName;
	char assignmentGrade;

	public Assignment(String assignmentName, char assignmentGrade) {
		this.assignmentName = assignmentName;
		this.assignmentGrade = assignmentGrade;
	}

	public String getAssignmentName() {
		return assignmentName;
	}

	public void setAssignmentName(String assignmentName) {
		this.assignmentName = assignmentName;
	}

	public char getAssignmentGrade() {
		return assignmentGrade;
	}

	public void setAssignmentGrade(char assignmentGrade) {
		this.assignmentGrade = assignmentGrade;
	}

}
