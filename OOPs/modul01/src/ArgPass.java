class MyMath{
    public void add(int a, int b) { // Formal Arguments (a and b) /Parameters are the variables defined in the method signature./
        int c= a + b;
        System.out.println("Sum of " + a + " and " + b + " is: " + c);
    }
}

public class ArgPass {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        int a = 10, b = 5;
        myMath.add(a, b);// Actual Arguments (a and b) /Arguments are the values passed to the method when it is called./
    }
}
