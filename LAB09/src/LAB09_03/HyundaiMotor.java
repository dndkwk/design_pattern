package LAB09_03;

public class HyundaiMotor extends Motor {
	protected void moveMotor(Direction direction) {
		System.out.println("move Hyundai Motor " + direction);
	}
	
	protected void stopMotor() {
		System.out.println("stop Hyundai Motor ");
	}
	
}
