import java.util.*;
import java.util.Collections;
/**
 * So this class is intended to create the board on a representational level.
 * this means that it will create all the possible paths as arrays so that they
 * can be referenced and colored in when claimed
 * it will also initialize the possible stock choices for every path
 * 
 * methods that are currently missing include the ability to create 
 * all decks of cards and shuffle them
 * these include the various stock decks, the routes deck and the train color deck
 * all deck  resets will also be here
 * 
 * in here is also where we will calculate who is winning and how may points evryone has
 * 
 * we will also most likely calculate how many of each card each player has in here, rather than 
 * outside of this class
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board
{
    public ArrayList<TrainPath> listOfPaths;
    ArrayList<STOCK> stockSet0;
    ArrayList<STOCK> stockSet1;
    ArrayList<STOCK> stockSet2;
    ArrayList<STOCK> stockSet3;
    ArrayList<STOCK> stockSet4;
    ArrayList<STOCK> stockSet5;
    ArrayList<STOCK> stockSet6;
    ArrayList<STOCK> stockSet7;
    ArrayList<STOCK> stockSet8;
    ArrayList<STOCK> stockSet9;
    ArrayList<STOCK> stockSet10;
    ArrayList<STOCK> stockSet11;
    /**
     * Constructor for objects of class Board
     */
    public Board(int numOfPlayers){
        //going to require much more intialization after other functions are added
        //this includes all the creation of the decks and their shuffling and what not
        initializePaths();
        initializeStockArrays();

    }

    public void initializePaths()
    {
        //every path here needs to be hardcoded in with a rectangular data set
        //this indicates what portion of the board will get colored in once the path is claimed
        //a different function elsewhee will make the path the color of the player claiming it
        //after creating the path, it must be added to the listOfPaths
        TrainPath OntarioErie = new TrainPath(CITY.ONTARIO, CITY.ERIE,
                2, stockSet1, true, 3, COLOR.RAINBOW, new int[][]{{75,67,116,121}}, 
                new int[][]{{60,65,143,136}});
        listOfPaths.add(OntarioErie);
        TrainPath OntarioErie2 = new TrainPath(CITY.ONTARIO, CITY.ERIE,
                2, stockSet1, true, 3, COLOR.RAINBOW, new int[][]{{86,79,123,132}}, 
                new int[][]{{56,61,134,129}});
        listOfPaths.add(OntarioErie2);
        TrainPath ErieBuffaloO = new TrainPath(CITY.ERIE, CITY.BUFFALO,
                0, stockSet2, false, 5, COLOR.ORANGE, new int[][]{{145,149,286,279}}, 
                new int[][]{{128,136,62,55}});
        listOfPaths.add(ErieBuffaloO);
        TrainPath ErieBuffaloW = new TrainPath(CITY.ERIE, CITY.BUFFALO,
                0, stockSet2, false, 5, COLOR.WHITE, new int[][]{{150,153,294,287}}, 
                new int[][]{{140,148,72,63}});
        listOfPaths.add(ErieBuffaloW);
        TrainPath ErieYoungstownY = new TrainPath(CITY.ERIE, CITY.YOUNGSTOWN,
                0, stockSet2, false, 4, COLOR.YELLOW, new int[][]{{109,52,61,116}}, 
                new int[][]{{164,275,280,170}});
        listOfPaths.add(ErieYoungstownY);
        TrainPath ErieYoungstownG = new TrainPath(CITY.ERIE, CITY.YOUNGSTOWN,
                0, stockSet2, false, 4, COLOR.GREEN, new int[][]{{118,63,71,128}}, 
                new int[][]{{171,280,285,176}});
        listOfPaths.add(ErieYoungstownG);
        TrainPath ErieOilCity = new TrainPath(CITY.ERIE, CITY.OILCITY,
                0, stockSet1, false, 3, COLOR.BLACK, new int[][]{{131,161,171,140}}, 
                new int[][]{{165,252,249,163}});
        listOfPaths.add(ErieOilCity);
        TrainPath ErieWarren = new TrainPath(CITY.ERIE, CITY.WARREN,
                0, stockSet1, false, 3, COLOR.BLUE, new int[][]{{143,227,231,145}}, 
                new int[][]{{160,193,186,151}});
        listOfPaths.add(ErieWarren);
        TrainPath OntarioBuffalo = new TrainPath(CITY.ONTARIO, CITY.BUFFALO,
                1, stockSet1, false, 1, COLOR.RAINBOW, new int[][]{{241,240,268,268}}, 
                new int[][]{{53,60,60,53}});
        listOfPaths.add(OntarioBuffalo);
        TrainPath OntarioBuffalo2 = new TrainPath(CITY.ONTARIO, CITY.BUFFALO,
                1, stockSet1, false, 1, COLOR.RAINBOW, new int[][]{{241,240,268,268}}, 
                new int[][]{{40,48,48,40}});
        listOfPaths.add(OntarioBuffalo2);
        TrainPath BuffaloRochesterY = new TrainPath(CITY.BUFFALO, CITY.ROCHESTER,
                0, stockSet4, false, 5, COLOR.YELLOW, new int[][]{{316,316,469,469}}, 
                new int[][]{{42,52,52,42}});
        listOfPaths.add(BuffaloRochesterY);
        TrainPath BuffaloRochesterB = new TrainPath(CITY.BUFFALO, CITY.ROCHESTER,
                0, stockSet4, false, 5, COLOR.BLACK, new int[][]{{316,316,469,469}}, 
                new int[][]{{55,62,62,55}});
        listOfPaths.add(BuffaloRochesterB);
        TrainPath BuffaloCoudersport = new TrainPath(CITY.BUFFALO, CITY.COUDERSPORT,
                0, stockSet5, false, 4, COLOR.RAINBOW, new int[][]{{313,372,382,324}}, 
                new int[][]{{77,186,180,72}});
        listOfPaths.add(BuffaloCoudersport);
        TrainPath BuffaloWarren = new TrainPath(CITY.BUFFALO, CITY.WARREN,
                0, stockSet6, false, 4, COLOR.GREEN, new int[][]{{300,244,253,308}}, 
                new int[][]{{71,180,185,75}});
        listOfPaths.add(BuffaloWarren);
        TrainPath YoungstownWheeling = new TrainPath(CITY.YOUNGSTOWN, CITY.WHEELING,
                0, stockSet7, false, 5, COLOR.PINK, new int[][]{{37,50,60,46}}, 
                new int[][]{{311,467,467,312}});
        listOfPaths.add(YoungstownWheeling);
        TrainPath YoungstownPittsburghB = new TrainPath(CITY.YOUNGSTOWN, CITY.PITTSBURGH,
                0, stockSet7, false, 4, COLOR.BLUE, new int[][]{{67,56,128,135}}, 
                new int[][]{{303,306,407,401}});
        listOfPaths.add(YoungstownPittsburghB);
        TrainPath YoungstownPittsburghO = new TrainPath(CITY.YOUNGSTOWN, CITY.PITTSBURGH,
                0, stockSet7, false, 4, COLOR.ORANGE, new int[][]{{56,48,112,127}}, 
                new int[][]{{309,315,416,408}});
        listOfPaths.add(YoungstownPittsburghO);
        TrainPath YoungstownOilCity = new TrainPath(CITY.YOUNGSTOWN, CITY.OILCITY,
                0, stockSet8, false, 3, COLOR.WHITE, new int[][]{{64,67,156,153}}, 
                new int[][]{{291,300,276,266}});
        listOfPaths.add(YoungstownOilCity);
        TrainPath OilCityWarren = new TrainPath(CITY.OILCITY, CITY.WARREN,
                0, stockSet9, false, 2, COLOR.ORANGE, new int[][]{{185,191,234,226}}, 
                new int[][]{{249,257,211,205}});
        listOfPaths.add(OilCityWarren);
        TrainPath OilCityDubois = new TrainPath(CITY.OILCITY, CITY.DUBOIS,
                0, stockSet0, false, 3, COLOR.PINK, new int[][]{{191,187,274,278}}, 
                new int[][]{{272,281,314,305}});
        listOfPaths.add(OilCityDubois);
        TrainPath OilCityPittsburgh = new TrainPath(CITY.OILCITY, CITY.PITTSBURGH,
                0, stockSet10, false, 4, COLOR.RED, new int[][]{{161,139,153,172}}, 
                new int[][]{{278,400,403,281}});
        listOfPaths.add(OilCityPittsburgh);
        TrainPath WheelingPittsburghG = new TrainPath(CITY.WHEELING, CITY.PITTSBURGH,
                0, stockSet11, false, 2, COLOR.GREEN, new int[][]{{64,71,119,114}}, 
                new int[][]{{459,467,430,423}});
        listOfPaths.add(WheelingPittsburghG);
        TrainPath WheelingPittsburghW = new TrainPath(CITY.WHEELING, CITY.PITTSBURGH,
                0, stockSet11, false, 2, COLOR.WHITE, new int[][]{{73,80,128,121}}, 
                new int[][]{{468,477,438,432}});
        listOfPaths.add(WheelingPittsburghW);
    }

    public void initializeStockArrays(){
        //each railroad can have a different set of possible stocks to choose from
        //my initial idea was to just create every possible set that exists 
        //on the board and just assign them after
        //as you can see, ive made an example of the first set using the path from ontario to erie
        //if anyone has a better way to do this, go ahead, otherwise, we will need several
        //sets of stocks as most routes use different amounts of each
        stockSet1.add(STOCK.PRR);
        stockSet1.add(STOCK.ERIE);
        stockSet1.add(STOCK.NYCENTRAL);
        
        stockSet2.add(STOCK.ERIE);
        stockSet2.add(STOCK.NYCENTRAL);
        
        stockSet3.add(STOCK.ERIE);
        stockSet3.add(STOCK.NYCENTRAL);
        stockSet3.add(STOCK.BANDO);
        stockSet3.add(STOCK.BRANDP);
        stockSet3.add(STOCK.LEHIGH);
        
        stockSet4.add(STOCK.ERIE);
        stockSet4.add(STOCK.NYCENTRAL);
        
        stockSet5.add(STOCK.PRR);
        stockSet5.add(STOCK.ERIE);
        
        stockSet6.add(STOCK.ERIE);
        stockSet6.add(STOCK.PRR);
        stockSet6.add(STOCK.BANDO);
        stockSet6.add(STOCK.BRANDP);
        
        stockSet7.add(STOCK.PRR);
        stockSet7.add(STOCK.BANDO);
        stockSet7.add(STOCK.NYCENTRAL);
        
        stockSet8.add(STOCK.ERIE);
        
        stockSet9.add(STOCK.PRR);
        stockSet9.add(STOCK.ERIE);
        stockSet9.add(STOCK.BANDO);
        
        stockSet10.add(STOCK.PRR);
        stockSet10.add(STOCK.BANDO);
        
        stockSet11.add(STOCK.PRR);
    }
    
    public int[] genColorTotals(PlayerCharacter activePlayer){
        //arraylist of the users tickets that finding totals for
        ArrayList<TICKETS> playerTrainCards = activePlayer.playerTrains;
        //the array of totals for each of the train tickets 
        int[] trainCardColorTotals = new int[9];
        for(int i = 0;i<playerTrainCards.size();i++){
            if(playerTrainCards.get(i)==TICKETS.RAINBOW)
                trainCardColorTotals[0]++;            
            else if(playerTrainCards.get(i)==TICKETS.PINK)
                trainCardColorTotals[1]++;            
            else if(playerTrainCards.get(i)==TICKETS.WHITE)
                trainCardColorTotals[2]++;            
            else if(playerTrainCards.get(i)==TICKETS.BLUE)
                trainCardColorTotals[3]++;           
            else if(playerTrainCards.get(i)==TICKETS.YELLOW)
                trainCardColorTotals[4]++;            
            else if(playerTrainCards.get(i)==TICKETS.ORANGE)
                trainCardColorTotals[5]++;            
            else if(playerTrainCards.get(i)==TICKETS.BLACK)
                trainCardColorTotals[6]++;
            else if(playerTrainCards.get(i)==TICKETS.RED)
                trainCardColorTotals[7]++;            
            else if(playerTrainCards.get(i)==TICKETS.GREEN)
                trainCardColorTotals[8]++;            
        }
        return trainCardColorTotals;
    }
}
