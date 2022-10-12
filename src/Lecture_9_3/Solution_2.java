package Lecture_9_3;

import java.io.IOException;

public class Solution_2 {
    static int count = 5;

    public static void main(String[] args) {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            Thread t = Thread.currentThread();//присвой переменной t текущую нить
            String name = t.getName();
            System.out.println("Name =" + name);
            //add sleep here - добавь sleep тут
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }
}
