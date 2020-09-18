package main.lesson1.task1;

public class NewClass3 {
    public static void main(String[] args) {
        double radius = 100;
        metod(radius);
    }

    public static void metod(Double aDouble) {
        double pi = 3.14;
        double area = aDouble * aDouble * pi;
        System.out.println("Result:" + " " + area);
    }

}
