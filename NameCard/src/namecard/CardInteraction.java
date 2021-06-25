package namecard;

/*
 * OOP Assignment 1
 * Contains methods for interaction with user
 */
import java.util.Scanner;

public class CardInteraction {
	private Scanner scanner;
	private CardOrder card;

	public CardInteraction() {
		scanner = new Scanner(System.in);
	}

	// runs the program as follows:
	// Gets details of card name from user
	// Displays card
	// Repeatedly, until user responds ok
	// Asks the user if they would like to change the border
	// If so, change the border and print the new card
	// Print the price of the order
	// print whether a discount is applicable or not
	public void run() {
		// Alter this gradually to add more details
		String border="";
		this.card = new CardOrder(getNameFromUser());//이름입력
		
		//테두리 입력받기
		while(true){
			//샘플 카드 보여주기
			System.out.print("\nHere is a sample card: \n\n");
			System.out.print(card.getSampleCard());
			
			System.out.print("\nEnter “OK” if this card is ok, otherwise enter an alternative border character:");
			border=scanner.nextLine();
			
			if(!border.equals("OK")) {
				//OK가 아니면
				this.card.setBorder(border.charAt(0));
			}else {
				break;
			}
		}
		
		this.card.setNumCards(getNumberFromUser());//매수 입력
		
		System.out.print("\nThe price of "+ card.getNumCards() +" cards is "+ (int)card.getFinalCost() +" won\n");
		if(card.hasDiscount()) {
			System.out.print("10% discount applied\n");
		}else {
			System.out.print("No discount given\n");
		}
		

	}

	// repeatedly requests and reads name from user
	// until valid (i.e. <=28 chars and contains at least one space
	// finally returns the valid text
	private String getNameFromUser() {
		// use this value until more code written
		//이름 입력 받기
		String fullName;
		do {
			System.out.print("Enter name: ");
			fullName=scanner.nextLine();
			if(fullName.length() >28) {
				System.out.print("이름이 28자 보다 많습니다\n");
			}
			
			if(fullName.indexOf(" ") == -1) {
				System.out.print("공백이 없습니다\n");
			}
		}while(fullName.length() >28 || (fullName.indexOf(" ") == -1));
		
		return fullName;
	}

	// repeatedly requests and reads number from user
	// until valid number entered i.e. between 1 and 1000
	// finally returns the valid number
	private int getNumberFromUser() {
		// use this number until more code written
		// 프린트 매수 입력받기
		int cnt;
		do {
			System.out.print("How many cards would you like? ");
			cnt=scanner.nextInt();
			if(cnt < 1 || cnt>1000) {
				//오류메시지 출력
				System.out.print("범위를 벗어났습니다.\n");
			}
		}while(cnt < 1 || cnt>1000);//범위를 벗어나면 계속 입력
		
		
		return cnt;
	}
	
	

}
