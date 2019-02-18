import java.math.BigDecimal;
import java.util.ArrayList;

public class TestClass
{
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.addAccount(123456,new BigDecimal(25000),new CreditCard(1234));
        ATM atm1 = new ATM(new ArrayList<>(),4444);

        atm1.display();
    }
}
