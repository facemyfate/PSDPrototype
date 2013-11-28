public class Student {
	private int ID;
	private String name;
	
	public Student(int ID, String name){
		this.ID = ID;
		this.name = name;
	}
	
	public Student(Student s){
		ID = s.getID();
		name = s.getName();
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
