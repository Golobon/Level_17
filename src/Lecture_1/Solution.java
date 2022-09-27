package Lecture_1;

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getName());

        Tiger tiger = new Tiger();
        System.out.println(tiger.getName());
        tiger.getBoo();

        Cat catTiger = new Tiger();
        System.out.println(catTiger.getName());
    }
}