import java.util.*;
/**
 * create a path between two cities
 * generally going to be used in counting scores and displaying the claimed paths via
 * colorized sections of the map.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrainPath
{
    int length; // the length of the path
    //color of the peices needed to claimed the path  
    COLOR peiceColor; 
    // is the root a ferry root 
    boolean isFerry; 
    //# of locomotives needed to claim route, refers pretty much to the ferry routes only
    int numLocomotivesNeeded;
    //list of players who have claimed that root 
    ArrayList<PLAYER> playerClaimed;
    ArrayList<STOCK> stocksAvailable;

    public CITY start; 
    public CITY end;
    
    //all x and y values of the rectangles to be filled
    public int[][] xCoords;
    public int[][] yCoords;


    /**
     * 
     */
    public TrainPath(CITY inRoute, CITY outRoute, int locoNeededIn,  ArrayList<STOCK> possibleStock,
    boolean checkFerry, int lengthIn, COLOR colorNeeded, int[][] xCoordsIn, int[][] yCoordsIn)
    {
        length = lengthIn;
        peiceColor = colorNeeded; 
        numLocomotivesNeeded= locoNeededIn; 
        isFerry = checkFerry; 
        start = inRoute;
        end = outRoute;
        playerClaimed = new ArrayList<>(); 
        xCoords = xCoordsIn;
        yCoords = yCoordsIn;

    }
    /**
     * currently this just returns a 1, showing the path has been claimed
     */
    public int claim()
    {
        return 1;
    }

}
