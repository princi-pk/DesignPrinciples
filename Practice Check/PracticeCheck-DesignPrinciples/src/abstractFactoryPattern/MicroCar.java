package abstractFactoryPattern;

public class MicroCar extends Car {

	@Override
	protected void construct() {
		System.out.println("Connecting to Micro car");
	}

	MicroCar(Location location) {
		super(CarType.MICRO,location);
		construct();
	}

}
