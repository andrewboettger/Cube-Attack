// The "FinalProject" class.
import java.awt.*;
//Imports abstract windows toolkit


import hsa.Console;
//Allows consoles to be created
import java.awt.event.*;
//Allows keypress code to run

public class FinalProject extends Console implements KeyListener
    //allows class name to be console; adds a keylistener to check for keypresses
{
    public static Console c;
    public static Console m;
    // The output consoles

    public static int posXMain, posYmain, posX2Main, posY2Main;

    public static int posYMain = 570;
    public static int posX, posY, posX2, posY2;
    public static int posXTwo, posYTwo, posX2Two, posY2Two;
    public static int posXThree, posYThree, posX2Three, posY2Three;
    public static int posXFour, posYFour, posX2Four, posY2Four;
    public static int posXFive, posYFive, posX2Five, posY2Five;
    public static int posXSix, posYSix, posX2Six, posY2Six;
    public static int posXSeven, posYSeven, posX2Seven, posY2Seven;
    public static int posXEight, posYEight, posX2Eight, posY2Eight;
    public static int posXNine, posYNine, posX2Nine, posY2Nine;
    public static int posXTen, posYTen, posX2Ten, posY2Ten;
    public static int posXEleven, posYEleven, posX2Eleven, posY2Eleven;
    public static int posXTwelve, posYTwelve, posX2Twelve, posY2Twelve;
    public static int posXThirteen, posYThirteen, posX2Thirteen, posY2Thirteen;
    public static int posXFourteen, posYFourteen, posX2Fourteen, posY2Fourteen;
    public static int posXFifteen, posYFifteen, posX2Fifteen, posY2Fifteen;
    //Creates global variables to store the value of the x and y positions of various objects


    public static boolean health;
    //Variable used to identify collision

    public static int score = 0;
    //Variable to keep score

    public static String userName, keyEntered;
    public static String productKey = "Password";
    //Creates variables to store user inputs




    public static boolean left, right;
    //Allows movement of character

    public static boolean start;
    //Variable to start the program

    //public static int counterLeft = 0;
    //public static int counterRight, counterUp, counterDown;


    public FinalProject (int width, int height)
	//Final project method
    {
	super (height, width);
	//creates a console with the dimensions previously defined







	first ();
	//Calls the method "first"



    }


    public static void main (String[] args)
	//Main method
    {

	new FinalProject (120, 30);
	//creates a new console






    }


    public void second ()
	//Second method
    {


	setColor (Color.black);
	fillRect (0, 0, 3000, 3000);
	//Creates a very big black square as the background






	posXMain = 480;
	posYMain = 570;
	posX2Main = 480;
	posY2Main = 570;
	//Defines the start position of the character
















	posX = 60;
	posXTwo = 120;
	posXThree = 180;
	posXFour = 240;
	posXFive = 300;
	posXSix = 360;
	posXSeven = 420;
	posXEight = 480;
	posXNine = 540;
	posXTen = 600;
	posXEleven = 660;
	posXTwelve = 720;
	posXThirteen = 780;
	posXFourteen = 840;
	posXFifteen = 900;
	//Aligns the falling cubes to a column based on the number given

	posX2 = posX;
	posX2Two = posXTwo;
	posX2Three = posXThree;
	posX2Four = posXFour;
	posX2Five = posXFive;
	posX2Six = posXSix;
	posX2Seven = posXSeven;
	posX2Eight = posXEight;
	posX2Nine = posXNine;
	posX2Ten = posXTen;
	posX2Eleven = posXEleven;
	posX2Twelve = posXTwelve;
	posX2Thirteen = posXThirteen;
	posX2Fourteen = posXFourteen;
	posX2Fifteen = posXFifteen;
	//Makes sure the secondary cube is aligned with the first cube

	//I added a seconary cube, one unit thick, behind the primary for all 15 cubes to give the illusion of a falling cube
	//Otherwise it would just draw a line down the console




	posY = (int) (Math.random () * 400 + 1);
	posYTwo = (int) (Math.random () * 400 + 1);
	posYThree = (int) (Math.random () * 400 + 1);
	posYFour = (int) (Math.random () * 400 + 1);
	posYFive = (int) (Math.random () * 400 + 1);
	posYSix = (int) (Math.random () * 400 + 1);
	posYSeven = (int) (Math.random () * 40 + 1);
	posYEight = (int) (Math.random () * 400 + 1);
	posYNine = (int) (Math.random () * 400 + 1);
	posYTen = (int) (Math.random () * 400 + 1);
	posYEleven = (int) (Math.random () * 400 + 1);
	posYTwelve = (int) (Math.random () * 400 + 1);
	posYThirteen = (int) (Math.random () * 400 + 1);
	posYFourteen = (int) (Math.random () * 400 + 1);
	posYFifteen = (int) (Math.random () * 400 + 1);

	//Assigns a random value between 1 and 400 to the y coordinate variable of the cubes; staggers them


	posY = posY - 400;
	posYTwo = posYTwo - 400;
	posYThree = posYThree - 400;
	posYFour = posYFour - 400;
	posYFive = posYFive - 400;
	posYSix = posYSix - 400;
	posYSeven = posYSeven - 400;
	posYEight = posYEight - 400;
	posYNine = posYNine - 400;
	posYTen = posYTen - 400;
	posYEleven = posYEleven - 400;
	posYTwelve = posYTwelve - 400;
	posYThirteen = posYThirteen - 400;
	posYFourteen = posYFourteen - 400;
	posYFifteen = posYFifteen - 400;

	//Moves the new values up 400 so that they start off the screen.

	posY2 = posY - 1;
	posY2Two = posYTwo - 1;
	posY2Three = posYThree - 1;
	posY2Four = posYFour - 1;
	posY2Five = posYFive - 1;
	posY2Six = posYSix - 1;
	posY2Seven = posYSeven - 1;
	posY2Eight = posYEight - 1;
	posY2Nine = posYNine - 1;
	posY2Ten = posYTen - 1;
	posY2Eleven = posYEleven - 1;
	posY2Twelve = posYTwelve - 1;
	posY2Thirteen = posYThirteen - 1;
	posY2Fourteen = posYFourteen - 1;
	posY2Fifteen = posYFifteen - 1;
	//Offsets the secondary cubes by 1 since it's only 1 unit thick



	do
	{
	    //Start of a loop




	    try
	    {
		//Try statements allow the code to run in the case of an exception



		Thread.sleep (7);
		//Pauses the program for 7 milliseconds

	    }


	    catch (Exception e)
	    {
	    }
	    //What will happen if an exception occurs; nothing

	    m.setColor (Color.black);
	    m.fillRect (0, 0, 3000, 3000);
	    //Creates a big square to cover everything previously drawn on the console



	    if (posXMain <= 0)
	    {

		right = true;
		left = false;

	    }
	    else if (posXMain >= 960)
	    {

		left = true;
		right = false;

	    }
	    //if the character moves outside of the window boundaries it will bounce back in
	    //the opposite direction



	    if (left == true)
		//If left is true, governed by a method below, this code will execute
		{

		    right = false;
		    //right becomes false to avoid freezing
		    posX2Main = posXMain + 30;
		    //Secondary cube placed one unit to the right of the width of the main block
		    // Allows for smooth graphics

		    posXMain--;
		    posX2Main--;
		    //both cubes move one unit left


		    setColor (Color.black);
		    fillRect (posX2Main, posY2Main, 1, 30);
		    setColor (Color.white);
		    fillRect (posXMain, posYMain, 30, 30);
		    //Draws the main and secondary cube


		}


	    else if (right == true)
	    {

		left = false;
		posX2Main = posXMain - 1;
		posXMain++;
		posX2Main++;
		setColor (Color.black);
		fillRect (posX2Main, posY2Main, 1, 30);
		setColor (Color.white);
		fillRect (posXMain, posYMain, 30, 30);


	    }
	    //The same as above, only everything is reversed




	    setColor (Color.black);
	    //Sets the colour of things being drawn to black
	    posY2++;
	    //Moves the secondary y coordinate down 1
	    fillRect (posX2, posY2, 30, 1);
	    //Creates a box 30 by 1 units
	    setColor (Color.white);
	    //Sets the colour of things being drawn to white
	    posY++;
	    //Moves the primary y coordinate down 1
	    fillRect (posX, posY, 30, 30);
	    //Creates a box 30 by 30 units






	    if (posY >= 540 && posY <= 570)
	    {
		//If the y position of the falling cube (considering height of cube) is
		//anywhere between the height of the main character, the next code will execute



		if (posXMain >= 30 && posXMain <= 90)
		{
		    //if the main cube is anywhere in the path of the falling cube, the next
		    //code will execute

		    health = false;
		    //health is the coniditon for collision, if it is false the
		    //loop will end


		    break;
		    //exits all loops
		}
	    }

	    if (posY >= 600)

		{
		    posY = 0;
		    posY = posY - 30;
		    posY2 = posY - 1;
		}
	    //If the y coordinate of the falling cube reaches the bottom of the console it is brought back to
	    //the top. Simulates a constant flow of cubes


	    //The next bit of code is all the same, but for the remaining fourteen cubes

	    setColor (Color.black);
	    posY2Two++;
	    fillRect (posX2Two, posY2Two, 30, 1);
	    setColor (Color.white);
	    posYTwo++;
	    fillRect (posXTwo, posYTwo, 30, 30);

	    if (posYTwo + 30 >= 570 && posYTwo <= 570 + 60)
	    {

		if (posXMain >= 90 && posXMain <= 150)
		{

		    health = false;

		    break;
		}
	    }

	    if (posYTwo >= 600)
	    {
		posYTwo = 0;
		posYTwo = posYTwo - 30;
		posY2Two = posYTwo - 1;
	    }


	    setColor (Color.black);
	    posY2Three++;
	    fillRect (posX2Three, posY2Three, 30, 1);
	    setColor (Color.white);
	    posYThree++;
	    fillRect (posXThree, posYThree, 30, 30);

	    if (posYThree + 30 >= 570 && posYThree <= 570 + 60)
	    {
		if (posXMain >= 150 && posXMain <= 210)
		{
		    health = false;
		    break;
		}
	    }

	    if (posYThree >= 600)
	    {
		posYThree = 0;
		posYThree = posYThree - 30;
		posY2Three = posYThree - 1;
	    }


	    setColor (Color.black);
	    posY2Four++;
	    fillRect (posX2Four, posY2Four, 30, 1);
	    setColor (Color.white);
	    posYFour++;
	    fillRect (posXFour, posYFour, 30, 30);

	    if (posYFour + 30 >= 570 && posYFour <= 570 + 60)
	    {
		if (posXMain >= 210 && posXMain <= 270)
		{
		    health = false;
		    break;
		}
	    }

	    if (posYFour >= 600)
	    {
		posYFour = 0;
		posYFour = posYFour - 30;
		posY2Four = posYFour - 1;
	    }


	    setColor (Color.black);
	    posY2Five++;
	    fillRect (posX2Five, posY2Five, 30, 1);
	    setColor (Color.white);
	    posYFive++;
	    fillRect (posXFive, posYFive, 30, 30);

	    if (posYFive + 30 >= 570 && posYFive <= 570 + 60)
	    {
		if (posXMain >= 270 && posXMain <= 330)
		{
		    health = false;
		    break;
		}
	    }

	    if (posYFive >= 600)
	    {
		posYFive = 0;
		posYFive = posYFive - 30;
		posY2Five = posYFive - 1;
	    }


	    setColor (Color.black);
	    posY2Six++;
	    fillRect (posX2Six, posY2Six, 30, 1);
	    setColor (Color.white);
	    posYSix++;
	    fillRect (posXSix, posYSix, 30, 30);

	    if (posYSix + 30 >= 570 && posYSix <= 570 + 60)
	    {
		if (posXMain >= 330 && posXMain <= 390)
		{
		    health = false;
		    break;
		}
	    }

	    if (posYSix >= 600)
	    {
		posYSix = 0;
		posYSix = posYSix - 30;
		posY2Six = posYSix - 1;
	    }


	    setColor (Color.black);
	    posY2Seven++;
	    fillRect (posX2Seven, posY2Seven, 30, 1);
	    setColor (Color.white);
	    posYSeven++;
	    fillRect (posXSeven, posYSeven, 30, 30);

	    if (posYSeven + 30 >= 570 && posYSeven <= 570 + 60)
	    {
		if (posXMain >= 390 && posXMain <= 450)
		{
		    health = false;
		    break;
		}
	    }

	    if (posYSeven >= 600)
	    {
		posYSeven = 0;
		posYSeven = posYSeven - 30;
		posY2Seven = posYSeven - 1;
	    }


	    setColor (Color.black);
	    posY2Eight++;
	    fillRect (posX2Eight, posY2Eight, 30, 1);
	    setColor (Color.white);
	    posYEight++;
	    fillRect (posXEight, posYEight, 30, 30);

	    if (posYEight + 30 >= 570 && posYEight <= 570 + 60)
	    {
		if (posXMain >= 450 && posXMain <= 510)
		{
		    health = false;
		    break;
		}
	    }

	    if (posYEight >= 600)
	    {
		posYEight = 0;
		posYEight = posYEight - 30;
		posY2Eight = posYEight - 1;
	    }


	    setColor (Color.black);
	    posY2Nine++;
	    fillRect (posX2Nine, posY2Nine, 30, 1);
	    setColor (Color.white);
	    posYNine++;
	    fillRect (posXNine, posYNine, 30, 30);

	    if (posYNine + 30 >= 570 && posYNine <= 570 + 60)
	    {
		if (posXMain >= 510 && posXMain <= 570)
		{
		    health = false;
		    break;
		}
	    }

	    if (posYNine >= 600)
	    {
		posYNine = 0;
		posYNine = posYNine - 30;
		posY2Nine = posYNine - 1;
	    }


	    setColor (Color.black);
	    posY2Ten++;
	    fillRect (posX2Ten, posY2Ten, 30, 1);
	    setColor (Color.white);
	    posYTen++;
	    fillRect (posXTen, posYTen, 30, 30);

	    if (posYTen + 30 >= 570 && posYTen <= 570 + 60)
	    {
		if (posXMain >= 570 && posXMain <= 630)
		{
		    health = false;
		    break;
		}
	    }

	    if (posYTen >= 600)
	    {
		posYTen = 0;
		posYTen = posYTen - 30;
		posY2Ten = posYTen - 1;
	    }


	    setColor (Color.black);
	    posY2Eleven++;
	    fillRect (posX2Eleven, posY2Eleven, 30, 1);
	    setColor (Color.white);
	    posYEleven++;
	    fillRect (posXEleven, posYEleven, 30, 30);

	    if (posYEleven + 30 >= 570 && posYEleven <= 570 + 60)
	    {
		if (posXMain >= 630 && posXMain <= 690)
		{
		    health = false;
		    break;
		}
	    }

	    if (posYEleven >= 600)
	    {
		posYEleven = 0;
		posYEleven = posYEleven - 30;
		posY2Eleven = posYEleven - 1;
	    }


	    setColor (Color.black);
	    posY2Twelve++;
	    fillRect (posX2Twelve, posY2Twelve, 30, 1);
	    setColor (Color.white);
	    posYTwelve++;
	    fillRect (posXTwelve, posYTwelve, 30, 30);

	    if (posYTwelve + 30 >= 570 && posYTwelve <= 570 + 60)
	    {
		if (posXMain >= 690 && posXMain <= 750)
		{
		    health = false;
		    break;
		}
	    }

	    if (posYTwelve >= 600)
	    {
		posYTwelve = 0;
		posYTwelve = posYTwelve - 30;
		posY2Twelve = posYTwelve - 1;
	    }


	    setColor (Color.black);
	    posY2Thirteen++;
	    fillRect (posX2Thirteen, posY2Thirteen, 30, 1);
	    setColor (Color.white);
	    posYThirteen++;
	    fillRect (posXThirteen, posYThirteen, 30, 30);

	    if (posYThirteen + 30 >= 570 && posYThirteen <= 570 + 60)
	    {
		if (posXMain >= 750 && posXMain <= 810)
		{
		    health = false;
		    break;
		}
	    }

	    if (posYThirteen >= 600)
	    {
		posYThirteen = 0;
		posYThirteen = posYThirteen - 30;
		posY2Thirteen = posYThirteen - 1;
	    }


	    setColor (Color.black);
	    posY2Fourteen++;
	    fillRect (posX2Fourteen, posY2Fourteen, 30, 1);
	    setColor (Color.white);
	    posYFourteen++;
	    fillRect (posXFourteen, posYFourteen, 30, 30);

	    if (posYFourteen + 30 >= 570 && posYFourteen <= 570 + 60)
	    {
		if (posXMain >= 810 && posXMain <= 870)
		{
		    health = false;
		    break;
		}
	    }

	    if (posYFourteen >= 600)
	    {
		posYFourteen = 0;
		posYFourteen = posYFourteen - 30;
		posY2Fourteen = posYFourteen - 1;
	    }


	    setColor (Color.black);
	    posY2Fifteen++;
	    fillRect (posX2Fifteen, posY2Fifteen, 30, 1);
	    setColor (Color.white);
	    posYFifteen++;
	    fillRect (posXFifteen, posYFifteen, 30, 30);

	    if (posYFifteen + 30 >= 570 && posYFifteen <= 570 + 60)
	    {
		if (posXMain >= 870 && posXMain <= 930)
		{
		    health = false;
		    break;
		}
	    }

	    if (posYFifteen >= 600)
	    {
		posYFifteen = 0;
		posYFifteen = posYFifteen - 30;
		posY2Fifteen = posYFifteen - 1;
	    }










	    //}
	    setColor (Color.black);
	    fillRect (12, 28, 160, 30);
	    //Draws a black rectangle to cover up the spot of the previous white rectangle
	    setColor (Color.white);
	    fillRect (12, 28, 160, 30);
	    //Draws a white rectangle for text to be placed on
	    setColor (Color.black);

	    drawString (userName + "'s Score: " + score, 20, 40);
	    //Prints the user's entered name and the current score









	    score++;
	    //Adds one to the score every iteration of the loop

	}


	while (health == true)
	    ;
	//will loop while health is true, which is the collision condition








    }







    public void first ()
    {
	//The first method




	m = new Console (10, 40, 40);
	//creates a new console


	//while (true)
	//{

	try
	{

	    m.setColor (Color.black);


	    m.fillRect (0, 0, 3000, 3000);

	    //Creates a black background
	    m.setColor (Color.white);

	    m.setTextColor (Color.white);
	    m.setTextBackgroundColor (Color.black);
	    m.print ("\t\tCUBE ATTACK");
	    //Prints the text in quotes

	    Thread.sleep (2000);
	    //Pauses for 2 seconds
	    m.clear ();
	    //Clears the consle

	}


	catch (Exception e)
	{
	}
	//The reason I keep on drawing black backgrounds and setting all these colours is because
	//I'm clearing the screen so the text will print at the top every time
	
	//The other method which contains the falling blocks doesn't clear because at the rate at which it's clearing it 
	//would create a flicker so instead I made secondary cubes

	m.setColor (Color.black);
	m.fillRect (0, 0, 3000, 3000);
	m.setColor (Color.white);
	m.print ("Welcome");
	m.print ("\nEnter your name\n");
	userName = m.readString ();
	//Prompts the user for a name

	clear ();
	//Clears the screen


	m.setColor (Color.black);
	m.fillRect (0, 0, 3000, 3000);
	m.setColor (Color.white);
	m.print ("Welcome " + userName);
	//Welcomes the user


	try
	{


	    Thread.sleep (2000);
	    //timer (2000 ms)


	}


	catch (Exception e)
	{
	}


	clear ();
	m.setColor (Color.black);
	m.fillRect (0, 0, 3000, 3000);
	m.setColor (Color.white);
	m.print ("\nPlease enter the product key\n");
	keyEntered = m.readString ();
	//Prompts the user for the product key (which is "Password", case sensetive)

	if (keyEntered.equals (productKey))
	{
	}
	//If the entered key is the same as the product key defined earlier, it will keep on going


	else
	{
	//otherwise it asks them for it again
	    do
	    {
		clear ();
		m.setColor (Color.black);
		m.fillRect (0, 0, 3000, 3000);
		m.setColor (Color.white);
		m.print ("Incorrect product key. \nPlease enter the product key\n");
		//Prints the line in quotes
		keyEntered = m.readString ();
		//Asks them for the product key
		if (keyEntered.equals (productKey))
		//If the key entered is the correct key it will continue to execute the code
		{
		    break;
		}

	    }
	    while (!keyEntered.equals (productKey));
	    //will loop as long as the password is incorrect
	}

	clear ();
	m.setColor (Color.black);
	m.fillRect (0, 0, 3000, 3000);
	m.setColor (Color.white);
	m.print ("Product key confirmed");
	//Tells user the line in quotes

	m.clear ();
	m.setColor (Color.black);
	m.fillRect (0, 0, 3000, 3000);
	m.setColor (Color.white);
	m.print ("\nCube attack is a game where falling \nblocks spawn randomly. You must avoid \nthem by using the 'A' and 'D' keys. \nYour score accumulates the longer \nyou survive.");
	//Gives the game instructions


	try
	{
	    Thread.sleep (5000);
	    //waits five seconds
	}
	catch (Exception e)
	{
	}



	m.clear ();
	m.setColor (Color.black);
	m.fillRect (0, 0, 3000, 3000);
	m.setColor (Color.white);

	m.print ("\nPlease mimimize this window to play \nCube Attack\nYour game will start in 5 seconds");
	//Prints line in quotes






	try
	{
	    Thread.sleep (1000);
	    clear ();
	    setColor (Color.black);
	    fillRect (0, 0, 3000, 3000);
	    setTextColor (Color.white);
	    setTextBackgroundColor (Color.black);
	    print ("\n\n\n\n\n\n\t\t\t\t\t\t\tStarting in 5");
	    //Prints the line in quotes after waiting 1000 ms



	}
	catch (Exception e)
	{
	}



	try
	{
	    Thread.sleep (1000);
	    clear ();
	    setColor (Color.black);
	    fillRect (0, 0, 3000, 3000);
	    setTextColor (Color.white);
	    setTextBackgroundColor (Color.black);
	    print ("\n\n\n\n\n\n\t\t\t\t\t\t\tStarting in 4");
	    //Prints the line in quotes after waiting 1000 ms



	}
	catch (Exception e)
	{
	}

	try
	{
	    Thread.sleep (1000);
	    clear ();
	    setColor (Color.black);
	    fillRect (0, 0, 3000, 3000);
	    setTextColor (Color.white);
	    setTextBackgroundColor (Color.black);
	    print ("\n\n\n\n\n\n\t\t\t\t\t\t\tStarting in 3");
	    //Prints the line in quotes after waiting 1000 ms

	}
	catch (Exception e)
	{
	}


	try
	{
	    Thread.sleep (1000);
	    clear ();
	    setColor (Color.black);
	    fillRect (0, 0, 3000, 3000);
	    setTextColor (Color.white);
	    setTextBackgroundColor (Color.black);
	    print ("\n\n\n\n\n\n\t\t\t\t\t\t\tStarting in 2");
	    //Prints the line in quotes after waiting 1000 ms

	}
	catch (Exception e)
	{
	}

	try
	{
	    Thread.sleep (1000);
	    clear ();
	    setColor (Color.black);
	    fillRect (0, 0, 3000, 3000);
	    setTextColor (Color.white);
	    setTextBackgroundColor (Color.black);
	    print ("\n\n\n\n\n\n\t\t\t\t\t\t\tStarting in 1");
	    //Prints the line in quotes after waiting 1000 ms

	}


	catch (Exception e)
	{
	}


	try
	{
	    Thread.sleep (1000);
	    clear ();
	    setColor (Color.black);
	    fillRect (0, 0, 3000, 3000);
	    setTextColor (Color.white);
	    setTextBackgroundColor (Color.black);
	    print ("\n\n\n\n\n\n\t\t\t\t\t\t\tStart!");
	    //Prints the line in quotes after waiting 1000 ms

	}


	catch (Exception e)
	{

	}


	try
	{
	    Thread.sleep (1000);

	    clear ();
	}


	catch (Exception e)
	{

	}





	health = true;
	//makes health true



	second ();
	//Calls the second method
	
	clear ();
	m.setColor (Color.black);


	m.fillRect (0, 0, 3000, 3000);
	setTextColor (Color.white);

	println ("\n\n\n\n\n\t\t\t\t\t\tGame Over");
	println ("\n\t\t\t\t\t\tYour score was " + score);
	//Prints the line in quotes plus the users score



    }







    


    public void keyPressed (KeyEvent e)
    {
	





	if (e.getKeyCode () == KeyEvent.VK_A)
	{
	    
	    left = true;
	    right = false;
	    
	    //If the "A" key is pressed, left becomes true 
	    //and right becomes false


	}


	if (e.getKeyCode () == KeyEvent.VK_D)
	{

	    right = true;
	    left = false;
	    
	    //If the "D" key is pressed, right becomes true
	    //and left becomes false
	    
	    //These conditions are used in the second method.



	}



    }




} // FinalProject class


