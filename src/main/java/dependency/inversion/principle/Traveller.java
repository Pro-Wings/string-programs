package dependency.inversion.principle;

public class Traveller {
	
//	Bike bike;
//	Car car;

	Vehicle vehicle;
	
//	public Traveller(Bike bike) {
//		super();
//		this.bike = bike;
//	}
	
//	public Traveller(Car car) {
//		super();
//		this.car = car;
//	}

	public Traveller(Vehicle vehicle) {
		super();
		this.vehicle = vehicle;
	}
	
	public void startJourney()
	{
//		bike.start();
//		car.start();
		vehicle.start();
		System.out.println("Traveller's journey started!!!");
	}



}
