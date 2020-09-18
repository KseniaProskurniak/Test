package main.lesson1.task1;

public class NewClass {
    int radius = 0;

    public static void main(String[] args) {
        NewClass instance;
        instance = new NewClass();
        System.out.println(instance.getSquare());
    }

    double getSquare() {
        return 3.14 * radius * radius;
    }
}
