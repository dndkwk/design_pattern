package LAB09_03;

public class MotorFactory {
	
	public Motor createMotor(String type) {
		if(type.equals("LG")) {
			return new LGMotor();
		}else if(type.equals("Hyundai")) {
			return new HyundaiMotor();
		}
		return null;
	}

}
