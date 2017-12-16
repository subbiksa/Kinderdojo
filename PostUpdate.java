import java.io.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class PostUpdate
{
	public static int n=0;
	
	public static void main(String args[])
	{
		PostUpdate pu=new PostUpdate();
	String CUsername;
	String CPassword;
	String Comments;
	
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String uname=sc.nextLine();
		System.out.println("Enter Password");
		String Password=sc.nextLine();
               
		
		if(uname.equals("Admin")&&Password.equals("kinderdojo"))
		{
			System.out.println("ENTER 1 FOR POST_DETAILS,2 FOR UPDATE_DETAILS,3 FOR REMOVE_DETAILS");
			 n=sc.nextInt();
			 if(n==1)
			 {
				 pu.Post_Details();
		}
			 if(n==2)
			 {
				 Post_Details();
		}
			 if(n==3)
			 {
				 Remove_Details();
		}
		}
		else
		{
			System.out.println("Incorrect username or Password");
		}
		
	}
				public static void  Post_Details(){
					Scanner sc1=new Scanner(System.in);
					 HashMap<String,String> hm=new HashMap<String,String>();
                        System.out.println("Enter the childs name");
                        String child_name=sc1.next();
			System.out.println("Enter your comments");
			String comments=sc1.next();
                        hm.put(child_name,comments);
			System.out.println(comments);
			}
			
				public static void  Remove_Details()
			{
				HashMap<String,String> hm=new HashMap<String,String>();
				Scanner sc2=new Scanner(System.in);
				System.out.println("Enter the childs name");
                String child_name=sc2.next();
                hm.remove(child_name);
                System.out.println("Post has been deleted");
			}
		}
		
	
	
	
	

	