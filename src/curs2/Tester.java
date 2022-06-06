package curs2;

public class Tester {
	
	//variabile
	private String nume;
	private int ratePerHour;
	private int age;

	//constructor default
	//public Tester() {}
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Tester(String nume, int ratePerHour, int age) {
	setNume(nume);
	setRatePerHour(ratePerHour);
	setAge(age);
	
	}
	
	
	//metode getter & setter
	
	public String getNume() {
		return nume;
	}
	
	private void setNume(String nume) {
		this.nume = nume;
	}
	//Tester tester1 = new Tester();
	// tester1.setNume("Oana")
	//tester1.getNume() --> Oana
	
	//Tester tester2 = new Tester();
	// tester2.setNume("Diana")
	//tester2.getNume() --> Diana
	
	
	public int getRatePerHour() {
		return ratePerHour;
	}
	
	private void setRatePerHour(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	
	
	
	
	
	

}
