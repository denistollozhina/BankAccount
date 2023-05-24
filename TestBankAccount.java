public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        account1.deposit(1000, "checking");
        account1.deposit(500, "savings");
        account2.deposit(2000, "checking");

        account1.printTotalMoney();  // Output: Total money stored: $3500.0

        account1.withdraw(200, "checking");
        account1.withdraw(700, "savings");
        account1.withdraw(1000, "savings");  // Output: Insufficient funds in the savings account.

        account2.withdraw(1500, "checking");  // Output: Insufficient funds in the checking account.

        System.out.println("Account 1 - Checking balance: $" + account1.getCheckingBalance());  // Output: Account 1 - Checking balance: $800.0
        System.out.println("Account 1 - Savings balance: $" + account1.getSavingsBalance());  // Output: Account 1 - Savings balance: $0.0
        System.out.println("Account 2 - Checking balance: $" + account2.getCheckingBalance());  // Output: Account 2 - Checking balance: $2000.0

        System.out.println("Number of accounts created: " + BankAccount.getNumberOfAccounts());  // Output: Number of accounts created: 2

        System.out.println("Account 1 - Account number: " + account1.getAccountNumber());
        System.out.println("Account 2 - Account number: " + account2.getAccountNumber());
    }
}
