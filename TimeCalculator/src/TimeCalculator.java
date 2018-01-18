import javax.swing.JOptionPane;

public class TimeCalculator{
	
	
	
	public static void main( String  [	] args) {

		final int minutes = 60;
		final int hours = 3600;
		final int day = 86400;
		
		
		
		
		String secondsvalue;
		final int seconds;
		secondsvalue = JOptionPane.showInputDialog(null, "Enter how many seconds to convert");
		//cant use show message dialog 
		seconds = Integer.parseInt(secondsvalue);
		
	
		
		
		
		
		if (seconds <= day){
			if (seconds >= hours){
				JOptionPane.showMessageDialog(null, "That is " + (seconds/hours) + " hours " + ((seconds%hours)/minutes) + " minutes and " + ((seconds%hours)%minutes) + " seconds.");
		}
				else if(seconds >= minutes){
					JOptionPane.showMessageDialog(null, "That is " + seconds + " seconds which is equal to " + seconds/minutes + " minutes and " + seconds%minutes + " seconds.");
		}
	}
		else{
			JOptionPane.showMessageDialog(null, "That is " + (seconds/day) + " days " + (seconds%day)/hours + " hours " +((seconds%day)%hours)/minutes + " minutes " +  ((seconds%day)%hours)%minutes + " seconds.");
	}

	}

}

//double onlySeconds;
//	double days = 0;
//double hours = 0;
//double leftoverSeconds;


//System.out.println("Enter a number of seconds");
//onlySeconds; = scanner.nextDouble();