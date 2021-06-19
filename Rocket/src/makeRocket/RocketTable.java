//2015112232 백근주
//AbstractTableModel를 상속받는다. 생성자에서 rockets배열을 매개변수로 받는다.
//rocket배열만으로는 Table을 만들 수 없으므로 RocketTable이 어댑터 역할을 한다.
package makeRocket;

import javax.swing.table.*;

public class RocketTable extends AbstractTableModel {
	protected Rocket[] rockets;
	protected String[] columnNames = new String[] { "Name", "Price", "Apogee" };

	public RocketTable(Rocket[] rockets) {
		this.rockets = rockets;
	}

	public int getColumnCount() {
		// 완성할 코드!
		return columnNames.length;
	}

	public String getColumnName(int i) {
		// 완성할 코드!
		return columnNames[i];
	}

	public int getRowCount() {
		// 완성할 코드!
		return rockets.length;
	}

	public Object getValueAt(int row, int col) {
		// 완성할 코드!
		switch (col) {
		case 0:
			return rockets[row].getName();
		case 1:
			return rockets[row].getPrice();
		case 2:
			return rockets[row].getApogee();
		default:
			return null;
		}

	}

}
