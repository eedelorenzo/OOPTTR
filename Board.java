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
 * @author Leo Dohmann  
 * @author Luke McKenna
 * @author Emily DeLorenzo
 * @author Matt LaNeve
 * @author Edwin Svraka
 * @version 5/1/17
 */
public class Board
{
    public ArrayList<TrainPath> listOfPaths;
    //create arrayLists to hold the stocks for each path
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
    ArrayList<STOCK> stockSet12;
    ArrayList<STOCK> stockSet13;
    ArrayList<STOCK> stockSet14;
    ArrayList<STOCK> stockSet15;
    ArrayList<STOCK> stockSet16;
    ArrayList<STOCK> stockSet17;
    ArrayList<STOCK> stockSet18;
    ArrayList<STOCK> stockSet19;
    ArrayList<STOCK> stockSet20;
    ArrayList<STOCK> stockSet21;
    ArrayList<STOCK> stockSet22;
    ArrayList<STOCK> stockSet23;
    ArrayList<STOCK> stockSet24;
    ArrayList<STOCK> stockSet25;
    ArrayList<STOCK> stockSet26;
    ArrayList<STOCK> stockSet27;
    ArrayList<STOCK> stockSet28;
    ArrayList<STOCK> stockSet29;
    ArrayList<STOCK> stockSet30;
    ArrayList<STOCK> stockSet31;
    ArrayList<STOCK> stockSet32;
    ArrayList<STOCK> stockSet33;
    ArrayList<STOCK> stockSet34;
    ArrayList<STOCK> stockSet35;
    ArrayList<STOCK> stockSet36;
    ArrayList<STOCK> stockSet37;
    ArrayList<STOCK> stockSet38;
    ArrayList<STOCK> stockSet39;
    ArrayList<STOCK> stockSet40;
    ArrayList<STOCK> stockSet41;
    ArrayList<STOCK> stockSet42;
    ArrayList<STOCK> stockSet43;
    ArrayList<STOCK> stockSet44;
    ArrayList<STOCK> stockSet45;
    ArrayList<STOCK> stockSet46;
    ArrayList<STOCK> stockSet47;
    ArrayList<STOCK> stockSet48;
    ArrayList<STOCK> stockSet49;
    ArrayList<STOCK> stockSet50;
    ArrayList<STOCK> stockSet51;
    ArrayList<STOCK> stockSet52;
    ArrayList<STOCK> stockSet53;
    ArrayList<STOCK> stockSet54;
    ArrayList<STOCK> stockSet55;
    ArrayList<STOCK> stockSet56;
    ArrayList<STOCK> stockSet57;
    ArrayList<STOCK> stockSet58;
    ArrayList<STOCK> stockSet59;
    ArrayList<STOCK> stockSet60;
    ArrayList<STOCK> stockSet61;
    ArrayList<STOCK> stockSet62;
    ArrayList<STOCK> stockSet63
    
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
        //create every possible set that exists on the board
        
        //Ontario-Erie
        stockSet1.add(STOCK.PRR);
        stockSet1.add(STOCK.ERIE);
        stockSet1.add(STOCK.NYCENTRAL);
        
        //Erie-Youngstown
        stockSet2.add(STOCK.ERIE);
        stockSet2.add(STOCK.NYCENTRAL);
        
        //Buffalo-Rochester
        stockSet3.add(STOCK.ERIE);
        stockSet3.add(STOCK.NYCENTRAL);
        stockSet3.add(STOCK.BANDO);
        stockSet3.add(STOCK.BRANDP);
        stockSet3.add(STOCK.LEHIGH);
        
        //Erie-Buffalo
        stockSet4.add(STOCK.ERIE);
        stockSet4.add(STOCK.NYCENTRAL);
        
        //Buffalo-Coudersport
        stockSet5.add(STOCK.PRR);
        stockSet5.add(STOCK.ERIE);
        
        //Warren-Buffalo
        stockSet6.add(STOCK.ERIE);
        stockSet6.add(STOCK.PRR);
        stockSet6.add(STOCK.BANDO);
        stockSet6.add(STOCK.BRANDP);
        
        //Youngstown-Pittsburg
        stockSet7.add(STOCK.PRR);
        stockSet7.add(STOCK.BANDO);
        stockSet7.add(STOCK.NYCENTRAL);
        
        //Youngstown-Oil City
        stockSet8.add(STOCK.ERIE);
        
        //Oil City -Warren
        stockSet9.add(STOCK.PRR);
        stockSet9.add(STOCK.ERIE);
        stockSet9.add(STOCK.BANDO);
        
        //Pittsburg-Oil City
        stockSet10.add(STOCK.PRR);
        stockSet10.add(STOCK.BANDO);
        
        //Wheeling-Pittsburg
        stockSet11.add(STOCK.PRR);
        
        //Youngstown-Wheeling
        stockSet12.add(STOCK.PRR);
        stockSet12.add(STOCK.BANDO);
        stockSet12.add(STOCK.NYCENTRAL);
        
        //Wheeling-Morgantown
        stockSet13.add(STOCK.BANDO);
        
        //Erie-Warren
        stockSet14.add(STOCK.PRR);
        stockSet14.add(STOCK.ERIE);
        stockSet14.add(STOCK.NYCENTRAL);
        
        //Erie-Oil City
        stockSet15.add(STOCK.PRR);
        stockSet15.add(STOCK.ERIE);
        stockSet15.add(STOCK.NYCENTRAL);
        
        //Pittsburg-Johnstown
        stockSet16.add(STOCK.PRR);
        stockSet16.add(STOCK.BANDO);
        
        //Morgantown-Cumberland
        stockSet17.add(STOCK.WM);
        stockSet17.add(STOCK.BANDO);
        
        //Warren-Coudersport
        stockSet18.add(STOCK.PRR);
        stockSet18.add(STOCK.ERIE);
        stockSet18.add(STOCK.BANDO);
        stockSet18.add(STOCK.NYCENTRAL);
        stockSet18.add(STOCK.BRANDP);
        
        //Warren-Dubois
        stockSet19.add(STOCK.ERIE);
        stockSet19.add(STOCK.BRANDP);
        
        //Dubois-Altoona
        stockSet20.add(STOCK.PRR);
        
        //Johnstown-Altoona
        stockSet21.add(STOCK.PRR);
        
        //Johnstown-Cumberland
        stockSet22.add(STOCK.WM);
        stockSet22.add(STOCK.PRR);
        stockSet22.add(STOCK.BANDO);
        
        //Coudersport-Elmira
        stockSet23.add(STOCK.PRR);
        stockSet23.add(STOCK.ERIE);
        stockSet23.add(STOCK.BANDO);
        stockSet23.add(STOCK.NYCENTRAL);
        stockSet23.add(STOCK.BRANDP);
        
        //Coudersport-Williamsport
        stockSet24.add(STOCK.PRR);
        
        //Altoona-Harrisburg
        stockSet25.add(STOCK.PRR);
        
        //Cumberland-Chambersburg
        stockSet26.add(STOCK.WM);
        stockSet26.add(STOCK.PRR);
        
        //Rochester-Elmira
        stockSet27.add(STOCK.PRR);
        stockSet27.add(STOCK.ERIE);
        stockSet27.add(STOCK.BANDO);
        stockSet27.add(STOCK.LEHIGH);
        stockSet27.add(STOCK.NYCENTRAL);
        stockSet27.add(STOCK.BRANDP);
        
        //Rochester-Syracuse
        stockSet28.add(STOCK.NYCENTRAL);
        stockSet28.add(STOCK.LEHIGH);
        
        //Lewiston-Williamsport
        stockSet29.add(STOCK.PRR);
        stockSet29.add(STOCK.READINGLINE);
        
        //Lewiston-Harrisburg
        stockSet30.add(STOCK.PRR);
        
        //Chambersburg-Harrisburg
        stockSet31.add(STOCK.WM);
        stockSet31.add(STOCK.PRR);
        stockSet31.add(STOCK.READINGLINE);
        
        //Cumberland-Baltimore
        stockSet32.add(STOCK.WM);
        stockSet32.add(STOCK.BANDO);
        
        //Elmira-Syracuse
        stockSet33.add(STOCK.ERIE);
        stockSet33.add(STOCK.LEHIGH);
        
        //Elmira-Binghamton
        stockSet34.add(STOCK.ERIE);
        
        //Elmira-Towanda
        stockSet35.add(STOCK.PRR);
        stockSet35.add(STOCK.ERIE);
        stockSet35.add(STOCK.LEHIGH);
        
        //Willamsport-Towanda
        stockSet36.add(STOCK.ERIE);
        stockSet36.add(STOCK.READINGLINE);
        
        //Gettysburg-Baltimore
        stockSet37.add(STOCK.WM);
        stockSet37.add(STOCK.PRR);
        
        //Gettysburg-York
        stockSet38.add(STOCK.WM);
        stockSet38.add(STOCK.PRR);
        
        //Gettysburg-Harrisburg
        stockSet39.add(STOCK.PRR);
        stockSet39.add(STOCK.READINGLINE);
        
        //Harrisburg-York
        stockSet40.add(STOCK.WM);
        stockSet40.add(STOCK.PRR);
        
        //Harrisburg-Scranton
        stockSet41.add(STOCK.PRR);
        stockSet41.add(STOCK.READINGLINE);
        
        //Harrisburg-Reading
        stockSet42.add(STOCK.READINGLINE);
        
        //Harrisburg-Lancaster
        stockSet43.add(STOCK.PRR);
        
        //York-Lancaster
        stockSet44.add(STOCK.PRR);
        
        //York-Baltimore
        stockSet45.add(STOCK.WM);
        stockSet45.add(STOCK.PRR);
        
        //Towanda-Binghamton
        stockSet46.add(STOCK.ERIE);
        
        //Towanda-Scranton
        stockSet47.add(STOCK.PRR);
        stockSet47.add(STOCK.ERIE);
        stockSet47.add(STOCK.LEHIGH);
        
        //Reading-Allentown
        stockSet48.add(STOCK.READINGLINE);
        
        //Reading-Lancaster
        stockSet49.add(STOCK.READINGLINE);
        
        //Lancaster-Philadelphia
        stockSet50.add(STOCK.PRR);
        
        //Baltimore-Philadelphia
        stockSet51.add(STOCK.PRR);
        stockSet51.add(STOCK.BANDO);
        
        //Syracuse-Albany
        stockSet52.add(STOCK.NYCENTRAL);
        
        //Syracuse-Binghamton
        stockSet53.add(STOCK.ERIE);
        
        //Binghamton-Scranton
        stockSet54.add(STOCK.ERIE);
        
        //Scranton-New York
        stockSet55.add(STOCK.ERIE);
        stockSet55.add(STOCK.LEHIGH);
        stockSet55.add(STOCK.JCL);
        
        //Scranton-Stroudsburg
        stockSet56.add(STOCK.READINGLINE);
        stockSet56.add(STOCK.LEHIGH);
        stockSet56.add(STOCK.JCL);
        
        //Scranton-Allentown
        stockSet57.add(STOCK.JCL);
        stockSet57.add(STOCK.LEHIGH);
        stockSet57.add(STOCK.READINGLINE);
        stockSet57.add(STOCK.PRR);
        
        //Allentown-Stroudsburg
        stockSet58.add(STOCK.READINGLINE);
        stockSet58.add(STOCK.LEHIGH);
        stockSet58.add(STOCK.JCL);
        
        //Allentown-Philadelphia
        stockSet59.add(STOCK.PRR);
        stockSet59.add(STOCK.READINGLINE);
        
        //Philadelphia-Atlantic City
        stockSet60.add(STOCK.PRR);
        stockSet60.add(STOCK.READINGLINE);
        stockSet60.add(STOCK.JCL);
        
        //Philadelphia-New York
        stockSet61.add(STOCK.PRR);
        stockSet61.add(STOCK.BANDO);
        stockSet61.add(STOCK.READINGLINE);
        stockSet61.add(STOCK.JCL);
        
        //Albany-New York
        stockSet62.add(STOCK.PRR);
        stockSet62.add(STOCK.BANDO);
        stockSet62.add(STOCK.NYCENTRAL);
        
        //New York-Atlantic City
        stockSet63.add(STOCK.JCL);
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
