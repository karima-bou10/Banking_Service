public class Main {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.deposit(3000);
        account.deposit(1000);
        account.withdraw(500);
        account.deposit(2000);
        account.withdraw(500);

        account.printStatement();
	}
}
