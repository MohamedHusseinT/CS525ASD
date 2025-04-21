package Lab09.main.java.bank.dao;

import java.util.Collection;
import Lab09.main.java.bank.domain.Account;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber);
	Collection<Account> getAccounts();
}
