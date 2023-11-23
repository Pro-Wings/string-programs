package com.prowings.immutableclass;

public final class ImmutableStudent {
	
	private final int roll;
	private final String name;
	private final Address address;

	public ImmutableStudent() {
		this.roll = 0;
		this.name = "";
		this.address = new Address();
	}

	public ImmutableStudent(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		//Creating deep copy of mutable field
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
		//Returning dummy copy instead of original mutable field
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
