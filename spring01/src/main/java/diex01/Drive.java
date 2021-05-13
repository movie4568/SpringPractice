package diex01;

public class Drive {
	public static void main(String[] args) {
		//Tire tire = new KoreaTire();
		Tire tire = new SmartTire();
		
		Car car = new Car();
		car.setTire(tire);
		System.out.println(car.getTireBrand());
	}

}
