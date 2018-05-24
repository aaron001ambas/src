package studentdirectory;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		String input = "";
		int input2 = 0;
		Student s0 = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Scanner Scanner = new Scanner(System.in);
		int temp = 0;
		
		fillStudents(s0, s1, s2, s3, s4);
		
		do {
			System.out.println("Loop no: " + temp);
			System.out.print("CONSOLE>");
			input = Scanner.nextLine();
			if (input.toUpperCase().equals("LIST STUDENTS")) {
				Student201.listStudents(s0, s1, s2, s3, s4);
			} /* else System.out.println("ERROR MESSAGE: '" + input + "' is not recognized "
					+ "as a command."); */
			if (input.toUpperCase().equals("FIND")) {
				System.out.print("FIND >");
				input = Scanner.nextLine();
				if (input.toUpperCase().equals("ID")) {
					System.out.print("FIND ID >");
					input2 = Scanner.nextInt();
					if(s0.getStudentID() == input2) {
						System.out.println(s0);
					} /* else System.out.println("CONSOLE MESSAGE: No results were found with the first name '"
							+ input + "'."); */
					if(s1.getStudentID() == input2) {
						System.out.println(s1);
					}
					if(s2.getStudentID() == input2) {
						System.out.println(s2);
					}
					if(s3.getStudentID() == input2) {
						System.out.println(s3);
					}
					if(s4.getStudentID() == input2) {
						System.out.println(s4);
					}
				}
				if (input.toUpperCase().equals("FIRST NAME")) { // If the user chooses FIRST NAME to find students
					System.out.print("FIND FIRST NAME >");
					input = Scanner.nextLine();
					if(s0.getFirstName().toUpperCase().equals(input.toUpperCase())) {
						System.out.println(s0);
					} /* else System.out.println("CONSOLE MESSAGE: No results were found with the first name '"
							+ input + "'."); */
					if(s1.getFirstName().toUpperCase().equals(input.toUpperCase())) {
						System.out.println(s1);
					}
					if(s2.getFirstName().toUpperCase().equals(input.toUpperCase())) {
						System.out.println(s2);
					}
					if(s3.getFirstName().toUpperCase().equals(input.toUpperCase())) {
						System.out.println(s3);
					}
					if(s4.getFirstName().toUpperCase().equals(input.toUpperCase())) {
						System.out.println(s4);
					}
				}
				if (input.toUpperCase().equals("LAST NAME")) { // If the user chooses LAST NAME to find students
					System.out.print("FIND LAST NAME >");
					input = Scanner.nextLine();
					if(s0.getLastName().toUpperCase().equals(input.toUpperCase())) {
						System.out.println(s0);
					} /* else System.out.println("CONSOLE MESSAGE: No results were found with the last name '"
							+ input + "'."); */
					if(s1.getLastName().toUpperCase().equals(input.toUpperCase())) {
						System.out.println(s1);
					}
					if(s2.getLastName().toUpperCase().equals(input.toUpperCase())) {
						System.out.println(s2);
					}
					if(s3.getLastName().toUpperCase().equals(input.toUpperCase())) {
						System.out.println(s3);
					}
					if(s4.getLastName().toUpperCase().equals(input.toUpperCase())) {
						System.out.println(s4);
					}
				}
				
			}
		temp++;
		}while (!input.equals("exit"));

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
		s0.setYear("1st Year");
		s0.setStudentID(20180001);
		
		s1.setLastName("Wallace");
		s1.setFirstName("Mark");
		s1.setAge(18);
		s1.setCourse("IT");
		s1.setYear("1st Year");
		s1.setStudentID(20180002);

		s2.setLastName("Reese");
		s2.setFirstName("Tony");
		s2.setAge(18);
		s2.setCourse("MA");
		s2.setYear("1st Year");
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
