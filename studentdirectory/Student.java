package studentdirectory;

public class Student extends Student201{
	
	private String lastName;
	private String firstName;
	private String course;
	private String year;
	private int age;
	private int studentID;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	@Override
	public String toString() {
		return "|\tID: " + this.getStudentID() + "\t|\t Name: " + this.getLastName() + ", "
				+ this.getFirstName() + "\t|\t Course: " + this.getCourse() + "\t|\t Year: " +
				this.getYear() + "\t\t|\t Age: " + this.getAge() + "\t|";
	}
	
}


