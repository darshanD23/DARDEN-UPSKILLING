import java.util.Scanner;
public class Compoundinterest {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the principal amount: ");
	        double principal = scanner.nextDouble();

	        System.out.print("Enter the rate of interest (in percentage): ");
	        double rateOfInterest = scanner.nextDouble();

	        System.out.print("Enter the time (in years): ");
	        double time = scanner.nextDouble();

	        double simpleInterest = calculateSimpleInterest(principal, rateOfInterest, time);
	        double compoundInterest = calculateCompoundInterest(principal, rateOfInterest, time);

	        System.out.println("Simple Interest: " + simpleInterest);
	        System.out.println("Compound Interest: " + compoundInterest);

	        scanner.close();
	    }

	    private static double calculateSimpleInterest(double principal, double rateOfInterest, double time) {
	        return (principal * rateOfInterest * time) / 100;
	    }

	    private static double calculateCompoundInterest(double principal, double rateOfInterest, double time) 	    {
	        double compoundInterest = principal * Math.pow((1 + rateOfInterest / 100), time) - principal;
	        return compoundInterest;
	    }
	}