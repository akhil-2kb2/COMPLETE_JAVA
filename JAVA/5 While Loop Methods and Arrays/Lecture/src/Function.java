public class Function {
    public static void main(String[] args) {
        //System.out.println("In Main Method...");
        //greetUser();
        //System.out.println("Method Calling Complete");

        firstPattern();
    }

    public static void greetUser(){
        System.out.println("Welcome to the Function Learning Zone");
    }
    public static void firstPattern(){
        int rows = 0;
        while (rows < 5){
            System.out.print("*");
            int cols = 0;
            while (cols < rows){
                System.out.print("   *");
                cols++;
            }
            rows++;
            System.out.println();
        }
    }
}