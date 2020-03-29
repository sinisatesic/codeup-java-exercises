public class YoutubePractice15DeclaringInitializing {

    public static void main(String[] args){
        int var1; //declaring the variable

        var1 = 10; //initializing the variable

        //it gets lengthy if you declare and initialize on separate lines

        int sini = 77; //both on same line

        int a=3, b=6, c=9; //even more flexibility/less space

        /*
        1.
        Declare an integer named length and initialize it
        to 10 on the same line.

        On the same line, declare and initialize two more
        integers named "width" and "height".
        Initialize these to 12 and 15 respectively.

        Declare a final integer named "volume" and initialize it
        to be equal to "length = width * height". The "volume"
        variable is dynamically initialized to a value that is
        calculated when the program runs.

        Print out the value of the volume to the screen.
         */

        int length = 10;
        int width = 12, height = 15;
        int volume = length = width * height;
        System.out.println("Volume is initialized to value of " + volume);

    }
}
