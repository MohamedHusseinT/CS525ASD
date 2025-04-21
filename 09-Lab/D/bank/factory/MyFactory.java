package Lab09.main.java.bank.factory;

import Lab09.main.java.bank.email.IEmailSender;
import Lab09.main.java.bank.dao.IAccountDAO;

public interface MyFactory {
	public IAccountDAO getAccountDAO();
	public IEmailSender getEmailSender();
}
