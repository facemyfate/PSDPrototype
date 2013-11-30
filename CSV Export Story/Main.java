import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	static ArrayList<Student> s;

	public static void sel(int i) {
		boolean showMenu = true;
		Scanner scanner = new Scanner(System.in);

		switch(i) {
		case 1:
			for (Student studs : s){
				System.out.println(studs.getName());
			}
			System.out.println("Select A Student: ");
			String input = scanner.next();
			showStudentAllCourseGrades(input);
			break;

		case 2:
			System.out.println("Select A Course: ");
			for (Student stud : s){
				ArrayList<Course> studco = stud.getCourse();
				for (int j = 0; j < studco.size(); j++){
					System.out.println((j + 1) + ". " + studco.get(j).getCourseName());
				}
				break;
			}

			int inpu = (scanner.nextInt() - 1);

			for (Student stud : s){
				System.out.println("Student :" + stud.getName());
				ArrayList<Course> studco = stud.getCourse();
				ArrayList<Assignment> assignment = studco.get(inpu).getAssignment();
				for (Assignment gass : assignment){
					System.out.println(gass.getAssignmentName() + "\nGrade: " + gass.getAssignmentGrade());
				}
				System.out.println("");
			}
			System.out.println("");
			break;

		case 3:
			System.out.println("Select Student By Typing Student's Name: ");

			for (Student afterselect : s){
				System.out.println(afterselect.getName());
			}
			System.out.println("");
			String tempstud = scanner.next();
			exportOne(tempstud, tempstud + ".csv");
			System.out.println("Export Successful");
			System.out.println("");
			break;

		case 4:
			System.out.println("Select Course By Typing Course's Name: ");

			for (Student stud : s){
				ArrayList<Course> studco = stud.getCourse();
				for (Course c : studco){
					System.out.println(c.getCourseName());
				}
				break;
			}

			String tempcourse = scanner.next();
			exportOneCourse(tempcourse, tempcourse + ".csv");


			break;

		case 5:
			showMenu = false;
			System.out.println("You Have Exited The Program...");
			break;
		}

		if (showMenu) {
			gradesMenu();
		}

		scanner.close();
	}


	public static void gradesMenu(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("GRADES MENU");
		System.out.println("Select your choice with the number that represents it.");
		System.out.println("1. View One Student's Courses Grades");
		System.out.println("2. View All Students Grades In A Course");
		System.out.println("3. Export Grades For One Student");
		System.out.println("4. Export All Grades In A Course");
		System.out.println("5. Quit");

		int number = scanner.nextInt();

		if ((number > 0) && (number < 6)){
			sel(number);
		}else {
			System.err.println("Please select from choice 1 to 5\n");
			gradesMenu();
		}
		scanner.close();
	}

	public static void main(String[] args) {

		Student terence = new Student("2110003L", "Terence");
		addCourseGrade(terence, Course.AP3, Grade.A);
		addAssignmentGrade(terence, Course.AP3, "Assignment 1", Grade.A);
		addAssignmentGrade(terence, Course.AP3, "Assignment 2", Grade.B);
		addCourseGrade(terence, Course.ALG3, Grade.B);
		addAssignmentGrade(terence, Course.ALG3, "Assignment 1", Grade.C);
		addAssignmentGrade(terence, Course.ALG3, "Assignment 2", Grade.D);
		addCourseGrade(terence, Course.IS3, Grade.C);
		addAssignmentGrade(terence, Course.IS3, "Assignment 1", Grade.E);
		addAssignmentGrade(terence, Course.IS3, "Assignment 2", Grade.A);
		addCourseGrade(terence, Course.PSD3, Grade.D);
		addAssignmentGrade(terence, Course.PSD3, "Assignment 1", Grade.B);
		addAssignmentGrade(terence, Course.PSD3, "Assignment 2", Grade.C);
		addCourseGrade(terence, Course.PL3, Grade.E);
		addAssignmentGrade(terence, Course.PL3, "Assignment 1", Grade.D);
		addAssignmentGrade(terence, Course.PL3, "Assignment 2", Grade.E);

		Student infinitydevil = new Student("2000000T", "BingLu");
		addCourseGrade(infinitydevil, Course.AP3, Grade.B);
		addAssignmentGrade(infinitydevil, Course.AP3, "Asssignment 1", Grade.B);

		s = new ArrayList<Student>();
		s.add(terence);
		s.add(infinitydevil);

		gradesMenu();

	}

	public static void showStudentAllCourseGrades(String student){
		for (Student stu : s){
			if (stu.getName().equalsIgnoreCase(student)){
				System.out.println("Student Name: " + stu.getName() + "\n");
				ArrayList<Course> co = stu.getCourse();
				for (Course c : co){
					System.out.println("Course Name: " +c.getCourseName() + "\n" + "Course Grade: " + c.getCourseGrade());
					System.out.println("");
					ArrayList<Assignment> ass = c.getAssignment();
					for (Assignment sass : ass){
						System.out.println("Assignment Name: " + sass.getAssignmentName()+ "\n" + "Assignment Grade: " + sass.getAssignmentGrade());
						System.out.println("");
					}
				}
			}

		}
	}

	public static void exportOne(String input, String fname){
		try{
			FileWriter file = new FileWriter(fname);

			file.append("StudentID");
			file.append(",");
			file.append("StudentName");
			file.append(",");
			file.append("AP3");
			file.append(",");
			file.append("Assignment 1");
			file.append(",");
			file.append("Assignment 2");
			file.append(",");
			file.append("ALG3");
			file.append(",");
			file.append("Assignment 1");
			file.append(",");
			file.append("Assignment 2");
			file.append(",");
			file.append("IS3");
			file.append(",");
			file.append("Assignment 1");
			file.append(",");
			file.append("Assignment 2");
			file.append(",");
			file.append("PSD3");
			file.append(",");
			file.append("Assignment 1");
			file.append(",");
			file.append("Assignment 2");
			file.append(",");
			file.append("PL3");
			file.append(",");
			file.append("Assignment 1");
			file.append(",");
			file.append("Assignment 2");
			file.append("\n");

			for (Student afterselect :s){
				if(afterselect.getName().equalsIgnoreCase(input)){
					System.out.println(afterselect.getName());
					ArrayList<Course> selco = afterselect.getCourse();
					file.append(afterselect.getId());
					file.append(",");
					file.append(afterselect.getName());
					file.append(",");
					for (Course studco : selco){
						file.append(studco.getCourseGrade());
						file.append(",");
						ArrayList<Assignment> ass = studco.getAssignment();
						for (Assignment gass : ass){
							file.append(gass.getAssignmentGrade());
							file.append(",");
						}
					}
				}
			}

			file.flush();
			file.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}

	}
	
	public static void exportOneCourse(String input, String fname){

		try {
			FileWriter file = new FileWriter(fname);
			
			file.append("StudentID");
			file.append(",");
			file.append("StudentName");
			file.append(",");
			file.append("Course Name");
			file.append(",");
			file.append("Course Grade");
			file.append(",");
			file.append("Assignment 1");
			file.append(",");
			file.append("Assignment 2");
			file.append(",");
			file.append("\n");
			
			for (Student all : s){
				ArrayList<Course> selco = all.getCourse();
				file.append(all.getId());
				file.append(",");
				file.append(all.getName());
				file.append(",");
				for (Course c : selco){
					if (c.getCourseName().equalsIgnoreCase(input)){
						file.append(c.getCourseName());
						file.append(",");
						file.append(c.getCourseGrade());
						file.append(",");
						ArrayList<Assignment> ass = c.getAssignment();
						for (Assignment gass : ass){
							file.append(gass.getAssignmentGrade());
							file.append(",");
						}
					}
				}
				file.append("\n");
			}
			
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	/*public static void showCourseStudentsGrades(String course){
		for (Student stu : s){
			ArrayList<Course> co = stu.getCourse();
			for (Course c : co) {
				if (c.getCourseName().equals(course)) {
					ArrayList<Assignment> ass = c.getAssignment();
					System.out.println("Student: " + stu.getName() +"\n" + "Course: " + c.getCourseName() + "\n" + "Course Grade: " + c.getCourseGrade());
					for (Assignment gass : ass){
						System.out.println("Assignment Name: " + gass.getAssignmentName() + "\n" + 
								"Assignment Grade: " + gass.getAssignmentGrade() + "\n");
					}
					System.out.println("==================");
				}
			}
		}
	}*/

	public static void addCourseGrade(Student student, String course, char grade) {
		for (Course c : student.getCourse()) {
			if (c.getCourseName().equals(course)) {
				c.setCourseGrade(grade);
				break;
			}
		}
	}

	public static void addAssignmentGrade(Student student, String course, String assignment, char grade) {
		for (Course c : student.getCourse()) {
			if (c.getCourseName().equals(course)) {
				c.getAssignment().add(new Assignment(assignment, grade));
			}
		}

	}



}
