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

}
public class UseData {
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