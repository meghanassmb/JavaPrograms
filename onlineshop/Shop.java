package onlineshop;
import java.io.*;
import java.util.*;


public class Shop  {
	static int UID;
	static int CUID;
	public static void main(String args[]) throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("WELCOME TO SHOPPING SYSTEM\n");
		int ch;
		do
		{
			System.out.println("*****************************************************\n");
			System.out.println("1 - REGISTER AS ADMIN");
			System.out.println("2 - REGISTER AS CUSTOMER");
			System.out.println("3 - LOGIN TO SYSTEM");
			System.out.println("4 - EXIT");
			System.out.println("*****************************************************\n");
			System.out.print("Enter choice : ");
			ch=Integer.parseInt(br.readLine());
			if(ch==1)
				registerAdmin();
			else if(ch==2)
				registerCustomer();
			else if(ch==3)
				loginSystem();
			else if(ch==4)
				System.out.println("Thank you");
			else
				System.out.println("Wrong choice");
		}while(ch!=4);
		
	}
	static void loginSystem()throws IOException
	{
		String chc;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nWELCOME TO LOGIN PAGE\n");
		System.out.println("*****************************************************\n");
		
		//selecting data from login info table
		ArrayList<Integer> id=new ArrayList<Integer>();
		ArrayList<String> pass=new ArrayList<String>();
		ArrayList<Character> type=new ArrayList<Character>();
		
		try
		{
			int uid;
			String passw;
			char tp=' ';
			
			
			
			int flag1=0,flag2=0;
			int f1,f2;
			do
			{
				System.out.print("Enter USER ID : ");
				uid=Integer.parseInt(br.readLine());
				System.out.print("Enter PASSWORD : ");
				passw=br.readLine();
				f1=id.indexOf(uid);
				f2=pass.indexOf(passw);
				if(f1==f2 && (f1!=-1 && f2!=-1))
				{
					flag1=1;
					flag2=1;
				}
				if(flag1==0 || flag2==0)
				{
					System.out.println("INVALID CREDENTIALS , ENTER AGAIN !");
					System.out.print("Do you want to continue ( Y for yes, N for No)");
					chc=br.readLine();
					if(chc.equalsIgnoreCase("N"))
						break;
				}
					
			}while(flag1==0 || flag2==0);
			if(flag1==1 && flag2==1)
			{
				tp=type.get(id.indexOf(uid));
			}
			//System.out.println(tp);
			//continue the code here........
			if(tp=='A')
			{
				Admin ob=new Admin(uid,passw);
				ob.AdminPage();
			}
			else if(tp=='C')
			{
				Customer ob=new Customer(uid,passw);
				ob.CustomerPage();
			}
		
		}
		catch(Exception e)
		{
			//System.out.println(e);
			e.printStackTrace();
		}
		
	}
	static void registerAdmin()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String pass,name,num,addr,email;
		int age;
		System.out.println("\nWELCOME TO ADMIN REGISTRATION PAGE\n");
		System.out.println("*****************************************************\n");
		
		System.out.println("ADMIN ID = "+UID);
		System.out.print("Enter password = ");
		pass=br.readLine();
		System.out.print("Enter Name = ");
		name=br.readLine();
		System.out.print("Enter age = ");
		age=Integer.parseInt(br.readLine());
		System.out.print("Enter contact number = ");
		num=br.readLine();
		System.out.print("Enter address = ");
		addr=br.readLine();
		System.out.print("Enter email = ");
		email=br.readLine();
		
		
		
	}
	static void registerCustomer()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String pass,name,num,addr,email;
		int age;
		System.out.println("\nWELCOME TO CUSTOMER REGISTRATION PAGE\n");
		System.out.println("*****************************************************\n");
		
		System.out.println("CUSTOMER ID = "+CUID);
		System.out.print("Enter password = ");
		pass=br.readLine();
		System.out.print("Enter Name = ");
		name=br.readLine();
		System.out.print("Enter age = ");
		age=Integer.parseInt(br.readLine());
		System.out.print("Enter contact number = ");
		num=br.readLine();
		System.out.print("Enter address = ");
		addr=br.readLine();
		System.out.print("Enter email = ");
		email=br.readLine();
		
		
		
	}
}

	
