package Lab12A.main.java.customers;

public interface IEmailSender {
	void sendEmail(String email, String message);
	String getOutgoingMailServer();
}