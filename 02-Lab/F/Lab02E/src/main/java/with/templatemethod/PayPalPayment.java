package Lab02E.src.main.java.with.templatemethod;

public class PayPalPayment extends PaymentProcessor {
    String localpaypalAddress;

    public PayPalPayment(String paypalAddress) {
        super();
        localpaypalAddress = paypalAddress;
    }


    @Override
    protected boolean validate() {
        // logic to validate paypal address
        System.out.println("Validate paypal address "+localpaypalAddress);
        return true;
    }

    @Override
    protected void performPayment() {
        // logic to perform paypal payment
        System.out.println("Perform payment with paypal address "+localpaypalAddress+" and amount $"+dollarAmount);
    }

    @Override
    protected void notifyCustomer() {
// logic to notify customer
        System.out.println("Notify customer "+customer.getName()+" with email "+customer.getEmail()+" about paypal payment to address "+localpaypalAddress);
    }
}
