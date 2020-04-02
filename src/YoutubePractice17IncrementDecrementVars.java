public class YoutubePractice17IncrementDecrementVars {

    public static void main(String[] args){
        int a = 10;
        a = a + 1; //here, a no longer stays 10, but increments to 11
        //can also use a++ here
        //decrement would be a--
        //++a or --a would incre or decre before print or return
        System.out.println(a);

        int b = a++;
        //here, with just in reference, printing a would be 11 but
        //printing b would equal 10, because of location of ++
        //++ in front of var would equal 11 in the same print


        /*
        1.
        Using a loop with decrementing variable,
        produce the following output:

        140 times 2 equals <answer>
        139 times 2 equals <answer>
        138 times 2 equals <answer>
        ... and so on until 130
         */

        for(int i = 140; i >= 130; i--){
            System.out.println(i + " times 2 equals " + i * 2);
        }
    }
}

//for(int i=0;i<t;i++){
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int n = in.nextInt();
//        int k=a;
//        for(int j=0;j<n;j++)
//        {
//            k+=b*(int)Math.pow(2,j);
//            System.out.print(k+" ");
//        }
//        System.out.println();
//    }
