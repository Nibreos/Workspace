public class Temperature { private double ftemp;

		/* Constructor accepts a Fahrenheit temperature and stores it in the ftemp field. */

		public Temperature(double f)
		{
			ftemp=f;
		}

		/* setFahrenheit method returns the value of the ftemp field as a Fahrenheit temperature */
		public void setFahrenheit(double f)
		{
			ftemp=f;
		}

		/* getFahrenheit returns the value of the ftemp field, as a Fahrenheit temperature */

		public double getFahrenheit()
		{
			return ftemp;
		}
		/* getCelsisu method returns the converted value of temp field as a Celsius temperature. */

		public double getCelsius()
		{
			return (ftemp - 32)*(5/9);
		}
		/* getKelvin method returns the converted value of temp filed as a Kelvin temperature*/

		public double getKelvin()
		{
				return ((ftemp - 32)*(5/9))+273;
		}

}