package LAB09_03;

public abstract class Motor {
	private MotorStatus motorStatus;

	protected abstract void moveMotor(Direction direction);
	protected abstract void stopMotor();
	
	public Motor() {
		motorStatus = MotorStatus.STOPPING;
	}

	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	private void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}
	
	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.MOVING)
			return;
		moveMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
	
	public void stop() {
		MotorStatus motorStatus = getMotorStatus();
		if (motorStatus == MotorStatus.STOPPING)
			return;
		stopMotor();
		setMotorStatus(MotorStatus.STOPPING);
		
	}
}
