package com.Edubridge.BankingApp;
import java.util.Scanner;
public class Bank 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		char ch,lg;
		String emailId=null, password=null, emailIdl=null, passwordl=null, name=null, type=null, adm="admin", pass="admin", date = null;
		int mono;
		do
		{
			System.out.println("\n\t\t---BANKING APPLICATION----\n");
			System.out.println("\t   1: Register  |  2: Login  |  3: Exit");
			Scanner sc =new Scanner(System.in);
			System.out.println("----------------------------------------");
			System.out.print("Choose Option\t");
			int option = sc.nextInt();
			System.out.println("----------------------------------------");
			switch(option)
			{
			case 1: 
				System.out.print("Enter EmailId :- ");
				emailId=sc.next();
				System.out.print("Enter Your Name :- ");
				name=sc.next();
				System.out.print("Enter Password :- ");
				password=sc.next();
				System.out.print("Enter Account Type :- ");
				type=sc.next();
				if(type.equals("Saving") || type.equals("saving"))
					System.out.println("Congrats u are eligible for 6% interest");
				else if(type.equals("Fixed") || type.equals("fixed"))
					System.out.println("Get 5% interest on fixed deposit");
				else
					System.out.println("Get homeloan with 2% interest rate from our bank");
				System.out.print("Enter Date :- ");
				date=sc.next();
				
				System.out.println("\nAccount Created Successfully..Login Now\n");
			case 2: System.out.println("\t" + " Enter Login Details");
					System.out.println("----------------------------------------");
					System.out.print("Enter EmailId :- ");
					emailIdl=sc.next();
					System.out.print("Enter Password :- ");
					passwordl=sc.next();
				if(emailIdl.equals(emailId) && passwordl.equals(password) || emailIdl.equals(adm) && passwordl.equals(pass))
				{
					System.out.println("----------------------------------------");
					System.out.println("Congratulations Login Successful " +name);
					System.out.println("----------------------------------------");
					System.out.println("Our Services Choose Option : ");
					int balance=0, withdraw, deposit;
					while(true)
					{
						System.out.println("1. Account Details");
						System.out.println("2. Withdraw");
						System.out.println("3. Deposit");
						System.out.println("4. Check Balance");
						System.out.println("5. Log Out");
						System.out.println("----------------------------------------");
						System.out.print("Choose Option\t");
						int option2 = sc.nextInt(); 
						switch(option2)
						{
						case 1 : System.out.println("\tAccount Details :-");
						System.out.println("\tEmailId :- " +emailId);
						System.out.println("\tAccount Holder Name :- " +name);
						System.out.println("\tAccount Type :- " +type);
						System.out.println("\tAccount Opening Date :- " +date);
						System.out.println("----------------------------------------");
						break;
						
						case 2 : System.out.println("Enter Money to be  Withdraw " );
						withdraw = sc.nextInt();
						if(balance>=withdraw)
						{
							balance = balance-withdraw;
							System.out.println("Collect Your money " +withdraw+ "Rupees");
						}
						else
						{
							System.out.println("Insufficient Balance");
						}
						System.out.println(" ");
						System.out.println("----------------------------------------");
						break;
						
						case 3 : System.out.println("Enter Money to be Deposit");
						{
							deposit = sc.nextInt();
							balance = balance+deposit;
							System.out.println("Your Money Deposited Successfully..");
						}
						System.out.println("");
						System.out.println("----------------------------------------");
						break;
						
						case 4 : 
						{
							System.out.println("Your Current Balance is = " +balance +" Rs");
						}
						System.out.println(" ");
						System.out.println("----------------------------------------");
						break;
						
						case 5 :
						{
							do {
							System.out.println("Are u sure wants to log out y / n");
							lg = sc.next().charAt(0);
							System.out.println("Confirmation y or n");
							ch=sc.next().charAt(0);
							}
							while(lg== 'n' || lg == 'N');
							System.out.println("Log out successful");
							System.exit(0);
						}
					}
				  }
		 	     }
				else
				{
				System.out.println("Ooopsss something went wrong");
				break;
				}
			}
				System.out.println("To Continue press y else press n");
				ch=sc.next().charAt(0);
				System.out.println("----------------------------------------");
		}while(ch=='y'||ch=='Y');
	}
}