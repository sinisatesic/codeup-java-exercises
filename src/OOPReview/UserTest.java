package OOPReview;

public class UserTest {


    public static void Main(String[] args){
        User brance = new User("javamancer", "brance@codeup.com", "abc123");
        User jasmine = new User("mirafaun", "jasmine@gmail.com", "cbd234");

        brance.addFriend(jasmine);

        for(User friend : brance.getFriends()){
            System.out.println("friend.getUsername() = " + friend.getUsername());
            System.out.println("friend.getEmail() = " + friend.getEmail());
        }
    }
}
