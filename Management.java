import java.util.Scanner;
//management class
public class Management {
	private static Scanner parent;
	private static Scanner carer;
	private static Scanner child;
	private static Scanner choice;
    String name;
    public int id;
    //beginning of main method
	public static void main(String[] args) {
		     System.out.println("***KINDERDOJO***");
		     Scanner sc=new Scanner(System.in);
				System.out.println("Enter username");
				String uname=sc.nextLine();
				String Pwd;
				System.out.println("Enter Password");
				String Pwd1=sc.nextLine();
				//validation of admin
		     if(uname.equals("Admin")&&Pwd1.equals("kinderdojo"))
		     { System.out.println("Hello Admin!");
			 choice = new Scanner(System.in);
			 System.out.println("Enter the desired operation");
			 System.out.println("1.Add Parent");
			 System.out.println("2.Add Carer");
			 System.out.println("3.Add Child");
			 System.out.println("Enter a number: ");
			 int ch = choice.nextInt();  
			
			 switch(ch) {
		         case 1 :
		            System.out.println("***ADD PARENT***!"); 
		            addParent();
		            break;
		         case 2 :
		            System.out.println("***ADD CARER***!");
		            addCarer();
		            break;
		         case 3 :
		            System.out.println("***ADD CHILD***!");
		            addChild();
		            break;
		         default :
		            System.out.println("Invalid entry!Try again...");
		      }
			
			}else{System.out.println("Sorry! Only admin access is possible!");}
	}
	//addParent() method begins
		public static int addParent() {
         	parent = new Scanner(System.in);
	        int id= 3132456;
         	System.out.println("Enter the name of the parent");
			String name = parent.nextLine();
			System.out.println("Enter the dob of "+name);
			String dob= parent.nextLine();
			System.out.println("Enter the gender of "+name);
			String gender= parent.nextLine();
			System.out.println("Enter the phone number of "+name);
			String ph= parent.nextLine();
			System.out.println("Enter the address of "+name);
			String address= parent.nextLine();
			System.out.println("The ID for "+name+" is "+name+"123");
			System.out.println("Password is kinderdojo");
	        return(id);          
		}
//addCarer() method starts
		public static void addCarer() {
			carer = new Scanner(System.in);
			System.out.println("Enter the name of the carer");
			String name = carer.nextLine();
			System.out.println("Enter the dob of "+name);
			String dob= carer.nextLine();
			System.out.println("Enter the gender of "+name);
			String gender= carer.nextLine();
			System.out.println("Enter the phone number of "+name);
			String ph= carer.nextLine();
			System.out.println("Enter the address of "+name);
			String address= carer.nextLine();
			System.out.println("The ID for "+name+" is "+name+"8181");
			System.out.println("Password is kinderdojo");
		}
		
	//addChild() method starts
		public static void addChild(){
			child = new Scanner(System.in);
			System.out.println("Enter the name of the child");
			String name= child.nextLine();
			System.out.println("Enter the gender of "+name);
			String gender=child.nextLine();
			System.out.println("Enter the date of birth of "+name);
			String dob=child.nextLine();
			System.out.println("The child "+name+" has been added");
		}

      
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public String getFamilyName() {
   		
   		return this.name;
   	}
   	
   	public int getID() {
   		return this.id;
   	}    
    //test case-constructor 
   	public Management(int pid, String pName) {
		// TODO Auto-generated constructor stub
		String pname = null;
		this.name= pname;
    	   this.id= pid;
	}
  }





