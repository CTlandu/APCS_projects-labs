import java.util.Scanner;
public class PopulationGrowth {
	public static void main(String [] args) {
		
		Scanner reader = new Scanner(System.in);
		double initial;
		double rt;
		double hourNeed;
		double time;
		
		System.out.print("Please enter the initial popuation: ");
		initial = reader.nextDouble();
		System.out.print("Please enter the rate of growth: ");
		rt = reader.nextDouble();
		System.out.print("Please enter the hours to achieve the growth rate: ");
		hourNeed = reader.nextDouble();
		System.out.print("Please enter the hours it grows: ");
		time = reader.nextDouble();
	
		double finalpop;
		finalpop = initial * Math.pow(rt,time/hourNeed);   
		/** because the power number(time/hour needed) can be a decimal, it's a little difficult for me
		to use loop to calculate the final population, I just used math method 'power' to achieve it. **/
		System.out.print(finalpop);          
	}
	

}
