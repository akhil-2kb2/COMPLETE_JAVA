public class CollegeStudent extends Student {

    public CollegeStudent(int roll, String name, double per) {
        super(roll, name, per); // call parent constructor
    }

    @Override   // overriding the abstract method
    // Implementing the abstract method showStudent
    public void showStudent() {
        System.out.println("College Student Details:");
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + per);
    }
}
