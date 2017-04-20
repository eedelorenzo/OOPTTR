
/**
 * these are the possible route cards, with their images and point values taken into account
 * they store references to cities that can be referenced via other enums
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum ROUTES
{
    TOWANDALANCASTER(CITY.TOWANDA ,CITY.LANCASTER,9,
    "TicketToRidePics/Pics/Routes/routes1.jpg"),
    MORGANTOWNWILLIAMSPORT(CITY.MORGANTOWN ,CITY.WILLIAMSPORT,13,
    "TicketToRidePics/Pics/Routes/routes2.jpg"),
    WHEELINGERIE(CITY.WHEELING ,CITY.ERIE,9,
    "TicketToRidePics/Pics/Routes/routes3.jpg"),
    WHEELINGALLENTOWN(CITY.WHEELING ,CITY.ALLENTOWN,15,
    "TicketToRidePics/Pics/Routes/routes4.jpg"),
    HARRISBURGNEWYORK(CITY.HARRISBURG ,CITY.NEWYORK,11,
    "TicketToRidePics/Pics/Routes/routes5.jpg"),
    ALTOONABINGHAMTON(CITY.ALTOONA ,CITY.BINGHAMTON,9,
    "TicketToRidePics/Pics/Routes/routes6.jpg"),
    LEWISTONSYRACUSE(CITY.LEWISTON ,CITY.SYRACUSE,9,
    "TicketToRidePics/Pics/Routes/routes7.jpg"),
    BALTIMOREALBANY(CITY.BALTIMORE ,CITY.ALBANY,16,
    "TicketToRidePics/Pics/Routes/routes8.jpg"),
    HARRISBURGPHILADELPHIA(CITY.HARRISBURG ,CITY.PHILADELPHIA,6,
    "TicketToRidePics/Pics/Routes/routes9.jpg"),
    SCRANTONWILKESBARREALLENTOWN(CITY.SCRANTONWILKESBARRE ,CITY.ALLENTOWN,3,
    "TicketToRidePics/Pics/Routes/routes10.jpg"),
    
    ROCHESTERELMIRA(CITY.ROCHESTER ,CITY.ELMIRA,3,
    "TicketToRidePics/Pics/Routes/routes11.jpg"),
    ERIEALBNY(CITY.ERIE ,CITY.ALBANY,20,
    "TicketToRidePics/Pics/Routes/routes12.jpg"),
    SYRACUSEALLENTOWN(CITY.SYRACUSE ,CITY.ALLENTOWN,8,
    "TicketToRidePics/Pics/Routes/routes13.jpg"),
    ERIEALTOONA(CITY.ERIE ,CITY.ALTOONA,8,
    "TicketToRidePics/Pics/Routes/routes14.jpg"),
    MORGANTOWNCHAMBERSBURG(CITY.MORGANTOWN ,CITY.CHAMBERSBURG,7,
    "TicketToRidePics/Pics/Routes/routes15.jpg"),
    ONTARIOSYRACUSE(CITY.ONTARIO ,CITY.SYRACUSE,10,
    "TicketToRidePics/Pics/Routes/routes16.jpg"),
    ONTARIOWARREN(CITY.ONTARIO ,CITY.WARREN,5,
    "TicketToRidePics/Pics/Routes/routes17.jpg"),
    PHILADELIPHAATLANTICCITY(CITY.PHILADELPHIA ,CITY.ATLANTICCITY,2,
    "TicketToRidePics/Pics/Routes/routes18.jpg"),
    DUBOISCUMBERLAND(CITY.DUBOIS ,CITY.CUMBERLAND,6,
    "TicketToRidePics/Pics/Routes/routes19.jpg"),
    DUBOISSTROUDSBURG(CITY.DUBOIS ,CITY.STROUDSBURG,12,
    "TicketToRidePics/Pics/Routes/routes20.jpg"),
    
    BUFFALOHARRISBURG(CITY.BUFFALO ,CITY.HARRISBURG,13,
    "TicketToRidePics/Pics/Routes/routes21.jpg"),
    BUFFALOJOHNSTOWN(CITY.BUFFALO ,CITY.JOHNSTOWN,10,
    "TicketToRidePics/Pics/Routes/routes22.jpg"),
    BUFFALONEWYORK(CITY.BUFFALO ,CITY.NEWYORK,18,
    "TicketToRidePics/Pics/Routes/routes23.jpg"),
    BUFFALOPHILADELPHIA(CITY.BUFFALO ,CITY.PHILADELPHIA,19,
    "TicketToRidePics/Pics/Routes/routes24.jpg"),
    ONTARIOPITTSBURGH(CITY.ONTARIO ,CITY.PITTSBURGH,10,
    "TicketToRidePics/Pics/Routes/routes25.jpg"),
    CUMBERLANDHARRISBURG(CITY.CUMBERLAND ,CITY.HARRISBURG,4,
    "TicketToRidePics/Pics/Routes/routes26.jpg"),
    WILLIAMSPORTALBANY(CITY.WILLIAMSPORT ,CITY.ALBANY,10,
    "TicketToRidePics/Pics/Routes/routes27.jpg"),
    BALTIMORENEWYORK(CITY.BALTIMORE ,CITY.NEWYORK,10,
    "TicketToRidePics/Pics/Routes/routes28.jpg"),
    BALTIMOREPHILADELPHIA(CITY.BALTIMORE ,CITY.PHILADELPHIA,4,
    "TicketToRidePics/Pics/Routes/routes29.jpg"),
    BUFFALOBALTIMORE(CITY.BUFFALO ,CITY.BALTIMORE,16,
    "TicketToRidePics/Pics/Routes/routes30.jpg"),
    
    PITTSBURGHPHILADELPHIA(CITY.PITTSBURGH ,CITY.PHILADELPHIA,15,
    "TicketToRidePics/Pics/Routes/routes31.jpg"),
    WHEELINGALBANY(CITY.WHEELING ,CITY.ALBANY,22,
    "TicketToRidePics/Pics/Routes/routes32.jpg"),
    YOUNGSTOWNSCRANTONWILKESBARRE(CITY.YOUNGSTOWN ,CITY.SCRANTONWILKESBARRE,17,
    "TicketToRidePics/Pics/Routes/routes33.jpg"),
    CHAMBERSBURGSCRANTONWILKESBARRE(CITY.CHAMBERSBURG ,CITY.SCRANTONWILKESBARRE,8,
    "TicketToRidePics/Pics/Routes/routes34.jpg"),
    COUDERSPORTBINGHAMTON(CITY.COUDERSPORT ,CITY.BINGHAMTON,7,
    "TicketToRidePics/Pics/Routes/routes35.jpg"),
    WARRENYORK(CITY.WARREN ,CITY.YORK,10,
    "TicketToRidePics/Pics/Routes/routes36.jpg"),
    GETTYSBURGREADING(CITY.GETTYSBURG ,CITY.READING,3,
    "TicketToRidePics/Pics/Routes/routes37.jpg"),
    YOUNGSTOWNMORGANTOWN(CITY.YOUNGSTOWN ,CITY.MORGANTOWN,7,
    "TicketToRidePics/Pics/Routes/routes38.jpg"),
    JOHNSTOWNELMIRA(CITY.JOHNSTOWN ,CITY.ELMIRA,10,
    "TicketToRidePics/Pics/Routes/routes39.jpg"),
    ROCHESTERREADING(CITY.ROCHESTER ,CITY.READING,13,
    "TicketToRidePics/Pics/Routes/routes40.jpg"),
    
    PITTSBURGBUFFALO(CITY.PITTSBURGH,CITY.BUFFALO,10,
    "TicketToRidePics/Pics/Routes/routes41.jpg"),
    HARRISBURGBALTIMORE(CITY.HARRISBURG,CITY.BALTIMORE,3,
    "TicketToRidePics/Pics/Routes/routes42.jpg"),
    YOUNGSTOWNROCHESTER(CITY.YOUNGSTOWN ,CITY.ROCHESTER,14,
    "TicketToRidePics/Pics/Routes/routes43.jpg"),
    PITTSBURGHARRISBURG(CITY.PITTSBURGH ,CITY.HARRISBURG,9,
    "TicketToRidePics/Pics/Routes/routes44.jpg"),
    PITTSBURGHNEWYORK(CITY.PITTSBURGH ,CITY.NEWYORK,20,
    "TicketToRidePics/Pics/Routes/routes45.jpg"),
    NEWYOKATLANTICCITY(CITY.NEWYORK ,CITY.ATLANTICCITY,6,
    "TicketToRidePics/Pics/Routes/routes46.jpg"),
    OILCITYJOHNSTOWN(CITY.OILCITY,CITY.JOHNSTOWN,6,
    "TicketToRidePics/Pics/Routes/routes47.jpg"),
    OILCITYSCRANTONWILKESBARRE(CITY.OILCITY ,CITY.SCRANTONWILKESBARRE,14,
    "TicketToRidePics/Pics/Routes/routes48.jpg"),
    PHILADELPHIANEWYORK(CITY.PHILADELPHIA ,CITY.NEWYORK,6,
    "TicketToRidePics/Pics/Routes/routes49.jpg"),
    PITTSBURGHBALTIMORE(CITY.PITTSBURGH ,CITY.BALTIMORE,13,
    "TicketToRidePics/Pics/Routes/routes50.jpg"),
    ;
    
    public CITY city1;
    public CITY city2;
    public int points;
    public String imgId;
  
    ROUTES(CITY city1In, CITY city2In, int pointsIn,String imgIdIn){
        this.city1 = city1In;
        this.city2 = city2In;
        this.points = pointsIn;
        this.imgId = imgIdIn;
    }
}
