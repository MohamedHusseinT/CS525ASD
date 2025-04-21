package Lab09.main.java.bank.email;

public class MockEmailSender implements IEmailSender {

	@Override
	public void send(String message) {
		System.out.println("Mock emailsender send message: "+message);
		
	}

}
