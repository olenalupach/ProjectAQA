package first.statick;

import java.util.Scanner;

public class Calc {
    public static int multiply (int num1, int num2) {
        return num1 * num2;
    }
    public static int plus (int num1, int num2) {
        return num1 + num2;
    }
    public static int divide (int num1, int num2) {
        return num1 / num2;
    }
    public static int minus (int num1, int num2) {
        return num1 - num2;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first integer");
        int num1 = sc.nextInt();
        System.out.println(">>> " + num1);

        System.out.println("enter the second integer");
        int num2 = sc.nextInt();
        System.out.println(">>> " + num2);

        System.out.println("\nResult:");
        System.out.println(num1 + " * " + num2 + " = " + plus(num1, num2));
        System.out.println(num1 + " + " + num2 + " = " + minus(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + multiply(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + divide(num1, num2));

    }
}
