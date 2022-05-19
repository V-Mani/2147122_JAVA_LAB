import java.util.*;

public class JavaLab_07 {
    public static void main(String arg[]) {
        Receipt obj = new Receipt();
        obj.ShowDetail();
        obj.SupplierDetail();
        obj.bill();
    }
}


class CsDetails{
    int CsId=101;
    String CsLocation = "Bengaluru";
    int TotalAvailableSlot = 1000;
    float avgtemp =23;
    void ShowDetail(){
        System.out.println("\n\n****************/Welcome to Mani Cold Storage/*******************");
        System.out.println("Cold Storage ID>>> "+ CsId);
        System.out.println("Cold Storage Location>>> "+ CsLocation);
        System.out.println("Total Availabe Slots>>> "+ TotalAvailableSlot);
        System.out.println("Average Teperature Maintained>>> "+ avgtemp);
        System.out.println();
    }
}

class Supplier extends CsDetails{
    int CurrentSlot;
    int NewAvgTemp;
    String type1 ="organic";
    String type2 ="medical";
    static int S_id, P_qty;
    static String S_Name, P_Name, P_type;
    Scanner in= new Scanner(System.in);
    void SupplierDetail(){
        System.out.println("\nEnter The Supplier Id>>> ");
        S_id = in.nextInt();
        System.out.println("Enter The Supplier Name>>> ");
        S_Name = in.nextLine();
        S_Name = in.nextLine();
        System.out.println("Enter The Product Name>>> ");
        P_Name = in.nextLine();
        System.out.println("Product Types> organic/medical/others ");
        System.out.println("Enter The Product Type>>> ");
        P_type = in.nextLine();
        System.out.println("Enter The Product Quantity>>> ");
        P_qty = in.nextInt();
        CurrentSlot = TotalAvailableSlot - P_qty;
        if(P_type.equals(type1)){
            this.NewAvgTemp = 22;
        }
        else if(P_type.equals(type2)){
            this.NewAvgTemp = 20;
        }
        else{
            this.NewAvgTemp = 23;
        }
    }
}

class Receipt extends Supplier{
    void bill(){
        System.out.println("\n\n############################");
        System.out.println("Supplier Id ="+S_id);
        System.out.println("Supplier Name = "+S_Name);
        System.out.println("Product Name = "+P_Name);
        System.out.println("Product Type = "+P_type);
        System.out.println("Product Quantity = "+P_qty);
        System.out.println("Current Slot Available = "+CurrentSlot);
        System.out.println("Temperature maintained = "+NewAvgTemp);
    }
}