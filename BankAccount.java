import java.util.Random;

public class BankAccount {
    private static int numberOfAccounts = 0;
    private static double totalAmountStored = 0;
    private static Random random = new Random();

    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;

    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        this.accountNumber = generateAccountNumber();
        numberOfAccounts++;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            checkingBalance += amount;
        } else if (accountType.equalsIgnoreCase("savings")) {
            savingsBalance += amount;
        }

        totalAmountStored += amount;
    }

    public void withdraw(double amount, String accountType) {
        if (accountType.equalsIgnoreCase("checking")) {
            if (amount <= checkingBalance) {
                checkingBalance -= amount;
                totalAmountStored -= amount;
            } else {
                System.out.println("Insufficient funds in the checking account.");
            }
        } else if (accountType.equalsIgnoreCase("savings")) {
            if (amount <= savingsBalance) {
                savingsBalance -= amount;
                totalAmountStored -= amount;
            } else {
                System.out.println("Insufficient funds in the savings account.");
            }
        }
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static double getTotalAmountStored() {
        return totalAmountStored;
    }

    public void printTotalMoney() {
        System.out.println("Total money stored: $" + totalAmountStored);
    }

    private String generateAccountNumber() {
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNumber.append(random.nextInt(10));
        }
        return accountNumber.toString();
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
