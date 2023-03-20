package Fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n = scan.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a + " \n" + b + " ");

        int c = 0;

        for (int i = 2; i < n; i++){
            c = a + b;
            System.out.println(c + " ");

            a = b;
            b = c;
        }

    }
}
