class Emp {
   private int age;
   private String name;
   private static String company  = "AMAZON";
    public Emp(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void display(){
        System.out.println("Age: "+age +", Name: "+name + ", Company: "+company);
    }
}
public class StaticMemberDemo {
    public static void main(String[] args) {
        Emp emp = new Emp(25, "AKHIL");
        Emp emp1 = new Emp(23, "AYUSHI");
        Emp emp2 = new Emp(21, "AYUSHWA");
        emp.display();
        emp1.display();
        emp2.display();
    }
}
