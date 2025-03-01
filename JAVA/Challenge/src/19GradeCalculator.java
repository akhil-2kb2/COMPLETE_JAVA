import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Grade Calculator Zone");
        System.out.print("Enter Your Percentage: ");
        double percentage = input.nextDouble();
        char grade;
        if (percentage > 90) {
            grade = 'A';
        } else if (percentage > 75) {
            grade = 'B';
        } else if (percentage > 60) {
            grade = 'C';
        } else if (percentage > 30) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your Grade Is: " + grade);
        System.out.println(".....Happy 😀 Coding.....\n......Enjoy Learning......");

        input.close();
    }
}

