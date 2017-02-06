package Bank;

/**
 * Created by Temir on 05.02.2017.
 */
public class Customer extends Person {
    /*
        Данные клиента( номер и привязанные счета);
    */
    private int sin;
    private CustomerAccount[] customerAccounts;

    public Customer(int sin) {
        this.sin = sin;
    }

    public int getId() {
        return sin;
    }

    public CustomerAccount[] getBankAccounts() {
        return customerAccounts;
    }

    public void setBankAccounts(CustomerAccount[] bankAccounts) {
        this.customerAccounts = bankAccounts;
    }
}
