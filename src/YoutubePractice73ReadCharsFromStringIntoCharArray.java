public class YoutubePractice73ReadCharsFromStringIntoCharArray {

    public static void main(String[] args){
        String str = "Sini Bini";
        char array[] = new char[15];

        str.getChars(0, 5, array, 0);
        //source begin, source end (how many chars you want overall - where count stops), character destination, beginning of this destination

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);

        /*
        Exercise 1:
        Create a string that holds the following:
        "Humpty Dumpty Sat On The Wall."

        Copy each character from this string
        and put it into a Char Array. Then, use this array
        to print the string backwards to the screen.
         */

        String blarg = "Humpty Dumpty Sat On The Wall.";
        char blargArray[] = new char[32];

        blarg.getChars(0, 29, blargArray, 0);
//        System.out.println(blargArray[29]);
//        System.out.println(blargArray[28]);
//        System.out.println(blargArray[27]);
//        System.out.println(blargArray[26]);

        int i;

       for(i = 29; i >= 0; i--){
           System.out.println(blargArray[i]);
       }
    }
}
