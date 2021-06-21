package LAB11_2;

abstract class DoorState {
	public Door_1 door;
	public String status;
	
	public DoorState(Door_1 door) {
        this.door = door;
    }
	
	public String getstatus() {
        return this.status;
    }
	
	public abstract void click(); 
	public abstract void complete();
	public abstract void timeout();
	
	
}
