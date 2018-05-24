package studentdirectory;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		String input = "";
		int input2 = 0;
		boolean validCMD = false;
		boolean validFind = false;
		boolean hasResult = false;
		Student s0 = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Scanner Scanner = new Scanner(System.in);
		
		fillStudents(s0, s1, s2, s3, s4);
		
		while(!input.toUpperCase().equals("EXIT")) {
			System.out.print("CONSOLE>");
			input = Scanner.nextLine();
			if (input.toUpperCase().equals("HELP")) { // HELP Command
				validCMD = true;
				clear();
				System.out.println("COMMAND\t\t-\tDESCRIPTION");
				System.out.println("LIST STUDENTS\t-\tLists all of the students with their information.");
				System.out.println("FIND\t\t-\tLists students with the specified information. (Type "
						+ "LAST NAME, FIRST NAME, COURSE, AGE, YEAR, or STUDENT ID on the next entry.");
				System.out.println("EXIT\t\t-\tTerminates the program.");
			}
			if (input.toUpperCase().equals("LIST STUDENTS")) { // LIST STUDENTS Command
				validCMD = true;
				Student201.listStudents(s0, s1, s2, s3, s4);
			}
			if (input.toUpperCase().equals("FIND")) { // FIND Command
				validCMD = true;
				System.out.print("FIND >");
				input = Scanner.nextLine();
				if (input.toUpperCase().equals("YEAR")) { // If the user chooses YEAR to find students
					validFind = true;
					System.out.print("FIND YEAR >");
					input = Scanner.nextLine();
					if(s0.getYear().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s0);
					}
					if(s1.getYear().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s1);
					}
					if(s2.getYear().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s2);
					}
					if(s3.getYear().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s3);
					}
					if(s4.getYear().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s4);
					}
				if (hasResult == true) {
					hasResult = false;
				} else {
					System.out.println("CONSOLE MESSAGE: No results were found with the year '"
								+ input + "'.");
				}
				}
				if (input.toUpperCase().equals("AGE")) { // If the user chooses AGE to find students
					validFind = true;
					System.out.print("FIND AGE >");
					input2 = Scanner.nextInt();
					Scanner.nextLine();
					if(s0.getAge() == input2) {
						hasResult = true;
						System.out.println(s0);
					}
					if(s1.getAge() == input2) {
						hasResult = true;
						System.out.println(s1);
					}
					if(s2.getAge() == input2) {
						hasResult = true;
						System.out.println(s2);
					}
					if(s3.getAge() == input2) {
						hasResult = true;
						System.out.println(s3);
					}
					if(s4.getAge() == input2) {
						hasResult = true;
						System.out.println(s4);
					}
				if (hasResult == true) {
					hasResult = false;
				}else {
					System.out.println("CONSOLE MESSAGE: No results were found with the age '"
								+ input2 + "'.");
				}
				}
				if (input.toUpperCase().equals("COURSE")) { // If the user chooses COURSE to find students
					validFind = true;
					System.out.print("FIND COURSE >");
					input = Scanner.nextLine();
					if(s0.getCourse().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s0);
					}
					if(s1.getCourse().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s1);
					}
					if(s2.getCourse().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s2);
					}
					if(s3.getCourse().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s3);
					}
					if(s4.getCourse().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s4);
					}
				if (hasResult == true) {
						hasResult = false;
					} else {
						System.out.println("CONSOLE MESSAGE: No results were found with the course '"
								+ input + "'.");
						}					
				}
				if (input.toUpperCase().equals("ID")) { // If the user chooses FIRST NAME to find students
					validFind = true;
					System.out.print("FIND ID >");
					input2 = Scanner.nextInt();
					Scanner.nextLine();
					if(s0.getStudentID() == input2) {
						hasResult = true;
						System.out.println(s0);
					}
					if(s1.getStudentID() == input2) {
						hasResult = true;
						System.out.println(s1);
					}
					if(s2.getStudentID() == input2) {
						hasResult = true;
						System.out.println(s2);
					}
					if(s3.getStudentID() == input2) {
						hasResult = true;
						System.out.println(s3);
					}
					if(s4.getStudentID() == input2) {
						hasResult = true;
						System.out.println(s4);
					}
				if (hasResult == true) {
					hasResult = false;
					} else {
						System.out.println("CONSOLE MESSAGE: No results were found with the ID '"
						+ input2 + "'.");
						}
				}
				if (input.toUpperCase().equals("FIRST NAME")) { // If the user chooses FIRST NAME to find students
					validFind = true;
					System.out.print("FIND FIRST NAME >");
					input = Scanner.nextLine();
					if(s0.getFirstName().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s0);
					} 
					if(s1.getFirstName().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s1);
					}
					if(s2.getFirstName().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s2);
					}
					if(s3.getFirstName().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s3);
					}
					if(s4.getFirstName().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s4);
					}
				if (hasResult == true) {
					hasResult = false;
				} else {
					System.out.println("CONSOLE MESSAGE: No results were found with the first name '"
					+ input + "'.");
					}				
				}
				if (input.toUpperCase().equals("LAST NAME")) { // If the user chooses LAST NAME to find students
					validFind = true;
					System.out.print("FIND LAST NAME >");
					input = Scanner.nextLine();
					if(s0.getLastName().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s0);
					}
					if(s1.getLastName().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s1);
					}
					if(s2.getLastName().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s2);
					}
					if(s3.getLastName().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s3);
					}
					if(s4.getLastName().toUpperCase().equals(input.toUpperCase())) {
						hasResult = true;
						System.out.println(s4);
					}
				if (hasResult == true) {
					hasResult = false;
				} else {
					System.out.println("CONSOLE MESSAGE: No results were found with the last name '"
							+ input + "'.");
					}
				}
			if (validFind == true) {
				validFind = false;
			} else {
				System.out.println("ERROR MESSAGE: Choose either FIRST NAME, LAST NAME,"
						+ " AGE, COURSE, YEAR, or STUDENT ID when using the FIND "
						+ "command.");
			}
			}
		if (input.toUpperCase().equals("EXIT")) {
			System.out.println("CONSOLE MESSAGE: Shutting down...");
		}
		
		if (validCMD == true) {
			validCMD = false;
		} else {
			System.out.println("ERROR MESSAGE: '" + input + "' is not recognized "
					+ "as a command.");
		}
		
		}
		
		TimeUnit.SECONDS.sleep(1);
		System.out.println("CONSOLE MESSAGE: Program terminated.");
	}
	
	public static void fillStudents(Student s0, Student s1, Student s2, Student s3, Student s4) throws InterruptedException {
		
		clear();
		System.out.println("Filling the information of Students...");
		TimeUnit.SECONDS.sleep(1);
		clear();
		
		s0.setLastName("Smith");
		s0.setFirstName("John");
		s0.setAge(18);
		s0.setCourse("IT");
		s0.setYear("2nd Year");
		s0.setStudentID(20180001);
		
		s1.setLastName("Wallace");
		s1.setFirstName("Mark");
		s1.setAge(18);
		s1.setCourse("IT");
		s1.setYear("1st Year");
		s1.setStudentID(20180002);

		s2.setLastName("Reese");
		s2.setFirstName("Tony");
		s2.setAge(19);
		s2.setCourse("MA");
		s2.setYear("2nd Year");
		s2.setStudentID(20180003);
		
		s3.setLastName("Johnson");
		s3.setFirstName("Liza");
		s3.setAge(18);
		s3.setCourse("BA");
		s3.setYear("1st Year");
		s3.setStudentID(20180004);
		
		s4.setLastName("Nguyen");
		s4.setFirstName("Kim");
		s4.setAge(17);
		s4.setCourse("ECE");
		s4.setYear("1st Year");
		s4.setStudentID(20180005);
	}
	
	public static void clear() {
		for(int x = 0; x<=100; x++) {
			System.out.println();
		}
	}
	
}
