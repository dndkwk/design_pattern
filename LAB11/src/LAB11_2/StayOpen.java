package LAB11_2;

public class StayOpen extends DoorState{
	public Door_1 door;
	public String status="StayOpen";
	
	public StayOpen(Door_1 door) {
		super(door);	
	}
	
	@Override
	public void click() {
		door.setState(door.CLOSING);
	}

	@Override
	public void complete() {
		
	}

	@Override
	public void timeout() {
		
	}

}

