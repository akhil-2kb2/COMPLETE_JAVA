public class IfElse {
    public static void main(String[] args) {
        boolean isMale = true;
        String name = "Bod";
        System.out.println("Before if");
        if(isMale){
            System.out.println("Mr." + name);
        }
        else {
            System.out.println("Ms." + name);
        }
        System.out.println("After if");


        boolean isSeniorCitizen = false;
        boolean isAnAdult = false;
        if(isSeniorCitizen){
            System.out.println("Hello Senior Citizen");
        }
        else if (isAnAdult){
                System.out.println("Hello Adult");
            }
        else {
                System.out.println("Hello Child");
            }

        }
}
