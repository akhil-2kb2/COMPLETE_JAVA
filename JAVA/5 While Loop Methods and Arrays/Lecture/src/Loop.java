import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
//        int myNum = 1;// Initialisation
//        while(myNum <= 10){
//            System.out.println(myNum);
//            myNum++;
//        }
//        int count = 500;
//        while(count >= 200){
//            System.out.println(count);
//            count--;
//        }
        int i = 0;
        while (i < 5){
            int inp = input.nextInt();
            System.out.println("Number is: " + inp);
            i++;
        }
    }
}
