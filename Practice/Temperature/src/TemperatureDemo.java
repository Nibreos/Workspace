import java.util.Scanner;

public class TemperatureDemo{
	public static void main( String [] args ) {
		Scanner scanner = new Scanner( System.in );
		double userFahrenheitTemperature;
		
		System.out.println("Please enter a fahrenheit Temperature");
		userFahrenheitTemperature = scanner.nextDouble();
		
		Temperature temp1 = new Temperature(userFahrenheitTemperature);
		
		System.out.printf( "Fahrenheit temperature: %.2f\nCelsius temperature: %.2f\nKelvin temperature: %.2f",
				temp1.getFahrenheit(), temp1.getCelsius(), temp1.getKelvin() );
		
		System.out.println( "n/Please enter another fahrenheit Temperature" );
		userFahrenheitTemperature = scanner.nextDouble();
		
		temp1.setFahrenheit( userFahrenheitTemperature );
		
		System.out.printf( "Fahrenheit temperature: %.2f\nCelsius temperature: %.2f\nKelvin temperature: %.2f",
				temp1.getFahrenheit(), temp1.getCelsius(), temp1.getKelvin() );
	}
	
}




