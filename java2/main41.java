        import java.util.Scanner;

// Parent Class
class Currency {
    protected double amount;

    public void getAmount(double amt) {
        amount = amt;
    }
}

// Child Class
class CurrencyConverter extends Currency {

    public void convert(int choice) {

        if (choice == 1) {
            double usd = amount / 87.0;
            System.out.println("Indian Rupees = ₹" + amount);
            System.out.println("US Dollars = $" + usd);
        }
        else if (choice == 2) {
            double eur = amount / 102.0;
            System.out.println("Indian Rupees = ₹" + amount);
            System.out.println("Euro = €" + eur);
        }
        else if (choice == 3) {
            double gbp = amount / 118.0;
            System.out.println("Indian Rupees = ₹" + amount);
            System.out.println("British Pound = £" + gbp);
        }
        else {
            System.out.println("Invalid Choice!");
        }
    }
}

// Main Class
public class main41 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CurrencyConverter obj = new CurrencyConverter();

        System.out.print("Enter Amount in Indian Rupees: ");
        double amt = sc.nextDouble();

        obj.getAmount(amt);

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

 