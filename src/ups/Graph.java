package ups;
import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<User> users;

    // Constructor 
    public Graph() {
        this.users = new ArrayList<>();
    }

    // Método para añadir un usuario
    public void addUser(User user) {
        if (!users.contains(user)) {
            users.add(user);
        }
    }

    // Método para añadir una conexión entre dos usuarios
    public void addConnection(User user1, User user2) {
        user1.addFriend(user2);

    }


    // Obtener los amigos de un usuario
    public List<User> getFriends(User user) {
        if (users.contains(user)) {
            return user.getFriends();
        }
        return new ArrayList<>();
    }

    // Recomendar amigos
    public List<User> recommendFriends(User user) {
        RecommendationEngine engine = new RecommendationEngine();
        return engine.recommendFriends(user, this);
    }

    // Método para visualizar los amigos de un usuario
    public void printUserFriends(User user) {
        if (users.contains(user)) {
            System.out.println("Vertex " + user.getName() + ":");
            for (User friend : user.getFriends()) {
                System.out.println("->" + friend.getName());
            }
            System.out.println();
        } else {
            System.out.println("El usuario " + user.getName() + " no existe en el grafo.");
        }
    }

    // Método para visualizar todo el grafo
    public void printGraph() {
        for (User user : users) {
            printUserFriends(user);
        }
    }

    // Implementación del método getUsers
    public List<User> getUsers() {
        return new ArrayList<>(users); 
    }
}
