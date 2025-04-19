public class Addition {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public String add(String a, String b) {
        return a + b;
    }
    // Now Order of the parameter deff
    public void show(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
    public void show(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
