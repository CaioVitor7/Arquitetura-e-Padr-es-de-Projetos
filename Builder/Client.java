package Builder;

public class Client {

	public static void main(String[] arg) {
		Car c = new CarBuilder().setWheel(4).setColor("Black").getCar();
		System.out.print(c);
	}
}
