import java.util.Scanner;

class CtoF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("...Welcome to Conversion Of C to F...");
        // Taking user input
        System.out.print("Enter Temperature in Celsius: ");
        double celsius = input.nextDouble();
        // Converting Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        // Display result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit +"F"+ "\n ...Happy Coding😀...");

        input.close(); // Closing scanner to prevent memory leak
    }
}
