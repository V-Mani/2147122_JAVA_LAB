///firstly i have 2 classes one is main class "airline" and another is "booking" in the program 
// booking is third program there are multiple constructors where i have implemented
// function overloading and constructor over loading 

//firstly go to public class for further instruction  go to line number 88

import java.io.*;
import java.util.*;
import java.util.Random; 
 
class booking{

    // all the members of the class
    double total;
    String usr_name;
    int ticket_id;
    String acc_no,email_id;
    long mob_no;
    int price;


    //constructor overloading and chaining of constructor 
    booking()
    {
        Random random = new Random();  
        System.out.println(" Welcome to airlines bookings ");
        this.price=1000;
        System.out.println(" Each ticket is "+this.price+" Rs");
        this.ticket_id=random.nextInt(10000);
    }
    
    booking(String name,long mob,int n){
        //so once the book1 object is been created with the above 3 parameters 
        // the  fisrt line in this is "this(n)" wwhich will call the constructor with only one parameter that is namely booking(int n);
        //go to lin number  50
        this(n);
        // the above 2 constructors basically initialize the base price and  calculates the amount for each seat 
        //after the abpve 2 constructor execution here the booking data is been printed like a bill or something 
        this.usr_name=name;
        this.mob_no=mob;
        System.out.println("  ticket iD "+this.ticket_id);
        System.out.println("  Name "+this.usr_name);
        System.out.println("  Mob_no "+this.mob_no);
        this.total=this.total+(this.total*.18);
        System.out.println(" Total : "+this.total);
        
        
    }

    booking(int seats)
    {
        // the control comes here and as the first line here is calling an another constructor with out any parameters 
        // this() ill invoke the construcor  ith no parameters so that constructor ill execute and print elcome to airline bookings 
        this();
        //after the constructor is execurted the total price is been calculate and ithout gst and printed here go back to the constructor ith 3 parameters 
        this.total=seats*this.price;
        System.out.println(" For "+seats+" seats Your total is : "+total+" + gst " );
        
    }
    booking(booking nbooking,int n)
    {
        this(nbooking.usr_name,nbooking.mob_no,n);
        
    }



    //funcion overloading 
    public void payment() {
        System.out.println(" You have opted for Internet Banking");
        
    }
    public void payment(String email)
    {
        System.out.println(" You have opted for Payment via UPI id ");
    }
    public void payment(long mob)
    {
        System.out.println(" You have opted for Payment Mobile Banking ");
    }
    public void payment(long card_no,String expiredate)
    {
        System.out.println(" You have opted for Payment Debit/Credit  ");
    }


}
public class airline
{
    //static members which will be same for all the classes and 
    //also can access without any object creation 
    public static int no_of_seats=100;
    public static int avai_seat=60;
    

    //static functions by which we can access this functions without any object creation 
    public static void get_seats() {
        System.out.println(" Total seats in Flight : "+no_of_seats);
        System.out.println(" Total seats available : "+avai_seat);
    }
    //the above function will just display the number of seats available 

    public static void book_seat() {
        avai_seat=-avai_seat;
    }
    // the above function will decrement the available seats once its booked 
    public static void book_seat(int n)
    {
        avai_seat=avai_seat-n;
    }
    // here in the above functionthe concept of 
    //static function overloading is been implemented where it will decrement the no of seats that are booked at a time 
    
    
    //implementation of static block 
    // using this static bloack inside the public class  before the main gets executed this static block gets executed so u can see 
    // welcome to abc airlines at the first and foremost execution 
    static 
    {
        System.out.println(" Welcome to ABC Airlines ");
    }

    //after the static block the controller comes to main 
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        String ch1="";
        
        System.out.println("* *  Ticket Booking * * ");

        get_seats();

        System.out.println(" Enter Name ");
        String name=sc.nextLine();
        System.out.println(" Enter Mob NO :  ");
        long mob=sc.nextLong();
        sc.nextLine();
        System.out.println(" Enter NO of seats  :  ");
        int n=sc.nextInt();
        sc.nextLine();
        //after all the above input statements 
        //now we shall create an object for the booking 
        // here the booking is a seperate class which takes care of payments and booking the tickets 
        //the booking must also require many other classes and inheritance concepts hence 
        // here we are just implementing the function overloading concepts in booking class like tht type of payments methods 

        booking book1=new booking(name,mob,n);
        // as soon as book1 is been created the constructor with the parameter that as string, long and int will be invoked 
        // which is in line number 31 go to line number 32
        do{
            //after displaying the booking details here it asks for the mode of payments 
        System.out.println(" * * Payment Options * * ");
        System.out.println(" 1. Internet Banking ");
        System.out.println(" 2. VIA UPI");
        System.out.println(" 3. Mobile Banking ");
        System.out.println(" 4. Credit/Debit");
        System.out.println(" Your Option :");
        String ch=sc.nextLine();


    //your can clearly see that all the payment function name are same but the parameters passed are different 
    // so this is the concept of function overloading  go to end of switch statement 
        switch (ch) {
            case "1":book1.payment();
                
                break;
            case "2":System.out.println(" Enter Email/upi_id : ");
                     String upi=sc.nextLine();
                    book1.payment(upi);
                    break;
            case "3":book1.payment(mob);break;
            case "4":System.out.println(" Enter Credit/debit card number  : ");
                     long card=sc.nextLong();
                     System.out.println(" Enter CArd Expiry NO : ");
                     String exp=sc.nextLine();
                    book1.payment(card,exp);
                    break;
            default: System.out.println("Invalid Input");
                break;
        }
        book_seat(n);
        
        //if at all the user wants to book more tickets he cannot just edit from the bookings new ticket will be generated 
        //hence here we are creating another object book2 which basicalyy means another ticket booking 
        System.out.println(" Do u want to Book another ticket : ");
        ch1=sc.nextLine();
         if(ch1.equals("Y"))
         {
            
            get_seats();
            System.out.println(" Enter NO of seats  :  ");
             n=sc.nextInt();
             sc.nextLine();
             //here all the data of the previous object is passed to the new bookings as the user is same but the bookings are different
             // instead of passing the data we are passing the object itself this is copy constructor concept 
             //copy constructors initialisation 
             booking book2=new booking(book1,n);
             //this ill invoke the constructor named booking(booking nbooking,int n) which again calls the other constructors for new object 
             book1=book2;
         }
    }while(ch1.equals("Y")); 
            
        
        
        
    }
}



