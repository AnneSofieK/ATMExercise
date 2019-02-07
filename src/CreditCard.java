public class CreditCard
{
    private int pinCode;
    private int cardNumber;

    public CreditCard (int cardNumber, int pinCode)
    {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public boolean validate(int pinCode)
    {
        if (this.pinCode == pinCode)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int getCardNumber()
    {
        return cardNumber;
    }
}
