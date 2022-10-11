package Lecture_9_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static Thread t1 = new Thread() {
        public void run() {
            while (true) {
            }
        }
    };


    static Thread t2 = new Thread() {
        public void run() {
            try {
                while (true) {
                    throw new InterruptedException();
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    };
    static Thread t3 = new Thread(new Bob2());

    static Bob bob = new Bob();
        static Thread t5 = new Thread() {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));

        public void run() {
            ArrayList<Integer> list = new ArrayList<>();
            while (true) {
                try {
                    String value = bR.readLine();
                    if (value.equals("N")) {
                        t5.interrupt();
                        break;
                    }

                    list.add(Integer.parseInt(value));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                } finally {
                    if (interrupted()) {
                        int result = 0;
                        for (int x : list) {
                            result += x;
                        }
                        System.out.println(result);
                    }
                }
            }
        }
    };

    static {
        threads.add(t1);

        threads.add(t2);

        threads.add(t3);

        threads.add(bob);

        threads.add(t5);
    }

    public static void main(String[] args) {
    }

    public static class Bob extends Thread implements Message {

        @Override
        public void run() {
            while (!this.isInterrupted());
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class Bob2 extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(500);
                    System.out.println("Ура");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}