package chp2;
import java.util.Scanner;
public class ex2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter teh length of the side : ");
        double s = input.nextDouble();
        double Area = ((3 * Math.sqrt(3)) * Math.pow(s,2)) / 2;
        System.out.println("The area of the hexagon is " + Area);
    }
}
