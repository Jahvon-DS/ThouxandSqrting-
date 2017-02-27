package packageHomework;
import java.util.*; 

public class SquareZZ {

	public static double BeMethod( double guess, int x, int errorDiff){
		double error = Math.abs(x- guess* guess);
		if (x<0){
			return 1;
			
		}
		if (error <= errorDiff){
			return (guess);
		}
		else {
			double newGuess = .5*(guess + x / guess); 
				return BeMethod(newGuess, x, errorDiff);
				
		}
}
/*	public static void main(String[] args){
		int x1 = 1000;
		double guess1 = x1/2;
		System.out.println(BeMethod(guess1,x1,5));
	}*/
	
public static void main (String [] args){
	System.out.println( "What would you like to be squared ? ");
	Scanner keyboard = new Scanner(System.in); 
	
	int x = keyboard.nextInt(); 
	
	System.out.println("Guess what will it be "); 
	double guess = keyboard.nextDouble();
	System.out.print(BeMethod(guess,x,5));
	
	keyboard.close();
}
}