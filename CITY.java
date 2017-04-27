
/**
 * gives a reference for each city at an x/y coordinate. this will be used so that if
 * you hover over the city it will display the name. this is functionaility that
 * will need to be implemented later. there may be other uses for this enum.
 * 
 * @author Leo Dohmann  
 * @author Luke McKenna
 * @author Emily DeLorenzo
 * @author Matt LaNeve
 * @author Edwin Svraka
 * @version 5/1/17
 */
public enum CITY
{   
    ONTARIO(69,48),
    BUFFALO(298,50),
    ERIE(128,148),
    YOUNGSTOWN(51,293),
    OILCITY(172,265),
    WARREN(239,195),
    DUBOIS(290,315),
    ALTOONA(335,401),
    PITTSBURGH(132,420),
    WHEELING(57,478),
    MORGANTOWN(144,560),
    JOHNSTOWN(285,436),
    CUMBERLAND(337,555),
    ROCHESTER(484,50),
    SYRACUSE(638,50),
    WILLIAMSPORT(502,292),
    TOWANDA(577,210),
    COUDERSPORT(385,197),
    LEWISTON(438,391),
    CHAMBERSBURG(423,498),
    GETTYSBURG(483,520),
    BALTIMORE(604,557),
    YORK(544,496),
    LANCASTER(599,487),
    ALLENTOWN(695,390),
    PHILADELPHIA(754,502),
    ATLANTICCITY(853,514),
    ALBANY(857,74),
    BINGHAMTON(656,148),
    ELMIRA(523,151),
    SCRANTONWILKESBARRE(679,268),
    NEWYORK(857,297),
    STROUDSBURG(757,331),
    READING(615,425),
    HARRISBURG(522,439),
    ;
    
    public int xCord;
    public int yCord;
    
    /**
     * Enum constructor passing in an X coordinate 
     * and Y coordinate for each city
     */
    CITY(int xCord, int yCord){
        this.xCord = xCord;
        this.yCord = yCord;
    }
}
