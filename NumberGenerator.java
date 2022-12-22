package numbergenerator;
import java.util.Random;

/**
 * 
 * @author ifennaekwenem
 *
 */
public class NumberGenerator {
	

	public static void main(String[] args) {
	    Random randomnumber = new Random();
	    double numberinput = randomnumber.nextDouble();
	    numberinput = Math.pow(numberinput, -1);
	    System.out.println("The Generated number is: " + numberinput);
	  }
	}
