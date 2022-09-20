package Lecture_6;

import java.util.Arrays;

public class Solution_4 {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
        }
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Arrays.stream(array).min().getAsInt()){
                res = i;
            }
        }
        return new Pair<Integer, Integer>(Arrays.stream(array).min().getAsInt(), res);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
