package PPSU;

/*public class ArrayExample {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 92};  // array initialization

        System.out.println("Marks of Students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i+1) + ": " + marks[i]);
        }

        // Calculate Average
        int sum = 0;
        for (int m : marks) {   // for-each loop
            sum += m;
        }
        double avg = (double) sum / marks.length;
        System.out.println("Average Marks = " + avg);
    }
}*/ //                    ARRAYS
//         // ==========================================================



public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize array
        int[] marks = {85, 90, 78, 88, 92};

        // Print all marks
        System.out.println("Marks of Students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        // Find average
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        double avg = (double) sum / marks.length;

        System.out.println("Average Marks = " + avg);
    }
}





/*
int[] numbers = new int[5];            // declaration + memory allocation
int[] marks = {85, 90, 78, 88, 92};    // declaration + initialization


System.out.println(marks[0]); // first element → 85
System.out.println(marks[4]); // fifth element → 92


String s1 = "PPSU";                      // literal
String s2 = new String("University");    // using new keyword
*/