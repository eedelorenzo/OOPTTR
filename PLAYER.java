import java.awt.Color;
/**
 * sets the color that the player will be represented by. there are five options
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum PLAYER
{
    PLAYER1(Color.RED),
    PLAYER2(Color.BLUE),
    PLAYER3(Color.ORANGE),
    PLAYER4(Color.PINK),
    PLAYER5(Color.BLACK);
    
    public Color playerColor;
    PLAYER(Color playerColor){
        this.playerColor = playerColor;
    } 
}
