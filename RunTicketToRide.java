import java.awt.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.event.*;
import java.applet.Applet;
import javax.imageio.ImageIO;
import java.util.*;
import java.io.*;
import java.awt.image.BufferedImage;
import java.awt.Checkbox;
/**
 * straight up, this stuff is mostly just a mess right now. a lot of random stuff 
 * is here for debugging
 * the init is going to have to start a lot more things and there will be a lot more 
 * draw functions needed
 * pretty much all coordinates will need to be hardcoded in, so use the map as a reference
 * the tickets that are currently being displayed are just for testing, and will be moved
 * upon actual completion
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class RunTicketToRide extends JApplet 
{
    public BufferedImage gameBoard, startScreen;
    public Image doubleBufferImage;
    public Graphics doubleBufferGraphic;

    public PlayerCharacter activePlayer;
    public Board session;
    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void init()
    {
        try{
            gameBoard = ImageIO.read(new File ("TicketToRidePics/Pics/Map.jpg"));
            startScreen = ImageIO.read(new File ("TicketToRidePics/Pics/StartScreen.jpg"));
        }
        catch(IOException e){
        } 
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();
        double screenHeight = screenSize.getHeight();
        resize((int)screenWidth,(int)screenHeight);
    }

    /**
     * Called by the browser or applet viewer to inform this JApplet that it 
     * should start its execution. It is called after the init method and 
     * each time the JApplet is revisited in a Web page. 
     */
    public void start()
    {
        // provide any code requred to run each time 
        // web page is visited
    }

    /** 
     * Called by the browser or applet viewer to inform this JApplet that
     * it should stop its execution. It is called when the Web page that
     * contains this JApplet has been replaced by another page, and also
     * just before the JApplet is to be destroyed. 
     */
    public void stop()
    {
        // provide any code that needs to be run when page
        // is replaced by another page or before JApplet is destroyed 
    }

    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics g){
        drawBoard(g);
        drawTrains(g);
    }

    public void update(Graphics g){
        // initialize buffer
        if (doubleBufferImage == null){
            doubleBufferImage = createImage (getSize().width, getSize().height);
            doubleBufferGraphic = doubleBufferImage.getGraphics();
        }
        // clear screen in background
        doubleBufferGraphic.setColor (getBackground ());
        doubleBufferGraphic.fillRect (0, 0, getSize().width, getSize().height);
        // draw elements in background
        doubleBufferGraphic.setColor (getForeground());
        paint (doubleBufferGraphic);
        // draw image on the screen
        g.drawImage (doubleBufferImage, 0, 0, this);
    } 

    public void drawBoard(Graphics g){
        g.drawImage(gameBoard,0,0,this);

    }

    public void drawStartScreen(Graphics g){
        g.drawImage(startScreen,0,0,this);
    }

    public void drawTrains(Graphics g){
        //move these slightly more rightward, maybe squish them together more
        //change path to be tickets.color.imgid
        try{
            g.drawImage(ImageIO.read(new File 
                    ("TicketToRidePics/Pics/TrainColors/black.jpg")),1300,540,this);
            g.drawImage(ImageIO.read(new File 
                    ("TicketToRidePics/Pics/TrainColors/blue.jpg")) ,1450,540,this);
            g.drawImage(ImageIO.read(new File 
                    ("TicketToRidePics/Pics/TrainColors/green.jpg")) ,1600,540,this);
            g.drawImage(ImageIO.read(new File 
                    ("TicketToRidePics/Pics/TrainColors/orange.jpg")) ,1300,630,this);
            g.drawImage(ImageIO.read(new File 
                    ("TicketToRidePics/Pics/TrainColors/pink.jpg")) ,1450,630,this);
            g.drawImage(ImageIO.read(new File 
                    ("TicketToRidePics/Pics/TrainColors/red.jpg")) ,1600,630,this);
            g.drawImage(ImageIO.read(new File 
                    ("TicketToRidePics/Pics/TrainColors/white.jpg")) ,1300,730,this);
            g.drawImage(ImageIO.read(new File 
                    ("TicketToRidePics/Pics/TrainColors/yellow.jpg")) ,1450,730,this);
            g.drawImage(ImageIO.read(new File 
                    ("TicketToRidePics/Pics/TrainColors/rainbow.jpg")) ,1600,730,this);
        }
        catch(Exception e) {
            System.out.println("error");
        }
    }
    
    

    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * is being reclaimed and that it should destroy any resources that it
     * has allocated. The stop method will always be called before destroy. 
     */
    public void destroy()
    {
        // provide code to be run when JApplet is about to be destroyed.
    }

    /**
     * Returns information about this applet. 
     * An applet should override this method to return a String containing 
     * information about the author, version, and copyright of the JApplet.
     *
     * @return a String representation of information about this JApplet
     */
    public String getAppletInfo()
    {
        // provide information about the applet
        return "Title:   \nAuthor:   \nA simple applet example description. ";
    }

    /**
     * Returns parameter information about this JApplet. 
     * Returns information about the parameters than are understood by this JApplet.
     * An applet should override this method to return an array of Strings 
     * describing these parameters. 
     * Each element of the array should be a set of three Strings containing 
     * the name, the type, and a description.
     *
     * @return a String[] representation of parameter information about this JApplet
     */
    public String[][] getParameterInfo()
    {
        // provide parameter information about the applet
        String paramInfo[][] = {
                {"firstParameter",    "1-10",    "description of first parameter"},
                {"status", "boolean", "description of second parameter"},
                {"images",   "url",     "description of third parameter"}
            };
        return paramInfo;
    }
}
