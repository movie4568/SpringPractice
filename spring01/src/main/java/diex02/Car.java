package diex02;

public class Car {
	Tire tire;
	public Car() {
		//this.tire = new KoreaTire();
		this.tire = new SmartTire();
	}
	public String getTireBrand() {
		return "장착된 타이어 :"+tire.getBrand();
	}

}
