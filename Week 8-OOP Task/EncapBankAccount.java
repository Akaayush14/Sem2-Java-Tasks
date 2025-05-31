public class EncapBankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public EncapBankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.accountBalance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.accountBalance = 0;
        }
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited $" + amount + " successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrew $" + amount + " successfully.");
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Balance: $" + accountBalance);
    }

    public static void main(String[] args) {
        EncapBankAccount account = new EncapBankAccount("ISI0000044222999", "Thor Odinson", 131500.0);

        account.displayAccountInfo();

        account.deposit(10000.0);
        account.withdraw(1500.0);
        account.withdraw(800.0);

        System.out.println("\n--- Updated Account Info ---");
        account.displayAccountInfo();
    }
}
