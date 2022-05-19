package Cinventory;

import java.util.*;

public class Shop {
    private int item_no;
    private String item_name;
    private int item_price;

    public void add_newitem(Shop s){
        this.item_no = s.item_no;
        this.item_name = s.item_name;
        this.item_price = s.item_price;
        
    }
    public void display_item(ArrayList<Shop> arr){
        for(Shop shop: arr){
            System.out.println("---------------------------------");
            System.out.println("Item no>> "+shop.item_no);
            System.out.println("Item name>> "+shop.item_name);
            System.out.println("Item price>> "+shop.item_price);
            System.out.println("---------------------------------");

        }
    }

}
