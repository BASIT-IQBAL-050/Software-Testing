package ErrorCheckList;

public class CorrectBankAccount {
    private String accountHolderName; 
    private double accountBalance; 
    
    public CorrectBankAccount(double startingAmount){
        accountBalance = startingAmount;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    
    public double getAccountBalance() {
        return accountBalance;
    }
    
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    
    public void deposit(double depositAmount) {
        if (depositAmount > 0) { 
            setAccountBalance(getAccountBalance() + depositAmount);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }
   
    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount > 0 && withdrawalAmount <= this.accountBalance) { 
            setAccountBalance(getAccountBalance() - withdrawalAmount);
        } else {
            System.out.println("Insufficient funds. Withdrawal amount cannot be negative or exceed your balance.");
        }
    }
  
    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Account Balance: $" + this.accountBalance); 
    }
}
