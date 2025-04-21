package Lab09.main.java.bank.dao;

import Lab09.main.java.bank.dao.IAccountDAO;
import Lab09.main.java.bank.domain.Account;

import java.util.Collection;

public abstract class AccountDecorator implements Lab09Sol.main.java.bank.dao.IAccountDAO {

	protected Lab09Sol.main.java.bank.dao.IAccountDAO decoratedDAO;

	public AccountDecorator(IAccountDAO decoratedDAO) {
		super();
		this.decoratedDAO = decoratedDAO;
	}

	public  void saveAccount(Account account) {
		decoratedDAO.saveAccount(account);
	};
	public  void updateAccount(Account account) {
		decoratedDAO.updateAccount(account);
	}
	public  Account loadAccount(long accountnumber) {
		return decoratedDAO.loadAccount(accountnumber);
	};
	public  Collection<Account> getAccounts() {
		return decoratedDAO.getAccounts();
	}

}
