// edit do later
// hardcode for student and course

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Attendance att = new Attendance();
	static ArrayList<Student> student = new ArrayList<Student>();
	static ArrayList<Course> course = new ArrayList<Course>();

	public static void main (String[] args) {
		// hard code students and courses
		// as of now all students taking all the courses

		// Students
		Student s1 = new Student(9801001, "Lavender Brown");
		Student s2 = new Student(9801002, "Seamus Finnigan");
		Student s3 = new Student(9802003, "Hermione Granger");
		Student s4 = new Student(2102004, "Neville Longbottom");
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);

		// Courses
		Course c1 = new Course(1, "Professional Software Development 3");
		Course c2 = new Course(2, "Algorithmics 3");
		Course c3 = new Course(3, "Advanced Programming 3");
		Course c4 = new Course(4, "Interactive Systems 3");
		Course c5 = new Course(5, "Programming Language 3");
		course.add(c1);
		course.add(c2);
		course.add(c3);
		course.add(c4);
		course.add(c5);

		// add to the array of attendance
		for(int c = 0; c<course.size();c++){
			for (int s=0; s<student.size();s++){
				String cs = course.get(c).getName();
				AttendanceItem a = new AttendanceItem(cs);
				att.getAttendance().add(a);
				a.setCourse(cs);
				a.setName(student.get(s).getName());
				a.setId(student.get(s).getID());
			}
		}

		attendanceMenu();


	}



	public static void attendanceMenu(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("ATTENDANCE MENU");
		System.out.println("Select your choice with the number that represents it.");
		System.out.println("1. New Attendance");
		System.out.println("2. Import Attendance");
		System.out.println("3. Edit Attendance");
		System.out.println("4. View Attendance");
		System.out.println("5. Quit");

		int number = scanner.nextInt();
		if ((number > 0) && (number < 6)){
			selection(number);
		}else {
			System.err.println("Please select from choice 1 to 5\n");
			attendanceMenu();
		}
		scanner.close();
	}

	public static void courseMenu(){
		System.out.println("1. Professional Software Development 3");
		System.out.println("2. Algorithmics 3");
		System.out.println("3. Advanced Programming 3");
		System.out.println("4. Interactive Systems 3");
		System.out.println("5. Programming Language 3");
		System.out.println("6. Back to Main Menu");
	}

	public static void selection(int number){
		boolean exit = false;



		while (exit != true){
			Scanner scanner = new Scanner(System.in);

			switch(number){
			case 1:
				// New Attendance
				System.out.println("ATTENDANCE MENU: NEW ATTENDANCE");
				System.out.println("Select the course that you want to mark the attendance.");
				courseMenu();

				int course1 = scanner.nextInt();
				

				boolean case1 = false;
				while (case1 != true) {
					if ((course1>0) && (course1<6)){
						System.out.println("Choose the week of attendance you want to edit. Key from week 1 to 5");
						System.out.println("Key 0 to exit to main menu.");

						boolean w1 = false;
						while (w1 != true) {
							String coursestr1 = course.get(course1-1).getName();
							int week1 = scanner.nextInt();
							if ((week1 > 0) && (week1 < 6)){
								System.out.println("Marking attendance for " + coursestr1 + " of week " + week1);
								System.out.println("Choose from the options below. \n1.\tpresent \n2.\tabsent \n3.\tmv \n4.\tskip\n");
								exit = true;
								case1 = true;
								w1 = true;
								addAttendance(coursestr1, week1);
							} else if (week1 == 0){
								attendanceMenu();
								exit = true;
								case1 = true;
								w1 = true;
							} else {
								System.err.println("Please select from choice 1 to 5\n");
								w1 = true;
							}
						}
					} else if (course1 == 6) {
						attendanceMenu();
						case1=true;
						exit=true;
					} else {
						System.err.println("Please key in again!\n");
						case1=true;
					}
				}
				break;
			case 2:
				//Import Attendance
				System.out.println("ATTENDANCE MENU: IMPORT ATTENDANCE");
				System.out.println("Select the course to import the attendance.\n");
				courseMenu();

				int course2 = scanner.nextInt();

				boolean b2 = false;
				while(b2 != true){
					if((course2>0) &&(course2<6)){
						System.out.println("Please key in the location of the file.");
						String url = scanner.next();
						try { 
							String coursestr2 = course.get(course2-1).getName();
							att.importFile(coursestr2, url);
							b2 = true;
							exit = true;
							System.out.println("Successfully imported the attendance.");
						} catch (IOException e) { 
						}

						System.out.println("");
						System.out.println("Returning back to main menu ...");
						System.out.println("");
						attendanceMenu();
					} else if (course2 == 6) {
						attendanceMenu();
						b2=true;
						exit=true;
					} else {
						System.err.println("Please key in again!\n");
						b2 = true;
					}
				}

				break;
			case 3:
				// Edit Attendance
				System.out.println("ATTENDANCE MENU: EDIT ATTENDANCE");
				System.out.println("Select the course that you want to edit.\n");
				courseMenu();

				int course3 = scanner.nextInt();
				//int week3 = 0;
				

				boolean case3 = false;
				while (case3 != true){
					if ((course3>0) && (course3<6)) {
						System.out.println("Choose the week of attendance you want to edit. Key from week 1 to 5");
						System.out.println("Key 0 to exit to main menu.");

						boolean w3 = false;
						while (w3 != true) {
							String coursestr3 = course.get(course3-1).getName();
							int week3 = scanner.nextInt();
							if ((week3 > 0) && (week3 < 6)){
								System.out.println("Editing attendance for " + coursestr3 + " of week " + week3);
								exit = true;
								case3 = true;
								w3 = true;
								editAttendance(coursestr3, week3);
							} else if (week3 == 0){
								attendanceMenu();
								exit = true;
								case3 = true;
								w3 = true;
							} else {
								System.err.println("Please select from choice 1 to 5\n");
								w3 = true;
							}
						}
					} else if (course3 == 6) {
						attendanceMenu();
						case3=true;
						exit=true;
					} else {
						System.err.println("Please key in again!\n");
						case3=true;
					}
				}
				System.out.println("");
				System.out.println("Returning back to main menu ...");
				attendanceMenu();
				break;
			case 4:
				// View Attendance

				System.out.println("ATTENDANCE MENU: VIEW ATTENDANCE");
				System.out.println("Select the course you want to view.");
				courseMenu();

				int course4 = scanner.nextInt();
				

				boolean case4 = false;
				while (case4 != true){
					if ((course4 > 0) && (course4 < 6)) {
						String coursestr4 = course.get(course4-1).getName();
						System.out.println("Viewing attendance for " + coursestr4);
						case4 = true;
						exit = true;
						viewAttendance(coursestr4);
					} else if (course4 == 6) {
						attendanceMenu();
						case4 = true;
						exit = true;
					} else {
						System.err.println("Please key again!");
						case4 = true;
					}
				}
				break;
			case 5:
				// Quit
				exit = true;
				scanner.close();
				System.out.println("You are now exiting the program.");
				break;
			}
		}
	}

	public static void addAttendance(String course, int week){
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < att.attendanceSize(); i++){
			if (att.getAttendance().get(i).getCourse().equals(course)){

				int status = -1;
				int numStud = 0;
				int cs;

				if (week == 1){	
					for (cs = 0; cs < att.attendanceSize(); cs++){
						boolean c1 = false;
						while (c1 != true){


							if (att.getAttendance().get(cs).getCourse().equals(course)) {
								System.out.println("Mark " + att.getAttendance().get(cs).getName() + " of ID, " + att.getAttendance().get(cs).getId());
								status = scanner.nextInt();

								boolean attwk = false;
								while (attwk != true){
									if ((status > 0) && (status <4)){
										att.getAttendance().get(cs).setWeek1(attendanceStatus(status));
										attwk = true;
										c1 = true;
										numStud++;
										if (numStud == student.size()){
											System.out.println("");
											System.out.println("Returning back to main menu");
											attendanceMenu();
										}
									} else if (status == 4){
										attwk = true;
										c1 = true;
										numStud++;
										if (numStud == student.size()){
											System.out.println("");
											System.out.println("Returning back to main menu");
											attendanceMenu();
										}
									} else {
										System.err.println("Please key in again!");
										attwk = true;
									}
								}

							}
						}
					}
				} else if (week == 2) {
					for (cs = 0; cs < att.attendanceSize(); cs++){
						boolean c1 = false;
						while (c1 != true){


							if (att.getAttendance().get(cs).getCourse().equals(course)) {
								System.out.println("Mark " + att.getAttendance().get(cs).getName() + " of ID, " + att.getAttendance().get(cs).getId());
								status = scanner.nextInt();

								boolean attwk = false;
								while (attwk != true){
									if ((status > 0) && (status <4)){
										att.getAttendance().get(cs).setWeek2(attendanceStatus(status));
										attwk = true;
										c1 = true;
										numStud++;
										if (numStud == student.size()){
											System.out.println("");
											System.out.println("Returning back to main menu");
											attendanceMenu();
										}
										System.out.println(numStud);
									} else if (status == 4){
										attwk = true;
										c1 = true;
										numStud++;
										if (numStud == student.size()){
											System.out.println("");
											System.out.println("Returning back to main menu");
											attendanceMenu();
										}
									} else {
										System.err.println("Please key in again!");
										attwk = true;
									}
								}

							}
						}
					}
				} else if (week == 3) {
					for (cs = 0; cs < att.attendanceSize(); cs++){
						boolean c1 = false;
						while (c1 != true){


							if (att.getAttendance().get(cs).getCourse().equals(course)) {
								System.out.println("Mark " + att.getAttendance().get(cs).getName() + " of ID, " + att.getAttendance().get(cs).getId());
								status = scanner.nextInt();

								boolean attwk = false;
								while (attwk != true){
									if ((status > 0) && (status <4)){
										att.getAttendance().get(cs).setWeek3(attendanceStatus(status));
										attwk = true;
										c1 = true;
										numStud++;
										if (numStud == student.size()){
											System.out.println("");
											System.out.println("Returning back to main menu");
											attendanceMenu();
										}
									} else if (status == 4){
										attwk = true;
										c1 = true;
										numStud++;
										if (numStud == student.size()){
											System.out.println("");
											System.out.println("Returning back to main menu");
											attendanceMenu();
										}
									} else {
										System.err.println("Please key in again!");
										attwk = true;
									}
								}

							}
						}
					}
				} else if (week == 4) {
					for (cs = 0; cs < att.attendanceSize(); cs++){
						boolean c1 = false;
						while (c1 != true){


							if (att.getAttendance().get(cs).getCourse().equals(course)) {
								System.out.println("Mark " + att.getAttendance().get(cs).getName() + " of ID, " + att.getAttendance().get(cs).getId());
								status = scanner.nextInt();

								boolean attwk = false;
								while (attwk != true){
									if ((status > 0) && (status <4)){
										att.getAttendance().get(cs).setWeek4(attendanceStatus(status));
										attwk = true;
										c1 = true;
										numStud++;
										if (numStud == student.size()){
											System.out.println("");
											System.out.println("Returning back to main menu");
											attendanceMenu();
										}
										System.out.println(numStud);
									} else if (status == 4){
										attwk = true;
										c1 = true;
										numStud++;
										if (numStud == student.size()){
											System.out.println("");
											System.out.println("Returning back to main menu");
											attendanceMenu();
										}
									} else {
										System.err.println("Please key in again!");
										attwk = true;
									}
								}

							}
						}
					}
				} else if (week == 5) {
					for (cs = 0; cs < att.attendanceSize(); cs++){
						boolean c1 = false;
						while (c1 != true){


							if (att.getAttendance().get(cs).getCourse().equals(course)) {
								System.out.println("Mark " + att.getAttendance().get(cs).getName() + " of ID, " + att.getAttendance().get(cs).getId());
								status = scanner.nextInt();

								boolean attwk = false;
								while (attwk != true){
									if ((status > 0) && (status <4)){
										att.getAttendance().get(cs).setWeek5(attendanceStatus(status));
										attwk = true;
										c1 = true;
										numStud++;
										if (numStud == student.size()){
											System.out.println("");
											System.out.println("Returning back to main menu");
											attendanceMenu();
										}
										System.out.println(numStud);
									} else if (status == 4){
										attwk = true;
										c1 = true;
										numStud++;
										if (numStud == student.size()){
											System.out.println("");
											System.out.println("Returning back to main menu");
											attendanceMenu();
										}
									} else {
										System.err.println("Please key in again!");
										attwk = true;
									}
								}

							}
						}
					}
				}

			}
		}
	}

	public static void viewAttendance(String course){
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < att.attendanceSize(); i++){
			if (att.getAttendance().get(i).getCourse() == course){
				System.out.println("Name:\t" + att.getAttendance().get(i).getName());
				System.out.println("ID:\t" + att.getAttendance().get(i).getId());
				System.out.println("Week 1:\t" + att.getAttendance().get(i).getWeek1());
				System.out.println("Week 2:\t" + att.getAttendance().get(i).getWeek2());
				System.out.println("Week 3:\t" + att.getAttendance().get(i).getWeek3());
				System.out.println("Week 4:\t" + att.getAttendance().get(i).getWeek4());
				System.out.println("Week 5:\t" + att.getAttendance().get(i).getWeek5());
				System.out.println("");
			}
		}

		System.out.println("");
		System.out.println("Returning back to main menu");
		attendanceMenu();
		scanner.close();
	}

	public static String attendanceStatus(int choice){
		String status = "";
		if (choice == 1){
			status = "present";
		} else if (choice == 2) {
			status = "absent";
		} else if (choice == 3) {
			status = "mv";
		}
		return status;
	}

	public static void editAttendance(String course, int week){
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < att.attendanceSize(); i++){
			if (att.getAttendance().get(i).getCourse() == course){
				//System.out.print(index + ".\t");
				System.out.println("Name:\t" + att.getAttendance().get(i).getName());
				System.out.println("ID:\t" + att.getAttendance().get(i).getId());
				if (week == 1){
					System.out.println("Week 1:\t" + att.getAttendance().get(i).getWeek1());
				} else if (week ==2){
					System.out.println("Week 2:\t" + att.getAttendance().get(i).getWeek2());
				} else if (week == 3){
					System.out.println("Week 3:\t" + att.getAttendance().get(i).getWeek3());
				} else if (week == 4){
					System.out.println("Week 4:\t" + att.getAttendance().get(i).getWeek4());
				} else if (week == 5) {
					System.out.println("Week 5:\t" + att.getAttendance().get(i).getWeek5());
				}
				System.out.println("");
			}
		}

		boolean b = false;
		while (b != true){
			System.out.println("Which student do you want to edit? Key in his/her ID.");
			int stud = scanner.nextInt();
			boolean found = false;
			int edit = 0;


			boolean b2 = false;
			while (b2 != true){
				for (int st = 0; st < student.size(); st++){
					if (student.get(st).getID() == stud){
						found = true;
						System.out.println("What are you editing to?");
						System.out.println("1. present");
						System.out.println("2. absent");
						System.out.println("3. mv");
						System.out.println("4. Back");

						edit = scanner.nextInt();
						boolean b3 = false;
						while (b3 != true){
							if ((edit > 0) && (edit <4)){
								switch (week){
								case 1:
									for (int stu = 0; stu < att.attendanceSize(); stu++){
										if ((att.getAttendance().get(stu).getCourse().equals(course)) && (att.getAttendance().get(stu).getId() == stud)){
											att.getAttendance().get(stu).setWeek1(attendanceStatus(edit));
											b = true;
											b2 = true;
											b3=true;
											System.out.println(att.getAttendance().get(stu).getName() + "'s attendance for week " + week + " has been updated to " + att.getAttendance().get(stu).getWeek1() + ".");
										}
									}
									break;
								case 2:
									for (int stu = 0; stu < att.attendanceSize(); stu++){
										if ((att.getAttendance().get(stu).getCourse().equals(course)) && (att.getAttendance().get(stu).getId() == stud)){
											att.getAttendance().get(stu).setWeek2(attendanceStatus(edit));
											b = true;
											b2 = true;
											b3=true;
											System.out.println(att.getAttendance().get(stu).getName() + "'s attendance for week " + week + " has been updated to " + att.getAttendance().get(stu).getWeek2() + ".");
										}
									}
									break;
								case 3:
									for (int stu = 0; stu < att.attendanceSize(); stu++){
										if ((att.getAttendance().get(stu).getCourse().equals(course)) && (att.getAttendance().get(stu).getId() == stud)){
											att.getAttendance().get(stu).setWeek3(attendanceStatus(edit));
											b = true;
											b2 = true;
											b3=true;
											System.out.println(att.getAttendance().get(stu).getName() + "'s attendance for week " + week + " has been updated to " + att.getAttendance().get(stu).getWeek3() + ".");
										}
									}
									break;
								case 4:
									for (int stu = 0; stu < att.attendanceSize(); stu++){
										if ((att.getAttendance().get(stu).getCourse().equals(course)) && (att.getAttendance().get(stu).getId() == stud)){
											att.getAttendance().get(stu).setWeek4(attendanceStatus(edit));
											b = true;
											b2 = true;
											b3=true;
											System.out.println(att.getAttendance().get(stu).getName() + "'s attendance for week " + week + " has been updated to " + att.getAttendance().get(stu).getWeek4() + ".");
										}
									}
									break;
								case 5:
									for (int stu = 0; stu < att.attendanceSize(); stu++){
										if ((att.getAttendance().get(stu).getCourse().equals(course)) && (att.getAttendance().get(stu).getId() == stud)){
											att.getAttendance().get(stu).setWeek5(attendanceStatus(edit));
											b = true;
											b2 = true;
											b3=true;
											System.out.println(att.getAttendance().get(stu).getName() + "'s attendance for week " + week + " has been updated to " + att.getAttendance().get(stu).getWeek5() + ".");
										}
									}
									break;
								}
							} else if (edit == 4) {
								editAttendance(course,week);
								b = true;
								b2 = true;
								b3 = true;
							} else {
								System.err.println("Please key in again!");
								b3 = true;
							}
						}

					} 
				}
				if (found == false) {
					b2 = true;
					System.err.println("Invalid ID. Please key in again.\n");
				}
			}

		}


	}




}
