//
//Simulation
//
//This class represents the simulation of a TollPlaza.
//
//Author:	Nekesa Mercy
//date:		11/2/15
//

package lab5Package;

public class Simulation
{
// attributes
	// attributes
	private TollPlaza thePlaza;			// the plaza to simulate
	private final int PAYCAR = 1;		// keyboard input representing a paying car
	private final int NOPAYCAR = 2;		// keyboard input representing a non-paying car
	private final int EXITSIMULATION = -1;	// keyboard input representing end of simulation
	

//
//	Simulation
//
//	the purpose of this method is to initialize all attributes.
//
//	Input:	 	none
//	Return:		none
//

public Simulation(int num )
{
	thePlaza = new TollPlaza(num );
	
} // end Simulation constructor

//
//	setThePlaza
//
//	the purpose of this method is to modify thePlaz attribute
//
//	Input:		b		the new tollPlaza
//	Return:		none
//
public void setTheBooth(TollPlaza b)
{
	thePlaza = b;
}// end setTheBooth

//
//	getThePlaza
//
//	the purpose of this method is to return a copy of thePlaza attribute
//
//	Input:	none
//	Return:	thePlaza
//
public TollPlaza getThePlaza()
{
	return(thePlaza);
}// end getTheBooth

//
//	printData
//
//	the purpose of this method is to print out the non-constant attributes
//
//	Input:	none
//	Return:	none
//

public void printData()
{
	thePlaza.printData();
}// end printData


//
//	inputValidCarType
//
//	the purpose of this method is to input a valid car type
//
//	Input:	none
//	Return:	validCarType		the valid car type
//
public int inputValidCarType( ){
	//declare variables 
	int validCarType;
	
	//initialize variable 
	validCarType = 0;
	
	//prompt the user to input the valid car type
	do{	
		//print a menu of options 
		System.out.println("Enter 1 for a paying car, 2 for a non paying car and -1 to exit the simulation");
		
		//prompt the user to enter the car type 
		validCarType = MyUtilityClass.inputInteger("Enter your car type");
		
		if((validCarType > NOPAYCAR)||( validCarType < EXITSIMULATION)||(validCarType == 0)){
		
			System.out.println("Error, invalid input for car type " + validCarType);
			
		}// end if
		
	}while((validCarType > NOPAYCAR)||(validCarType < EXITSIMULATION)||(validCarType == 0));
	
	return(validCarType);
}// end inputValidCarType

//
// inputValidBoothNumber
//
// the purpose of this method is to input a valid booth number
//
// Input:	none
// Return:	bthNumber		the valid booth number
//
public int inputValidBoothNumber() {
	//declare variables 
	int bthNumber;					// the number of the booth
	int numBooths;
	
	//initialize variables 
	bthNumber = 0;
	numBooths = 0;
	
	//get the number of booths 
	numBooths = thePlaza.getNumBooths();
	
	//prompt for the valid booth number 
	do{
		//prompt to enter the booth number 
		bthNumber = MyUtilityClass.inputInteger("Enter the booth number ");
				
		if((bthNumber < 0)&&(bthNumber >= numBooths)){
			
			System.out.println("Error, invalid number for booth " + bthNumber);
			
		}// end else 
		
	}while((bthNumber >= numBooths)&&(bthNumber < 0));
	
	return(bthNumber);
}// end inputValidBoothNumber 


//	runSimulation
//
//	The purpose of this method is to run the simulation of the tollPlaza
//
//	Input:	none
//	REturn:	none
//
public void runSimulation( )
{
	// add some local variables
	int carType;
	int boothNum;
	
	// initialize the local variables
	carType = 0;
	boothNum = 0;
	
	// loop until the user enters a negative number
	do
	{
		// input a valid car type
		carType = inputValidCarType();
		
		// if the user did not request to exit the simulation then continue
		if (carType != EXITSIMULATION)
		{
			// input a valid booth number
			boothNum = inputValidBoothNumber();
			
			// the user entered a 1 for a paying car, then handle the paying car
			if (carType == PAYCAR)
			{
				thePlaza.handlePayCar(boothNum);
			}// end if 
			else
			{
				thePlaza.handleNoPayCar(boothNum);
			}// end else 				
		}// end if 

	}while(carType != EXITSIMULATION);

	// print out the tollPlaza results
	thePlaza.printData();
	
}// end runSimulation


}// end Simulation class