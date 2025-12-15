import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService{
	// Current account balance
    private int balance;

    // Transaction history
    private List<Transaction> transactions;

    public Account() {
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

	@Override
	public void deposit(int amount) {
		 if (amount <= 0) {
		        throw new IllegalArgumentException("Deposit amount must be positive");
		 }
		 balance += amount;
		 transactions.add(new Transaction(today(), amount, balance));
	}

	@Override
	public void withdraw(int amount) {
		 if (amount <= 0) {
		        throw new IllegalArgumentException("Withdraw amount must be positive");
		 } 
		 if (amount > balance) {
		        throw new IllegalArgumentException("Insufficient balance");
		 }
		 balance -= amount;
		 transactions.add(new Transaction(today(), -amount, balance));
		
	}

	@Override
	public void printStatement() {
		 System.out.println("Date \t || Amount || Balance");

		 for (int i = transactions.size() - 1; i >= 0; i--) {
		     Transaction t = transactions.get(i);
		     System.out.println(t.getDate() + " || " + t.getAmount() + " || " + t.getBalanceAfter());
		 }
	}
	
	private String today() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
