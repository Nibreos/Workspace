public class Car{

private int yearModel;
private String make;
private int speed;

public int getYearModel() {
	return yearModel;
}

public String getMake() {
	return make;

}
public int getSpeed() {
	return speed;
}

public void accelerator() {
	speed += 5;
}

public void brake() {
	speed -= 5;
}

	public Car(int yearModelGiven, String makeGiven ) {
		yearModel = yearModelGiven;
		make = makeGiven;
		speed = 0;
	}


}