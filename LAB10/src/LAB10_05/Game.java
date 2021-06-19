//2015112232백근주
package LAB10_05;

import java.util.List;

public class Game {

	List<Memento> snapshots;

	public void Play() {
		Adventurer temp = new Adventurer();
		do {
			snapshots.add(temp.createMemento());
			
			if(temp.Hp<=0) {
				temp.setMemento(snapshots.get(snapshots.size()-1));
				
			}
		}while(true);
	}

}
