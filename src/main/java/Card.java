/**
 * The Card class represents the card's name, suit, and value.
 * @author Kelly Fu
 * @version 17.0.1
 */
public class Card{
    private String name;
    private String suit;
    private int value;

/**
 * Constructs a card object with the given name, suit, value
 * @param name the name of the card(eg. Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King)
 * @param suit the suit of the card (eg.  Hearts, Spades, Diamonds, Clubs)
 * @param value the value of the card
 */
public Card(String name, String suit, int value){
    this.name = name;
    this.suit = suit;
    this.value = value;
}

/**
 * Gets the card's name
 * @return the card's name
 */
public String getName(){
    return name;
}


/**
 * Gets the card's suit
 * @return the card's suit
 */
public String getSuit(){
    return suit;
}


/**
 * Gets the card's value
 * @return the card's value
 */
public int getValue(){
    return value;
}


/**
 * Returns its full form (e.g. "Queen of Diamonds" if the name is "Queen" and the suit is "Diamonds")
 */
@Override
public String toString(){
    return this.name + " of " + this.suit;
}

/**
 * Checks if the two cards have the same name, suit and value
 */
@Override
public boolean equals(Object obj){
    if (obj == null || obj.getClass() != this.getClass()){
        return false;
    }
    Card card = (Card) obj;
    return this.value == card.value && this.name.equals(card.name) && this.suit.equals(card.suit);
}
}
