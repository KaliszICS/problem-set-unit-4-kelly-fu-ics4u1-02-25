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
 * Sets the card's name
 * @param name the new name of the card
 */
public void setName(String name){
    this.name = name;
}


/**
 * Gets the card's suit
 * @return the card's suit
 */
public String getSuit(){
    return suit;
}

/**
 * Sets the card's suit
 * @param suit the new suit of the card
 */
public void setSuit(String suit){
    this.suit = suit;
}

/**
 * Gets the card's value
 * @return the card's value
 */
public int value(){
    return value;
}

/**
 * Sets the card's value
 * @param value the new value of the card
 */
public void setValue(int value){
    this.value = value;
}


public String toString(){
    return name + " of " + suit;
}

public boolean equals(Object obj){
    if (this == obj){
        return true;
    }
    if (obj == null || getClass() != obj.getClass()){
        return false;
    }
    Card card = (Card) obj;
    return value == card.value && name.equals(card.name) && suit.equals(card.suit);
}
}
