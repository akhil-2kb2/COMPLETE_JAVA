import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("...Welcome to the Calculator of Perimeter of Rectangle...");
        System.out.println("Now Enter All Four perimeter at Once Followed by Space: ");
        float A = input.nextFloat();
        float B = input.nextFloat();
        float C = input.nextFloat();
        float D = input.nextFloat();
        System.out.println("Now Your Perimeter of Rectangle is: " + (A+B+C+D) + " Units" + "\n ...Happy Coding 😀...\n and Enjoy Learning......");
    }
}
