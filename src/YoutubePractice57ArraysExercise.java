public class YoutubePractice57ArraysExercise {

    /*
    1.
    Declare and initialize an array of type int named yearsMarried,
    which will have 5 elements. This array holds how many years that
    families have been married on your street. Store the following data
    into the array by storing them into the individual elements of the array

    family 1 = 4 years
    family 2 = 3 years
    family 3 = 10 years
    family 4 = 12 years
    family 5 = 6 years

    Next, print this data to the screen by accessing the elements and using
    System.out.println();
     */


    /*
    2.
    Declare and initialize an array of type double named dailyTemp,
    which will have 7 elements. This array holds the high temperature
    recorded on 7 days of a given week. Initialize the array to the following
    data when you declare an array:

    87.5
    90.0
    91.2
    88.8
    88.6
    87.5
    89.2

    Next, print out this data to the screen by accessing the elements and
    using System.out.println();
     */
    public static void main(String[] args){

        int yearsMarried[] = {4, 3, 10, 12, 6};
        System.out.println("family 1 = " + yearsMarried[0] + " years");
        System.out.println("family 2 = " + yearsMarried[1] + " years");
        System.out.println("family 3 = " + yearsMarried[2] + " years");
        System.out.println("family 4 = " + yearsMarried[3] + " years");
        System.out.println("family 5 = " + yearsMarried[4] + " years");


        double dailyTemp[] = {87.5, 90.0, 91.2, 88.8, 88.6, 87.5, 89.2};
        System.out.println("Sunday temp: " + dailyTemp[0] + " degrees");
        System.out.println("Monday temp: " + dailyTemp[1] + " degrees");
        System.out.println("Tuesday temp: " + dailyTemp[2] + " degrees");
        System.out.println("Wednesday temp: " + dailyTemp[3] + " degrees");
        System.out.println("Thursday temp: " + dailyTemp[4] + " degrees");
        System.out.println("Friday temp: " + dailyTemp[5] + " degrees");
        System.out.println("Saturday temp: " + dailyTemp[6] + " degrees");
    }
}
