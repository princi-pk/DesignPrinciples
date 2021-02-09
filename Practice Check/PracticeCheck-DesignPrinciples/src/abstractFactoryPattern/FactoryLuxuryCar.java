package abstractFactoryPattern;

public class FactoryLuxuryCar extends CarFactory{

	@Override
	public LuxuryCar buildCar(CarType cartype, Location loc) {
		LuxuryCar luxurycar=new LuxuryCar(loc);
		return luxurycar;
	}

}
