package Lab02B.main.java.bank.dao;

import java.util.Collection;
import Lab02B.main.java.bank.domain.Account;

public interface IAccountDAO {
	void saveAccount(Account account);
	void updateAccount(Account account);
	Account loadAccount(long accountnumber);
	Collection<Account> getAccounts();
}
