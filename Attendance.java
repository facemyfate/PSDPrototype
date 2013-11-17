import java.io.*;
import java.util.*;

public class Attendance {
	private ArrayList<AttendanceItem> attendance;
	
	public Attendance (){
		attendance = new ArrayList<>();
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
		String rmv = in.nextLine();
		while (in.hasNext()){
			String next = in.nextLine();
			String[] tmp = next.split(",");
			
			AttendanceItem a = new AttendanceItem(course);
			attendance.add(a);
			a.setCourse(course);
			String name = ((tmp[0].toString()) + ", " + (tmp[1].toString()));
			a.setName(name);
			a.setId(Integer.parseInt(tmp[2].toString()));
			a.setWeek1(tmp[3].toString());
			a.setWeek2(tmp[4].toString());
			a.setWeek3(tmp[5].toString());
			a.setWeek4(tmp[6].toString());
			a.setWeek5(tmp[7].toString());
			
		}
		/*System.out.println(attendance.get(1).getCourse());
		System.out.println(attendance.get(1).getName());
		System.out.println(attendance.get(1).getId());
		System.out.println(attendance.get(1).getWeek1());
		System.out.println(attendance.get(1).getWeek2());
		System.out.println(attendance.get(1).getWeek3());*/
		
		
		
		
	}
	
	
	
}
