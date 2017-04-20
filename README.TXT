------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:


so gang, things we are going to need in the applet itself

a pop up window at the beginning of the run that asks for an amount of users between 2 and 5
    each user should then select a color from the list of available colors

a list of functions that will allow us to fully use the following extension and implementation
    extends Applet implements MouseListener, 
    MouseWheelListener, ActionListener, MouseMotionListener 

function to check if any of the users route cards have been fulfilled

function to draw the current number of cards that a player has of each ticket color
    also, a function to show all the routes that a player currently has
    
function to draw the filled in path of any path that has been claimed by a player

function to draw all of the stock decks, and display how many of each is left

function to draw the ticket deck and the color train cards that are available to be picked
    within this function, a function to put a new card on the board when one has been picked
    
function to draw all the peripherals such as
    player 1: score
    player 2: score, etc
    display current players information: routes, tickets, etc
    
function to show a cities name when hovered over

function to show the start screen
    image provided for start screen, needs an overlay of the start button
    resize as you see fit
    once the start button is clicked, the player is prompted by the pop up screen 
        that i spoke of earlier asking for player number and colors

functions to draw any changes made, like scores, current player , etc

function to end turn and move to next player in the cycle

tons of mouse listeners for clicks of tickets, stocks, everything
    if the end turn is created via a button, this includes a listener for that
    repaint functions any time a color train ticket is selected to move a new one
    all stuff like that
    
    mouse move functions as well. these would help with displaying city names when hovered over