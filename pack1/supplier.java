package pack1;

public class supplier {
    int S_id;
    String S_name;
    long S_phno;
    String S_mail;
    String S_address;
    String G_type;
    int G_rate;
    int G_quantity;

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
        System.out.println(S_id+"\n"+S_name+"\n"+S_phno+"\n"+S_mail+"\n"+S_address+"\n"+G_type+"\n"+G_rate+"\n"+G_quantity);
    }

    void FindSupIncome(){

    }

        
        
        
    

}
