package Lab02E.src.main.java.with.templatemethod;

public class EuroCurrencyConverter implements   ICurrencyConverter{

    String currency = "EUR";  // European Euro

    @Override
    public double convert(double amount) {
        double dollarAmount = amount * 1.1;
        System.out.println("Convert " + amount + " " + currency + " to US dollars");
        return dollarAmount;
    }
}
