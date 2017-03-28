import java.util.Scanner;
interface Department
{
	String deptName = "Computer Science";
	String deptHead = "John Smith";
	
	//void getDeptData();
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
		super(hostelName, hostelLocation, numberofRooms);
		this.studentName = studentName;
		this.regdNo = regdNo;
		this.electiveSubject = electiveSubject;
		this.avgMarks = avgMarks;
	}
	
	/*void getDeptData(String deptName, String deptHead)
	{
		this.deptName = deptName;
		this.deptHead = deptHead;		
	}*/
	
	public void showDeptData()
	{
		System.out.println("The department is " + deptName + ".");
		System.out.println("The department head is " + deptHead + ".");
	}
	
	void showDetails()
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
		int choice = 0, regdNo = 0, numberofRooms = 0, i = 0;
		String studentName, electiveSubject, hostelName, hostelLocation , deptName, deptHead;
		double avgMarks = 0.0;
		Scanner in = new Scanner(System.in);
		Student stu[] = new Student[4];
		do
		{
			System.out.println();
			System.out.println("Enter 1 to admit a new student.");
			//System.out.println("Enter 2 to migrate an existing student.");
			System.out.println("Enter 2 to see the details of a student.");
			System.out.println("Enter 3 to exit.");
			choice = in.nextInt();
			start:
			switch(choice)
			{
				case 1: 
						if(i > 3)
						{
							System.out.println("Database full! Operation aborted.");
							break;					
						}
						in.nextLine();
						System.out.println("Please enter the name of the student.");
						studentName = in.nextLine();
						System.out.println("Please enter the registration number of the student.");
						regdNo = in.nextInt();
						/*System.out.println("Please enter the department name of the student.");
						deptName = in.nextLine();
						System.out.println("Please enter the name of the respective Head of the Department.");
						deptHead = in.nextLine();*/
						in.nextLine();
						System.out.println("Please enter the elective subject of the student.");
						electiveSubject = in.nextLine();
						System.out.println("Please enter the average marks of the student");
						avgMarks = in.nextDouble();
						in.nextLine();
						System.out.println("Please enter the name of the hostel where the student is residing.");
						hostelName = in.nextLine();
						System.out.println("Please enter the location of the hostel.");
						hostelLocation = in.nextLine();
						System.out.println("Please enter the number of rooms in the hostel. Enter 0 if not applicable.");
						numberofRooms = in.nextInt();
						stu[i] = new Student(hostelName, hostelLocation, numberofRooms, studentName, regdNo, electiveSubject, avgMarks);
						//stu[i].getDeptData(deptName, deptHead);
						System.out.println("The Student has been admitted successfully.");
						++i;
						break;
				
				case 2:
						if(i < 1)
						{
							System.out.println("Empty database! First enter the details.");
							break;							
						}
						System.out.println("Please enter the registration number of the student whose details you would like to see.");
						regdNo = in.nextInt();
						for(int j = 0; j < i; j++)
						{
							if(stu[j].regdNo == regdNo)
							{
								System.out.println("The details are as follows: ");
								System.out.println("--------------------------- ");
								System.out.println();
								stu[j].showDetails();
								break start;
							}
						}
						System.out.println("Registration information not found! Try again.");
						break;
					
				case 3:
						System.out.println("Bye.");
						System.exit(0);
					
				default:
						System.out.println("Invalid choice! Try again.");
			}
		}while(choice != 3);
		in.close();
	}
}