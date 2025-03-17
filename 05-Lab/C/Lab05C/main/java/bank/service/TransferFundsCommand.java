package Lab05C.main.java.bank.service;

import Lab05CSol.main.java.bank.service.IAccountService;

public class TransferFundsCommand implements ICommand{

    private IAccountService localAccountService;
    private long localFromaccountnumber;
    private long localToaccountnumber;
    private double localAmount;
    private String localDescription;


    public TransferFundsCommand(IAccountService accountService, long fromAccountNumber, long toAccountNumber, double amount, String description)
    {
        this.localAccountService = accountService;
        this.localFromaccountnumber = fromAccountNumber;
        this.localToaccountnumber = toAccountNumber;
        this.localAmount = amount;
        this.localDescription = description;


    }

    @Override
    public void execute() {
        localAccountService.transferFunds(localFromaccountnumber, localToaccountnumber, localAmount, "add fund description: "+localDescription);

    }

    @Override
    public void unExecute() {
        localAccountService.transferFunds(localToaccountnumber, localFromaccountnumber, localAmount, "undo fund with description: "+localDescription);

    }
}
