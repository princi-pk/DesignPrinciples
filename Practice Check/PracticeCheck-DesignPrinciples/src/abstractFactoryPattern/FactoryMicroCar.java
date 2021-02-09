package abstractFactoryPattern;

public class FactoryMicroCar extends CarFactory{

	@Override
	public MicroCar buildCar(CarType cartype, Location loc) {
		MicroCar microcar=new MicroCar(loc);
		return microcar;
	}

}
