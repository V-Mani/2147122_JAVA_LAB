package pack1;
import java.util.*;

public class customer {
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
