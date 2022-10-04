package Lecture_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Закрепляем паттерн Singleton
*/

public class Solution implements Planet {

    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        try {
            String value = bR.readLine();
            switch (value) {
                case SUN:
                    thePlanet = Sun.getInstance();
                    break;
                case MOON:
                    thePlanet = Moon.getInstance();
                    break;
                case EARTH:
                    thePlanet = Earth.getInstance();
                    break;
                default:
                    thePlanet = null; break;
            }
        } finally {
            bR.close();
        }
    }
}
