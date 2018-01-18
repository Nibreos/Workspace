import java.util.Scanner;

public class JangoFett
{
	public static void main (String[] args)
	{
		int number = 0, total = 0;
		Scanner keyboard = new Scanner(System.in);
		
		for (int i = 1; i <= 7; i++)
			System.out.print("Enters a number): ");
			number = keyboard.nextInt();
			total += number;
		}
	
		System.out.println("Sum of numbers entered = " +total);
}