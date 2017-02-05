package Bank;

import java.util.*;
public class CreateCustomerAccount {
    private int sin;

    CreateCustomerAccount(int sin) {
        this.sin = sin;
    }

    private void fillAccount() {
        CustomerAccount customer = new CustomerAccount(sin);
        customer.setCountNum(sin + 666);
        customer.setAccecable(true);
        customer.setBalance(0);
    }
    private void Create(){
        CreateCustomerAccount.this.fillAccount();
    }
}