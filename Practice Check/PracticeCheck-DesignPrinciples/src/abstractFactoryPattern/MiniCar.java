package abstractFactoryPattern;

public class MiniCar extends Car {

	@Override
	protected void construct() {
		System.out.println("Connecting to Mini car");
	}

	MiniCar(Location location) {
		super(CarType.MINI,location);
		construct();
	}

}
