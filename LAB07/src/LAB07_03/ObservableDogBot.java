
//DogBot객체를 받아서 관찰 할 수 있는 객체로 바꿔주는 클래스, Observable을 상속한다.
//생성할때 DogBot객체를 받아 저장하고 그 객체의 name도 저장한다.
//DogBot인터페이스 선언된 함수를 구현한다. 함수 실행할때 마다 update할수 있게 setChange와 notifyObservers를 호출한다.
package LAB07_03;

import java.util.Observable;

public class ObservableDogBot extends Observable {
	private DogBot dog;
	private String obsname;

	ObservableDogBot(DogBot DB) {
		dog = DB;
		PlainDogBot PDB=(PlainDogBot)dog;
		obsname="observed"+PDB.getName();
	}

	public void play() {
		dog.play();
		setChanged();
		notifyObservers("play");
	}

	public boolean eat() {
		if(dog.eat()) {
			notifyObservers("eat");
			setChanged();
			return true;
		}else {
			return false;
		}
	}

	public void rest() {
		dog.rest();
		setChanged();
		notifyObservers("rest");
	}

	public String noise() {
		setChanged();
		notifyObservers("noise");
		return dog.noise();
	}

	public String toString() {
		return obsname;
	}

	public String getName() {
		PlainDogBot PDB=(PlainDogBot)dog;
		return PDB.getName();
	}

}
