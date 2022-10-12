package Lecture_9_4;

public class Solution_2 {
    static volatile int count = 15;
    static int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            this.start();

        }
        public String toString() {
            return "" + this.getName() + " created";
        }

        @Override
        public void run() {
            if (Integer.parseInt(getName()) < count) {
                GenerateThread gT = new GenerateThread();
                System.out.println(gT);
            } this.interrupt();
        }
    }
}
