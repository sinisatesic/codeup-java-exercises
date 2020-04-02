package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

//        Student enki = new Student("Enki");
//        enki.addGrade(77);
//        enki.addGrade(77);
//        enki.addGrade(77);
//        students.put("Enlil", "Enlil1");
//        students.put("Ea", "Ea1");
//        students.put("Anu", "Anu1");

        Student enlil = new Student("Enlil", "Enlil33");
        enlil.addGrade(30);
        enlil.addGrade(60);
        enlil.addGrade(90);

        Student ea = new Student("Ea", "Ea777");
        ea.addGrade(33);
        ea.addGrade(33);
        ea.addGrade(33);

        Student anu = new Student("Anu", "Anu369");
        anu.addGrade(77);
        anu.addGrade(77);
        anu.addGrade(77);

//        students.put("Enki", enki);
        students.put("Enlil", enlil);
        students.put("Ea", ea);
        students.put("Anu", anu);

        System.out.println("Students are listed below -");


        for(String student : students.keySet()){
            System.out.printf(" %s \n", student);
        }

        boolean loop;
        Scanner userInput = new Scanner(System.in);

        do {
            System.out.println("Which do you seek?");
            String studentSelection = userInput.nextLine();
            studentSelection.trim();

            if(students.containsKey(studentSelection)){
                System.out.printf("%nStudent: %s || Github username: %s%n ||\t Average: %.2f%n%n", students.get(studentSelection).getName(), students.get(studentSelection).getUserName(), students.get(studentSelection).getGradeAverage());
            } else {
                System.out.println("Student not found");
            }

            System.out.println("Seek another student? [y/n]");
            studentSelection = userInput.nextLine();
            studentSelection = studentSelection.trim();

            if(studentSelection.equalsIgnoreCase("y")){
                loop = true;
            } else {
                loop = false;
            }
        } while (loop);


    }
}
