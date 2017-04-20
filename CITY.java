
/**
 * gives a reference for each city at an x/y coordinate. this will be used so that if
 * you hover over the city it will display the name. this is functionaility that
 * will need to be implemented later. there may be other uses for this enum.
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum CITY
{   
    ONTARIO(94,64),
    BUFFALO(396,65),
    ERIE(171,198),
    YOUNGSTOWN(65,390),
    OILCITY(230,355),
    WARREN(318,261),
    DUBOIS(386,419),
    ALTOONA(447,535),
    PITTSBURGH(177,560),
    WHEELING(77,638),
    MORGANTOWN(193,745),
    JOHNSTOWN(382,582),
    CUMBERLAND(450,740),
    ROCHESTER(643,67),
    SYRACUSE(851,69),
    WILLIAMSPORT(669,390),
    TOWANDA(768,281),
    COUDERSPORT(512,264),
    LEWISTON(587,521),
    CHAMBERSBURG(569,663),
    GETTYSBURG(649,691),
    BALTIMORE(808,741),
    YORK(729,663),
    LANCASTER(800,641),
    ALLENTOWN(926,521),
    PHILADELPHIA(1004,671),
    ATLANTICCITY(1140,684),
    ALBANY(1143,96),
    BINGHAMTON(877,198),
    ELMIRA(700,201),
    SCRANTONWILKESBARRE(906,358),
    NEWYORK(1141,395),
    STROUDSBURG(1015,415),
    READING(819,571),
    HARRISBURG(694,584),
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
