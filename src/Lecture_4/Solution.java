package Lecture_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //add your code here - добавьте код тут
        try {
            reset();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static CanFly result;

    public static void reset() throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        try {
            String value = bR.readLine();
            switch (value) {
                case "helicopter" -> result = new Helicopter();
                case "plane" -> {
                    int res = Integer.parseInt(bR.readLine());
                    result = new Plane(res);
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        bR.close();
        //add your code here - добавьте код тут
    }
}
