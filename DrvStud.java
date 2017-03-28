/*The following code implements a mock Student Registration System for a university.
It uses the interface and inhertitance features present in Java.*/

import java.util.Scanner;
interface Department
{
	String deptName = "Computer Science"; // public static final data members
	String deptHead = "John Smith"; // same as above
	
	void showDeptData();
}

class Hostel
{
	String hostelName;
	String hostelLocation;
	int numberofRooms;
	
	public Hostel(String hostelName, String hostelLocation, int numberofRooms)
	{
		this.hostelName = hostelName;
		this.hostelLocation = hostelLocation;
		this.numberofRooms = numberofRooms;
	}
	
	void showHostelData()
	{
		System.out.println("The name of the hostel is " + hostelName + ".");
		System.out.println("The hostel is located at " + hostelLocation + ".");
		System.out.println("The hostel has " + numberofRooms + " rooms.");
	}
}

class Student extends Hostel implements Department
{
	String studentName;
	int regdNo;
	String electiveSubject;
	double avgMarks;
	
	public Student(String hostelName, String hostelLocation, int numberofRooms, String studentName, int regdNo, String electiveSubject, double avgMarks)
	{
		super(hostelName, hostelLocation, numberofRooms); // calls the Hostel constructor
		this.studentName = studentName;
		this.regdNo = regdNo;
		this.electiveSubject = electiveSubject;
		this.avgMarks = avgMarks;
	}
	
	public void showDeptData() // defines the abstract method from the Department interface
	{
		System.out.println("The department is " + deptName + ".");
		System.out.println("The department head is " + deptHead + ".");
	}
	
	void showDetails() // displays the student details
	{
		System.out.println("The name of the student is " + studentName + ".");
		System.out.println("The registration number of the student is " + regdNo + ".");
		System.out.println("The elective subject chosen by the student is " + electiveSubject + ".");
		System.out.println("The average marks secured by the student is " + avgMarks + ".");
		showDeptData();
		showHostelData();		
	}
	
}

class DrvStud
{
	public static void main(String args[])
	{
		int choice = 0, regdNo = 0, numberofRooms = 0, i = 0, size = 0;
		String studentName, electiveSubject, hostelName, hostelLocation , deptName, deptHead;
		double avgMarks = 0.0;
		Scanner in = new Scanner(System.in);
		System.out.println("How many records would you like to have on your database?");
		size = in.nextInt();
		Student stu[] = new Student[size]; // creates an array of objects for the student database
		do
		{
			System.out.println();
			System.out.println("Enter 1 to admit a new student.");
			System.out.println("Enter 2 to see the details of a student.");
			System.out.println("Enter 3 to exit.");
			choice = in.nextInt();
			start: // label to break to from the swtich case block
			switch(choice)
			{
				case 1: 
						if(i > size - 1) // checks if the array of objects is full
						{
							System.out.println("Database full! Operation aborted.");
							break;					
						}
						in.nextLine();
						System.out.println("Please enter the name of the student.");
						studentName = in.nextLine();
						System.out.println("Please enter the registration number of the student.");
						regdNo = in.nextInt();
						in.nextLine(); // consumes the pending return key from the buffer
						System.out.println("Please enter the elective subject of the student.");
						electiveSubject = in.nextLine();
						System.out.println("Please enter the average marks of the student");
						avgMarks = in.nextDouble();
						in.nextLine(); // again consumes the pending return key
						System.out.println("Please enter the name of the hostel where the student is residing.");
						hostelName = in.nextLine();
						System.out.println("Please enter the location of the hostel.");
						hostelLocation = in.nextLine();
						System.out.println("Please enter the number of rooms in the hostel. Enter 0 if not applicable.");
						numberofRooms = in.nextInt();
						stu[i] = new Student(hostelName, hostelLocation, numberofRooms, studentName, regdNo, electiveSubject, avgMarks); // creates the student object
						System.out.println("The student has been admitted successfully.");
						++i;
						break; // here a for-loop hasn't been used to dynamically add student objects and instantiating them according to the users choice
				
				case 2:
						if(i < 1) // displays an error message if the users wants to display student details from an empty database
						{
							System.out.println("Empty database! First enter the details.");
							break;							
						}
						System.out.println("Please enter the registration number of the student whose details you would like to see.");
						regdNo = in.nextInt();
						for(int j = 0; j < i; j++) // the loop runs as many time as there are student records in the database
						{
							if(stu[j].regdNo == regdNo) // performs a linear search against the registration number provided
							{
								System.out.println("The details are as follows: ");
								System.out.println("--------------------------- ");
								System.out.println();
								stu[j].showDetails();
								break start; // breaks to the interactive menu instead of exiting the program after displaying the details
							}
						}
						System.out.println("Registration information not found! Try again."); // displays a message if the record is not found
						break;
					
				case 3:
						System.out.println("Bye.");
						System.exit(0);
					
				default:
						System.out.println("Invalid choice! Try again.");
			}
		}while(choice != 3); // exits when the user selects the third option
		in.close();
	} // end
}