package Lecture_9_11;

import java.io.*;

/*
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //напишите тут ваш код
    static {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = bR.readLine();
            secondFileName = bR.readLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws IOException, InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        public String fullFileName;

        public String sB;
        @Override
        public void setFileName(String fullFileName) {
            this.fullFileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return sB.toString().substring(0, sB.length() - 1);
        }

        @Override
        public void start() {
            run();
        }

        @Override
        public void run() {
            sB = "";
            try {
                BufferedReader bR2 = new BufferedReader(new FileReader(fullFileName));
                while (bR2.ready()) {
                    String x = bR2.readLine();
                    sB += x + " ";
                } Thread.currentThread().interrupt();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent() throws IOException;

        void join() throws InterruptedException;

        void start();
    }

    //напишите тут ваш код
}
