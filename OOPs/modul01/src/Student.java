public abstract class Student {
    protected int roll;
    protected String name;
    protected double per;

    public Student(int roll, String name, double per) {
        if (roll < 0) {
            System.out.println("Invalid roll number");
            return;
        }
        this.roll = roll;
        this.name = name;
        this.per = per;
    }

    // Abstract method = no body here
    public abstract void showStudent();
}
