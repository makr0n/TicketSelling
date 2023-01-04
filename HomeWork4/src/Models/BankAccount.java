package Models;

/**
 * Модель банковского аккаунта v0.0.1
 */
public class BankAccount {
    private long card;
    private int balance;
    private long oldCard;

    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getCard() {
        return card;
    }

    public int getBalance() {
        return balance;
    }

}
