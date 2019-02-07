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

    public double withDraw(double amount)
    {
        return 0;
    }

    public BigDecimal getBalance()
    {
        return balance;
    }

    public ArrayList getCreditCards()
    {
        return creditCards;
    }
}
