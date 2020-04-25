package OOPReview;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class User {
    private long id;
    private String username;
    private String email;
    private String password;
    private ArrayList<User> friends;
    private boolean isAdmin;

    //default constructor
    public User(){
    }

    //modified constructor for this review (when user first signs up); doesn't accept ID or Boolean that is called when user signs up
    public User(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
        this.friends = new ArrayList<>();
        this.isAdmin = false;
    }

    //Constructor that has ID for after User has been put in the database and is now being pulled out with an ID
    public User(long id, String username, String email, String password, ArrayList<User> friends, boolean isAdmin) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.friends = friends;
        this.isAdmin = isAdmin;
    }

    //method for adding other users (friends) on app
    public void addFriend(User friendToAdd){
        this.friends.add(friendToAdd);
        friendToAdd.getFriends().add(this); //
    }

    //getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<User> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<User> friends) {
        this.friends = friends;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
