import java.math.BigDecimal;
import java.util.ArrayList;

public class Bank
{
    private static ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<ATM> atmMachines = new ArrayList<>();

    /**
     * Method to create new accounts
     * @param accountNumber
     * @param balance
     * @param creditCard
     */
    public void addAccount(int accountNumber, BigDecimal balance, CreditCard creditCard)
    {
        accounts.add(new Account(accountNumber,balance,creditCard));
    }

    /**
     * @return all the accounts in the bank
     */
    public ArrayList getAccounts()
    {
        return accounts;
    }
}
