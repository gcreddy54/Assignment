package Assignment.module2;
public class Methodoverloading {
    static int add(int a, int b) {
        return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("Sum of integers: " + add(5, 10));
        System.out.println("Sum of doubles: " + add(5.5, 2.5));
    }
}