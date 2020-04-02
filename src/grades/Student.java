package grades;

import java.util.ArrayList;

public class Student {

    private String studentName;
    private String userName;
    private ArrayList<Integer> grades;

    public Student(String name, String userName){
        this.studentName = name;
        this.userName = userName;
        grades = new ArrayList<>();

    }


    public String getName(){
        return this.studentName;
    }

    public String getUserName(){
        return this.userName;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;

        if(!grades.isEmpty()){
            for (int i = 0; i < grades.size(); i++){
                total += grades.get(i);
            }
            total /= grades.size();
        }

        return total;
    }

    public static void main(String[] args) {
        Student ea = new Student("Ea", "Ea777");
        Student enlil = new Student("Enlil", "Enlil33");
        Student anu = new Student("Anu", "Anu369");

        System.out.println(ea.getName());
        ea.addGrade(97);
        ea.addGrade(98);
        ea.addGrade(99);
        System.out.println("Ea's average is " + ea.getGradeAverage());
        System.out.println();

        System.out.println(enlil.getName());
        enlil.addGrade(87);
        enlil.addGrade(88);
        enlil.addGrade(89);
        System.out.println("Enlil's average is " + enlil.getGradeAverage());
        System.out.println();

        System.out.println(anu.getName());
        anu.addGrade(77);
        anu.addGrade(78);
        anu.addGrade(79);
        System.out.println("Anu's average is " + anu.getGradeAverage());
        System.out.println();

        System.out.println("Collective average of these three is " + (ea.getGradeAverage() + enlil.getGradeAverage() + anu.getGradeAverage()) /3);
    }
}
