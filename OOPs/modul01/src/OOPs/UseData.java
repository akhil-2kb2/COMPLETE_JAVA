package OOPs;

class Data{
    static{
        System.out.println("Static block of Data class called........");
    }
    public Data(){
        System.out.println("Constructor of Data class called........");
    }
    public static void display(){
        System.out.println("Display method of Data class called........");
    }
// This static method can be called without creating an instance of the class
    // It is useful for utility methods that do not require an instance of the class
}
public class UseData { // This class demonstrates the use of the Data class
     // It contains a main method that creates instances of the Data class and calls its methods
    public static void main(String[] args) {
        Data.display();
        Data data = new Data();
        Data data1 = new Data();
        Data data2 = new Data();
        Data data3 = new Data();
        Data data4 = new Data();
        Data data5 = new Data();
        Data data6 = new Data();
    }
}
// In this code, we have a static block in the Data class that prints a message when the class is loaded.