package Lab03G.main.java.bank.Observers;

import Lab03G.main.java.bank.domain.Account;

public class SMSSender implements AccountObserver{


    private void sendSMS( Account account)
    {
        System.out.println("Sending SMS: " + account);
    }

    @Override
    public void update(Account account) {
        sendSMS(account);
    }

}
