package LAB09_03;

public class LGMotor extends Motor {
	protected void moveMotor(Direction direction) {
		System.out.println("move LG Motor " + direction);
	}
	
	protected void stopMotor() {
		System.out.println("stop LG Motor ");
	}
}
