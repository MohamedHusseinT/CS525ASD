package Lab08.main.java.bank.dao;

import java.util.*;
import Lab08.main.java.bank.domain.Account;

public class AccountDAO implements IAccountDAO {
	Collection<Account> accountlist = new ArrayList<Account>();

	public void saveAccount(Account account) {
		accountlist.add(account); // add the new
	}

	public void updateAccount(Account account) {
		Account accountexist = loadAccount(account.getAccountnumber());
		if (accountexist != null) {
			accountlist.remove(accountexist); // remove the old
			accountlist.add(account); // add the new
		}

	}

	public Account loadAccount(long accountnumber) {
		for (Account account : accountlist) {
			if (account.getAccountnumber() == accountnumber) {
				return account;
			}
		}
		return null;
	}

	public Collection<Account> getAccounts() {
		return accountlist;
	}

}
