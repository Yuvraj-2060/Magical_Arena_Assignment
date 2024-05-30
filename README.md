## Description of the Magical Arena Project

# Overview:

The Magical Arena project is a simple Java application that simulates a battle between two players in a magical arena. Each player has attributes like health, strength, and attack power. The game is turn-based, where players take turns attacking each other using dice rolls to determine the effectiveness of their attacks and defenses. The game continues until one player's health reaches zero.

## Project Structure
The project is structured as a Maven project, making it easy to manage dependencies and build the project. The directory structure is organized to separate the main application code from the test code.


### Main Components 

## Main Class

# Main.java: 
Entry point of the application that initializes the players and starts the battle in the arena.
Arena Package

# Arena.java: 
Manages the overall battle between two players. It sets up the players and starts the battle sequence.
Game Package

# Dice.java: 
Represents a dice with a specified number of sides. Contains a method to roll the dice and return a random value.
# Player.java: 
Represents a player in the game, with attributes for name, health, strength, and attack power. Contains methods to take damage and check if the player is alive.
# Battle.java:
Manages the battle logic between two players, including dice rolls for attacks and defenses, calculating damage, and determining the outcome of the battle.

### Utils Package

# RandomUtils.java: 
Utility class for generating random numbers within a specified range. Used for dice rolls.

## Unit Tests
The project includes comprehensive unit tests to ensure the functionality of each component. The tests are written using JUnit 5 and cover the following:

# ArenaTest.java: 
Tests the creation of the arena and initialization of players.
# DiceTest.java: 
Tests the dice roll functionality to ensure it returns values within the expected range.
# PlayerTest.java: 
Tests player creation, taking damage, and checking if the player is alive.
# BattleTest.java: 
Tests the battle logic between two players to ensure the correct calculation of damage and the determination of the battle outcome.
# RandomUtilsTest.java: 
Tests the random number generation to ensure it falls within the specified range.



## ------------------------------ Build and Run Instructions -------------------------------------------

# 1). Clone the Repository
git clone <repository_url>

# 2). Navigate to the Project Directory
cd MagicalArena

# 3). Compile and Package the Application using Maven
mvn clean package

# 4). Run the Application
java -cp target/MagicalArena-1.0-SNAPSHOT.jar com.magicalarena.Main

# 5). Run the Unit Tests
mvn test


### Design Considerations

# Simple Design:   
The code has a clear and simple design, making it easy to understand and modify.
# Readability: 
The code is well-organized with clear and consistent naming conventions.
# Modeling: 
The objects and classes are well-designed and appropriate for the problem at hand.
# Maintainability: 
The code is easy to maintain and modify, with a clean separation of concerns.
# Testability: 
The code has comprehensive unit tests, providing a high degree of test coverage.

This project serves as a good example of applying object-oriented principles and writing clean, maintainable code in Java. The use of Maven ensures that dependencies are managed effectively, and the project structure follows best practices for Java development.










![image](https://github.com/Yuvraj-2060/Magical_Arena_Assignment/assets/103349788/3e9d0397-80e0-4ed1-994b-331c75f49407)

