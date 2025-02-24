package Lab02E.src.main.java.with.templatemethod;


public class INRCurrencyConverter implements ICurrencyConverter {
    String currency = "INR";  // Indian Rupee

    @Override
    public double convert(double amount) {

        double dollarAmount = amount * 0.014;
        System.out.println("Convert "+amount+" "+currency+" to US dollars");
        return dollarAmount;
    }
}
