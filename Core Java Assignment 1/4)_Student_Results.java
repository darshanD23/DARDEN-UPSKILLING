
import java.util.Scanner;

public class Results {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();

        if (subject1 > 60 && subject2 > 60 && subject3 > 60) 
	{
            System.out.println("Result: Passed");
        } 
	else if ((subject1 > 60 && subject2 > 60) || (subject2 > 60 && subject3 > 60) || (subject1 > 60 && subject3 > 60))
	 {
            System.out.println("Result: Promoted");
        } 
	else 
	{
            System.out.println("Result: Failed");
        }

        scanner.close();
    }
}
