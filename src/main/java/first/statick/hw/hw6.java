package first.statick.hw;

import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        int n = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Input number");
            n = Integer.parseInt(sc.nextLine());
            if (n < 0){
                n = i;
                break;
            }
        }
        System.out.println(n);
        sc.close();
    }
}

