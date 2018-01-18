
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class SpeedofSound{

	public static void main(String[] args) {
		

		final String question;
		final String questioner;
		


	// String userselectedspeed;
	double Air = 1100;
	double Water = 4900;
	double Steel = 16400;
	double distanceTraveled;
	double timeInSec;
	
	 DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#0.00");
	
	 	question = JOptionPane.showInputDialog("What medium do you want to travel through you can choose air/water/steel");
		questioner = JOptionPane.showInputDialog("Put in how fast you want the sound wave to travel in the designated medium");
		distanceTraveled = Double.parseDouble(questioner);


	//DecimalFormat formatter = DECIMAL_FORMAT;
				if (question == "Air" )
					  {	
				timeInSec = distanceTraveled/Air;
				//String timeInSec = DECIMAL_FORMAT.format(timeInSec);
				JOptionPane.showMessageDialog(null, "Will take you" + timeInSec + " seconds ");
					  }	   
					  
					
				 if (question("Water"))
					   {
				 timeInSec = distanceTraveled/distanceTraveled;
				 String formattedtimeInSec = DECIMAL_FORMAT.format(timeInSec);
				 JOptionPane.showMessageDialog(null, "Will take you" + timeInSec + " seconds ");
								   
						 }
					   
					else if (question("Steel"))
					   {
						   timeInSec = distanceTraveled/Steel;
							String formattedtimeInSec = DECIMAL_FORMAT.format(timeInSec);
						   JOptionPane.showMessageDialog(null, "Will take you" + timeInSec + " seconds ");
					   }
			
					}

	private static boolean question(String string) {
		// TODO Auto-generated method stub
		return false;
	}
}
