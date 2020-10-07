package task_1;

public class Car {

	int power;
	int yearOfProduction;
	Helm helm;
	Engine engine;

	public Car(int power, int yearOfProduction, Helm helm, Engine engine) {
		this.power = power;
		this.yearOfProduction = yearOfProduction;
		this.helm = helm;
		this.engine = engine;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public Helm getHelm() {
		return helm;
	}

	public void setHelm(Helm helm) {
		this.helm = helm;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [power=" + power + ", yearOfProduction=" + yearOfProduction + ", helm=" + helm + ", engine="
				+ engine + "]";
	}

}
