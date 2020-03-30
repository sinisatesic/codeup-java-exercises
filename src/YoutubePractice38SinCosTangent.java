public class YoutubePractice38SinCosTangent {
    //https://docs.oracle.com/javase/7/docs/api/

    public static void main(String[] args){

        System.out.println(Math.sin(7)); //providing radians, not degrees

        System.out.println(Math.sin(3.14));

        System.out.println(Math.sin(Math.PI)); //near zero

        System.out.println(Math.cos(Math.PI)); //-1

        System.out.println(Math.tan(Math.PI/4)); //near 1

        System.out.println(Math.cos(Math.toRadians(45))); //inputting degree measure
        //negatives can work as well
    }
}
