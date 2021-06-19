//2015112232백근주
//Rocket 객체를 만들고 그 객체들을 RocketTable에 넣어준다.
//객체들이 들어있는 RocketTable을 JTable에 넣어줌으로써 Table을 그릴 수 있도록 만든다. 
package makeRocket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RocketUI {

	public void getRocketUI() {
		Rocket[] rockets = new Rocket[] { new Rocket("Shooter", 3.95, 50), new Rocket("Orbit", 29.95, 5000), };

		RocketTable rocketBomb = new RocketTable(rockets);
		JFrame frame = new JFrame();
		JTable table = new JTable(rocketBomb);
		frame.add(new JScrollPane(table));
		frame.setSize(300, 400);
		frame.setVisible(true);
	}
}
