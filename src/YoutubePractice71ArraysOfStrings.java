public class YoutubePractice71ArraysOfStrings {

    public static void main(String[] args){
        int array1[] = {2,3,4,7,5};

        String sentence[] = {"I","love","to travel to","far away","places."};

        String array2[] = new String[3]; //this is creating new array that's reserving memory for 3 elements

        System.out.println(sentence[0] + " " + sentence[1] + " " + sentence[2] + " " + sentence[3] + " " + sentence[4]);

        sentence[4] = "continents";
        //modifying this string in array
        System.out.println(sentence[0] + " " + sentence[1] + " " + sentence[2] + " " + sentence[3] + " " + sentence[4]);

        array2[0] = "buttercups are awesome";
        array2[1] = "I love wurks";
        array2[2] = "I love da lasagna";

        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);


        /*
        Exercise 1:
        Create an array of length 4 to hold string elements. Store these strings
        in the array when this array is initialized: "popeye" "the" "sailor" "man".

        Create a second array of length 5 to hold string elements. After this array
        is created, store the following strings into the 5 elements:
        Here
        I
        Come
        To Save
        The Day!

        Print out the contents of both arrays to the screen to reassemble the phrases.
         */
        String first[] = {"popeye","the","sailor","man"};

        String second[] = new String[5];
        second[0] = "Here";
        second[1] = "I";
        second[2] = "Come";
        second[3] = "To Save";
        second[4] = "The Day!";

        System.out.println();

        System.out.println(first[0] + " " + first[1] + " " + first[2] + " " + first[3]);
        System.out.println(second[0]);
        System.out.println(second[1]);
        System.out.println(second[2]);
        System.out.println(second[3]);
        System.out.println(second[4]);
    }
}
