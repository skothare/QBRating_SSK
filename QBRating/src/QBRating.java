import java.util.*;
import java.math.*;

public class QBRating {
	//This method calculates the passer rating given the stats
	public static double Passer_Rating(double att, double comp, double yds, double td, double ints) {
		double a = ((comp/att)-0.3)*5;
		double b = ((yds/att)-3)*0.25;
		double c = (td/att)*20;
		double d = 2.375-((ints/att)*25);

		double passerRating = ((a+b+c+d)/6)*100;

		return (double)Math.round(passerRating * 10d) / 10d;
		
	}
	
	public static void main(String[] args) {
		//Requests inputs from the user and calls the passer rating method
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number of Passing Attempts");
		double att=input.nextDouble();
		
		System.out.println("Enter the number of Completions");
		double comp=input.nextDouble();
		
		System.out.println("Enter the number of Passing Yards");
		double yds=input.nextDouble();
		
		System.out.println("Enter the number of Touchdowns");
		double td=input.nextDouble();
		
		System.out.println("Enter the number of Interceptions");
		double ints=input.nextDouble();
		
		double passer_rating = Passer_Rating( att, comp, yds, td, ints);
		
		// Display results
		System.out.println("The QB Rating with the given stats is " + passer_rating);


	}

}
