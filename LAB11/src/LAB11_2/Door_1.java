package LAB11_2;

import java.util.Observable;

public class Door_1 extends Observable {
	public DoorState CLOSED = new Closed(this);
	public DoorState CLOSING = new Closing(this);
	public DoorState OPEN = new Open(this);
	public DoorState OPENING = new Opening(this);
	public DoorState STAYOPEN = new StayOpen(this);
	
	private DoorState state = CLOSED;
	
	public void complete() {
		state.complete();
	}
	
	public void timeout() {
		state.timeout();
	}
	
	public String status() {
		return state.getstatus();
	}

	public void click() {
		state.click();
	}

	public void setState(DoorState state) {
		this.state = state;
		setChanged();
		notifyObservers();
	}
}