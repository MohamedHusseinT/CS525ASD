package Lab05C.main.java.bank.dao;

import java.util.Collection;
import Lab05C.main.java.bank.domain.Account;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber);
	Collection<Account> getAccounts();
}
