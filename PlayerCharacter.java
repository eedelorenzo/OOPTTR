import java.util.*;
/**
 * players will have their current score, the amount of trains they have left to place
 * a list of tickets that have and the routes they are currently going for
 * they must also have a list of their stocks, and i currently have them 
 * with a list of all the paths that they have made
 * currently they also have a value indicating how many draws they have left
 * i believe this will be useful later when determining if they draw a card from the deck
 * 
 * note, this has a link to the PLAYER enum, giving it access to all of those values
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerCharacter{
    // the player enumeration for user,gives 
    // the user a player number and a color
    public PLAYER player;

    //the score of the player 
    int score = 0; // score always starts at 0 
    int trainCount = 45; // number of trains left

    // list of the users train tickets  
    ArrayList<TICKETS> playerTrains;
    // list of the users destination tickets
    ArrayList<ROUTES> playerDestinations; 
    // list of the users technology tickets 
    ArrayList<STOCK> playerStocks; 
    ArrayList<TrainPath> pathsMade; 
    // number of draws the player can do 
    int drawsLeft = 2; 

    /**
     * Constructor for the user Object in 
     * the game ticket to ride 
     */
    public PlayerCharacter(PLAYER playerIn){
        this.player = playerIn; // sets player id
        this.playerTrains = new ArrayList<>();
        this.playerDestinations= new ArrayList<>();
        this.playerStocks = new ArrayList<>();
        pathsMade = new ArrayList<>();

    }
}