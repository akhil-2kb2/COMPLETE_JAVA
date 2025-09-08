package PPSU;

class PpsuUniversity {
    void showUni() {
        System.out.println("Welcome to P P Savani University (PPSU)");
    }
}

class PpsuSchool extends PpsuUniversity {
    void showSchool() {
        System.out.println("School of Engineering at PPSU");
    }
}

class PpsuCseDept extends PpsuSchool {
    void showDept() {
        System.out.println("Department: Computer Science and Engineering");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        PpsuCseDept cse = new PpsuCseDept();
        cse.showUni();     // from grandparent
        cse.showSchool();  // from parent
        cse.showDept();    // from child
    }
}



