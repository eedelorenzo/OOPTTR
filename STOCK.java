
/**
 * these are currently just the images of the stock cards, all of which will have their own decks
 * however, they have the ability to be given a value
 * this value will go from 1 to x, where x is the amount of whichever stock is being referenced
 * this value will have to be set when drawing the card in another class as part of
 * some other function
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum STOCK
{
    BANDO("TicketToRide/Pics/Stocks/bostock.jpg"),
    BRANDP("TicketToRide/Pics/Stocks/brpstock.jpg"),
    ERIE("TicketToRide/Pics/Stocks/eriestock.jpg"),
    JCL("TicketToRide/Pics/Stocks/jclstock.jpg"),
    LEHIGH("TicketToRide/Pics/Stocks/lehighstock.jpg"),
    NYCENTRAL("TicketToRide/Pics/Stocks/nycentralstock.jpg"),
    PRR("TicketToRide/Pics/Stocks/prrstock.jpg"),
    READINGLINE("TicketToRide/Pics/Stocks/readingstock.jpg"),
    WM("TicketToRide/Pics/Stocks/wmstock.jpg"),
    ;
    
    
    public String imgId;
    public int value;
    
    
    STOCK(String imgIdIn){
        this.imgId = imgIdIn;
        value = 0;
    }
    public void setValue(int newVal){
        value = newVal;
    }
}
