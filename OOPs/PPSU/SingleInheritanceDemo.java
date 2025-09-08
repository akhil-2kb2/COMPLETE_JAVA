
package PPSU;

class PpsuDepartment {
    String deptName = "General Department of PPSU";
    void showDept() {
        System.out.println("Department: " + deptName);
    }
}

class PpsuCseDepartment extends PpsuDepartment {
    void showCourse() {
        System.out.println("Course: B.Tech Computer Science");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        PpsuCseDepartment cse = new PpsuCseDepartment();
        cse.showDept();    // from parent
        cse.showCourse();  // from child
    }
}



