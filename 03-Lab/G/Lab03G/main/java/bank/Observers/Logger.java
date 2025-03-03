package Lab03G.main.java.bank.Observers;

import Lab03G.main.java.bank.domain.Account;

public class Logger implements AccountObserver {

    private void log(Account account)
    {
        System.out.println("log account: " + account);
    }

    @Override
    public void update(Account account) {
        log(account);
    }

}
