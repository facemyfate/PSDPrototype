// view dont need week.

import java.util.Scanner;

public class Main {





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
	public static void selection(int i){
		boolean exit = false;



		while (exit != true){
			Scanner scanner = new Scanner(System.in);

			switch(i){
			case 1:
				

				break;
			case 2:
				//Import Attendance
				break;
			case 3:
				// Edit Attendance
				System.out.println("ATTENDANCE MENU: EDIT ATTENDANCE");
				System.out.println("Choose the course.");
				System.out.println("1. Professional Software Development 3");
				System.out.println("2. Algorithmics 3");
				System.out.println("3. Advanced Programming 3");
				System.out.println("4. Interactive Systems 3");
				System.out.println("5. Programming Language 3");

				int course3 = scanner.nextInt();
				int week3 = 0;
				String coursestr = null;

				boolean a = false;
				while(a != true){
					switch(course3){
					case 1:
						coursestr = "Professional Software Development 3";
						System.out.println("Choose the week of attendance you want to view. Key from week 1 to 10");
						week3 = scanner.nextInt();
						if ((week3 > 0) && (week3 < 11)){
								System.out.println("Editing attendance for " + coursestr + " of week " + week3);
								exit = true;
								a = true;
								editAttendance(course3, week3);
							}	else {
								System.err.println("Please select from choice 1 to 10\n");

							}
						break;
					case 2:
						coursestr = "Algorithmics 3";
						System.out.println("Choose the week of attendance you want to view. Key from week 1 to 10");
						week3 = scanner.nextInt();
						if ((week3 > 0) && (week3 < 11)){
								System.out.println("Editing attendance for " + coursestr + " of week " + week3);
								exit = true;
								a = true;
								editAttendance(course3, week3);
							}	else {
								System.err.println("Please select from choice 1 to 10\n");

							}
						break;
					case 3:
						coursestr = "Advanced Programming 3";
						System.out.println("Choose the week of attendance you want to view. Key from week 1 to 10");
						week3 = scanner.nextInt();
						if ((week3 > 0) && (week3 < 11)){
								System.out.println("Editing attendance for " + coursestr + " of week " + week3);
								exit = true;
								a = true;
								editAttendance(course3, week3);
							}	else {
								System.err.println("Please select from choice 1 to 10\n");

							}
						break;
					case 4:
						coursestr = "Interactive Systems 3";
						System.out.println("Choose the week of attendance you want to view. Key from week 1 to 10");
						week3 = scanner.nextInt();
						if ((week3 > 0) && (week3 < 11)){
								System.out.println("Editing attendance for " + coursestr + " of week " + week3);
								exit = true;
								a = true;
								editAttendance(course3, week3);
							}	else {
								System.err.println("Please select from choice 1 to 10\n");

							}
						break;
					case 5:
						coursestr = "Programming Languages 3";
						System.out.println("Choose the week of attendance you want to view. Key from week 1 to 10");
						week3 = scanner.nextInt();
						if ((week3 > 0) && (week3 < 11)){
								System.out.println("Editing attendance for " + coursestr + " of week " + week3);
								exit = true;
								a = true;
								editAttendance(course3, week3);
							}	else {
								System.err.println("Please select from choice 1 to 10\n");

							}
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
				System.out.println("ATTENDANCE MENU: VIEW ATTENDANCE");
				System.out.println("Choose the course.");
				System.out.println("1. Professional Software Development 3");
				System.out.println("2. Algorithmics 3");
				System.out.println("3. Advanced Programming 3");
				System.out.println("4. Interactive Systems 3");
				System.out.println("5. Programming Language 3");

				int course4 = scanner.nextInt();

				if (course4 == 1){
					System.out.println("Viewing attendance for Professional Software Development 3 ");
					exit = true;
				} else if (course4 == 2) {
					System.out.println("Viewing attendance for Algorithmics 3");
					exit = true;
				} else if (course4 == 3){
					System.out.println("Viewing attendance for Advanced Programming 3");
					exit = true;
				} else if (course4 == 4) {
					System.out.println("Viewing attendance for Interactive Systems 3");
					exit = true;
				} else if (course4 == 5) {
					System.out.println("Viewing attendance for Programming Language 3");
					exit = true;
				} else {
					System.err.println("Please select from choice 1 to 5.\n");

				}
				viewAttendance(course4);
				break;
			case 5:
				// Quit
				exit = true;
				System.out.println("You are now exiting the program.");
				break;
			}
		}
	}

	public static void viewAttendance(int course){

	}
	public static void editAttendance(int course, int week){

	}




}
