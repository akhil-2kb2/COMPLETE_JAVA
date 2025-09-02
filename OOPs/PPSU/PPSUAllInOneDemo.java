package PPSU;
// Covers: variables/data types/operators, access specifiers,
// constructors (overloading), methods (overloading & overriding)
// It Includes Experiment 3, 4, 5
//
//
//
class Student {
    // ----- Access Specifiers -----
    public String name;     // public: accessible everywhere
    private int age;        // private: only inside Student
    protected String dept;  // protected: same package or subclasses
    int rollNo;             // default (package-private): same package

    // ----- Constructors (Overloading) -----
    public Student() {                // default constructor
        name = "Unknown";
        age = 0;
        dept = "NA";
        rollNo = -1;
    }

    public Student(String n, int a) { // parameterized (overloaded)
        name = n;
        age = a;
        dept = "NA";
        rollNo = -1;
    }

    public Student(String n, int a, String d, int r) { // another overload
        name = n;
        age  = a;
        dept = d;
        rollNo = r;
    }

    // ----- Methods -----
    // setter/getter for private field 'age'
    public void setAge(int a) {
        if (a > 0) age = a;
    }
    public int getAge() {
        return age;
    }

    // Method to display info
    public void showInfo() {
        System.out.println("Student{name='" + name + "', age=" + age +
                ", dept='" + dept + "', rollNo=" + rollNo + "}");
    }

    // ----- Method Overloading -----
    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
    public void sayHello(String toWhom) {
        System.out.println("Hello " + toWhom + ", my name is " + name);
    }
}

// Subclass to demonstrate METHOD OVERRIDING
class PpsuStudent extends Student {

    public PpsuStudent(String n, int a, String d, int r) {
        super(n, a, d, r); // call parent constructor
    }

    // ----- Method Overriding -----
    @Override
    public void sayHello() {
        // Add department info in the greeting (override parent’s version)
        System.out.println("Hello, I am " + name + " from " + dept + " department.");
    }

    @Override
    public void showInfo() {
        // Slightly different display format (override)
        System.out.println("[PPSU] " + name + " | Age: " + getAge()
                + " | Dept: " + dept + " | Roll: " + rollNo);
    }
}

public class PPSUAllInOneDemo {
    public static void main(String[] args) {

        // ==========================================================
        // 1) Variables, Data Types, Operators (very simple)
        // ==========================================================
        int x = 15, y = 4;
        double pi = 3.14;
        boolean bigger = true;
        String note = "Welcome to PPSU!";

        System.out.println("x + y = " + (x + y));     // 19
        System.out.println("x / y = " + (x / y));     // 3 (integer division)
        System.out.println("x % y = " + (x % y));     // 3 (remainder)
        System.out.println("pi * y = " + (pi * y));   // 12.56
        System.out.println("Is x > y? " + bigger);    // true
        System.out.println("Note: " + note);
        System.out.println("----------------------------------------");

        // ==========================================================
        // 2) Access Specifiers + Constructors (Overloading)
        // ==========================================================
        Student s1 = new Student( ); // default constructor
        s1.name = "Shubhanshu";     // public OK
        s1.dept = "CSE";            // protected OK (same package)
        s1.rollNo = 101;            // default/package-private OK (same package)
        // s1.age = 25;             // NOT allowed (private)
        s1.setAge(25);              // use setter
        s1.showInfo();

        Student s2 = new Student("Akhilesh", 22); // overloaded constructor
        s2.dept = "IT";
        s2.rollNo = 102;
        s2.showInfo();

        Student s3 = new Student("Lalo", 21, "ECE", 103); // another overload
        s3.showInfo();

        System.out.println("----------------------------------------");

        // ==========================================================
        // 3) Method Overloading
        // ==========================================================
        s2.sayHello();             // no-arg
        s2.sayHello("Faculty");    // with-arg (overloaded)
        System.out.println("----------------------------------------");

        // ==========================================================
        // 4) Method Overriding (via subclass)
        // ==========================================================
        PpsuStudent ps = new PpsuStudent("Akhilesh", 22, "CSE", 201);
        ps.sayHello();  // overridden version (includes dept)
        ps.showInfo();  // overridden display
    }
}
