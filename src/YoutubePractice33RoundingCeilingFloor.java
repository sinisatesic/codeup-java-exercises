public class YoutubePractice33RoundingCeilingFloor {

    //https://docs.oracle.com/javase/7/docs/api/

    public static void main(String[] args){

        System.out.println(Math.round(1.25)); //rounds down
        System.out.println(Math.round(1.75)); //rounds up

        //Math.floor will always return rounded number that's smaller; rounds down, and with 1 decimal place

        System.out.println(Math.floor(2.8));

        //Math.ceiling is opposite; will always return larger num - round up, and with 1 decimal place

        System.out.println(Math.ceil(2.4));

        double num1 = 2.72;
        System.out.println(Math.round(num1));
    }
}
