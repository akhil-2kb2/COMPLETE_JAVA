package PPSU02;

// Interface 1
interface UniversityRules {
    void attendClasses();
    void followDiscipline();
}

// Interface 2
interface ExamRules {
    void giveExams();
}

// Class implementing multiple interfaces
class PpsuStudent implements UniversityRules, ExamRules {
    String name;
    String dept;

    PpsuStudent(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    // Implement methods from UniversityRules
    public void attendClasses() {
        System.out.println(name + " from " + dept + " attends all classes.");
    }

    public void followDiscipline() {
        System.out.println(name + " follows all PPSU rules and regulations.");
    }

    // Implement methods from ExamRules
    public void giveExams() {
        System.out.println(name + " appears in semester exams at PPSU.");
    }

    // Extra method
    public void showInfo() {
        System.out.println("Student: " + name + " | Department: " + dept);
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        PpsuStudent s1 = new PpsuStudent("Akhilesh", "CSE");

        s1.showInfo();
        s1.attendClasses();
        s1.followDiscipline();
        s1.giveExams();
    }
}



































