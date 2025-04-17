public class StudentDemo {
    public static void main(String[] args) {
        Student1 s = new CollegeStudent1(101, "AKHIL", 85.5);
        s.showStudent();

        System.out.println("x===x===x===x===x===x===x===x===x");

        Student1 p = new CollegeStudent1(102, "RAM", 90.5);
        p.showStudent();
    }
}

// Abstract class
abstract class Student1 {
    protected int roll;
    protected String name;
    protected double per;

    public Student1(int roll, String name, double per) {
        if (roll < 0) {
            System.out.println("Invalid roll number");
            return;
        }
        this.roll = roll;
        this.name = name;
        this.per = per;
    }

    // Abstract method
    public abstract void showStudent();
}

// Subclass
class CollegeStudent1 extends Student1 {
    public CollegeStudent1(int roll, String name, double per) {
        super(roll, name, per);
    }

    @Override
    public void showStudent() {
        System.out.println("College Student Details:");
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + per);
    }
}
