package abstractFactoryPattern;

public class FactoryMiniCar extends CarFactory{

	@Override
	public MiniCar buildCar(CarType cartype, Location loc) {
		MiniCar minicar=new MiniCar(loc);
		return minicar;
	}

}
