       import java.util.Scanner;

      class Currency {
    protected double amount;

    public void getAmount(double amt) {
        amount = amt;
    }
}

class Converter extends Currency {

    public void displayAmount() {
        System.out.println("Amount in Indian Rupees: ₹" + amount);
    }
}

class CurrencyConverter extends Converter {

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


public class main42 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CurrencyConverter obj = new CurrencyConverter();

        System.out.print("Enter Amount in Indian Rupees: ");
        double amt = sc.nextDouble();

        obj.getAmount(amt);

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

 