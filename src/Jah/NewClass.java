package Jah;



//• Create a new class in IntelliJ
public class NewClass {
    //• Create instance properties in your class
    String name;
    int grade;
    double gpa;

    //STATIC: attached to class rather than instance of class/object




    //• Create a constructor for your class
    NewClass(String constructorName, int constructorGrade, double constructorGpa){
        this.name = constructorName;
        this.grade = constructorGrade;
        this.gpa = constructorGpa;
    }



    //• Create static properties in your class
    //STATIC VARIABLES//
    static int myAge = 27;
    static double randomDouble = 7.77;
    static String myNickname = "BDD";




    //STATIC METHOD/// (Note: can't use non-static vars in static method)
    public static void printObject(NewClass object){
        System.out.println(object.getName());

        System.out.println(myNickname);
        System.out.println(randomDouble);
        System.out.println(myAge);
    }





    //• Create Getters and Setters for your properties
    //getters and setters ///
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    //////////

}
