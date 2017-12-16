import java.io.*;
import java.util.Scanner;
//import java.lang.Math;
public class Parent {
	String pName, pID, pPWD;
	
	
	public Parent(String aName, String aID, String aPWD) {
		// constructor
		this.pName= aName;
		this.pID= aID;
		this.pPWD= aPWD;
	}

	public String getpName(){// to return the name of the parent
		return this.pName;
	}
	/*public String getpPWD(){
		return this.pPWD;
	}*/
	
	public static void main(String args[])
	{ 
		Scanner sc= new Scanner(System.in);

/*System.out.println("Enter your name, ID and password");
pName= sc.nextLine();
pID= sc.nextLine();
pPWD= sc.nextLine();*/
int a;
System.out.println("Click 1 to enquire for an appointment");
System.out.println("Click 2 to ask a query");
System.out.println("Click 3 to view progress of your ward");

a= sc.nextInt();
    switch(a){
    case 1 : 
    	System.out.println("Enquire for an appointment->");
    	enquireAppointment();
    	break;
    case 2 :
    	System.out.println("Ask a query->");
    	askQuery();
    	break;
    case 3 :
    	System.out.println("View progress of your ward->");
    	viewProgress();
    	break;
    default:
    	System.out.println("Invalid choice");
}
}
	public static void enquireAppointment() //method to ask for an appointment with the carer
	{  
		Scanner sc= new Scanner(System.in);
		System.out.println("Hello!");
		System.out.println("Enter the class of your ward");
		
		int cls= sc.nextInt();
		System.out.println("Enter the day you wish to get an appointment on: ");
		String ch="";
		ch= sc.next();
		//double random=Math.random();
		switch(ch.toLowerCase())
		{
		case "monday":
			//for class 1 students
			System.out.println("You are scheduled for an appointment with Ms.Jane Adams at 1400 hours.");
			break;
		case "tuesday":
			//for class 2 students
			System.out.println("You are scheduled for an appointment with Ms Elbie Jones at 1100 hours");
			break;
		case "wednesday":
			//for class 1 students
			System.out.println("You are scheduled for an appointment with Ms Joe Matt at 1200 hours");
		    break;
		case "thursday":
			//for class 2 students
			System.out.println("You are scheduled for an appointment with Ms Elbie Jones at 1500 hours");
            break;	
		case "friday":
			//class 1 or 2
			System.out.println("You are scheduled for an appointment with Ms Naomi Jonson at 1030 hours");
			break;
		default:
			System.out.println("Sorry, we are closed on weekends!!");
		}

}
	public static void askQuery(){ //method to ask a query
		System.out.println("Post a query here and we will get back to you.");
	}
public static void viewProgress(){ //method to view the progress report of the child
	Scanner s= new Scanner(System.in); 
	
	
	System.out.println("Enter the student name");
	String name= s.nextLine();
	
	System.out.println("Enter the student ID");
	int sID= s.nextInt();
	
	System.out.println("***Progress Report***");
}
	
	
}