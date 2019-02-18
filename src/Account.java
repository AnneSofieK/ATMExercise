import java.math.BigDecimal;
import java.util.ArrayList;

public class Account
{
    private int accountNumber;
    private BigDecimal balance;
    private ArrayList<CreditCard> creditCards = new ArrayList<>();

    public Account (int accountNumber, BigDecimal balance, CreditCard creditCard)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        creditCards.add(creditCard);
    }

    /**
     * Subtracts the amount from the balance
     * @param amount
     */
    public void withDraw(BigDecimal amount)
    {
        balance = balance.subtract(amount);
    }

    /**
     * @return balance on account
     */
    public BigDecimal getBalance()
    {
        return balance;
    }

    /**
     *
     * @return arraylist of the creditcards connected to the account
     */
    public ArrayList getCreditCards()
    {
        return creditCards;
    }

    /**
     * @return the accountNumber
     */
    public int getAccountNumber()
    {
        return accountNumber;
    }
}
