
package ErrorCheckList;

/**
 *
 * @author BASIT
 */
public class Main {
    public static void main(String[] args){
         BankAccount account = new BankAccount(100); // Incorrect constructor name
        account.name = "John Doe"; // Accessing undeclared variable 'name'
        account.deposit(50.5); // Potential data loss due to mixed types
        account.withdraw(120); // Potential negative balance due to incorrect comparison
    }
}
