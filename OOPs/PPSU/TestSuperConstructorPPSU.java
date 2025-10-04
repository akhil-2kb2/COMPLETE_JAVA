package PPSU;

class Person01 {
    String name;
    Person01(String name) {
        this.name = name;
        System.out.println("Person constructor called for: " + this.name);
    }
}

class PPSU_Student01 extends Person01 {
    String enrollmentId;
    PPSU_Student01(String name, String enrollmentId) {
        super(name);
        this.enrollmentId = enrollmentId;
        System.out.println("PPSU_Student constructor called with ID: " + this.enrollmentId);
    }

    public void displayInfo() {
    }
}

public class TestSuperConstructorPPSU {
    public static void main(String[] args) {
        PPSU_Student01 student = new PPSU_Student01("Rohan", "21SOEIT13001");
    }
}
