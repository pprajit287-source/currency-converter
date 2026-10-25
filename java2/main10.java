             import java.util.Scanner;
             class Currency {
             synchronized void convert(double amount, int choice) {
             if (choice == 1) {
             double usd = amount / 83.5;
             System.out.println(Thread.currentThread().getName()
                    + " : INR to USD = " + usd);
        }
            else if (choice == 2) {
            double eur = amount / 90.5;
            System.out.println(Thread.currentThread().getName()
                    + " : INR to EUR = " + eur);
        }
          else if (choice == 3) {
            double gbp = amount / 105.5;
            System.out.println(Thread.currentThread().getName()
                    + " : INR to GBP = " + gbp);
        }
          else {
            System.out.println("Invalid currency choice");
           }
          }
         }
           class CurrencyThread extends Thread
         Currency converter;
          double amount;
           int choice;

         CurrencyThread(Currency converter, double amount, int choice) {
          this.converter = converter;
          this.amount = amount;
          this.choice = choice;
      }
           public void run() {
           converter.convert(amount, choice);
       }
     }
           public class main10 {
          public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter amount in INR: ");
         double amount = scan.nextDouble();
         System.out.println("\nChoose currency:");
         System.out.println("1. USD");
          System.out.println("2. EUR");
        System.out.println("3. GBP");
         System.out.print("Enter choice: ");
        int choice = scan.nextInt();
         Currency converter = new Currency();
         CurrencyThread t1 =
                new CurrencyThread(converter, amount, choice);
         CurrencyThread t2 =
                  new CurrencyThread(converter, amount, choice);
        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();
         scan.close();
    }
}
