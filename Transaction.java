public class Transaction {
	private String date;
    private int amount;
    private int balanceAfterTransaction;

    public Transaction(String date, int amount, int balanceAfterTransaction) {
        this.date = date;
        this.amount = amount;
        this.balanceAfterTransaction = balanceAfterTransaction;
    }

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public int getBalanceAfter() {
        return balanceAfterTransaction;
    }
}
