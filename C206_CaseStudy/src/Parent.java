
public class Parent {
	private String name;
	private String email;
	private String studentId;
	private String studentName;
	private String studentGrade;
	private String classrom;
	private String teacher;
	
	public Parent(String name, String email, 
			String studentId, String studentName, 
			String studentGrade, 
			String classrom, String teacher) {
		this.name = name;
		this.email = email;
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGrade = studentGrade;
		this.classrom = classrom;
		this.teacher = teacher;
	}//ParentGenerator

	public String getName() {
		return name;
	}//getName
	public void setName(String name) {
		this.name = name;
	}//setName

	public String getEmail() {
		return email;
	}//getEmail
	public void setEmail(String email) {
		this.email = email;
	}//setEmail

	public String getStudentId() {
		return studentId;
	}//getStudentId
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}//setStudentId

	public String getStudentName() {
		return studentName;
	}//getStudentName
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}///setStudentName

	public String getStudentGrade() {
		return studentGrade;
	}//getStudentGrade
	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}//setStudentGrade

	public String getClassrom() {
		return classrom;
	}//getClassrom
	public void setClassrom(String classrom) {
		this.classrom = classrom;
	}//setClassrom

	public String getTeacher() {
		return teacher;
	}//getTeacher
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}//setTeacher

	
	
}//publicClassParent
