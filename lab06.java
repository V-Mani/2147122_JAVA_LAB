import java.util.*;

class lab06 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        StringBuilder WH = new StringBuilder("Cold Stroage");
        int choice;
        int flag = 1;
        Supplies s = new Supplies();
        System.out.print("\n-----------------------------------------");
        System.out.print("\n         WELCOME TO " + WH + "        ");
        System.out.print("\n-----------------------------------------");
        s.insertion();
        while (flag == 1) {

            System.out.print("\n-----------------------------------------");
            System.out.print("\n    1 - Alter The Details    ");
            System.out.print("\n    2 - Display Products    ");
            System.out.print("\n    3 - Exit    ");
            System.out.print("\n-----------------------------------------");
            System.out.print("\nYour Choice : ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    s.display();
                    s.alter();
                    break;
                case 2:
                    s.display();
                    break;
                case 3:
                    flag = 0;
                    break;

            }
        }
    }
}

class Supplies {
    String Sname = new String();
    String Sproduct = new String();
    StringBuffer qty = new StringBuffer();
    StringBuffer date = new StringBuffer();
    Scanner in = new Scanner(System.in);

    void insertion() {
        Scanner in = new Scanner(System.in);
        System.out.print("\nSupplier Name>>> ");
        Sname = in.nextLine();
        System.out.print("\nsupplier's Product>>>");
        Sproduct = in.nextLine();
        System.out.print("\nProduct quantity>>> ");
        String take_data = in.nextLine();
        qty.append(take_data);
        System.out.print("\nDate>>> ");
        take_data = in.nextLine();
        date.append(take_data);
    }

    void display() {
        System.out.print("\n---------------  Wharehouse Management  ----------------");
        System.out.print("\n-          " + Sname + ">>>"+Sproduct+"  ");
        System.out.print("\n------------------------------------------");
        System.out.print("\n-                                        ");
        System.out.print("\n-           Product quantity | " + qty + "            ");
        System.out.print("\n-           Date  | " + date + "             ");
        System.out.print("\n-                                        ");
        System.out.print("\n------------------------------------------");
    }

    void alter() {
        int choice;
        int ch;
        System.out.print("\nPress Any Number to Exit ");
        System.out.print("\n 1  -  Update Information  ");
        System.out.print("\n 2  -  Append Quantity ");

        System.out.print("\nYour Choice : ");
        choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.print("\n   Update   ");
                System.out.print("\n 1  -  Supplier's Name  ");
                System.out.print("\n 2  -  Date   ");
                System.out.print("\n 3  -  Product Quantity  ");
                System.out.print("\nYour Choice : ");
                ch = in.nextInt();
                switch (ch) {
                    case 1:
                        System.out.print("\nSupplier's Name  : ");
                        Sname = in.nextLine();
                        Sname = in.nextLine();
                        break;
                    case 2:
                        System.out.print("\nDate : ");
                        date.append("");
                        String take_data = in.nextLine();
                        take_data = in.nextLine();
                        date.append(take_data);
                        break;
                    case 3:
                        System.out.print("\nQuantity : ");
                        qty.append("");
                        String take_qty= in.nextLine();
                        take_qty = in.nextLine();
                        qty.append(take_qty);

                        break;
                }

                break;
            case 2:

                System.out.print("\nQuantity : ");
                String take_data = in.nextLine();
                take_data = in.nextLine();
                qty.append(take_data);
                break;

        }
    }

}