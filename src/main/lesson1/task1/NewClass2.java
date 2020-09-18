package main.lesson1.task1;

public class NewClass2 {
    int radius = 2;

    public static void main(String[] args) {
        NewClass2 inst = new NewClass2();
        System.out.println(inst.getSquare());
    }

    double getSquare() {
        return 3.14 * radius * radius;
    }

}