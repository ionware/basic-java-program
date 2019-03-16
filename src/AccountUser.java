/**
 * A java class to use the Account class.
 * (c) copyright Adedeji Stephen Adedokun
 */
public class AccountUser {
    public static void main(String argv[]) {
        Account customer = new Account("Adedeji", "Stephen");
        System.out.printf("Customer Name: %s\n", customer.getFullName());
        customer.credit(1490246);
        customer.debit(300);
    }
}
