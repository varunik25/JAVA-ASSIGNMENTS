package Assignments;

import java.util.Scanner;

public class gretest_of_two_numbers {
    public static void main(String[] args){
        int firstnumber , secondnumber;
        System.out.println("enter first number");
        Scanner sc = new Scanner(System.in);
        firstnumber = sc.nextInt();
        System.out.println("enter second number");
        secondnumber = sc.nextInt();
        if(firstnumber>secondnumber){
            System.out.println(firstnumber + "is largest");
        }
        else{
            System.out.println(secondnumber + "is largest");
        }


    }


}
