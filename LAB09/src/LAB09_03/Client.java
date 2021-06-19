//2015112232백근주
package LAB09_03;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorFactory factory=new MotorFactory();
		Motor lgMotor = factory.createMotor("LG");
		ElevatorController controller1 = new ElevatorController(1, lgMotor);
		controller1.gotoFloor(5);
		controller1.gotoFloor(3);

		Motor hyundaiMotor = factory.createMotor("Hyundai");
		ElevatorController controller2 = new ElevatorController(1, hyundaiMotor);
		controller2.gotoFloor(4);
		controller2.gotoFloor(6);

	}

}
