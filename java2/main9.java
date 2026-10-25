        import java.util.Scanner;
        class CurrencyConverter {
        double amount;
        boolean available = false;
        synchronized void setAmount(double amount) {
        this.amount = amount;
        available = true;
        System.out.println("Amount entered: ₹" + amount);
        notify();
       }
         synchronized void convert(int choice) {
        try {
            while (!available) {
                wait();
            }
            double result = 0;
            if (choice == 1) {
                result = amount / 83.5;
                System.out.println("INR to USD = $" + result);
            }
            else if (choice == 2) {
                result = amount / 90.5;
                System.out.println("INR to EUR = €" + result);
            }
            else if (choice == 3) {
                result = amount / 105.5;
                System.out.println("INR to GBP = £" + result);
            }
            else {
                System.out.println("Invalid currency choice");
            }
            available = false;
            notifyAll();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            }
          }
         }
            class AmountThread extends Thread {
            CurrencyConverter converter;
            double amount;
            AmountThread(CurrencyConverter converter, double amount) {
            this.converter = converter;
            this.amount = amount;
         }
          public void run() {
          converter.setAmount(amount);
         }
       }
           class ConversionThread extends Thread {
           CurrencyConverter converter;
           int choice;
           ConversionThread(CurrencyConverter converter, int choice) {
           this.converter = converter;
          this.choice = choice;
        }
    public void run() {
        converter.convert(choice);
    }
}
class main9 {
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
        CurrencyConverter converter = new CurrencyConverter();
        ConversionThread t1 = new ConversionThread(converter, choice);
        AmountThread t2 = new AmountThread(converter, amount);
        t1.start();
        t2.start();
        scan.close();
    }
}
