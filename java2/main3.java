import java.util.Scanner;

class CurrencyConverter {

    void convert(double amount, double rate) {
        System.out.println("Converted Amount = " + (amount * rate));
    }

    void convert(double amount) {
        System.out.println("Converted Amount = " + (amount * 83.5));
    }

    void convert() {
        System.out.println("Currency Converter");
    }
}

public class main3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        CurrencyConverter obj = new CurrencyConverter();

        obj.convert();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        obj.convert(amount);
        obj.convert(amount, rate);

        sc.close();
    }
}