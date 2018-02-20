//
// TollPlaza
//
// The purpose of this class is to create a TollPlaza 
//
// Author: Nekesa Mercy
// Date: 11/13/2016
//
package lab5Package;

public class TollPlaza
{
	private TollBoothClass[]	allBooths;

//
//	TollPlaza
//
//	this is the constructor for the TollPlaza Class
//
//	Input:	numBooths	the number of booths for the plaza
//	Return:	none
//
public TollPlaza(int numBooths){
	int cntr;
	
	//check to see if the number of booths is valid 
	if(numBooths >= 0){
		
		allBooths =  new TollBoothClass[numBooths];
		
		for(cntr = 0; cntr < allBooths.length; ++cntr){
			
			allBooths[cntr] = new TollBoothClass();
			
		}// end for each tollBooth 
	}// end if
	
	else{
		System.out.println("You cannot have a negative number of booths - " + numBooths);	
	}// end else 
	
}// end TollPlaza constructor 

//
//	setAllBooths
//
//	the purpose of this method is to modify all booths in the toll plaza
//
//	Input:		bths		the new array of toll booths
//	Return:		none
//
public void setAllBooths(TollBoothClass[] bths){
	int cntr;
	
	//allocate space for the new booths 
	allBooths =  new TollBoothClass[bths.length];
	
	for(cntr = 0; cntr < allBooths.length; ++cntr){
		
		allBooths[cntr]= bths[cntr];
		
	}// end for each booth
	
}// end setAllBooths

//
//	setOneBooth
//
//	The purpose of this method is to allow one toll booth to be modified
//
//	Input:	num		the booth number to change
//			bth		the new toll booth object
//	Return:	none
//
public void setOneBooth(int num, TollBoothClass bth){
	
	//check to make sure the index is valid 
	if((num < allBooths.length)&&(num >= 0)){
		
		//valid index to make the change 
		allBooths[num] = bth;
		
	}//end if 
	else{
		// invalid index - no change
		System.out.println("invalid booth number request");

	}// end else 
	
}// end setOneBooth

//
//	getAllBooths
//
//	the purpose of this method is to return a copy of
//	all of the booths in the plaza
//
//	Input:	none
//	Return:	allBooths
//

public TollBoothClass[] getAllBooths( )
{
	return(allBooths);
}// end getAllBooths

//
//	getOneBooth
//
//	the purpose of this method is to return a copy of one 
//	booth from the plaza.
//
//	Input:	num		the booth number requested
//	Return:	tmp		one booth
//

public TollBoothClass getOneBooth(int num)
{
	TollBoothClass tmp;
	
	tmp = new TollBoothClass();
	
	// remember to make sure that this is valid
	if ((num < allBooths.length) && (num >= 0))
	{
		// valid booth number request
		tmp = allBooths[num];
	}
	else
	{
		// invalid booth number request
		System.out.println("Invalid booth number request");
	}
	return(tmp);
}// end getOneBooth

//
//	getNumBooths
//
//  The purpose of this method is to get the number of booths 
//
//	Input:	none
//	Return:	numBooths		the number of booths
//
public int getNumBooths(){
	
	return(allBooths.length);
}// end getNumBooths 


//
//	printData
//
//	The purpose of this method is to print out all attributes in this class.
//
//	Input:	none
//	Return:	none
//
public void printData( )
{
	int cntr;
	
	// print out the booth number and the booth information
	for (cntr = 0; cntr < allBooths.length;++cntr)
	{
		// print out the booth number
		System.out.println("Booth #" + cntr);
		
		// print out the booth information
		allBooths[cntr].printData();
		
		// print out a blank line
		System.out.println( );
	}// end for each booth

}// end printData

//
//	handlePayCar
//
//	the purpose of this method is to handle a paying car driving
//	through a specific booth in the TollPlaza.
//
//	Input:	bthNumber	the specific booth number
//	Return:	none
//
public void handlePayCar(int bthNumber)
{
	// make sure that the booth number is valid
	if ((bthNumber < allBooths.length) && (bthNumber >= 0))
	{
		// valid booth number so handle the car
		allBooths[bthNumber].handlePayCar();
	}
	else
	{
		// invalid booth number request
		System.out.println("Invalid booth number for handle pay car - " + bthNumber);
	}	
}// end handlePayCar

//
//handleNoPayCar
//
//the purpose of this method is to handle a non paying car driving
//through a specific booth in the TollPlaza.
//
//Input:	bthNumber	the specific booth number
//Return:	none
//
public void handleNoPayCar(int bthNumber)
{
// make sure that the booth number is valid
if ((bthNumber < allBooths.length) && (bthNumber >= 0))
{
	// valid booth number so handle the car
	allBooths[bthNumber].handleNoPayCar();
}
else
{
	// invalid booth number request
	System.out.println("Invalid booth number for handle no pay car - " + bthNumber);
}	
}// end handleNoPayCar






}// end TollPlaza class 




