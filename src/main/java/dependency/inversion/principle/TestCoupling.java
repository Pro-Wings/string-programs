package dependency.inversion.principle;

public class TestCoupling {
	
	public static void main(String[] args) {
		
		Bike bike = new Bike();
		
		Car car = new Car();
		
		Vehicle v = new Helicopter();
		
		
//		Traveller traveller = new Traveller(bike);
//		Traveller traveller = new Traveller(car);

		
		Traveller traveller = new Traveller(v);
		
		traveller.startJourney();
		
		
	}

}
