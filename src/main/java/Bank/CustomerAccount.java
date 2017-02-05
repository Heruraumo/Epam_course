package Bank;

/**
 * Created by Temir on 05.02.2017.
 */
public class CustomerAccount {
    private int sin;    //SystemIndentificalNumber
    private int countNum;
    private boolean accecable = true; //тру, в дальнейшем чек на блокировку счета
    private double balance;

    public CustomerAccount(int sin) {
        this.sin = sin;
    }

    public int getCountNum() {
        return countNum;
    }

    public void setCountNum(int countNum) {
        this.countNum = countNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isAccecable() {
        return accecable;
    }

    public void setAccecable(boolean accecable) {
        this.accecable = accecable;
    }
}
