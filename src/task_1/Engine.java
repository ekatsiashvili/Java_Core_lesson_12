package task_1;

public class Engine {

	int numberOfCylinders;

	public Engine(int numberOfCylinders) {
		super();
		this.numberOfCylinders = numberOfCylinders;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		this.numberOfCylinders = numberOfCylinders;
	}

	public String toString() {
		return "Engine [numberOfCylinders=" + numberOfCylinders + "]";
	}

}