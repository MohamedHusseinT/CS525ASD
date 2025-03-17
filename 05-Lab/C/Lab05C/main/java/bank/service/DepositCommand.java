package Lab05C.main.java.bank.service;

public class DepositCommand implements ICommand{

    private IAccountService localAccountService;
    private long localAccountnumber;
    private double localAmount;

    public DepositCommand(IAccountService accountService, long accountnumber, double amount) {
        this.localAccountService=accountService;
        this.localAccountnumber=accountnumber;
        this.localAmount=amount;
    }

    @Override
    public void execute() {
        localAccountService.deposit(localAccountnumber, localAmount);

    }

    @Override
    public void unExecute() {
        localAccountService.withdraw(localAccountnumber, localAmount);
    }
}
