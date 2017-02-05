package Bank;

/**
 * Created by Temir on 05.02.2017.
 */
public class Customer extends People {
    /*
        Данные клиента( номер и привязанные счета);
    */
    private int sin;
    private int[] bankAccounts;

    public Customer(int sin) {
        this.sin = sin;
    }

    public int getId() {
        return sin;
    }

    public int[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(int[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
