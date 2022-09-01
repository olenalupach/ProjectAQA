package first.statick.hw;

import java.util.Scanner;

public class hw_continue {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input number");
            n = Integer.parseInt(sc.nextLine());
            if (n < 0){
                n = i;
                continue;
            }
            sum += n;
        }
        System.out.println(sum);
        sc.close();

    }

}
