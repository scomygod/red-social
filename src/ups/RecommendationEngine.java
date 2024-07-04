package ups;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RecommendationEngine {

    // Método para recomendar amigos
    public List<User> recommendFriends(User user, Graph graph) {
        List<User> allUsers = graph.getUsers(); // Asegúrate de que este método esté implementado
        List<User> friends = user.getFriends();
        List<User> recommended = new ArrayList<>();
        
        for (User potentialFriend : allUsers) {
            if (!friends.contains(potentialFriend) && !potentialFriend.equals(user)) {
                double similarity = calculateSimilarity(user, potentialFriend);
                if (similarity > 0.3) {
                    recommended.add(potentialFriend);
                }
            }
        }
        return recommended;
    }

    // Método para calcular similitud
    public double calculateSimilarity(User user1, User user2) {
        Set<String> interests1 = new HashSet<>(user1.getInterests());
        Set<String> interests2 = new HashSet<>(user2.getInterests());
        Set<String> intersection = new HashSet<>(interests1);
        intersection.retainAll(interests2);
        Set<String> union = new HashSet<>(interests1);
        union.addAll(interests2);

        double similarity = (double) intersection.size() / union.size();
        System.out.println("Valor - " + similarity); // Mostrar valor de similitud
        return similarity;
    }
}
