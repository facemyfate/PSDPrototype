// view dont need week.

import java.io.IOException;
import java.util.Scanner;

public class Main {
	static Attendance att = new Attendance();



	public static void main (String[] args) {


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
	}

	public static void courseMenu(){
		System.out.println("1. Professional Software Development 3");
		System.out.println("2. Algorithmics 3");
		System.out.println("3. Advanced Programming 3");
		System.out.println("4. Interactive Systems 3");
		System.out.println("5. Programming Language 3");
		System.out.println("6. Back to Main Menu");
	}

	public static void selection(int i){
		boolean exit = false;



		while (exit != true){
			Scanner scanner = new Scanner(System.in);

			switch(i){
			case 1:
				// New Attendance

				break;
			case 2:
				//Import Attendance
				System.out.println("ATTENDANCE MENU: IMPORT ATTENDANCE");
				System.out.println("Select the course to import the attendance.\n");
				courseMenu();

				int course2 = scanner.nextInt();
				String coursestr2 = "";
				String url = "";
				//Attendance att = new Attendance(); 


				boolean b2 = false;
				while(b2 != true){
					switch(course2){
					case 1:
						coursestr2 = "Professional Software Development 3";
						System.out.println("Please key in the location of the file."); 

						url = scanner.next();  
						try { 
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

						break;
					case 2:
						coursestr2 = "Algorithmics 3";
						System.out.println("Please key in the location of the file."); 

						url = scanner.next(); 
						try { 
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
						break;
					case 3:
						coursestr2 = "Advanced Programming 3";
						System.out.println("Please key in the location of the file."); 

						url = scanner.next(); 
						try { 
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
						break;
					case 4:
						coursestr2 = "Interactive Systems 3";
						System.out.println("Please key in the location of the file."); 

						url = scanner.next();  
						try { 
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
						break;
					case 5:
						coursestr2 = "Programming Languages 3";
						System.out.println("Please key in the location of the file."); 

						url = scanner.next(); 
						try { 
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
						break;
					case 6:
						attendanceMenu();
						break;
					default:
						System.err.println("Please key in again!\n");
						b2 = true;
						break;

					}
				}
				break;
			case 3:
				// Edit Attendance
				System.out.println("ATTENDANCE MENU: EDIT ATTENDANCE");
				System.out.println("Choose the course.\n");
				courseMenu();

				int course3 = scanner.nextInt();
				int week3 = 0;
				String coursestr3 = "";

				boolean a = false;
				while(a != true){
					switch(course3){
					case 1:
						coursestr3 = "Professional Software Development 3";
						System.out.println("Choose the week of attendance you want to edit. Key from week 1 to 5");
						System.out.println("Key 0 to exit to Main Menu");
						week3 = scanner.nextInt();
						if ((week3 > 0) && (week3 < 6)){
							System.out.println("Editing attendance for " + coursestr3 + " of week " + week3);
							exit = true;
							a = true;
							editAttendance(coursestr3, week3);
						} else if (week3 == 0){
							attendanceMenu();
						} else {
							System.err.println("Please select from choice 1 to 5\n");

						}
						break;
					case 2:
						coursestr3 = "Algorithmics 3";
						System.out.println("Choose the week of attendance you want to edit. Key from week 1 to 5");
						week3 = scanner.nextInt();
						if ((week3 > 0) && (week3 < 6)){
							System.out.println("Editing attendance for " + coursestr3 + " of week " + week3);
							exit = true;
							a = true;
							editAttendance(coursestr3, week3);
						} else if (week3 == 0){
							attendanceMenu();
						} else {
							System.err.println("Please select from choice 1 to 5\n");

						}
						break;
					case 3:
						coursestr3 = "Advanced Programming 3";
						System.out.println("Choose the week of attendance you want to edit. Key from week 1 to 5");
						week3 = scanner.nextInt();
						if ((week3 > 0) && (week3 < 6)){
							System.out.println("Editing attendance for " + coursestr3 + " of week " + week3);
							exit = true;
							a = true;
							editAttendance(coursestr3, week3);
						} else if (week3 == 0){
							attendanceMenu();
						} else {
							System.err.println("Please select from choice 1 to 5\n");

						}
						break;
					case 4:
						coursestr3 = "Interactive Systems 3";
						System.out.println("Choose the week of attendance you want to edit. Key from week 1 to 5");
						week3 = scanner.nextInt();
						if ((week3 > 0) && (week3 < 6)){
							System.out.println("Editing attendance for " + coursestr3 + " of week " + week3);
							exit = true;
							a = true;
							editAttendance(coursestr3, week3);
						} else if (week3 == 0){
							attendanceMenu();
						} else {
							System.err.println("Please select from choice 1 to 5\n");

						}
						break;
					case 5:
						coursestr3 = "Programming Languages 3";
						System.out.println("Choose the week of attendance you want to edit. Key from week 1 to 5");
						week3 = scanner.nextInt();
						if ((week3 > 0) && (week3 < 6)){
							System.out.println("Editing attendance for " + coursestr3 + " of week " + week3);
							exit = true;
							a = true;
							editAttendance(coursestr3, week3);
						} else if (week3 == 0){
							attendanceMenu();
						} else {
							System.err.println("Please select from choice 1 to 5\n");

						}
						break;
					case 6:
						attendanceMenu();
						break;
					default:
						System.err.println("Please key in again!\n");
						a = true;
						break;

					}
				}
				break;
			case 4:
				// View Attendance
				String coursestr4 = "";

				System.out.println("ATTENDANCE MENU: VIEW ATTENDANCE");
				System.out.println("Choose the course.");
				System.out.println("1. Professional Software Development 3");
				System.out.println("2. Algorithmics 3");
				System.out.println("3. Advanced Programming 3");
				System.out.println("4. Interactive Systems 3");
				System.out.println("5. Programming Language 3");

				int course4 = scanner.nextInt();

				if (course4 == 1){
					coursestr4 = "Professional Software Development 3";
					System.out.println("Viewing attendance for Professional Software Development 3 ");
					exit = true;
					System.out.println("");
					viewAttendance(coursestr4);
				} else if (course4 == 2) {
					coursestr4 = "Algorithmics 3";
					System.out.println("Viewing attendance for Algorithmics 3");
					exit = true;
					System.out.println("");
					viewAttendance(coursestr4);
				} else if (course4 == 3){
					coursestr4 = "Advanced Programming 3";
					System.out.println("Viewing attendance for Advanced Programming 3");
					exit = true;
					System.out.println("");
					viewAttendance(coursestr4);
				} else if (course4 == 4) {
					coursestr4 = "Interactive Systems 3";
					System.out.println("Viewing attendance for Interactive Systems 3");
					exit = true;
					System.out.println("");
					viewAttendance(coursestr4);
				} else if (course4 == 5) {
					coursestr4 = "Programming Language 3";
					System.out.println("Viewing attendance for Programming Language 3");
					exit = true;
					System.out.println("");
					viewAttendance(coursestr4);
				} else {
					System.err.println("Please select from choice 1 to 5.\n");

				}
				viewAttendance(coursestr4);
				break;
			case 5:
				// Quit
				exit = true;
				System.out.println("You are now exiting the program.");
				break;
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

		boolean b = false;
		while (b != true){

			System.out.println("Please key in your choice.");
			System.out.println("1. Attendance Menu");
			System.out.println("2. Exit");

			int key = scanner.nextInt();
			boolean b2 = false;
			while(b2 != true){
				switch(key){
				case 1:
					attendanceMenu();
					b = true;
					b2 = true;
					break;
				case 2:
					System.out.println("You are now exiting the programme."); 
					b2 = true;
					b = true;
					break;
				default:
					System.err.println("Please key in again!\n");
					b2 = true;
					break;

				}
			}
		}

	}
	public static void editAttendance(String course, int week){
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < att.attendanceSize(); i++){
			if (att.getAttendance().get(i).getCourse() == course){
				System.out.print(i+1 + ".\t");
				System.out.println("Name:\t" + att.getAttendance().get(i).getName());
				System.out.println("\tID:\t" + att.getAttendance().get(i).getId());
				if (week == 1){
					System.out.println("\tWeek 1:\t" + att.getAttendance().get(i).getWeek1());
				} else if (week ==2){
					System.out.println("\tWeek 2:\t" + att.getAttendance().get(i).getWeek2());
				} else if (week == 3){
					System.out.println("\tWeek 3:\t" + att.getAttendance().get(i).getWeek3());
				} else if (week == 4){
					System.out.println("\tWeek 4:\t" + att.getAttendance().get(i).getWeek4());
				} else {
					System.out.println("\tWeek 5:\t" + att.getAttendance().get(i).getWeek5());
				}
				System.out.println("");
			}
		}

		boolean b = false;
		while (b != true){
			System.out.println("Which student do you want to edit? Key in his/her index.");
			int student = scanner.nextInt();

			boolean b2 = false;
			while (b2 != true){

				if ((student > 0) && (student < att.attendanceSize())){
					System.out.println("What are you editing to?");
					System.out.println("1. present");
					System.out.println("2. absent");
					System.out.println("3. mv");
					System.out.println("4. Back");

					int edit = scanner.nextInt();


					switch (edit){
					case 1:
						if (week == 1){
							att.getAttendance().get(student-1).setWeek1("present");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
							
						} else if (week ==2){
							att.getAttendance().get(student-1).setWeek2("present");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
						} else if (week == 3){
							att.getAttendance().get(student-1).setWeek3("present");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
						} else if (week == 4){
							att.getAttendance().get(student-1).setWeek4("present");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
						} else {
							att.getAttendance().get(student-1).setWeek5("present");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
						}
						boolean b3 = false;
						while (b3 != true){
							System.out.println("");
							System.out.println("Please key in your choice.");
							System.out.println("1. Attendance Menu");
							System.out.println("2. Exit");

							int key = scanner.nextInt();
							boolean b4 = false;
							while(b4 != true){
								switch(key){
								case 1:
									attendanceMenu();
									b3 = true;
									b4 = true;
									break;
								case 2:
									System.out.println("You are now exiting the programme."); 
									b3 = true;
									b4 = true;
									break;
								default:
									System.err.println("Please key in again!\n");
									b4 = true;
									break;

								}
							}
						}
						break;
					case 2:
						if (week == 1){
							att.getAttendance().get(student-1).setWeek1("absent");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
						} else if (week ==2){
							att.getAttendance().get(student-1).setWeek2("absent");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
						} else if (week == 3){
							att.getAttendance().get(student-1).setWeek3("absent");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
						} else if (week == 4){
							att.getAttendance().get(student-1).setWeek4("absent");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
						} else {
							att.getAttendance().get(student-1).setWeek5("absent");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
						}
						boolean b5 = false;
						while (b5 != true){
							System.out.println("");
							System.out.println("Please key in your choice.");
							System.out.println("1. Attendance Menu");
							System.out.println("2. Exit");

							int key = scanner.nextInt();
							boolean b6 = false;
							while(b6 != true){
								switch(key){
								case 1:
									attendanceMenu();
									b5 = true;
									b6 = true;
									break;
								case 2:
									System.out.println("You are now exiting the programme."); 
									b5 = true;
									b6 = true;
									break;
								default:
									System.err.println("Please key in again!\n");
									b6 = true;
									break;

								}
							}
						}
						break;
					case 3:
						if (week == 1){
							att.getAttendance().get(student-1).setWeek1("mv");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
						} else if (week ==2){
							att.getAttendance().get(student-1).setWeek2("mv");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
						} else if (week == 3){
							att.getAttendance().get(student-1).setWeek3("mv");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
						} else if (week == 4){
							att.getAttendance().get(student-1).setWeek4("mv");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
						} else {
							att.getAttendance().get(student-1).setWeek5("mv");
							b = true;
							b2 = true;
							System.out.print(att.getAttendance().get(student-1).getName());
							System.out.print("'s attendance for week ");
							System.out.print(week);
							System.out.print(" has been updated to ");
							System.out.print(att.getAttendance().get(student-1).getWeek1());
							System.out.println(".");
						}
						boolean b7 = false;
						while (b7 != true){
							System.out.println("");
							System.out.println("Please key in your choice.");
							System.out.println("1. Attendance Menu");
							System.out.println("2. Exit");

							int key = scanner.nextInt();
							boolean b8 = false;
							while(b8 != true){
								switch(key){
								case 1:
									attendanceMenu();
									b7 = true;
									b8 = true;
									break;
								case 2:
									System.out.println("You are now exiting the programme."); 
									b7 = true;
									b8 = true;
									break;
								default:
									System.err.println("Please key in again!\n");
									b8 = true;
									break;

								}
							}
						}
						break;
					case 4:
						editAttendance(course, week);
						b = true;
						b2 = true;
						break;
					default:
						System.err.println("Please key in again!");
						b2 = true;
						break;

					}


				} else {
					System.err.println("Please select from choice 1 to" + att.attendanceSize() +"\n");
				}
			}
		}
	}




}
