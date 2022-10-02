package Lecture_6;

import java.io.IOException;

public class Solution_8 {
    public static int A = 0;
    public static int B = 5;

    static {
        try {
            A = A / A;
        } catch (ArithmeticException e) {
            throw new RuntimeException();
        }
    }


    public static void main(String[] args) {
        System.out.println(B);
    }
}
