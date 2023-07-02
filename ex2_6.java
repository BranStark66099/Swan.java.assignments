package chp2;
import java.util.Scanner;
public class ex2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly saving amount : ");
        double monthly_saving =  input.nextDouble();
        double after_firstmonth = (monthly_saving * ( 1 + 0.00417));
        double after_2ndmonth = ((100 + after_firstmonth) * (1 + 0.00417));
        double after_3rdmonth = ((100 + after_2ndmonth) * (1 + 0.00417));
        double after_4rdmonth = ((100 + after_3rdmonth) * (1 + 0.00417));
        double after_5thmonth = ((100 + after_4rdmonth) * (1 + 0.00417));
        double after_6thmonth = ((100 + after_5thmonth) * (1 + 0.00417));
        System.out.println("After the sixth month, the account value is " + after_6thmonth);
    }
}
