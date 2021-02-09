package abstractFactoryPattern;

public abstract class CarFactory {
	
	public abstract Car buildCar(CarType cartype,Location Loc);
	
}
