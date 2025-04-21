
public class ArgPassDemo {
    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println("Before increment: x = " + x + ", y = " + y); // x and y are unchanged
        increment(x, y); // Actual Arguments (a and b) /Arguments are the values passed to the method when it is called./
        System.out.println("After increment: x = " + x + ", y = " + y); // x and y are unchanged, why? //
        // Because Java is pass-by-value, the values of x and y are passed to the method increment, not the variables themselves.
    }
    public static void increment(int a, int b){   // Formal Arguments (a and b) /Parameters are the variables defined in the method signature./
        a+=5;
        b+=5;
        System.out.println("Inside increment: a = " + a + ", b = " + b);
    }
}
