
package power;
import java.util.*;
/**
 *
 * @author Tin Tran
 */


public class Power
{
private static int num;
private static int num2;
private static String input="";


public static int Power(int x, int y)
{
    if(y==0)
        return 1;
    else
        return x*Power(x,y-1);
}



public static void main(String argsp[])
    {
       
        System.out.print("Enter x value: ");
        Scanner sr1 = new Scanner(System.in);
        input = sr1.next();
        num = Integer.parseInt(input);
        System.out.print("Enter x value: ");
        Scanner sr2 = new Scanner(System.in);
        String input2= sr2.next();
        num2 = Integer.parseInt(input2);
        System.out.println("Result of x to the power of y is: "+ Power(num,num2));
       
    }
}
