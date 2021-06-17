//2015112232백근주
//Observer인터페이스를 받는 DogBot을 관찰하는 객체이다. DogBot이 바뀔때마다 update를 해준다.
package LAB07_03;

import java.util.Observable;
import java.util.Observer;

public class DogWatcher implements Observer{
	
	private String name;
	DogWatcher(String s){
		
		name=s;
	}
	
	public String toString()
	 {
	  return "Dog Watcher: "+name;
	 }


	@Override
	public void update(Observable obs, Object obj) {
		ObservableDogBot temp=(ObservableDogBot)obs;
		System.out.println("["+temp.getName()+"] "+"Update: "+ obj);
	}
	
}
