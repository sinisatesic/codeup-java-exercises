package movies;

public class Movie { //class can see its own private members
    private String name;
    private String category;

    public Movie(String name, String category) { //constructor
        this.name = name;   //local variable in Movie class
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
