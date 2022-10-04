package Lecture_6;

import java.util.Scanner;

public class Solution_14 {
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        int a = Scanner.nextInt();
        int b = Scanner.nextInt();
        int c = Scanner.nextInt();

        if ((a == b) && (b == c) && (a == c)) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b) {
            System.out.println(a + " " + b);
        } else if (b == c) {
            System.out.println(b + " " + c);
        } else if (c == a) {
            System.out.println(c + " " + a);
        }


        //напишите тут ваш код
    }
}
