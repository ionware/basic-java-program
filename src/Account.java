public class Account {

    /**
     * Customer's balance
     */
    private double balance;

    /**
     * Customer first name
     */
    private String firstname;

    /**
     * customer lastname
     */
    private String lastname;

    /**
     * Constructor function to Setup the account of the customer
     * @param firstname
     * @param lastname
     */
    Account(String firstname, String lastname) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = 0;
    }

    /**
     * Set the firstname of the customer
     * @param firstname
     */
    public void setFirstname(String firstname) {

        this.firstname = firstname;
    }

    /**
     * Set the the last name of the customer.
     * @param lastname
     */
    public void setLastname(String lastname) {

        this.lastname = lastname;

    }

    /**
     * Get the first name of the customer
     * @return null
     */
    public String getFirstname() {

        return this.firstname;
    }

    /**
     * Get the last name of the customer
     * @return String
     */
    public String getLastname() {

        return this.lastname;
    }

    /**
     * Get the last and first names of the customer.
     * @return String
     */
    public String getFullName() {

        return this.firstname + ' ' + this.lastname;
    }

    /**
     * Get the account balance of the customer
     * @return double
     */
    public double getBalance() {

        return balance;
    }

    /**
     * Withdraw certain amount from the customer's account.
     * @param amount
     * @return double
     */
    public double debit(float amount) {
        if ( !(this.balance >= amount)) {
            return 0.00;
        }
        this.balance -= amount;
        System.out.printf("Hello %s, %.2f was debited from your account. \nNew balance is: %.2f\n",
                this.getFullName(), amount, this.balance
        );
        return this.balance;
    }

    /**
     * Add certain amount to the customer's account balance.
     * @param amount
     * @return double
     */
    public double credit(float amount) {
        this.balance += amount;
        System.out.printf("Dear %s, your account has been credited with %.2f. \nYour new account balance is: %.2f\n",
                this.getFirstname(), amount, this.getBalance());

        return this.balance;
    }
}
