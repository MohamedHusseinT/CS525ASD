package Lab02E.src.main.java.with.templatemethod;

public class VisaPayment extends PaymentProcessor {

    VisaCard localvisaCard;
    // we can add those and pass them to the super class double amount, String currency,
    public VisaPayment(VisaCard visaCard) {
        super();//(amount,currency);
        localvisaCard = visaCard;

    }
    @Override
    protected boolean validate() {
        // logic to validate visa card
        System.out.println("Validate visa card with card number " + localvisaCard.getCreditCardNumber());
        return true;
    }

    @Override
    protected void performPayment() {
        // logic to perform payment visa card
        System.out.println("Perform payment with visa card with card number " + localvisaCard.getCreditCardNumber()
                + " and amount $" + dollarAmount);
    }

    @Override
    protected void notifyCustomer() {
        // logic to notify customer
        System.out.println("Notify customer " + customer.getName() + " with email " + customer.getEmail()
                + " about visa credit card payment with card number " + localvisaCard.getCreditCardNumber());
    }
}
