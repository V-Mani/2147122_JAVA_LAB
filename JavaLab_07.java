import java.util.*;

public class JavaLab_07 {
    public static void main(String arg[]) {
        Supplier obj = new Supplier();
        obj.ShowDetail();
        obj.diplay();
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
    Scanner in= new Scanner(System.in);
    void SupplierDetail(){
        System.out.println("\nEnter The Supplier Id>>> ");
        int S_id = in.nextInt();
        System.out.println("Enter The Supplier Name>>> ");
        String S_Name = in.nextLine();
        S_Name = in.nextLine();
        System.out.println("Enter The Product Name>>> ");
        String P_Name = in.nextLine();
        System.out.println("Product Types> organic/medical/others ");
        System.out.println("Enter The Product Type>>> ");
        String P_type = in.nextLine();
        System.out.println("Enter The Product Quantity>>> ");
        int P_qty = in.nextInt();
        CurrentSlot = TotalAvailableSlot - P_qty;
        if(P_type == "organic"){
            this.NewAvgTemp = 22;
        }
        else if(P_type == "medical"){
            this.NewAvgTemp = 20;
        }
        else{
            this.NewAvgTemp = 23;
        }
    }
}

class Receipt{
    void bill(){
        System.out.println("");
    }
}