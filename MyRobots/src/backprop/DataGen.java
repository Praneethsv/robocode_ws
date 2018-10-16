package backprop;

import java.lang.Math;

public class DataGen{
	// Generates XOR data.
	
	//Input Parameters
	double randomVal;
	double xorOut;
	
	//Create the constructor - To intialize the class members and variables
	DataGen(){
		randomVal=0;
		xorOut=0;
	}
	
	//Function to assign random value - Function should generate value between -1 to 1
	public double randomfunc() {
		randomVal = Math.random();
		
		if(Math.random()>0.5) {
			randomVal = -1*randomVal;
		}	
		
		return randomVal;
	}
	
	//Function for Calculating XOR
	public double XORfunc(double param1, double param2) {
		
		if(param1==param2)
			xorOut=0;
		else 
			xorOut=1;
		
		return xorOut;
	}
}//Data Generation Class