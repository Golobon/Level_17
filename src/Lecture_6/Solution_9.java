package Lecture_6;

public class Solution_9 {
    public static Cat cat;
    static {
        cat = new Cat();
        cat.name = "Bob";
        System.out.println(cat.name);
    }
    public static void main(String[] args) {

    }

    public static class Cat{
        public String name;

    }
}
