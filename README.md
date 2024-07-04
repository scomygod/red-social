Description
Author: Adrian Lazo Cabrer
Version 1.0.0 Entrega Final
Clases usadas:
User, Graph, RecommendationEngine, User, App

La clase User representa a un usuario dentro de la aplicación. Cada usuario tiene los siguientes atributos:

name: El nombre del usuario.
age: La edad del usuario.
interests: Una lista de intereses del usuario (por ejemplo, música, arte).
friends: Una lista de amigos del usuario.
Métodos principales:

addFriend(User user): Agrega un nuevo amigo al usuario.
getName(): Devuelve el nombre del usuario.
getFriends(): Devuelve la lista de amigos del usuario.
getInterests(): Devuelve la lista de intereses del usuario.
Graph
La clase Graph gestiona un conjunto de usuarios y sus conexiones. Funciona como una red social simple.

Métodos principales:

addUser(User user): Añade un nuevo usuario al gráfico.
addConnection(User user1, User user2): Crea una conexión (amistad) entre dos usuarios.
printGraph(): Imprime todos los usuarios y sus amigos en la consola.
recommendFriends(User user): Recomendaciones de amigos para un usuario basado en intereses compartidos.
RecommendationEngine
La clase RecommendationEngine es responsable de recomendar nuevos amigos para un usuario en función de intereses compartidos.

Métodos principales:

recommendFriends(User user, Graph graph): Recomendaciones de amigos para el usuario dado.
calculateSimilarity(User user1, User user2): Calcula la similitud entre dos usuarios basada en sus intereses.
App
La clase App contiene el método principal main, donde se crean los usuarios, se establecen sus conexiones y se imprimen las recomendaciones de amigos.

