package  PPSU;

class UniversityMember {
    String universityName = "A Generic University System";
}

class PPSU_Student extends UniversityMember {
    // This variable hides the parent's universityName
    String universityName = "P. P. Savani University";

    void displayInfo() {
        // Prints the universityName of the PPSU_Student class
        System.out.println("Student is enrolled in: " + universityName);

        // Prints the universityName of the parent UniversityMember class using 'super'
        System.out.println("Part of a larger system: " + super.universityName);
    }
}

public class TestSuperVariablePPSU {
    public static void main(String[] args) {
        PPSU_Student student = new PPSU_Student();
        student.displayInfo();
    }
}


