
package PPSU;

// Parent class
class PpsuDepartment01 {
    String deptName = "General Department of PPSU";

    PpsuDepartment01() {
        System.out.println("Parent Constructor: PPSU Department Created");
    }

    void showDept() {
        System.out.println("Department: " + deptName);
    }
}

// Child class
class PpsuCseDepartment01 extends PpsuDepartment01 {
    String deptName = "Computer Science Department";

    PpsuCseDepartment01() {
        super(); // calls parent constructor
        System.out.println("Child Constructor: CSE Department Created");
    }

    void showDept() {
        System.out.println("Department: " + deptName);
        System.out.println("Accessing parent dept using super: " + super.deptName);
    }

    void displayBoth() {
        super.showDept(); // calls parent method
        this.showDept();  // calls child method
    }
}

// Main class
public class SuperKeywordDemo {
    public static void main(String[] args) {
        PpsuCseDepartment01 cse = new PpsuCseDepartment01();

        System.out.println("---- Calling Overridden Method ----");
        cse.showDept();

        System.out.println("---- Calling Parent and Child Methods ----");
        cse.displayBoth();
    }
}



