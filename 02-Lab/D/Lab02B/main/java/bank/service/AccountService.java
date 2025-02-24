package Lab02B.main.java.bank.service;

import java.util.Collection;

import Lab02B.main.java.bank.dao.AccountDAO;
import Lab02B.main.java.bank.dao.IAccountDAO;
import Lab02B.main.java.bank.domain.*;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;

	
	public AccountService(){
		accountDAO=new AccountDAO();
	}

	public Account createAccount(long accountNumber, String customerName, AccountType accountType) {
		Account account;

		switch (accountType) {
			case CheckingAccount ->account = new CheckingAccount(accountNumber) ;
			case SavingsAccount -> account = new SavingAccount(accountNumber);
			default -> throw new IllegalArgumentException("Invalid account type");
		}
		//Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
	}

	public Account getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}

	@Override
	public void addInterest() {
		Collection<Account> accounts = accountDAO.getAccounts();
		for (Account account: accounts){
			account.addInterest();
		}
	}
}
