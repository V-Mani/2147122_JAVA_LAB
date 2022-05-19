package Cinventory;

import java.util.*;

public class main_class {
    static void menu(){
        System.out.println("1. Add new item");
        System.out.println("2. Display all item");
        System.out.println("3. Add customer details");
        System.out.println("0. Exit");

    }

    public static void main(String[] args){
        int opt;
        Scanner sc = new Scanner(System.in);
        ArrayList<Shop> shopList= new ArrayList<Shop>();
        do{
            Shop s=new Shop();
            menu();
            opt =sc.nextInt();
            switch (opt) {
                case 1:
                    
                    break;
                case 2:
                
                    break;
                case 3:
                
                    break;
                default:

                    break;
            }
            
        }while(opt != 0);
    }
}
