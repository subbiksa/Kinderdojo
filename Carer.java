
import java.util.Scanner;

public class Carer {
		static Scanner sc=new Scanner(System.in);
	public static void main(String args[]){
		posteditUpdates();
	}
		
		
		public static void posteditUpdates()
{
	System.out.println("Enter username");
	String uname=sc.next();
	if(uname.equals("carer"))
{
		System.out.println("Enter Password");
		String pwd=sc.next();
		if(pwd.equals("kinderdojo"))
		System.out.println("Enter the child name ");
		String child_name=sc.next();
		System.out.println("Enter your comments");
		String comments=sc.next();
		System.out.println(comments);
}
	else
{
		System.out.println("Invalid username or password");
}
}

}
	
	