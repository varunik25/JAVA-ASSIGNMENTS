
package Assignments;


import java.util.Scanner;

public class positive_or_negative {
    public static  void main(String[] args){
        System.out.println("enter the number");
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        if (number>0){
            System.out.println("positive number");
        }else if(number<0){
            System.out.println("negative number");
        }else {
            System.out.println("entered number is zero");
        }





    }
}





