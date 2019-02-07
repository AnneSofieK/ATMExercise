import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank
{
    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<ATM> atmMachines = new ArrayList<>();

    public void addAccount(int accountNumber, BigDecimal balance, CreditCard creditCard)
    {
        accounts.add(new Account(accountNumber,balance,creditCard));
    }

    public ArrayList getAccounts()
    {
        return accounts;
    }
}
