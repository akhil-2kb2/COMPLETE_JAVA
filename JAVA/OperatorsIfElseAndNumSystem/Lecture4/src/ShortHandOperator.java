import java.util.Scanner;

public class ShortHandOperator {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        //a = a + x1;  {it goes for all type operator}
        a += x1;
        System.out.println(a);
        int x2 = input.nextInt();
        //a = a + x2;
        a += x2;
        System.out.println(a);
        int x3 = input.nextInt();
        //a = a + x3;
        a += x3;
        System.out.println(a);
        int x4 = input.nextInt();
        //a = a + x4;
        a += x4;
        System.out.println(a);

    }
}
