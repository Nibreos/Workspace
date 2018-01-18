import java.util.Scanner;

public class TestScoresAverage
{
	public TestScoresAverage(double test1, double test2, double test3) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		double test1, test2, test3;

		//Create a Scanner object for a keyboard input
		Scanner keyboard = new Scanner(System.in);

		//Input 3 test scores
		System.out.println("Enter test score #1: ");
		test1=keyboard.nextDouble();

		System.out.println("Enter test score #2: ");
		test2=keyboard.nextDouble();

		System.out.println("Enter test score #3: ");
		test3=keyboard.nextDouble();

		//Create a TestScores object
		TestScoresAverage scores = new TestScoresAverage(test1, test2, test3);
		
		//Display the average test score
		System.out.println("The average test score is " + scores.getAverageScore());
		
	}

	private String getAverageScore() {
		return null;
	}


}