public class YoutubePractice58LoopToAccessArray {

    public static void main(String[] args){
        double grades[] = {96.5, 98.7, 99.3, 88.4, 88.6, 90.1};
        int numbers[] = new int[10];

        for(int i = 0; i <= 5; i++){
            System.out.println("Grade number " + i + " is " + grades[i]);
        }

        for(int i = 0; i <= 9; i++){
            numbers[i] = i + 10;
        }

        for(int i = 0; i <= 9; i++){
            System.out.println(numbers[i]);
        }

        ///////////////////
        double max;
        max = grades[0];

        for(int i = 0; i <= 5; i++){
            if(grades[i] > max) {
                max = grades[i];
            }
        }

        System.out.println("Max grade in class is: " + max);
    }
}
