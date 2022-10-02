package Lecture_6;

import java.util.HashMap;
import java.util.Map;

public class Solution_5 {
    public static Map<Double, String> labels = new HashMap<Double, String>();
        static {labels.put(0.1, "i");
        labels.put(0.2, "i");
        labels.put(0.3, "i");
        labels.put(0.4, "i");
        labels.put(0.5, "i");}
    public static void main(String[] args) {

        System.out.println(labels);
    }
}
