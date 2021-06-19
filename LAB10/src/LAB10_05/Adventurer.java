
package LAB10_05;

import java.util.List;
import java.util.Map;

public class Adventurer {
	public int Hp;
	public int Mp;
	public Position Position;
	public Map CurrentMap;
	public List<Item> Items;
	
	public Memento createMemento() {
		return new Memento();
	}

	public void setMemento(Memento memento) {
		this.Hp=memento.getHp();
		this.Mp=memento.getMp();
		this.Position=memento.getPosition();
		this.CurrentMap=memento.getCurrentMap();
		this.Items=memento.getItems();
	}
	
	public int getHp() {
		return Hp;
	}

	public void setHp(int hp) {
		this.Hp = hp;
	}

	public int getMp() {
		return Mp;
	}

	public void setMp(int mp) {
		this.Mp = mp;
	}

	public Position getPosition() {
		return Position;
	}

	public void setPosition(Position position) {
		this.Position = position;
	}

	public Map getCurrentMap() {
		return CurrentMap;
	}

	public void setCurrentMap(Map currentMap) {
		this.CurrentMap = currentMap;
	}

	public List<Item> getItems() {
		return Items;
	}

	public void setItems(List<Item> items) {
		this.Items = items;
	}
	
}
