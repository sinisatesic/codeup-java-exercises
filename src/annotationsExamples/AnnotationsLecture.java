package annotationsExamples;

import java.util.ArrayList;
import java.util.List;

public class AnnotationsLecture {
    public static int someNum = 3;

    public static void main(String[] args) {

        Child child1 = new Child();


        //TODO TOGETHER: Call deprecated method & no comment
        child1.imAMethod(); //calling a deprecated method and Java knows it is so
        //in child class, there is comment with "link" to proper method, you can then hover over deprecated method and select to swap that one with proper/suggested method

        //TODO TOGETHER: Call deprecated method with comment
        child1.sayHello();

        //TODO TOGETHER:Call sayHello without @Override

        //TODO TOGETHER: Comment out annotation and change Parent sayHello no sayHelloParent

    }

    //TODO Together: explore analyze > inspect code
    //TODO Together: Use @SuppressWarnings
    @SuppressWarnings("deprecation rawtypes unused") //you can use "all" here to suppress all warnings
    public static void doRiskyThings(){
        Child riskyChild = new Child();
        riskyChild.oldMethod(); //static access & deprecation

        int a = (int) 2;
        List l = new ArrayList(); // raw use warning
        l.add("test"); // unchecked warning
        int three = 3; // unused warning

        System.out.println(l);
        AnnotationsLecture al = new AnnotationsLecture();
        System.out.println(al.someNum); // static-access warning

        String someName = "Fred"; // unused


        // Notice these warnings are still present!
        if (true) {
            ;
        }

        Boolean test = true; //
        if (test) {
            System.out.println("TRUE!");
        }
    }

}
