package Lecture_6;

public class Solution_15 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new SpecialThread());
        thread.start();

        System.out.println("*****************");


        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println("main: " + element);

        }
    }

    public static class SpecialThread implements Runnable {

        @Override
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println();
                System.out.println("run: " + element);
            }
        }
    }
}
