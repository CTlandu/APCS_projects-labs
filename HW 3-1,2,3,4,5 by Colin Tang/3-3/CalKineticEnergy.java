import java.util.Scanner;

public class CalKineticEnergy {
	public static void main(String [] args) {
		Scanner reader = new Scanner(System.in);
		double mass; 
		double velocity;
		double momentum;
		double kineticenergy; 
		
		System.out.print("please enter the mass(kg): ");
		mass = reader.nextDouble();//input mass(es)
		System.out.print("please enter the velocity(m/s): ");
		velocity = reader.nextDouble();//input velocity
		
		momentum = velocity * mass;
		System.out.print("The momentum is(kg*m/s): ");
		System.out.println(momentum); //print momentum
		
		kineticenergy = 0.5 * mass * velocity * velocity;
		System.out.print("The kinetic energy is(J): ");
		System.out.print(kineticenergy);
	}

}

