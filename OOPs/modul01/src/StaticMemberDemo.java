class Emp {
   private int age;
   private String name;
   private static String company  = "AMAZON";
    public Emp(int age, String name){ // constructor
        this.age = age;
        this.name = name;
    }
    //display method
    public void display(){
        System.out.println("Age: "+age +", Name: "+name + ", Company: "+company);
    }
    public static void showCompany(){
        System.out.println("Company: "+company);
    }
    //why to declare static method?
    // static method can be called without creating an object of the class
    // static method can access static data members,
    // static method can be called from static context,
    // static method can be called from non-static context,
    // static method can be called from instance method,
    // static method can be called from constructor
    // static method can be called from static block,
    // static method can be called from instance block
    // static method can be called from main method

}
public class StaticMemberDemo {
    public static void main(String[] args) {
        // static method can be called without creating an object of the class
        Emp.showCompany(); // Company: AMAZON

        Emp emp = new Emp(25, "AKHIL");
        Emp emp1 = new Emp(23, "SALAMANCA");
        Emp emp2 = new Emp(21, "WALTAR");

        emp.display();
        emp1.display();
        emp2.display();
    }
}
