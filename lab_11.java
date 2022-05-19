import java.io.*;
import java.util.ArrayList;


public class lab_11 {
    public static void main(String[] args) {

		ArrayList<String> arrlist = new ArrayList<String>();

		arrlist.add("aaa");
		arrlist.add("bbb");
		arrlist.add("ccc");
		arrlist.add("ddd");

		for (String number : arrlist) {
			System.out.println("Number = " + number);
		}
	} 
}