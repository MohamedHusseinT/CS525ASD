package Lab02B.main.java.bank.domain;

public class CheckingAccount  extends  Account{


    public CheckingAccount(long accountnr) {
        super(accountnr);
        interest = new CheckingInterest();

    }
}


