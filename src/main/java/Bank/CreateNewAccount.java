package Bank;

import java.util.*;

public class CreateNewAccount {
    private int sin;
    private CustomerAccount custAcc;

    CreateNewAccount(int sin) {
        this.sin = sin;
    }

    private CustomerAccount fillAccount() {
        CustomerAccount customer = new CustomerAccount(sin);
        customer.setCountNum(sin + ((int) Math.random() * 1000));
        customer.setAccecable(true);
        customer.setBalance(0);
        return customer;
    }

    public CustomerAccount getCustAcc() {
        custAcc = fillAccount();
        return custAcc;
    }

    /* public fill(CustomerAccount value) {
        return fillAccount();
    }*/
}