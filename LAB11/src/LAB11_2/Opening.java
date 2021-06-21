package LAB11_2;

public class Opening extends DoorState{
	public Door_1 door;
	public String status="Opening";
	
	public Opening(Door_1 door) {
		super(door);	
	}
	
	@Override
	public void click() {
		door.setState(door.CLOSING);
	}

	@Override
	public void complete() {
		door.setState(door.OPEN);
	}

	@Override
	public void timeout() {
		
	}

}

