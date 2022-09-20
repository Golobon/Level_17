package Lecture_6;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.sayHello();
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayGoodBuy() {
        System.out.println("sayGoodBuy!");
    }


    public interface CanFly {
        public void sayHello();

        public void sayGoodBuy();
    }
}
