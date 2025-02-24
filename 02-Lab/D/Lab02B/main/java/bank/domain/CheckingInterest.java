package Lab02B.main.java.bank.domain;

public class CheckingInterest implements IInterest{


    @Override
    public double CalculateInterest(double balance) {
        if (balance > 1000){
            return balance*0.025;
        }
        else{
            return balance*0.015;
        }
    }
}
