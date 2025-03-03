package Lab03G.main.java.bank.Observers;

import Lab03G.main.java.bank.domain.Account;

public interface AccountObserver {

    public void update(Account account);
}
