package Lecture_9_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        StringBuilder sB = new StringBuilder();

        @Override
        public void run() {
            try {
                sB.append(reader.readLine()).append(" ");
                sB.append(reader.readLine()).append(" ");
                sB.append(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void printResult() {
            System.out.println(sB);
        }
    }
}