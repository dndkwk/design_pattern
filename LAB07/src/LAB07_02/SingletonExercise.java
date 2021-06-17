//2015112232백근주
//Deck 클래스는 유일해야하며 모든 클래스에서 접근할 수 있어야 한다. 그러므로 Deck에 싱글톤 패턴을 적용시킨다.
//Deck 생성자를 private으로 만들어주고 접근할 수 있는 getDeck()메소드를 전역 메소드로 구현한다.
//getDeck은 Deck을 반환한다.
package LAB07_02;

import java.util.*;

enum Suit {
	SPADES, HEARTS, CLUBS, DIAMONDS
}

class Card {
	
	private Suit suit;
	private int number;
	
	public Card(Suit s, int n) {
		suit = s;
		if ((n < 2) || (n > 14)) {
			throw new IllegalArgumentException();
		}
		number = n;
	}

	public void print() {
		switch (number) {
		case 11:
			System.out.print("Jack");
			break;
		case 12:
			System.out.print("Queen");
			break;
		case 13:
			System.out.print("King");
			break;
		case 14:
			System.out.print("Ace");
			break;
		default:
			System.out.print(number);
			break;
		}
		System.out.print(" of ");
		switch (suit) {
		case SPADES:
			System.out.println("spades.");
			break;
		case HEARTS:
			System.out.println("hearts.");
			break;
		case CLUBS:
			System.out.println("clubs.");
			break;
		case DIAMONDS:
			System.out.println("diamonds.");
			break;
		}
	}
}

class Deck {
	private List<Card> cards;
	private static Deck deck;//Deck은 유일해야한다.
	
	private Deck() {
		cards = new ArrayList<Card>();
		// build the deck
		Suit[] suits = { Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS };
		for (Suit suit : suits) {
			for (int i = 2; i <= 14; i++) {
				cards.add(new Card(suit, i));
			}
		}

		// shuffle it!
		Collections.shuffle(cards, new Random());
	}
	
	public static Deck getDeck() {
		if (deck == null) {
			deck = new Deck();
		}
		return deck;
	}

	public void print() {
		for (Card card : cards) {
			card.print();
		}
	}

}

public class SingletonExercise {
	public static void main(String args[]) {
		Deck deck = Deck.getDeck();
		deck.print();
	}
}