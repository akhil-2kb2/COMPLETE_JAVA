package PPSU;

class Person {
    void introduce() {
        System.out.println("Introduction: I am a person.");
    }
}

class PPSU_Faculty extends Person {
    @Override
    void introduce() {
        System.out.println("Specific Role: I am a faculty member at PPSU.");
    }

    void giveFullIntroduction() {
        // Calls the parent class's introduce() method first
        super.introduce();
        // Then calls the current class's introduce() method
        this.introduce();
    }
}

public class TestSuperMethodPPSU {
    public static void main(String[] args) {
        PPSU_Faculty faculty = new PPSU_Faculty();
        faculty.giveFullIntroduction();
    }
}


