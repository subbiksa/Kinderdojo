import java.util.Scanner;
//import java.lang.Math;
public class Report {
	String pName, pID, pPWD, mName, mID, mPWD, cName,cID, cPWD;
	
	
	
	public Report(String aName, String aID, String aPWD) {
		
		this.pName= aName;
		this.pID= aID;
		this.pPWD= aPWD;
		
		this.mName= aName;
		this.mID= aID;
		this.mPWD= aPWD;
		
		this.cName= aName;
		this.cID= aID;
		this.cPWD= aPWD;
	}

	public String getpName(){
		return this.pName;
	}
	/*public String getpPWD(){
		return this.pPWD;
	}*/
	
	private static Scanner sc= new Scanner(System.in);
	
	public static void main(String args[])
	{ 

/*System.out.println("Enter your name, ID and password");
pName= sc.nextLine();
pID= sc.nextLine();
pPWD= sc.nextLine();*/
int a;
System.out.println("Click 1 to view report");
System.out.println("Click 2 to ask a query");


a= sc.nextInt();
   switch(a){
   case 1 : 
   	System.out.println("Generated Report->");
   	enquireReport();
   	break;
   case 2 :
   	System.out.println("Displayed Query->");
   	askQuery();
   	break;

   	
   default:
   	System.out.println("Invalid choice");
}
}
	
	public static String getMonth(String month) {
		switch(month) {
		case "January":
			//for class 1 students
			return "Following is your report: Ward went for an exhibition";
		case "February":
			//for class 2 students
			return "Following is your report: Ward went for Zoo Trip";
		case "March":
			//for class 1 students
			return "Following is your report: Ward went for Science Museum";
		case "April":
			//for class 2 students
			return "Following is your report: Ward went for Picnic";
		case "May":
			//class 1 or 2
			return "Following is your report: Ward went to Macdonald's";
		case "June":
			//for class 1 or 2 students
			return "Following is your report: Ward went to a water park";
		case "July":
			//for class 1 or 2 students
			return "Following is your report: Ward went for a dance competition";	
		case "August":
			//for class 1 or 2 students
			return "Following is your report: Ward went for a book fair";	
		case "September":
			//for class 1 or 2 students
			return "Following is your report: Ward went to a art gallery";	
		case "October":
			//for class 1 or 2 students
			return "Following is your report: Ward went for a drawing competition";	
		
		case "November":
			//for class 1 or 2 students
			return "Following is your report: School Holiday for Christmas Holiday";	
		case "December":
			//for class 1 or 2 students
			return "Following is your report: School Holiday for Christmas Holiday";
		default:
			System.out.println("Incorrect month entered. Try again\n");
			return getMonth(sc.next());
		}
	}
	public static void enquireReport()
	{  
		
		System.out.println("Hello!");
		//System.out.println("Enter the student name");
		//String name= sc.nextLine();
		
		System.out.println("Enter the student ID");
		int sID= sc.nextInt();
		System.out.println("Enter the class of your ward");
		
		int cls= sc.nextInt();
		System.out.println("Enter the month of report: ");
		//double random=Math.random();
		System.out.println(getMonth(sc.next()));

}
	public static void askQuery(){
		System.out.println("Ask any question regarding your ward and we will contact you as sson as possible");
	}

	
}