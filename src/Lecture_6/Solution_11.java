package Lecture_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
Разные методы для разных типов
*/

public class Solution_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String value = bR.readLine();
            if (value.equals("exit")){
                break;
            } else if (isNumeric(value) && value.contains(".")) {
                print(Double.parseDouble(value));
            } else if (isNumeric(value) && Integer.parseInt(value) > 0 && Integer.parseInt(value) < 128) {
                print(Short.parseShort(value));
            } else if ((isNumeric(value) && Integer.parseInt(value) <= 0) || (isNumeric(value) && Integer.parseInt(value) >= 128)) {
                print(Integer.parseInt(value));
            } else {
                print(value);
            }
        }
        bR.close();
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
