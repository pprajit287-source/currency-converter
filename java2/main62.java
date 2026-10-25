import java.util.Scanner;
// Abstract class
abstract class CurrencyConverter {
  // Abstract methods
    abstract double convertToDollar(double amount);
    abstract double convertToEuro(double amount);
    abstract double convertToPound(double amount);
 // Normal method
    void displayTitle() {
        System.out.println("===== CURRENCY CONVERTER =====");
    }
}
// Child class
class CurrencyApplication extends CurrencyConverter {
 // 1 USD = 83 INR
    public double convertToDollar(double amount) {
        return amount / 83;
    }
  // 1 EUR = 90 INR
    public double convertToEuro(double amount) {
        return amount / 90;
    }
  // 1 GBP = 105 INR
    public double convertToPound(double amount) {
        return amount / 105;
    }
}
// Main class
public class main62 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  CurrencyApplication converter = new CurrencyApplication();
  converter.displayTitle();
        System.out.println("1. INR to USD");
        System.out.println("2. INR to EUR");
        System.out.println("3. INR to GBP");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
       System.out.print("Enter amount in INR: ");
        double amount = sc.nextDouble();
        switch (choice) {
       case 1:
                System.out.printf("USD = %.2f%n",
                        converter.convertToDollar(amount));
                break;
        case 2:
                System.out.printf("EUR = %.2f%n",
                        converter.convertToEuro(amount));
                break;
          case 3:
                System.out.printf("GBP = %.2f%n",
                        converter.convertToPound(amount));
                break;

            default:
                System.out.println("Invalid choice!");
        }
       sc.close();
    }
}
