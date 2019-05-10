/** 
A simple program with an algorithm demonstrating the Collatz Sequence. 
Reports the number of operations that take place before the number reaches one.
@author Brynn Haley (brynnlet on GitHub)
*/

import java.util.*;

public class Collatz{
	
	private double input;
	
	public int reachOne(double input){
		int count = 0;
		while(input>1){
			if(input % 2 == 0){ //if input is even
				input = input/2;
				count++;
				}
			else{//if input is odd
				input = input *3 + 1;
				count++;
				}
		}
		return count;
	}
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Collatz coll = new Collatz();
		double temp= 1;
		
		while(temp!=0){ 
			System.out.print("\nEnter a number (0 to quit): ");
			
			try{
				temp = scan.nextDouble();	
				System.out.println("\nNumber of steps taken to reach 1: " + coll.reachOne(temp));
				}catch(InputMismatchException e){
					System.out.println("\nOnly numbers are accepted as input.");
					break;
					}
			if(temp == 0)
				System.out.println("\nGoodbye.");
		}
	}
}

