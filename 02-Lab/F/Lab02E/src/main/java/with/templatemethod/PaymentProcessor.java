package Lab02E.src.main.java.with.templatemethod;

public abstract class PaymentProcessor {

	protected ICurrencyConverter currencyConverter;
	protected double dollarAmount;
	protected Customer customer;


	public void proccessPayment(double amount, String currency,Customer inputcustomer)//, String paymentType, Customer customer,
                                   //VisaCard visaCard, String paypalAddress) {
	{
		dollarAmount = amount;
		customer = inputcustomer;

		switch (currency) {
			case "EUR": currencyConverter = new EuroCurrencyConverter();
				dollarAmount = currencyConverter.convert(dollarAmount);
				break;
			case "INR": currencyConverter = new INRCurrencyConverter();
				dollarAmount = currencyConverter.convert(dollarAmount);
				break;
			case "USD": dollarAmount = amount;
break;
			default: throw new RuntimeException("Unknown currency: " + currency);
		}

		if(validate())
		{
			performPayment();
			notifyCustomer();
		}

	}
	

	protected abstract boolean validate();
	//{
	//	System.out.println("default Validate payment");
	//}
	protected abstract void performPayment();
	//{
	//	System.out.println("default perform payment");
	//}
	protected abstract void notifyCustomer();
	//{
	//	System.out.println("default notify customer");
	//}

}
