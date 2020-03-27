

public class Person {
    private String name;

    Person(String n){
        this.name = n;
    }

    //returns person's name
    public String getName(){
        return name;
    }

    //changes the name property to the passed value
    public void setName(String personName) {
        this.name = personName;
    }

    //prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello " + name);
    }

    static class PersonTest{
        //tests the Person class
        public static void main(String[] args){
//            Person person1 = new Person("Ea");
//            Person person2 = person1;
//            System.out.println(person1 == person2);


//            Person person1 = new Person("John");
//            Person person2 = new Person("John");
//            System.out.println(person1.getName().equals(person2.getName())); //results in true ; im guessing because of getName method up top, and then .equals method here
//            System.out.println(person1 == person2); //results in false ; im guessing because of it being instance and no call to above methods



//            Person person1 = new Person("John");
//            Person person2 = person1;
//            System.out.println(person1 == person2); //i expected true; it is true - hell yeah

            Person person1 = new Person("John");
            Person person2 = person1;
            System.out.println(person1.getName()); //john is output
            System.out.println(person2.getName()); //john is output
            person2.setName("Jane");
            System.out.println(person1.getName()); //jane is output
            System.out.println(person2.getName()); //jane is output
        }
    }



}
