import java.util.*;
import java.util.Scanner;

public class ColdStorageMS {

    public static int WHCapacity=1000;
    
    public static void main(String[] args)
    {
        //demo obj1 = new demo();
        //obj1.show();

        // emp e1 = new emp();
        // e1.addEmployee();

        // supplier obj1 = new supplier(101,"Mani",987654321,"mani@gmail.com","Tamilnadu");
        // supplier obj2 = new supplier(102,"karan",987654300,"karan@gmail.com","kerala","flowers",20,500);
        // obj1.displaySupplier();
        // obj2.displaySupplier();

        Scanner input = new Scanner(System.in);
    //     String ch;
    //     do{
    //     System.out.println("----------Cold Storage Management----------\n");
    //     System.out.println("1. View Warehouse details\n2. Loading Goods\n3. Unloading Goods\n4. Exit");
    //     ch = input.nextLine();
    //     switch(ch){
    //         case "1":
    //         {

    //         }
    //         case "2":
    //         {

    //         }
    //         case "3":
    //         {

    //         }
    //         case "4":
    //         {

    //         }
    //         default:
    //         {
                
    //         }
    //     }
    //     }while(ch !="4");
    // }

    payment obj = new payment(101,201,"online",32100,700,"04/04/2022");
     

}
}

class customer {
    int customer_id;
    String first_name;
    String last_name;
    int age;
    String email;
    int phone_no;
    String address;

    public void addCustomer() 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("Enter customer id:");
            int customer_id = sc.nextInt();
            System.out.print("Enter first name:");
            String first_name = sc.next();
            System.out.print("Enter last type:");
            String last_name = sc.next();
            System.out.print("Enter customer age:");
            int age = sc.nextInt();
            System.out.print("Enter customer email id:");
            String email = sc.next();
            System.out.print("Enter customer phone_no:");
            int phone_no = sc.nextInt();
            System.out.print("Enter customer address:");
            String address = sc.next();
            System.out.println(customer_id + " " + first_name + " " + last_name + " " + age + " " + email + " "
                    + phone_no + " " + address);
        }
        
    }
}

class emp {
    static int employee_id; //class or static variable

    //instance variables
    float DA;
    float HRA;
    float incometax;
    float GS;
    double bonus;

    public void addEmployee()
     {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter employee id:");
            employee_id = sc.nextInt();
            System.out.print("Enter first name:");
            String first_name = sc.next(); //local variable
            System.out.print("Enter last name:");
            String last_name = sc.next();
            System.out.print("Enter employee age:");
            int age = sc.nextInt();
            System.out.print("Enter employee email id:");
            String email = sc.next();
            System.out.print("Enter employee phone_no:");
            long phone_no = sc.nextLong();
            System.out.print("Enter employee address:");
            String address = sc.next();
            System.out.print("Enter employee salary:");
            int basicsalary = sc.nextInt();
            
            System.out.println("\nEmployee_id: " + employee_id + "\nFirst_name:" 
            + first_name + "\nLast_name:" + last_name + "\nAge:" + age + "\nEmail:" + email + "\nPhone_no:"
                    + phone_no + "\nAddress:" + address + "\nBasic_ Salary:" + basicsalary+"\r\n");

            calculatesalary(basicsalary);
            calculatesalary(basicsalary, DA, HRA);
            print_salary(basicsalary);
            print_salary(basicsalary, bonus);
        }

    }

private void calculatesalary(int basicsalary) 
{
        this.HRA=(float) (0.1*basicsalary);
        this.DA=(float) (0.73*basicsalary);
        double bonus=1000+basicsalary;
        System.out.println("HRA:"+ HRA);
        System.out.println("DA:"+ DA);
        System.out.println("Bonus:"+ bonus);
}

private void calculatesalary(int basicsalary, float DA, float HRA)
{
    this.GS=basicsalary+DA+HRA;
    this.incometax=(float) ((0.3)*GS);
    System.out.println("GS:"+ GS);
    System.out.println("Income tax:"+ incometax);
}

protected void calculatesalary(float incometax, float GS)
{
   float netsalary=GS-incometax;
   System.out.println("Net salary:"+ netsalary);
}

public void print_salary(int basicsalary)
{
    System.out.println("Salary without bonus:" + basicsalary);
}

public void print_salary(int basicsalary,double bonus)
{
    System.out.println("Salary with bonus:" + (basicsalary+bonus));
}

}


class payment {
    int payment_id;
    int customer_id;
    String payment_methods;
    int invoice;
    int amount;
    String payment_date;

    payment(){
        System.out.println("Payment details");

    }

    payment(int PID){
        this();
        this.payment_id=PID;
        this.amount=500;
        System.out.println("\nPayment ID>>> "+PID+"\nAmount>>> "+this.amount);
        
    }

    payment(int PID, int CID, String PMethod, int Invoice,int AMT,String PDate)
    {
        this(PID);
        this.payment_id=PID;
        this.customer_id=CID;
        this.payment_methods=PMethod;
        this.invoice=Invoice;
        this.amount=AMT;
        this.payment_date=PDate;
        
        System.out.println("\nPayment ID>>> "+PID+"\nCustomer ID>>> "+CID+"\nPayment method>>> "+PMethod+"\nInvoice no>>> "+Invoice+"\nAmount>>> "+AMT+"\nPayment date>>> "+PDate);
        
    }
   

    public void addPayment() {
        
    }

    public void searchPayment() {

    }

    public void calculatePayment() {

    }
    
}


class supplier {
    int S_id, G_rate,G_quantity;
    String S_name,S_mail,S_address,G_type;
    Long S_phno;

    supplier(int i,String name, long phone, String mail,String adr){
        S_id=i;
        S_name=name;
        S_phno=phone;
        S_mail=mail;
        S_address=adr;
    }
    supplier(int i,String name, long phone, String mail,String adr,String type,int rate,int qan){
        S_id=i;
        S_name=name;
        S_phno=phone;
        S_mail=mail;
        S_address=adr;
        G_type= type;
        G_rate=rate;
        G_quantity=qan;
    }

    void displaySupplier(){
        System.out.println("Supplier ID>>>"+S_id+"\n"+"Supplier Name>>>"+S_name+"\n"+
        "Supplier Phone no>>>"+S_phno+"\n"+"Supplier Email>>>"+S_mail+"\n"+"Supplier address>>>"+S_address
        +"\n"+"Goods Type>>>"+G_type+"\n"+"Goods Rate>>>"+G_rate+"\n"+"Goods Quantity>>>"+G_quantity+"\n*********************\n\n");
    }
    void FindGoodsPrice(){}

    void FindSupIncome(){

    }
}


class retailer {
    int R_id;
    String R_name,R_address;
    long R_phno;
    

    
}

class warehouse {
    
}

class WHMaintanance {
    
}