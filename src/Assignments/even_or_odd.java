package Assignments;

import java.util.Scanner;

public class even_or_odd {

    public static void main(String[] args) {
        int number;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + ":is even");
        } else {
            System.out.println(number + ":is odd");
        }


    }
}
