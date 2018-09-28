/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */

import java.util.Scanner;


public class ProblemSet2 {
	private static Scanner in = new Scanner(System.in);
	
	/**
	 * You need not modify the main method.
	 */
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
		in.close();
	}
	
	public void sayHello() {
		System.out.println("Type First and Last Name followed by pressing \"Enter\"");
		
		String fNamelName = in.nextLine();
		System.out.println("Hello," + " " + fNamelName);
	}
	
	public void gradeMe() {
		System.out.println("Please enter your homework grade.");
		float hwGrade = in.nextFloat();
		
		System.out.println("Please enter your quiz grade.");
		float quizGrade = in.nextFloat();
		
		System.out.println("Please enter your test grade.");
		float testGrade = in.nextFloat();

		double average = ((hwGrade * .15) + (quizGrade * .30) + (testGrade * .55)) / 3.00;
		
		System.out.println("Your average is " + average);
		
	}
	
	public void groupUs() {
		System.out.println("Enter number of teachers.");
		int numTeachers = in.nextInt();
		
		System.out.println("Enter number of students.");
		int numStudents = in.nextInt();
		
		float numBus = ((numStudents + numTeachers)/47);
		float extra = numBus % 47;
		System.out.println("There will be " + numBus + " buses required with " + (numBus-1) + " buses full and " + extra + "people on the last bus.");
		
  
	}
	
	public void info() {
		System.out.println("Enter first name.");
		String fName1 = in.nextLine();

		System.out.println("Enter last name.");
		String lName1 = in.nextLine();

		System.out.println("Enter grade.");
		int grade1 = in.nextInt();

		System.out.println("Enter age.");
		int age1 = in.nextInt();
		in.nextLine();

		System.out.println("Enter hometown.");
		String hometown1 = in.nextLine();

		System.out.println("NAME: " + fName1 + " " + lName1 + "\nGRADE: " + grade1 + "\nAGE: " + age1 + "\nHOMETOWN: " + hometown1);
	}
	
	public void initials() {
		System.out.println("Enter first name.");
		String fName1 = in.nextLine();

		System.out.println("Enter middle name.");
		String mName1 = in.nextLine();

		System.out.println("Enter last name.");
		String lName1 = in.nextLine();

		String newFNAME = fName1.substring(0,1);
		String newMNAME = mName1.substring(0,1);
		String newLNAME = lName1.substring(0,1);

		System.out.println("Your initials are " + newFNAME + newMNAME + newLNAME);


	}
}