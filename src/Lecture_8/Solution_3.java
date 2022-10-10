package Lecture_8;

public class Solution_3 {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread tT = new TestThread();
        tT.start();
        tT.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
    }
}
