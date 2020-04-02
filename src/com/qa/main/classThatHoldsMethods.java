package com.qa.main;

public class classThatHoldsMethods {
	int returnSum = 0;
	public int methodOne(int sumVarA, int sumVarB, Boolean bool){
		
		if (bool == true){
			returnSum = sumVarA + sumVarB;
			System.out.println("you just did addition, and you get yourself: " + returnSum);
		}
		if (bool == false){
			returnSum= sumVarA * sumVarB;
			System.out.println("you just did multiplication chief, you get yourself this instead: " + returnSum);
		}
		return returnSum;
	}
}

