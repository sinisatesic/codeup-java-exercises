import java.util.Scanner;

public class YoutubePractice25IfElseIfLadder {

    public static void main(String[] args){
        char grade = 'A';

        if(grade == 'A'){
            System.out.println("Noice");
        } else if(grade == 'B'){
            System.out.println("Da bee");
        } else if(grade == 'C'){
            System.out.println("Da sea");
        } else if(grade == 'D'){
            System.out.println("Hah, da deee");
        } else {
            System.out.println("Da ffff");
        }


//        can also be:

        if(grade == 'A') System.out.println("Noice");
        else if(grade == 'B') System.out.println("Da bee");
        else if(grade == 'C') System.out.println("Da sea");
        else if(grade == 'D') System.out.println("Hah, da deee");
        else System.out.println("Da ffff");

        /*

        1.

        Write a program that asks what grade a student received on an exam.
        Using an if-else if ladder, output the following:

        If grade is between             Output
        Great than or equal to 90       earned an A on the exam
        Between 80 and 90               earned a B on the exam
        Between 70 and 80               earned a C on the exam
        Between 60 and 70               earned a D on the exam
        less than 60                    earned an F on the exam

         */

        Scanner userGrade = new Scanner(System.in);
        int studentGrade;
        System.out.println("What number grade you got?");
        studentGrade = userGrade.nextInt();

        if(studentGrade >= 90) System.out.println("Earned an A on the exam");
        else if(studentGrade >= 80 && studentGrade < 90) System.out.println("Earned a B on exam");
        else if(studentGrade >= 70 && studentGrade < 80) System.out.println("Earned a C on exam");
        else if(studentGrade >= 60 && studentGrade < 70) System.out.println("Earned a D on exam");
        else System.out.println("Earned an F on exam");

    }
}
