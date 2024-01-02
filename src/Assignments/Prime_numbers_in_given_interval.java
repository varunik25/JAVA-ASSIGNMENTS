package Assignments;

import java.util.Scanner;

public class Prime_numbers_in_given_interval {
    public static boolean isprime(int firstinterval , int lastinterval){
        boolean flag;
        for(int i = firstinterval;i<=lastinterval;i++){
            for ( int j=2;j<i;j++){
                if(i % j == 0){
                    flag = true;
                }
            }
            if(!flag){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args){
        System.out.println("Enter the first interval");
        Scanner sc = new Scanner(System.in);
        int firstinterval , lastinterval;
        firstinterval = sc.nextInt();
        System.out.println("enter last interval");
        lastinterval = sc.nextInt();
        isprime(firstinterval,lastinterval);


    }





}
