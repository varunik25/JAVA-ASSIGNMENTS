package Assignments;

import java.util.Scanner;



public class prime_or_not {

    public static boolean isprime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }


        public static void main (String[]args){
            System.out.println("enter the number");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            if(isprime(number)){
                System.out.println(number + "is prime number");
            }
            else{
                System.out.println(number + "is not a prime number");
            }

        }


    }



