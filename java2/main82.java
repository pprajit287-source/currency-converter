            import java.util.Scanner;
            class CurrencyConverter implements Runnable {
            double amount;
             int choice;
             CurrencyConverter(double amount, int choice) {
            this.amount = amount;
             this.choice = choice;
        }
              public void run() {
             if (choice == 1) {
            double usd = amount / 87.0;
            System.out.println("INR to USD = $" + usd);
        }
           else if (choice == 2) {
            double eur = amount / 102.0;
            System.out.println("INR to EUR = €" + eur);
        }
            else if (choice == 3) {
            double gbp = amount / 118.0;
            System.out.println("INR to GBP = £" + gbp);
        }
            else {
            System.out.println("Invalid choice");
          }
        }
      }
       public class main82 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount in INR: ");
        double amount = scan.nextDouble();
        System.out.println("1. INR to USD");
        System.out.println("2. INR to EUR");
        System.out.println("3. INR to GBP");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        CurrencyConverter obj = new CurrencyConverter(amount, choice);
        Thread t1 = new Thread(obj);
        t1.start();
        scan.close();
    }
}
