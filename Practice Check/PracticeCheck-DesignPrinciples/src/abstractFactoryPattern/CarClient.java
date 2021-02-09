package abstractFactoryPattern;

public class CarClient {
	

	public static void main(String[] args) {
		
		CarFactory fcf=new FactoryLuxuryCar();
		System.out.println(fcf.buildCar(CarType.LUXURY,Location.DEFAULT));

		CarFactory mocf=new FactoryMicroCar();
		System.out.println(mocf.buildCar(CarType.MICRO,Location.USA));

		CarFactory micf=new FactoryMiniCar();
		System.out.println(micf.buildCar(CarType.MINI,Location.INDIA));
	}
	
}
