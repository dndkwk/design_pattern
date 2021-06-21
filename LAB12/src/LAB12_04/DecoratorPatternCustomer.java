package LAB12_04;

import java.util.Scanner;

public class DecoratorPatternCustomer {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("========= Food Menu ============ \n");
			System.out.print("1. Vegetarian Food.  \n");
			System.out.print("2. Non-Vegetarian Food. \n");
			System.out.print("3. Chinese Food.  \n");
			System.out.print("4. Exit  \n");
			System.out.print("Enter your choice: ");
			num = sc.nextInt();
			
			switch (num) {
			case 1:
				VegeFood vf = new VegeFood();
				System.out.println(vf.menu());
				System.out.println(vf.price());
				break;
			case 2:
				Food nvf = new NonVegeFood(new VegeFood());
				System.out.println(nvf.menu());
				System.out.println(nvf.price());
				break;
			case 3:
				Food cf = new ChinaFood(new VegeFood());
				System.out.println(cf.menu());
				System.out.println(cf.price());
				break;
			case 4:
				System.out.println("exit");
				break;
			default:
				System.out.println("no menu");
			}
			
		} while (num != 4);
		
		sc.close();
	}

}
