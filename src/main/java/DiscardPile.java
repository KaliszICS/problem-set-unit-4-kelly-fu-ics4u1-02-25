/** 
 * The DiscardPile class represents a pile of cards that have been discarded.
 * It allows the cards to be added and removed
 *  @author Kelly Fu
 * @version 17.0.1
 */

public class DiscardPile {
    private Card[] discardPile;

/**
 * Constructs an array of cards and sets it as the discard pile
 * @param givenCards this array of cards to initialize the discard pile
 */
public DiscardPile(Card[] givenCards){
    if (givenCards != null){
        this.discardPile = givenCards;
    }
    else{
        this.discardPile = new Card[0];
    }
}

/**
 * Constructs an empty discard pile with no parameters
 */
public DiscardPile(){
    this.discardPile = new Card[0];
}


/**
 * Returns the discard pile as an array of cards
 * @return the array of cards in the pile
 */
public Card[] getDiscardPile(){
    return this.discardPile;
}

/**
 * Rturns the amount of cards in the discard pile
 * @return the size of the pile
 */
public int size(){
    return this.discardPile.length;
}


/**
 * Adds the provided card into the discard pile
 * @param card the card to add
 */
public void addCard(Card card){
    if (card == null){
        return;
    }

    Card[] currentPile = new Card[this.discardPile.length + 1];
    for (int i = 0; i < this.discardPile.length; i++){
        currentPile[i] = this.discardPile[i];
    }
     currentPile[this.discardPile.length] = card;
     this.discardPile = currentPile;
}

/**
 * Removes the specified card from the discard pile and returns it
 * If the card does not exist, return null
 * @param card the card to remove
 * @return card the card to remove
 * @return the removed card or null if the card does not exist
 */
public Card removeCard(Card card){
    if (card == null || this.discardPile.length == 0){
        return null;
    }
    for (int i = 0; i < this.discardPile.length; i++){
        if (this.discardPile[i].equals(card)){
            Card removedCards = this.discardPile[i];
            Card[] currentPile = new Card[this.discardPile.length - 1];
            int index = 0;
            for (int j = 0; j < discardPile.length; j++){
                if (j != i){
                    currentPile[index] = this.discardPile[j];
                    index++;
                }
            }
            this.discardPile = currentPile;
            return removedCards;
        }
    }
    return null;
}

/**
 * Removes the array of all cards from the discard pile
 * If there are no cards in the discard pile return an empty Card array
 * @return an array of all cards from the discard pile
 */
public Card[] removeAll(){
    Card[] allCards = this.discardPile;
    this.discardPile = new Card[0];
    return allCards;
}

/**
 * Returns all of the cards in the specific format(eg. "Ace of hearts, King of Hearts, Queen of Hearts, Jack of Hearts, 9 of Spades.")
 * @return the String format of the discard pile
 */
public String toString(){
    String result = "";
    for (int i = 0; i < this.discardPile.length; i++){
        result = result + this.discardPile[i].toString();
        if (i < this.discardPile.length - 1){
            result = result + ", ";
        }
        
    }
    return result;
}


}
