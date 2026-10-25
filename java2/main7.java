
        import java.util.Scanner;
        class InvalidAmountException extends Exception {
        InvalidAmountException(String message) {
        super(message);
       }
   }
       public class main7 {
       static double convert(double amount, int choice)
            throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException(
                "Amount must be greater than 0"
            );
        }
        if (choice == 1) {
            return amount / 83.5;
        }
        else if (choice == 2) {
            return amount / 90.5;
        }
        else if (choice == 3) {
            return amount / 105.5;
        }
        else {
            throw new InvalidAmountException(
                "Invalid currency choice"
            );
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter amount in INR: ");
            double amount = scan.nextDouble();
            System.out.println("\nChoose currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. GBP");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            double result = convert(amount, choice);
            if (choice == 1)
                System.out.println("Amount in USD = " + result);
            else if (choice == 2)
                System.out.println("Amount in EUR = " + result);
            else
                System.out.println("Amount in GBP = " + result);
        }
        catch (InvalidAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        scan.close();
    }
}
