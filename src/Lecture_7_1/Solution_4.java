package Lecture_7_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Обратный отсчет
*/

public class Solution_4 {
    public static volatile List<String> list = new ArrayList<String>(5);

    static {
        for (int i = 0; i < 5; i++) {
            list.add("Строка " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Countdown(3), "Countdown");
        t.start();
    }

    public static class Countdown implements Runnable {
        private int countFrom;

        public Countdown(int countFrom) {
            this.countFrom = countFrom;
        }

        public void run() {
            try {
                while (countFrom > 0) {
                    printCountdown();
                }
            } catch (InterruptedException e) {
            }
        }

        public void printCountdown() throws InterruptedException {
            Thread.sleep(500);
            System.out.println(list.get(countFrom - 1));
            countFrom = countFrom - 1;
        }
    }
}
