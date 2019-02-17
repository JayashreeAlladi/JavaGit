package basis;

public class Aerospace extends Flyable{
	public static void main(String[] args) {
		Flyable f=new Aerospace();
		f.fly();
		f.start();
		f.stop();
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("flying");
	}

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("starts");
	}

}
