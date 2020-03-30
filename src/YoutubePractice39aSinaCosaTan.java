public class YoutubePractice39aSinaCosaTan {
    //https://docs.oracle.com/javase/7/docs/api/

    public static void main(String[] args){

        System.out.println(Math.asin(7.2)); //will return NaN
        //for sin and cosin angles, only answers between -1 and 1 can come back


        System.out.println(Math.asin(.77)); //calculating angle in terms of radians
        System.out.println(Math.asin(-.88));

        System.out.println(Math.atan(.7));

        System.out.println(Math.toDegrees(Math.asin(.7))); //will calculate angle in degrees
    }
}
