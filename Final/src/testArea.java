//Nathan Johnson

import java.util.Scanner; // Needed for the Scanner class
import java.text.DecimalFormat;

public class testArea {

	public static void main(String[] args) {

		DecimalFormat DFormat = new DecimalFormat("######.00"); // Deformat.format goes before the area.area parts  

		{
			String input; // keep keyboard input
			char choice; // hold the selected option

			// to read input
			Scanner keyboard = new Scanner(System.in);

			// Ask the user to enter 1,2,or 3
			System.out.print(
					"To calculate the area of a circle, enter 1 To calculate the area of a rectangle, enter 2 To calculate the volume of a cylinder, enter 3 ");
			input = keyboard.nextLine();
			choice = input.charAt(0); // only look at first char

			// decide what was entered
			switch (choice) {
			case '1':
				System.out.print("What is the radius? ");
				final double rCircle = keyboard.nextDouble();
				System.out.println("The area of a circle with a radius of " + rCircle + " Is " + Area.Area(rCircle));
				break;
			case '2':
				// final int heightRectangle = 10; < not needed, just personal notes
				// final int widthRectangle = 20;  < not needed, just personal notes
				System.out.println("What is the rectangles length? ");
				final double heightRectangle = keyboard.nextDouble();
				System.out.println("What is the rectangles width? ");
				final double widthRectangle = keyboard.nextDouble();
				System.out.println("The area of a rectangle with a length of " + heightRectangle + "  and a width of "
						+ widthRectangle + " is " + DFormat.format(Area.Area(heightRectangle, widthRectangle)));

				break;
			case '3':
				System.out.print("What is the radius? ");
				final double radiusCylinder = keyboard.nextDouble();
				System.out.print("What is the rectangles length? ");
				final double heightCylinder = keyboard.nextDouble();
				System.out.println("The area of a cylinder with a radius of " + radiusCylinder + "and a height of "
						+ heightCylinder + " is " + Area.Area(radiusCylinder, heightCylinder));
				break;
			default:
				System.out.println("That's not 1, 2, or 3!");

			}
		}
	}
}