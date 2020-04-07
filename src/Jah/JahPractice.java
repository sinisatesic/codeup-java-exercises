package Jah;

import java.util.Scanner;

public class JahPractice {
    public static void main(String[] args) {
        //• Use a main() method to test your class methods, to ensure they work!
        NewClass object = new NewClass( "Peteyz", 5, 3.2);
        System.out.println("Da name be: " + object.name + " and grade: " + object.grade + " and gpa: " + object.gpa);
        //INSTANCE METHODS ABOVE (they're in instance/object occurrence)



        //printing out getters below:
        System.out.println();
        System.out.println(object.getName());
        System.out.println(object.getGpa());
        System.out.println(object.getGrade() + "\n\n");




        NewClass.printObject(object);
        //STATIC METHOD CALLED ABOVE (doesn't instantiate an object for method)
        //will first print values declared on NewClass first, then values get changed below
        System.out.println();



        ///
        NewClass.myAge = 28;
        System.out.println(NewClass.myAge); //prints above 28
        NewClass.randomDouble = 3.69;
        System.out.println(NewClass.randomDouble);
        NewClass.myNickname = "Sini or Siki";
        System.out.println(NewClass.myNickname);
        //STATIC VARIABLES DECLARED ABOVE (again, doesn't require instantiating)




        // Tell the difference between a void method (no return), and a method with a defined type (returns the defined type)
        //Void doesn't return anything; it's opposite has return-value (return keyword)
        //can't be void if returning value; needs to be value type in place of void(int, double, etc)
        //if return-value, it will send back value back to where it was called
    }

}
