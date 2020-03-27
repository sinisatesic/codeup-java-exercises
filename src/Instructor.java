public class Instructor {

    //we want first name, last name, brain frequency, and total count

    private String firstName; // don't need to be accessible to anything else
    private String lastName;
    private int brainWaveFrequency;
    private static int numInstructors = 0; //reason for static: every time we come into this class, we want this accessible in class and not to re-initialize to zero
    //when other instructors are created, they'll all be able to access this value to increment by 1

    public Instructor(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        this.brainWaveFrequency = 0;
        numInstructors++; //we have another instructor now, add to the count

        System.out.printf("\t%s was just created\n", firstName);
        System.out.printf("\tInstructor count: %d\n\n", numInstructors);
    }

    //create Getter and Setter for First Name

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String first) {
        this.firstName = first;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String last) {
        this.lastName = last;
    }

    // Getter and Setter for Brainwave Frequency
    public int getBrainWaveFrequency() {
        return brainWaveFrequency;
    }

    public void setBrainWaveFrequency(int brainWaveFreq){
        this.brainWaveFrequency = brainWaveFreq;
    }

    //method to display Instructor Info
    public String displayStats() {
        return String.format("\t%s %s, Brainwave Frequency: %d", firstName, lastName, brainWaveFrequency);
    }

    //Now we have to do something with this
}
