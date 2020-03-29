public class YoutubePractice13CharType {

    public static void main(String[] args){
//        char character;
//
//        int i;
//
//        for(i = 30; i <= 150; i++){
//            character = (char) i;
//            System.out.println("Code: " + i + " Corresponds to " + character);
//        }



        // 1.
        /*
        Write a program that uses a for loop to print out the alphabet from a - z as follows:

        A  a
        B  b
        C  c
        D  d
        ... and on until z

        Note that there is a tab between the columns.
        Uppercase letter is on the left and lowercase is on the right
         */

        //65 - 90 for upper, 97 - 122 for lower
       char upper = 'A';
       char lower = 'a';

        int z;

        for(z = 0; z <= 25; z++){
            System.out.println(upper + "\t" + lower);
            upper++;
            lower++;
        }
    }
}
