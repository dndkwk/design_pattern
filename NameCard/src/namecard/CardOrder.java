package namecard;

/**
 * OOP Assignment One
 * CardOrder class keeps details of one card order
 * and provides methods to print a card 
 * and determine the price
 *
 */
public class CardOrder {
	private Name name;  	//the name printed on the card
	private char border;    //the card border
	private int numCards;   //the number of cards to be printed
	
	private static final int CARD_LEN = 32;  //the length of the card in characters
	
	//initialises name from value in parameter
	//and sets other instance variables to suitable default values
	//you can create a Name from a single string after L5
      //If you want to start before then, just write name = new Name("A", "B", "C") in the constructor!
	public CardOrder(String fullName) {
		//초기화
		this.border='*';
		this.numCards=0;
		
		//middle 네임 있는지 확인
		String[] str=fullName.split(" ");
		if(str.length == 3) {
			this.name=new Name(str[0],str[1],str[2]);
		}else if(str.length == 2){
			this.name=new Name(str[0],str[1]);
		}
	}
	
	///////////////////////////////////////////
	//accessor/mutator methods
	
	//returns the character used in the border
	public char getBorder() {
		return border;
	}
	
	//sets the character used in the border 
	//to that provided in the parameter
	public void setBorder(char ch) {
		this.border=ch;
	}
	
	//returns the name 
	public Name getName() {
		return name;
	}
	
	//sets the name used in the card
	//to that provided in the parameter
	public void setName(Name name) {
		this.name=name;
	}
	
	//returns the number of cards to be printed
	public int getNumCards() {
		return numCards;
	}
	
	//sets the number of cards to be printed 
	//to that provided in the parameter
	public void setNumCards(int n) {
		this.numCards=n;
	}
	///////////////////////////////////////////
	
	//returns a sample card, including a newline at the end of each line
	public String getSampleCard() {
		return getTopLine() + getBlankLine() + this.getLineWithName()
		       + getBlankLine() + getTopLine();
	}
	
	//returns a String containing the top or bottom line
	//of a card, including a newline character at the end
	private String getTopLine() {
		//use this value until more code written
		//처음과 끝 라인 만들기
		String Topline="";
		Topline=Topline+name.getInits();
		int len=name.getInits().length();
		for(int i=0;i<CARD_LEN-len*2;i++) {
			Topline=Topline+border;
		}
		Topline=Topline+name.getInits();
		return Topline+"\n";
	}
	
	//returns a String containing the blank line
	//of a card, with a border char at each end
	//and including the newline character	
	private String getBlankLine() {	
		//use this value until more code written
		//이름없는 공백 라인 만들기
		String Blankline="";
		for(int i=0;i<CARD_LEN;i++) {
			if(i==0 || i==31) {
				Blankline=Blankline+border;
			}else {
				Blankline=Blankline+" ";
			}
		}
		return Blankline+"\n";
	}
	
	//returns a String containing the name line
	//of a card, including name, padding and border
	//and including the newline character	
	private String getLineWithName() {
		//use this value until more code written
		String Nameline="";
		String fullName="";
		
		//미들 네임의 유무에 따라 달라진다.
		if(this.name.getMiddleName().isEmpty()) {
			fullName=name.getFirstAndLastName();
		}else {
			fullName=name.getFirstAndMidInitAndLastName();
		}
		
		//border+공백+이름+공백+border 만들기
		for(int i=0;i<CARD_LEN;i++) {
			if(i==0 || i==31) {
				Nameline=Nameline+border;
			}else if(i==(CARD_LEN-fullName.length()+1)/2){
				Nameline=Nameline+fullName;
				i=i+fullName.length()-1;
			}else {
				Nameline=Nameline+" ";
			}
		}
		
		
		return Nameline+"\n";
	}
	
	//returns the price of one card
	//in pounds (i,e either 0.20 or 0.25)
	//based on the number of characters in the name to be printed
	//0.20 if <=12 otherwise 0.25
	public double getCardPrice() {
		//use this value until more code written
		double CardPrice=0;
		int len=0;
		
		if(!name.getMiddleName().isEmpty()) {
			//미들 네임이 있을때
			len=name.getFirstAndMidInitAndLastName().length();
		}else {
			len=name.getFirstAndLastName().length();
		}
		
		if(len<=12) {
			CardPrice=40;
		}else {
			CardPrice=50;
		}
		return CardPrice;
	}

	//returns the final cost of the order
	//which is the number of cards multiplied by the card price
	//and reduced by 10% if >= 100 cards
    public double getFinalCost() {
		//use this value until more code written
    	double FinalCost=0;
    	if(hasDiscount()) {
    		//200장 이상이면 할인
    		FinalCost=getCardPrice()*numCards*0.9;
    	}else {
    		FinalCost=getCardPrice()*numCards;
    	}
		return FinalCost;   	
    }
    
    //returns true if number of cards < 100, false otherwise
    public boolean hasDiscount() {
    	//200장 이상여부 확인
    	return numCards>=200;
    }
}
