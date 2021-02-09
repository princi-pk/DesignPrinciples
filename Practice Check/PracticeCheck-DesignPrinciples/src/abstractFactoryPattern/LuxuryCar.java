package abstractFactoryPattern;

public class LuxuryCar extends Car {

	@Override
	protected void construct() {
		System.out.println("Connecting to Luxury car");
	}

	LuxuryCar(Location location) {
		super(CarType.LUXURY,location);
		construct();
	}

}
