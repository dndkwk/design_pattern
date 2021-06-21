package LAB11_2;

public class Closed extends DoorState{
	public Door_1 door;
	public String status="Closed";
	
	public Closed(Door_1 door) {
		super(door);	
	}
	
	@Override
	public void click() {
		door.setState(door.OPENING);
	}

	@Override
	public void complete() {
		
	}

	@Override
	public void timeout() {
		
	}

}
