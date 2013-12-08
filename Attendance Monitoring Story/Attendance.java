import java.io.*;
import java.util.*;

public class Attendance {
	private ArrayList<AttendanceItem> attendance;

	public Attendance (){
		attendance = new ArrayList<AttendanceItem>();
	}
	public ArrayList<AttendanceItem> getAttendance(){
		return attendance;
	}
	public int attendanceSize(){
		return attendance.size();
	}

	public void importFile(String course, String filename) throws IOException{
		FileReader reader = new FileReader(filename);
		Scanner in = new Scanner(reader); 
		Scanner sc = new Scanner(System.in);
		String rmv = in.nextLine();
		while (in.hasNext()){
			String next = in.nextLine();
			String[] tmp = next.split(",");

			// Check the course, stud name and stud ID
			String name = ((tmp[0].toString()) + " " + (tmp[1].toString()));
			int ID = Integer.parseInt(tmp[2].toString());
			String week1 = (tmp[3].toString());
			String week2 = (tmp[4].toString());
			String week3 = (tmp[5].toString());
			String week4 = (tmp[6].toString());
			String week5 = (tmp[7].toString());

			boolean imp = false;
			while (imp != true){
				System.out.println("Do you want to update " + name +"'s attendance of student ID, " + ID + ",as follows? Key in y or n.");
				System.out.println("Week 1:\t" + week1);
				System.out.println("Week 2:\t" + week2);
				System.out.println("Week 3:\t" + week3);
				System.out.println("Week 4:\t" + week4);
				System.out.println("Week 5:\t" + week5);

				String yn = sc.nextLine();
				if (yn.equals("y")) {
					
					for (int cs = 0; cs < attendanceSize(); cs++){
						if ((attendance.get(cs).getCourse().equals(course)) && (attendance.get(cs).getName().equals(name)) && (attendance.get(cs).getId() == ID)) {
							
							attendance.get(cs).setWeek1(week1);
							attendance.get(cs).setWeek2(week2);
							attendance.get(cs).setWeek3(week3);
							attendance.get(cs).setWeek4(week4);
							attendance.get(cs).setWeek5(week5);
						}
					}
					imp = true;
				} else if (yn.equals("n")) {
					System.out.println(name + "'s attendance is not updated.");
					imp = true;
				} else {
					System.err.println("Please key in either y or n.\n");
				}

			}

		}
		//in.close();
		//sc.close();
	}



}