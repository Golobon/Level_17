package Lecture_6;

public class Solution_10 {
    private String name;
    private int age;
    private int weight;

    public Solution_10(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Solution_10() {
    }

    public void sayMeow() {
        System.out.println("Мяу!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // проверка входящего параметра
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // проверка входящего параметра
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        // проверка входящего параметра
        this.weight = weight;
    }
}
