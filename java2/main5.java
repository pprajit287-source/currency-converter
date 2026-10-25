import java.util.Scanner;

// Parent Class
class Currency {
    protected double amount;

    public void getAmount(double amt) {
        amount = amt;
    }

    // Method to be overridden
    public void displayAmount() {
        System.out.println("Amount: ₹" + amount);
    }
}

// Child Class
class Converter extends Currency {

    // Overriding displayAmount()
    @Override
    public void displayAmount() {
        System.out.println("Amount in Indian Rupees: ₹" + amount);
    }
}

// Grandchild Class
class CurrencyConverter extends Converter {

    // Method Overriding
    @Override
    public void displayAmount() {
        System.out.println("Entered Amount in Indian Rupees: ₹" + amount);
        System.out.println("Ready for currency conversion...");
    }

    public void convert(int choice) {

        if (choice == 1) {
            double usd = amount / 87.0;
            System.out.println("US Dollar = $" + usd);
        }
        else if (choice == 2) {
            double eur = amount / 102.0;
            System.out.println("Euro = €" + eur);
        }
        else if (choice == 3) {
            double gbp = amount / 118.0;
            System.out.println("British Pound = £" + gbp);
        }
        else {
            System.out.println("Invalid Choice!");
        }
    }
}

// Main Class
public class main5{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CurrencyConverter obj = new CurrencyConverter();

        System.out.print("Enter Amount in Indian Rupees: ");
        double amt = sc.nextDouble();

        obj.getAmount(amt);

        // Calls the overridden method in CurrencyConverter
        obj.displayAmount();

        System.out.println("\nSelect Currency");
        System.out.println("1. USD");
        System.out.println("2. EURO");
        System.out.println("3. GBP");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        obj.convert(choice);

        sc.close();
    }
}
