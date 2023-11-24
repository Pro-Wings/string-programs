package com.prowings.immutableclass;

//#1 : Declare class as final - so that subclass can not change the internal state of object.
public final class ImmutableStudent {

//# 2: Declare all fields private (to restrict direct access to fields) and final -	to initialize only once
	private final int roll;
	private final String name;
	private final Address address;

//	#3 : Remove setter methods - as one can change internal state of Object through setters.
	
	public ImmutableStudent() {
		this.roll = 0;
		this.name = "";
		this.address = new Address();
	}

	public ImmutableStudent(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		//#4 : Creating deep copy of mutable field in constructor.
		Address addrCopy = new Address();
		addrCopy.setPin(address.getPin());
		addrCopy.setCity(address.getCity());
		addrCopy.setCountry(address.getCountry());
		
		this.address = addrCopy;
	}

	public int getRoll() {
		return roll;
	}


	public String getName() {
		return name;
	}


	public Address getAddress() {
		//#5 : Returning dummy copy instead of original mutable field in getter of mutable field.
		Address dummyAddr = new Address();
		dummyAddr.setPin(this.address.getPin());
		dummyAddr.setCity(this.address.getCity());
		dummyAddr.setCountry(this.address.getCountry());
		
		return dummyAddr;
	}


	@Override
	public String toString() {
		return "ImmutableStudent [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
