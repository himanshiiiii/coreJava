class Overloading {
    public void add(int a, int b) {
        System.out.println(a+b);
    }

    public void add(double a, double b) {
        System.out.println(a+b);
    }

    public void multiply(float a, float b) {
        System.out.println(a*b);
    }

    public void multiply(int a, int b) {
        System.out.println(a*b);
    }

    public void conString(String a, String b) {
        System.out.println(a+b);
    }

    public void conString(String a, String b, String c) {
        System.out.println(a+b+c);

    }

}
public class OverloadingTest {
    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.add(2, 3);
        o.add(2.0, 3.5);
        o.multiply(5, 10);
        o.multiply(0.5f,1.2f);
        o.conString("hello", "world");
        o.conString("hey", "what's", "happen");

    }
}
