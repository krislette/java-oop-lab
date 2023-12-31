package inheritance;

public class Kid extends Toddler {

    int intGradeLevel;
    
    Kid(String strFirstName, String strSex, int intAge, String strFavoriteGame, int intGradeLevel) {
        super(strFirstName, strSex, intAge, strFavoriteGame);
        this.intGradeLevel = intGradeLevel;
    }

    void checkStatus() {
        super.checkStatus();
        System.out.println("Grade Level: " + intGradeLevel);
    }

}

// This is another SUBCLASS. We use `extends` keyword in order to INHERIT from the TODDLER subclass.