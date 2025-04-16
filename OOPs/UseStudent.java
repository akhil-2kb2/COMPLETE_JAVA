public class UseStudent {
    public static void main(String[] args) {
        Student s = new CollegeStudent(101, "AKHIL", 85.5); // creating object of CollegeStudent class
        s.showStudent(); // calling the method of CollegeStudent class

        System.out.println("x===x===x===x===x===x");

        Student p = new CollegeStudent(102, "RAM", 90.5); // creating object of CollegeStudent class
        p.showStudent(); // calling the method of CollegeStudent class
    }
}
