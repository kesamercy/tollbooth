//
// TollBoothClass
//
// This class represents one TollBooth on a highway.
//
// Author:	Nekesa Mercy
// date:		11/1/16
//
package lab5Package;

public class TollBoothClass
{
// attributes
private int totalCars;				// the total number of cars passing through the booth
private int numPayCars;				// the total number of cars that pay the toll
private int numNoPayCars;			// the total number of cars that do not pay the toll
private double totalMoney;			// the total money collected
private static final double TOLL = 0.50;	// the toll collected at the booth

//
//	TollboothClass
//
//	the purpose of this method is to initialize all attributes in the class.
//
//	Input:	none
//	Return:	none
//
public TollBoothClass( )
{
	totalCars = 0;
	numPayCars = 0;
	numNoPayCars = 0;
	totalMoney = 0.0;
}// end constructor

//
//	setTotalCars
//
//	the purpose of this method is to modify the totalCars attribute
//
//	Input:	tc			the new value for the total cars
//	Return:	none
//

public void setTotalCars(int tc)
{
	// validate this input argument before use
	if(tc >= 0)
	{
		totalCars = tc;
	}
	else
	{
		System.out.println("Invalid new value for total cars of " + tc + " so no change");
	}
	
}// end setTotalCars

//
//	setNumPayCars
//
//	the purpose of this method is to modify the numPayCars attribute
//
//	Input:	npc			the new value for the number of pay cars
//	Return:	none
//

public void setNumPayCars(int npc)
{
	// validate input argument before use
	if(npc >= 0)
	{
		numPayCars = npc;
	}
	else
	{
		System.out.println("Invalid new value for number of pay cars of " + npc + " so no change");
	}
}// end setNumPayCars

//
//	setNumNoPayCars
//
//	the purpose of this method is to modify the numNoPayCars attribute
//
//	Input:	nnpc			the new value for the number of no pay cars
//	Return:	none
//

public void setNumNoPayCars(int nnpc)
{
	// validate input argument before use
	if(nnpc >= 0)
	{
		numNoPayCars = nnpc;
	}
	else
	{
		System.out.println("Invalid new value for number no pay cars of " + nnpc + " so no change");
	}
}// end setNumNoPayCars

//
//	setTotalMoney
//
//	the purpose of this method is to modify the totalMoney attribute
//
//	Input:	tm				the new value for total money
//	Return:	none
//

public void setTotalMoney(double tm)
{
	// validate input argument before use
	if(tm >= 0.0)
	{
		totalMoney = tm;
	}
	else
	{
		System.out.println("Invalid new value for total money of " + tm + " so no change");
	}
}// end setTotalMoney

//
//	getTotalCars
//
//	the purpose of this method is to return a copy of
//	the current value of the totalCars attribute
//
//	Input:	none
//	Return:	totalCars
//

public int getTotalCars( )
{
	return(totalCars);
}// end getTotalCars

//
//	getNumPayCars
//
//	the purpose of this method is to return a copy of
//	the current value of the numPayCars attribute
//
//	Input:	none
//	Return:	numPayCars
//

public int getNumPayCars( )
{
	return(numPayCars);
}// end getNumPayCars

//
//	getNumNoPayCars
//
//	the purpose of this method is to return a copy of
//	the current value of the numNoPayCars attribute
//
//	Input:	none
//	Return:	numNoPayCars
//

public int getNumNoPayCars()
{
	return(numNoPayCars);
}// end getNumNoPayCars

//
//	getTotalMoney
//
//	the purpose of this method is to return a copy of
//	the current value of the totalMoney attribute
//
//	Input:	none
//	Return:	totalMoney
//

public double getTotalMoney( )
{
	return(totalMoney);
}// end getTotalMoney

//
//	getTOLL
//
//	the purpose of this method is to return a copy
//	of the TOLL attribute
//
//	Input:	none
//	REturn:	TOLL
//
public double getTOLL( )
{
	return(TOLL);
}// end getTOLL

//
//	printData
//
//	the purpose of this method is to print out
//	the current values of all attributes.
//
//	Input:	none
//	Return:	none
//

public void printData()
{
	System.out.println("Total Cars\t\t" + totalCars);
	System.out.println("Number Pay Cars\t\t" + numPayCars);
	System.out.println("Number Non Pay Cars\t" + numNoPayCars);
	System.out.printf("Total Money\t\t$%.2f" , totalMoney);
}// end printData

//
//	handlePayCar
//
//	This method handles a paying car at the tollbooth.
//
//	Input:		none
//	Return:		none
//

public void handlePayCar( )
{
	// increment the total number of cars through the booth
	++totalCars;
	
	// increment the total number of paying cars
	++numPayCars;
	
	// increment the total amount of money collected by the toll amount
	totalMoney = totalMoney + TOLL;
}// end handlePayCar

//
//	handleNoPayCar
//
//	This method handles a non-paying car at the tollbooth.
//
//	Input:		none
//	Return:		none
//

public void handleNoPayCar( )
{
	// increment the total number of cars through the booth
	++totalCars;
	
	// increment the total number of non-paying cars
	++numNoPayCars;
}// end handleNoPayCar


}// end Tollbooth Class