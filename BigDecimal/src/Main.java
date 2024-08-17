import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main
{
    public static void main(String[] args)
    {
        //Nie uzywaj konstruowania przez double
        //BigDecimal bigD = BigDecimal.valueOf(2.5);
        BigDecimal bigD = new BigDecimal("2.55");
        System.out.println(bigD);

        BigDecimal normalDivide = bigD.divide(new BigDecimal("0.10"));
        System.out.println(normalDivide);

        //BigDecimal errorDivide = bigD.divide(new BigDecimal("0.3"));
        //System.out.println(errorDivide);

        BigDecimal roundedDivide = bigD.divide(new BigDecimal("0.31"), 5, RoundingMode.HALF_UP);
        System.out.println(roundedDivide);
    }
}