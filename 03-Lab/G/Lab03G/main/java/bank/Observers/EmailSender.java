package Lab03G.main.java.bank.Observers;

import Lab03G.main.java.bank.domain.Account;

public class EmailSender implements AccountObserver {

    private void sendEmail( Account account)
    {
        System.out.println("Sending Email: " + account);

    }

    @Override
    public void update(Account account) {
        sendEmail(account);
    }
}
