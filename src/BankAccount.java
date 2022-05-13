// import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
        private double bankAccountBalance;
        private String accountHolderName;
        private int accountNumber;

        public static Scanner scanner = new Scanner (System.in);
        //Bank account constructor for parameters
        public BankAccount(String customerName, double customerBalance, int customerNum){
            this.bankAccountBalance = customerBalance;
            this.accountHolderName = customerName;
            this.accountNumber = customerNum;
    }
        public BankAccount(){
            System.out.println("What is the name for the account?");
            this.accountHolderName = scanner.nextLine();
            System.out.println("What is the starting balance for the account?");
            this.bankAccountBalance = Integer.valueOf(scanner.nextLine());
            this.accountNumber = 12345;
        }

    public double transfer(BankAccount account, double amount){
        return account.deposit(this.withdrawal(amount));
    }

    public double deposit(double customerDeposit){
        bankAccountBalance += customerDeposit;
        return customerDeposit;
    }

    public double withdrawal(double customerWithdrawal){
        bankAccountBalance -= customerWithdrawal;
        return customerWithdrawal;
    }
    
    public String getAccountHolderName(){
        return accountHolderName;
    }

    public void setBankAccountBalance(double bankAccountBalance) {
        this.bankAccountBalance = bankAccountBalance;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public double getBankAccountBalance(){
        return bankAccountBalance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    @Override
    public String toString(){
        getAccountHolderName();
        getBankAccountBalance();
        getAccountNumber();
        return "Account Name: " +  getAccountHolderName() + "\n Account Number: " + getAccountNumber() + "\n Balance: " + getBankAccountBalance();
    }

    public void accountInfo() {
        System.out.println("Account Name: " + accountHolderName + '\n' + "Account Balance: $" + bankAccountBalance );
    }
}