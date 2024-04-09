package ErrorCheckList;
/**
 *
 * @author BASIT
 */
public class BankAccount { 

    private String name; 
    public int balance; 

    public BankAccount(int startingAmount) { 
         amount = startingAmount; 
    }

    public void deposit(int depositAmount) {
        balance += depositAmount; 
    }

    public void withdraw(int withdrawalAmount) {
        if (withdrawalAmount > balance) { 
            System.out.println("Insufficient Funds!");
        } else {
            balance = balance - withdrawalAmount; 
        }
    }   
}
