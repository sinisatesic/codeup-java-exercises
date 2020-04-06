public class YoutubePractice75ReplacingCharsInString {

    public static void main(String[] args){
        String str = "I love having fun at the amusement park in florida";

        System.out.println(str);

        str = str.replace('f','F');
        //replaces all 'f' with 'F'

        System.out.println(str);

        str = str.replace("Florida","Texas");
        //replaces ALL sequences of string "Florida" with "Texas"
        System.out.println(str);

        /*
        Exercise 1
        Create a string and put the following phrase in it:
        "jason went to washington dc."

        Print out the original string to the screen, then
        replace the j with J
        replace the w with W
        replace the dc with DC
         */

        String exercise = "jason went to washington dc";
        System.out.println(exercise);

        exercise = exercise.replace('j','J');
        System.out.println(exercise);

        exercise = exercise.replace(exercise.charAt(14), 'W');
        System.out.println(exercise);

        exercise = exercise.replace("dc","DC");
        System.out.println(exercise);
    }
}
