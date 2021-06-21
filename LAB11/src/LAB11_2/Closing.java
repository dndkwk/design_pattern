package LAB11_2;

public class Closing extends DoorState{
	public Door_1 door;
	public String status="Closing";
	
	public Closing(Door_1 door) {
		super(door);	
	}
	
	@Override
	public void click() {
		door.setState(door.OPENING);
	}

	@Override
	public void complete() {
		door.setState(door.CLOSED);
	}

	@Override
	public void timeout() {
		
	}

}
