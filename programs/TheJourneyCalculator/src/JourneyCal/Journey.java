package JourneyCal;


import java.util.Scanner;

public class Journey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		JourneyCalculator distance = new JourneyCalculator();
		System.out.println("enter speed");
		double s = scan.nextDouble();
		System.out.println("enter time");
		double t = scan.nextDouble();
		
		System.out.println("distance is "+distance.calculateDistance(s,t));
		
		
	}

	

}
