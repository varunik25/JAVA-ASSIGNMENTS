package Assignments;

import java.util.Scanner;

public class Greatest_of_three_numbers {
    public static void main(String[] args){
        int firstnumber , secondnumber , thirdnumber;
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        firstnumber = sc.nextInt();
        System.out.println("Enter second number");
        secondnumber = sc.nextInt();
        System.out.println("Enter third number");
        thirdnumber= sc.nextInt();
        if(firstnumber>secondnumber && firstnumber>thirdnumber){
            System.out.println(firstnumber + "is greater");
        } else if (secondnumber>firstnumber && secondnumber>thirdnumber) {
            System.out.println(secondnumber + "is greater");
        }
        else {
            System.out.println(thirdnumber + "is greater");
        }


    }
}
