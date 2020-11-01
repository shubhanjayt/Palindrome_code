package Palindrome_Check;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int r, sum = 0, temp;
        System.out.println("Print Number");
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();


        temp = number;
        while (number > 0) {
            r = number % 10;  //getting remainder
            sum = (sum * 10) + r;
            number = number / 10;
        }
        if (temp == sum)
            System.out.println("Palindrome number");
        else
            System.out.println("Not palindrome");
    }

}
