package Assignments;

import java.util.Scanner;

public class sumof_natural_numbers {
    public static void main(String[] args){
        int sum =0 , n;
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("SUM = " + sum);
    }
}
