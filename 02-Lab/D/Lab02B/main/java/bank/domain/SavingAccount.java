package Lab02B.main.java.bank.domain;

public class SavingAccount extends  Account{

    public SavingAccount(long accountnr) {
        super(accountnr);
        interest = new SavingInterest();

    }
}
