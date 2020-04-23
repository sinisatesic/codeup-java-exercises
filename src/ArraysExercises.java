import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args){
//an array is a point to a location in memory

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        //Create an array that holds 3 person objects
        //Assign a new instance of the Person class to each element.

        Person[] people = new Person[3];

        people[0] = new Person("Sini");
        people[1] = new Person("Bobby");
        people[2] = new Person("Thanos");

        //Iterate through the array and print out the name of each person in the array
        for(Person person : people) {   //enhanced for
            System.out.println("\t" + person.getName());
        }

        /*
        Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.
         */
        }
//
//        public static Person[] addPerson(Person[] inputPeople, Person inputPerson){
//            Person[] newPeeps = new Person[inputPeople.length + 1];
//
//            for(int i = 0; i < inputPeople; i++){
//                newPeeps[i] = inputPeople[i];
//            }
//            newPeeps[newPeeps.length-1] = inputPerson;
//    }
}
