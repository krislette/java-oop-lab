package fundamentals;

public class Person {
    
    // Declaring the global variables.
    public String strFirstName;
    public String strLastName;
    public char chrSex;
    public int intAge;

    Person(String strFirstName, String strLastName, char chrSex, int intAge) {
        // Constructor is a METHOD and it should be named after the CLASS NAME.
        // For example, class Person, Person()
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.chrSex = chrSex;
        this.intAge = intAge;
    }

}