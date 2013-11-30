import java.util.ArrayList;


public class Student {
	private String name;
	private String id;
	private ArrayList<Course> course;

	public Student(String id, String name){
		this.name = name;
		this.id = id;
		course = Course.getCourse();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Course> getCourse() {
		return course;
	}


}
