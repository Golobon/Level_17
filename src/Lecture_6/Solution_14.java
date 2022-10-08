package Lecture_6;

import java.util.Scanner;

public class Solution_14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a == b) && (b == c) && (a == c)) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b) {
            System.out.println(a + " " + b);
        } else if (b == c) {
            System.out.println(b + " " + c);
        } else if (c == a) {
            System.out.println(c + " " + a);
        }

        scanner.close();

        //напишите тут ваш код
    }
}
