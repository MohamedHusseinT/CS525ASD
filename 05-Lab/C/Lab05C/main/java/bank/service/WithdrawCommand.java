package Lab05C.main.java.bank.service;

public class WithdrawCommand implements ICommand{


    private IAccountService localAccountService;
    private long localAccountnumber;
    private double localAmount;
    public WithdrawCommand(IAccountService accountService, long accountnumber, double amount) {
        this.localAccountService=accountService;
        this.localAccountnumber=accountnumber;
        this.localAmount=amount;

    }


    @Override
    public void execute() {
        this.localAccountService.withdraw(localAccountnumber, localAmount);
    }

    @Override
    public void unExecute() {
        this.localAccountService.deposit(localAccountnumber, localAmount);
    }
}
