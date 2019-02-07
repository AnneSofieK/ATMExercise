import java.util.ArrayList;
import java.util.Scanner;

public class ATM extends Bank
{

    private ArrayList<Money> moneyBills = new ArrayList<>();
    private int atmID;

    public ATM(ArrayList<Money> moneyBills, int atmID)
    {
        this.moneyBills = moneyBills;
        this.atmID = atmID;
    }

    public void display()
    {
        //Displays a menu to the customer
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter card number: ");
        int cardNumber = in.nextInt();
        System.out.println("Please enter pin code: ");
        int pinCode = in.nextInt();

        validatePin(cardNumber,pinCode);


        System.out.println("Would like to withdraw (1) or see balance (2):         (0 to exit)");
        int choice = in.nextInt();
        if (choice == 1)
        {

        }
        else if (choice == 2)
        {

        }
    }

    public boolean validatePin(int cardNumber, int pinCode)
    {

        ArrayList<Account> accounts = getAccounts();

        for (int i = 0; i < accounts.size(); i++) {
            ArrayList<CreditCard> creditCards = accounts.get(i).getCreditCards();
            for (int j = 0; j < creditCards.size(); j++) {
                if (creditCards.get(i).getCardNumber() == cardNumber) {
                    if (creditCards.get(i).validate(pinCode))
                    {

                    }
                    else
                        {

                        }
                }
            }
        }
    }


    public double withDraw(double amount)
    {
        return 0;
    }

    public double getBalance()
    {
        return 0;
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
