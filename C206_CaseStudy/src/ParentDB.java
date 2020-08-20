import java.util.ArrayList;

public class ParentDB {

	public static ArrayList<Parent> parentList = new ArrayList <Parent> ();

	public static void addParent(Parent pat1) {
		// TODO Auto-generated method stub
		parentList.add(pat1);
	}//addParent

	public static String viewAllParents() {
		// TODO Auto-generated method stub
		String output = "";
		for (int i = 0; i < parentList.size(); i++) { 
			output += String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s", 
					parentList.get(i).getName(),
					parentList.get(i).getEmail(),
					parentList.get(i).getStudentId(),
					parentList.get(i).getStudentName(),
					parentList.get(i).getStudentGrade(),
					parentList.get(i).getClassrom(),
					parentList.get(i).getTeacher());
		} //forLoop
		return output;
	}//viewAllParents
	

	public static void delParent(Parent pat2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < parentList.size(); i++) {
			if (parentList.get(i) == pat2) {
				pat2 = null;
				break;
			}//if
		}//for

	}

}//publicClassParentDB
