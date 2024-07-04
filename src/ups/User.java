package ups;

import java.util.ArrayList;
import java.util.List;

public class User {

    // Atributos
    private String name;
    private int age;
    private List<String> interests;
    private List<User> friends;

    // Constructor
    public User(String name, int age, List<String> interests) {
        this.name = name;
        this.age = age;
        this.interests = new ArrayList<>(interests);
        this.friends = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<User> getFriends() {
        return friends;
    }

    public List<String> getInterests() {
        return interests;
    }

    // Método para añadir usuario
    public void addFriend(User user) {
        if (!friends.contains(user)) {
            friends.add(user);
        }
    }

    //ToString
    @Override
    public String toString() {
        return name; 
    }
}