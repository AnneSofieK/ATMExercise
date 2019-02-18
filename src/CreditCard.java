public class CreditCard
{
    private int pinCode;
    private int cardNumber;

    public CreditCard (int pinCode)
    {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    /**
     * Validates the pin
     * @param pinCode
     * @return if pin is correct
     */
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

}
