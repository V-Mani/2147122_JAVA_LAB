import java.util.Scanner;



 class CsDetails {
	 void display_details(){
		 System.out.println("WELCOME TO COLD STORAGE");
		 System.out.println("COLD STORAGE NAME   : MANI CS");
		 System.out.println("BRANCH NAME : VIJAYANAGAR");
		 System.out.println("Manager NAME : MANI");
		 System.out.println("TIMINGS  : 24*7");
		 System.out.println("NO of Employess : 35");
	 } 

	 // this particular snippet has to be modified-- error occurence
	 class Display_Cstorage_internalr_details{
		 public void display(int pin , int password){
		if(pin==1234 && password==938021)
			 {
			 System.out.println("Total Avalilable Slots :");
			 System.out.println("Total Avalilable Slots for Vip :");
			 System.out.println("Total Avalilable product in Storage  :");
			 System.out.println("No of security available in Lower Level:");
			 System.out.println("no OF CCTV present in bank :");}
			 else {System.out.println("please provide proper credentials");}
			 
		 }
	 }
}

public class lab05 {
	static int amt;
	static String welcomeMessage ="\n------------------WELCOME TO Mani Cold Storage -Keep it cool------------------ ";
	static String nextMessage="\n------------------Please Choose Next Operation From Menu------------------";
	static String endingMessage="\n------------------Thank You for Choosing Mani Cold Storage\nHave a Good Day------------------ ";
	static Scanner input = new Scanner(System.in);
	String name, actype;
	int accNo, bal;

	static {float p, r,  t,  si; // principal amount, rate, time and simple interest respectively  
		p = 13000;  r = 12; t = 2;  
		 si  = (p*r*t)/100;   
		
		System.out.println("Simple Interest on fd is: " +si);  }
	

	lab05(String name, int accNo, String actype, int bal) {
		this.name = name;
		this.accNo = accNo;
		this.actype = actype;
		this.bal = bal;
	}

	int deposit() {
		System.out.println(welcomeMessage);
		System.out.print("Enter amount to deposit:");
		amt = input.nextInt();
		System.out.println(nextMessage);
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		bal = bal + amt;
		return 0;
	}
	
	// Deposit amount and update the balance
	public static int deposit(int balance,
					int amt,int pin_no,int account_number,int card_no,String route_no)
	{
		System.out.println(welcomeMessage);
	  System.out.println("Depositing amount using Prepaid Debit Card");
	  System.out.println("Deposit Operation:");
	  System.out.println("Depositing Amount : "
			  + amt);
	  balance = balance + amt;
	  System.out.println(
		"Your Money has been successfully deposited");
	  displayBalance(balance);
	  return balance;
	}
	public static void deposit(int balance,int amt,String name,String branch,String date,String type_of_deposit,String pan_no){
		System.out.println(welcomeMessage);
		System.out.println("Deposit Amount USing DEPOSIT SLIP:");
	  System.out.println("Depositor Name :"+name);
	  System.out.println("Bank Branch Name "+branch);
	  System.out.println("Deposite Date "+date);
	  System.out.println("Deposite Type" +type_of_deposit);
	  System.out.println("Depositor Pan no"+pan_no);
	  //System.out.println("Depositor Account"+account_no);
	  System.out.println("Depositing Amount : " + amt);
	  balance = balance + amt;
	  System.out.println("Your Money has been successfully deposited");
	  
  
  }

  public static int deposit(int balance,int amt,int card_no,int pin_no){
	System.out.println(welcomeMessage);
	System.out.println("Depositing Amount Using Atm machine: "
			  + amt);

	  balance = balance + amt;
	  System.out.println(
		"Your Money has been successfully deposited");
	  displayBalance(balance);
	  return balance;


  }

	int withdraw() {
		System.out.println(welcomeMessage);
		System.out.println("Your Balance=" + bal);
		System.out.print("Enter amount to withdraw:");
		amt = input.nextInt();
		if (bal < amt) {
			System.out.println("Not sufficient balance.");
			return 1;
		}
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		bal = bal - amt;
		System.out.println(nextMessage);
		return 0;
	}

	void display() {
		System.out.println(welcomeMessage);
		System.out.println("Name:" + name);
		System.out.println("Account No:" + accNo);
		System.out.println("Balance:" + bal);
		System.out.println(nextMessage);


	}

	void dbal() {
		System.out.println("Balance:" + bal);
	}

	public static void main(String args[]) {
	
	int pin,password;
	
		int card_no,pin_no;
	
		int account_number;
		String route_no;
		
		
		
			
					 String name="rakesh";
					  String branch="vijayanagar";
					  String date="25/03/2022";
					  String type_of_deposit="fixed depositr";
					  String pan_no="EMRPR6989H";
					 // int account_no=501742451;


		System.out.println(welcomeMessage);

		System.out.println("Enter your Name: ");
		String nn = input.nextLine();
		System.out.println("Enter Account Number: ");
		int num = input.nextInt();
		System.out.println("Enter Account Type: ");
		String type = input.next();
		System.out.println("Enter Initial Balance: ");
		int bal = input.nextInt();
		BankDetails b2=new BankDetails();
		//BankDetails.Display_bank_internalr_details obj=new BankDetails.Display_bank_internalr_details();

		BankAccount b1 = new BankAccount(nn, num, type, bal);
		int menu;
		
		System.out.println("Menu");
		System.out.println("1. Deposit Amount \n-11.using Deposite Slip\n-12.Using Card No and Atm Pin\n-13.Using Prepaid Debit Card\n");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Display Information");
		System.out.println("4. Display BAnk Information");
		System.out.println("5. Display Confidential  Information of bank");

		System.out.println("6. Exit");
		boolean quit = false;
		do {
			System.out.print("Please enter your choice: ");
			menu = input.nextInt();
			switch (menu) {
			case 1:
				b1.deposit();
				break;

			case 2:
				b1.withdraw();
				break;

			case 3:
				b1.display();
				break;

				case 4:
				b2.display_details();
				break;
				case 5 :
				// this is to call nested class method
				System.out.println("provide the secret accessSBI BANK pin");
				pin=input.nextInt();
				System.out.println(" enter the  access code for SBI BANK");
				password=input.nextInt();
				//obj.display_bank_internalr_details(pin,password);
				break;
				
			case 6:
			
				quit = true;
				System.out.println(endingMessage);

				break;
				case 11:
				System.out.println(welcomeMessage);
				deposit(bal,amt , name, branch, date, type_of_deposit, pan_no);
				break;
				case 12:
				System.out.println(welcomeMessage);
				System.out.println("Enter Card Number");
          card_no=input.nextInt();
          System.out.println("enter pin no");
          pin_no=input.nextInt();
         deposit(bal, amt, card_no, pin_no);
		 break;
		 case 13:
		 System.out.println("Enter Card Number");
         card_no=input.nextInt();
         System.out.println("enter pin no");
         pin_no=input.nextInt();


         System.out.println("enter your acount Number");
         account_number=input.nextInt();
         System.out.println("enter your Prepaid Debit Card NUmber");
         card_no=input.nextInt();
         System.out.println("enter your bank routing number");
         route_no=input.nextLine();
        deposit(bal, amt,pin_no,account_number,card_no,route_no);


			}
		} while (!quit);
	}
}