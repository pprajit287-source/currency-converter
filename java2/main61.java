import java.util.Scanner;
// First interface
interface DollarConverter {
    double convertToDollar(double amount);
}
// Second interface
interface EuroConverter {
    double convertToEuro(double amount);
}
// Third interface
interface PoundConverter {
    double convertToPound(double amount);
}
// Multiple inheritance using interfaces
class CurrencyConverter implements DollarConverter, EuroConverter, PoundConverter {

   // Example fixed conversion rates
    // 1 USD = 83 INR
    // 1 EUR = 90 INR
    // 1 GBP = 105 INR

    public double convertToDollar(double amount) {
        return amount / 83;
    }
     public double convertToEuro(double amount) {
        return amount / 90;
    }
     public double convertToPound(double amount) {
        return amount / 105;
    }
}
// Main class
public class main61 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  CurrencyConverter converter = new CurrencyConverter();
     System.out.println("===== CURRENCY CONVERTER =====");
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
