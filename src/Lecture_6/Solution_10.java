package Lecture_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/*
Факториал
*/

public class Solution_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if (n > 0) {
            BigDecimal result = new BigDecimal(1);
            BigDecimal a;
            for (int i = 2; i <= n; i++) {
                a = new BigDecimal(i); // Преобразовать i в тип BigDecimal
                result = result.multiply(a); // Не использовать result * a, потому что тип BigDecimal не определяет * операцию
            }
            return result.toString();
        } else {
            return "0";
        }
    }
}
