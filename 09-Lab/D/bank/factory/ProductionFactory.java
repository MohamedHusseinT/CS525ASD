package Lab09.main.java.bank.factory;

import Lab09.main.java.bank.email.EmailSender;
import Lab09.main.java.bank.email.IEmailSender;
import Lab09.main.java.bank.dao.AccountDAO;
import Lab09.main.java.bank.dao.AccountDAOLogger;
import Lab09.main.java.bank.dao.IAccountDAO;

public class ProductionFactory implements MyFactory {

	public IAccountDAO getAccountDAO() {
		IAccountDAO accountDao = new AccountDAO();
		accountDao = new AccountDAOLogger(accountDao);
		return accountDao;
	}

	public IEmailSender getEmailSender() {
		return EmailSender.getEmailSender();
	}

}
