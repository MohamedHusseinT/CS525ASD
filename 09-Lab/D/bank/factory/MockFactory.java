package Lab09.main.java.bank.factory;

import Lab09.main.java.bank.email.IEmailSender;
import Lab09.main.java.bank.email.MockEmailSender;
import Lab09.main.java.bank.dao.IAccountDAO;
import Lab09.main.java.bank.dao.MockAccountDAO;

public class MockFactory implements MyFactory {

	public IAccountDAO getAccountDAO() {
		return new MockAccountDAO();
	}

	public IEmailSender getEmailSender() {
		return new MockEmailSender();
	}

}
