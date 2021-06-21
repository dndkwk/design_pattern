package LAB11_4;

import java.util.ArrayList;

public class ShellSort extends SortStrategy {
	public void sort(ArrayList<String> array) {
		System.out.println("Shell Sort");
		int len=array.size();
		int gap=len;
		String temp="";
		
		while(gap>1) {
			gap=(gap/3)+1;
			for(int i=0;i<gap;i++) {
				for(int j=i+gap;j<len;j+=gap) {
					for(int k=i;k<j;k+=gap) {
						if(array.get(k).compareTo(array.get(j))>0) {
							temp=array.get(k);
							array.set(k, array.get(j));
							array.set(j, temp);
						}
					}
				}
				
			}
			
		}
		
		for(int i=0;i<array.size();i++) {
			System.out.println(array.get(i));
		}
		System.out.println("");
		
	}
}
