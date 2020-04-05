public class YoutubePractice59ArraysAndLoopsExercise {

    /*
    1.
    Create an array with 100 elements that will hold integer values.
    Loop through the array and for each element, store the square of
    the element index. For example, for element [2], you would store
    the value of 4 in that location. For element [3], store 9 and so
    on. Print ou the element number and the contents of the array to
    the screen as follows:

    The square of 0 is 0
    The square of 1 is 1
    The square of 2 is 4
    ... and so on for the entire array.
     */

    public static void main(String[] args){
//mine contains 101 values in array to iterate to 100

        int numbers[] = new int[101];

        for(int i = 0; i <= 100; i++){
            numbers[i] = i * i;
            System.out.println("The square of " + i + " is " + numbers[i]);
        }
    }
}
