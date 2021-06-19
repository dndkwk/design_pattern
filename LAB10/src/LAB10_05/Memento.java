
package LAB10_05;

import java.util.List;
import java.util.Map;

public class Memento {
	public int Hp;
	public int Mp;
	public Position Position;
	public Map CurrentMap;
	public List<Item> Items;

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
