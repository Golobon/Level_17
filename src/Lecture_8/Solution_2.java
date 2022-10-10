package Lecture_8;

public class Solution_2 {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
        //add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                while (true) {
                    Thread.sleep(1000);
                    System.out.print(numSeconds-- + " ");
                    if (numSeconds == 0) {
                        System.out.print("Марш!");
                    }
                }
            } catch (InterruptedException e) {
                if (numSeconds == 1) {System.out.print("1 Прервано!");}
            }
        }
    }
}
