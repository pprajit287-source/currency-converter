class CurrencyConverter {
    double amount;
    double rate;

    CurrencyConverter(double amount, double rate) {
        this.amount = amount;
        this.rate = rate;
    }

    void convert() {
        double result = amount * rate;
        System.out.println("Converted Amount = " + result);
    }
}

public class Main2 {
    public static void main(String[] args) {
        CurrencyConverter obj = new CurrencyConverter(100, 83.5);
        obj.convert();
    }
}