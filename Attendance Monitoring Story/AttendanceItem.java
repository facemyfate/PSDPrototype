public class AttendanceItem {
	private String course;
	private String name;
	private int id;
	private String week1;
	private String week2;
	private String week3;
	private String week4;
	private String week5;
	
	public AttendanceItem(String course){
		this.course = course;
		name = "";
		id = -1;
		week1 = "";
		week2 = "";
		week3 = "";
		week4 = "";
		week5 = "";
	}
	
	public AttendanceItem(AttendanceItem a){
		course = a.getCourse();
		name = a.getName();
		id = a.getId();
		week1 = a.getWeek1();
		week2 = a.getWeek2();
		week3 = a.getWeek3();
		week4 = a.getWeek4();
		week5 = a.getWeek5();
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWeek1() {
		return week1;
	}

	public void setWeek1(String week1) {
		this.week1 = week1;
	}

	public String getWeek2() {
		return week2;
	}

	public void setWeek2(String week2) {
		this.week2 = week2;
	}

	public String getWeek3() {
		return week3;
	}

	public void setWeek3(String week3) {
		this.week3 = week3;
	}

	public String getWeek4() {
		return week4;
	}

	public void setWeek4(String week4) {
		this.week4 = week4;
	}

	public String getWeek5() {
		return week5;
	}

	public void setWeek5(String week5) {
		this.week5 = week5;
	}
	
	
}
