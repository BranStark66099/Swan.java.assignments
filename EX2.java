package chp3;

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        //Computer generates lottery number
        int generated_lott = (int)(Math.random() * 100);
        int gLott_firstDigit = generated_lott / 10;
        int gLott_secDigit = generated_lott % 10;

        //User input Guessed lottery
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits) : ");
        int picked_lott = input.nextInt();
        int picked_lott_firtDigit = picked_lott / 10;
        int picked_lott_secDigit = picked_lott % 10;
        System.out.println("The lottery number is " + generated_lott);

        if (picked_lott == generated_lott){
            System.out.println("Exact match : you win $10,000");
        }else if(picked_lott_firtDigit == gLott_secDigit && picked_lott_secDigit == gLott_firstDigit){
            System.out.println("Match all digits : you win $3,000");
        }else if(picked_lott_firtDigit == gLott_firstDigit || picked_lott_firtDigit == gLott_secDigit){
            System.out.println("Match one digit : you win $1,000");
        }else if(picked_lott_secDigit == gLott_firstDigit || picked_lott_secDigit == gLott_secDigit){
            System.out.println("Match one digit : you win $1,000");
        }
        else{
            System.out.println("Sorry : no match");
        }
    }
}
