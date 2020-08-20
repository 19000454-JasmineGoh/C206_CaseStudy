
public class Student {
	private String id;
	private String name;
	private String grade;
	private String classroom;
	private String teacher;
	private String parentName;
	private String parentEmail;
	
	public Student(String id, String name, String grade, String classroom, 
				String teacher, String parentName, String parentEmail) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.classroom = classroom;
		this.teacher = teacher;
		this.parentName = parentName;
		this.parentEmail = parentEmail;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentEmail() {
		return parentEmail;
	}

	public void setParentEmail(String parentEmail) {
		this.parentEmail = parentEmail;
	}
	
	public String toString() {
		
		String studentInfo = String.format("%-15s %-15s %-10s %-15s %-15s %-15s %-15s\n",
				id, name, grade, classroom, teacher, parentName, parentEmail);
				
		return studentInfo;
	}
	
}
