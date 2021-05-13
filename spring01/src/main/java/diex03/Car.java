package diex03;

public class Car {
	Tire tire;
	public Car(Tire tire) {
		//this.tire = new KoreaTire();
		this.tire = tire();
	}
	private Tire tire() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getTireBrand() {
		return "장착된 타이어 :"+tire.getBrand();
	}

}
