import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class ATM extends Bank
{

    private ArrayList<Money> moneyBills = new ArrayList<>();
    private int atmID;

    /**
     * Constructor for ATM machine
     * @param moneyBills
     * @param atmID
     */
    public ATM(ArrayList<Money> moneyBills, int atmID)
    {
        this.moneyBills = moneyBills;
        this.atmID = atmID;
    }

    /**
     * Display menu on ATM machine. Validates account and checks pin
     */
    public void display()
    {
        Scanner in = new Scanner(System.in);

        //Ask for the account number
        System.out.println("Please enter account number: ");
        int accountNumber = in.nextInt();
        ArrayList<Account> accounts = getAccounts();
        Account customerAccount = null;

        //Checks if the account exists
        for (Account account: accounts)
        {
            if (account.getAccountNumber() == accountNumber)
            {
                customerAccount = account;
            }
        }

        //If the account doesn't exist, then it returns, and run the display again
        if (customerAccount == null)
        {
            System.out.println("Account not found");
            display();
            return;
        }

        //Ask for pincode
        System.out.println("Please enter pin code: ");
        int pinCode = in.nextInt();

        //Validates pincode, and if the pincode is incorrect the program returns and displays the menu again
        if (!validatePin(pinCode, customerAccount))
        {
            display();
            return;
        }

        //Account is now validated and options is showed
        displayOptions(customerAccount);
    }

    /**
     * Displays the options for the customer
     * @param customerAccount
     */
    public void displayOptions(Account customerAccount)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Would like to withdraw (1) or see balance (2):         (0 to exit)");
        int choice = in.nextInt();
        if (choice == 1)
        {
            System.out.println("How much do you wish to withdraw: ");
            BigDecimal amount = in.nextBigDecimal();

            //Checks if the amount can be withdrawn
            if (withDraw(amount,customerAccount))
            {
                System.out.println("You have now withdrawn: "+amount+" from your account, and your balance is now: "+customerAccount.getBalance());
            }
            //If not the options is shown again
            else
            {
                displayOptions(customerAccount);
                return;
            }
        }
        else if (choice == 2)
        {
            System.out.println("Your balance is: "+customerAccount.getBalance());
        }
        else if(choice == 0)
        {
            return;
        }
    }

    /**
     * Validates the pincode to the account
     * @param pin
     * @param account
     * @return validation of pin
     */
    public boolean validatePin(int pin, Account account)
    {
        boolean returnVal = false;
        ArrayList<CreditCard> creditCards = account.getCreditCards();
        for (CreditCard creditCard: creditCards)
        {
            if (creditCard.validate(pin))
            {
                System.out.println("Pin validated");
                returnVal = true;
            }
            else {
                System.out.println("Wrong pin");
            }
        }
        return returnVal;
    }

    /**
     * Checks if the amount is in the account, and withdraws it or list the balance and exit
     * @param amount
     * @param account
     * @return if it is possible to withdraw the amount
     */
    public boolean withDraw (BigDecimal amount, Account account)
    {
        if (account.getBalance().compareTo(amount) >= 0)
        {
            account.withDraw(amount);
            return true;
        }
        else
        {
            System.out.println("Withdraw is not legal, due to less amount on balance. Your balance is: "+account.getBalance());
            return false;
        }
    }


    public void handoutMoneyBills()
    {

    }

    public void refillMoneyBills()
    {

    }

    public void StartTransaction()
    {

    }
}
