public class TestCar{
	public static void main( String [] args ) {
		Car car1 = new Car( 1999, "Toyota" );
		
		System.out.println( "Accelerating now" );
		for( int seconds =  1; seconds <= 5; seconds++) {
			car1.accelerator();
			System.out.println( "Current speed of the " +car1.getYearModel() + " " + car1.getMake() + " is " + car1.getSpeed() +" miles/h" );
		
		}
{
			System.out.println( "Braking now" );
			for( int seconds =  1; seconds <= 5; seconds++) {
				car1.brake();
				System.out.println( "Current speed of the " +car1.getYearModel() + " " + car1.getMake() + " is " + car1.getSpeed() +" miles/h" );
		}
	}
}
}