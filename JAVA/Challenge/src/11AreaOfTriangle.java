import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Zone of Area Calculator of Triangle...");
        System.out.println("Now you Have to Enter BASE and Height of Triangle for [(1/2)*B*H]");
        System.out.print("Enter BASE of Triangle: ");
        float B = input.nextFloat();
        System.out.print("Now Enter Height of Triangle: ");
        float H = input.nextFloat();
        float Result = 0.5f*B*H;
        System.out.println("The Area of Your Triangle is: " + Result +" Unit^2"+ "\n .....Happy Coding😀.....\n and .....Enjoy Learning.....");

        input.close();
    }
}
