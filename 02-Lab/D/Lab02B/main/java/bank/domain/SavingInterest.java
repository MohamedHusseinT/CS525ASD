package Lab02B.main.java.bank.domain;

public class SavingInterest implements IInterest{

    @Override
    public double CalculateInterest(double balance) {
        if (balance > 5000){
            return balance*0.04;
        }
        else{
            if (balance > 1000){
                return balance*0.02;
            }
            else{
                return balance*0.01;
            }
        }
    }
}
