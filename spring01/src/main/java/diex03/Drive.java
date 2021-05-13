package diex03;

public class Drive {
	public static void main(String[] args) {
		Tire tire = new KoreaTire();
		
		Car car = new Car(tire);
		
		
		System.out.println(car.getTireBrand());
	}

}
