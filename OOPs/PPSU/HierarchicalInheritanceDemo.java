package PPSU;

class PpsuBaseDeptHier {
    void showDept(String dept) {
        System.out.println("Department: " + dept + " at PPSU");
    }
}

class PpsuCseStudent extends PpsuBaseDeptHier {
    void project() {
        System.out.println("CSE Student doing Java Project");
    }
}

class PpsuEceStudent extends PpsuBaseDeptHier {
    void labWork() {
        System.out.println("ECE Student doing Electronics Lab Work");
    }
}

class PpsuItStudent extends PpsuBaseDeptHier {
    void workshop() {
        System.out.println("IT Student attending Web Development Workshop");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        PpsuCseStudent cse = new PpsuCseStudent();
        cse.showDept("Computer Science");
        cse.project();

        System.out.println("----");

        PpsuEceStudent ece = new PpsuEceStudent();
        ece.showDept("Electronics");
        ece.labWork();

        System.out.println("----");

        PpsuItStudent it = new PpsuItStudent();
        it.showDept("Information Technology");
        it.workshop();
    }
}

