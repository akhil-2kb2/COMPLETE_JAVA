public class UseAddition {
    public static void main(String[] args) {
        Addition addition = new Addition();
        System.out.println("Addition of 5 and 10: " + addition.add(5, 10));
        System.out.println("Addition of 5, 10 and 15: " + addition.add(5, 10, 15));
        System.out.println("Addition of 5, 10, 15 and 20: " + addition.add(5, 10, 15, 20));

        addition.show(25, "AKHIL");
        addition.show("AKHIL", 25);
    }
}
