
public class Grade {
	public static final char A = 'A';
	public static final char B = 'B';
	public static final char C = 'C';
	public static final char D = 'D';
	public static final char E = 'E';

	private String grade;

	public Grade(String grade) {
		this.grade = grade;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
