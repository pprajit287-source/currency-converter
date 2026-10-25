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


    void convert(double amount) {
        double result = amount * rate;
        System.out.println("Converted Amount for " + amount + " = " + result);
    }


    void convert(double amount, double rate) {
        double result = amount * rate;
        System.out.println("Converted Amount with new rate = " + result);
    }
}

public class main1 {
    public static void main(String[] args) {

        CurrencyConverter obj = new CurrencyConverter(100, 83.5);

        obj.convert();              // Calls Method 1
        obj.convert(200);           // Calls Method 2
        obj.convert(300, 84.2);     // Calls Method 3
    }
}