
/**
 * this allows all of the ticket images to be referenced easily. 
 * best used when we have to show the availible cards that can be picked up
 * during a players turn
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum TICKETS{
    RAINBOW("TicketToRidePics/Pics/TrainColors/rainbow.jpg"),//20
    PINK("TicketToRidePics/Pics/TrainColors/pink.jpg"),//12
    WHITE("TicketToRidePics/Pics/TrainColors/white.jpg"),//12
    BLUE("TicketToRidePics/Pics/TrainColors/blue.jpg"),//12
    YELLOW("TicketToRidePics/Pics/TrainColors/yellow.jpg"),//12
    ORANGE("TicketToRidePics/Pics/TrainColors/orange.jpg"),//12
    BLACK("TicketToRidePics/Pics/TrainColors/black.jpg"),//12
    RED("TicketToRidePics/Pics/TrainColors/red.jpg"),//12
    GREEN("TicketToRidePics/Pics/TrainColors/green.jpg"); //12   
        
    public String imgId;
    
    TICKETS(String imgIdIn){
        this.imgId = imgIdIn;
    }
}
