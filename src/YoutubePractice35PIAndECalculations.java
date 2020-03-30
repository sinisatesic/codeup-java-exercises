public class YoutubePractice35PIAndECalculations {
    //https://docs.oracle.com/javase/7/docs/api/

    public static void main(String[] args){

        System.out.println(Math.PI); //returns to 15th decimal place

        System.out.println(Math.E); //i think also to 15th decimal place

        int i;

        for(i = 1; i <= 6; i++){
            System.out.println(i + " times PI equals " + i*Math.PI);
            //if you're STORING a result, need to make sure result is double variable(s)
        }
    }
}
