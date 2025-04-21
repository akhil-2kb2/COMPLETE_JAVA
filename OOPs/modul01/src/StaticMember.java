
class Demo {
    int x = 10; // it takes memory when we create an object of the class
    static int y = 20;  // it will have created and takes memory even if we don't create an object of the class why?
    /**
     * static variable is created when the class is loaded,
     * and it is destroyed when the class is unloaded why ?
     * because static variable is shared by all the objects of the class, but why it destroyed?
     * because a static variable is created in the method area of the memory, and it is destroyed when the class is unloaded,
     * why static variable is shared by all the objects of the class?
     * because a static variable is created in the method area of the memory, and it is shared by all the objects of the class,
     * static method is created when the class is loaded.
     */
    static void display() {
        System.out.println("Static method called");

    }
}




class Counter {
    static int count = 0; // static variable

    Counter() {
        count++;
        System.out.println("Count: " + count);
    }
}


public class StaticMember {
    public static void main(String[] args) {
//        Demo d1 = new Demo();
//        Demo d2 = new Demo();
//        System.out.println(d1.x); // 10
//        System.out.println(d2.x); // 10
//        System.out.println(Demo.y); // 20
//        System.out.println(Demo.y); // Demo.y = 20
//        Demo.display(); // Static method called
//        Demo.display(); // Static method called


        Counter c1 = new Counter(); // Count: 1
        Counter c2 = new Counter(); // Count: 2
        Counter c3 = new Counter(); // Count: 3




    }
}
