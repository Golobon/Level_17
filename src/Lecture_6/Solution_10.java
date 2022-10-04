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
        BigInteger result2 = BigInteger.valueOf(1L);
        for (int i = 1; i <= n; i++){
            result2 = result2.multiply(BigInteger.valueOf(i));
        }
        return result2.toString();
    }
}
