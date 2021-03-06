class Bank {

    static int total = 100;

    synchronized void withdrawn(String name,
            int withdrawal) {
        if (total >= withdrawal) {
            System.out.println(name + " withdrawn "
                    + withdrawal);
            total = total - withdrawal;
            System.out.println("Balance after withdrawal: "
                    + total);
            /*
             * Making the thread sleep for 1 second after
             * each withdrawal.
             */
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                // to display line no where exception has occured
                e.printStackTrace();
            }
        } else {
            System.out.println(name
                    + " you can not withdraw "
                    + withdrawal);
            System.out.println("your balance is: " + total);

            try {

                // Making thread to sleep for 1 second
                Thread.sleep(1000);
            }

            catch (InterruptedException e) {

                // to diplay line where exception has occured
                e.printStackTrace();
            }
        }
    }

    synchronized void deposit(String name,
            int deposit) {
        System.out.println(name + " deposited " + deposit);
        total = total + deposit;
        System.out.println("Balance after deposit: "
                + total);

        try {

            // Making thread to sleep for 1 second
            Thread.sleep(1000);
        }

        catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}

class ThreadWithdrawal extends Thread {

    Bank object;
    String name;
    int rupees;

    // Constructor of this class
    ThreadWithdrawal(Bank ob, String name, int money) {
        // This keyword refers to parent class
        this.object = ob;
        this.name = name;
        this.rupees = money;
    }

    // run() method for the thread
    public void run() {
        object.withdrawn(name, rupees);
    }
}

class ThreadDeposit extends Thread {

    Bank object;
    String name;
    int rupees;

    ThreadDeposit(Bank ob, String name, int money) {
        this.object = ob;
        this.name = name;
        this.rupees = money;
    }

    public void run() {
        object.deposit(name, rupees);
    }
}

class Lab_09 {

    // Main driver method
    public static void main(String[] args) {

        Bank obj = new Bank();

        // Creating threads
        ThreadWithdrawal t1 = new ThreadWithdrawal(obj, "Rakesh", 20);
        ThreadWithdrawal t2 = new ThreadWithdrawal(obj, "rajesh", 40);
        ThreadDeposit t3 = new ThreadDeposit(obj, "smith", 35);
        ThreadWithdrawal t4 = new ThreadWithdrawal(obj, "logesh", 80);
        ThreadWithdrawal t5 = new ThreadWithdrawal(obj, "joshua", 40);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}