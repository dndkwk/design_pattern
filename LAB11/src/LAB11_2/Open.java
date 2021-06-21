package LAB11_2;

public class Open extends DoorState{
	public Door_1 door;
	public String status="Open";
	
	public Open(Door_1 door) {
		super(door);	
	}
	
	@Override
	public void click() {
		door.setState(door.STAYOPEN);
	}

	@Override
	public void complete() {
		
	}

	@Override
	public void timeout() {
		door.setState(door.CLOSING);
	}

}

