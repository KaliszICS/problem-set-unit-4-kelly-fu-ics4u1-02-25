/**
 * The Deck class represents a deck of cards that can be drawn from and shuffled
 * It allows the deck of cards to be shuffled, drawn, added, and reshuffled.
 * @author Kelly Fu
 * @version 17.0.1
 */


import java.util.Random;

public class Deck{
    private Card[] deck;
  
    
/**
 * Constructs an array of cards and sets it as the deck
 * @param initialCards array of Card objects
 */
public Deck(Card[] initialCards){
        if(initialCards != null){
            this.deck = initialCards;
           }
        else{
            initialCards = new Card[0];
        }
        }


/**
 * Constructs an unshuffled deck of cards 
 * Ace through King for each suit
 * Each suit has the order of hearts, clubs, diamonds, spades
 */
public Deck(){
    String[] suits = {"hearts", "clubs", "diamonds", "spades"};
    String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    this.deck = new Card[52];
    int index = 0;
    for(int i = 0; i < suits.length; i++){
        for (int j = 0; j< names.length; j++){
            this.deck[index] = new Card(names[j], suits[i], j + 1);
            index++;
        }
    }
}


/** 
 * Returns the number of cards in the deck
 * @return the length/size of the deck
 */
public int size(){
    return this.deck.length;
}


/** 
 * Draws and removes the top card of the deck
 * @return null if there are no cards left in the deck
 * @return topCard from the deck
 */
public Card draw(){
    if (this.deck.length == 0){
        return null;
    }
    Card topCard = this.deck[0];
    Card[] newDeck = new Card[this.deck.length-1];
    for (int i = 1; i < this.deck.length; i++){
        newDeck[i-1] = this.deck[i];
    }
    this.deck = newDeck;
    return topCard;
}


/**
 * Shuffle method: rearranges the order of the cards in the deck
 */
public void shuffle(){
    Random random = new Random();
    for (int i = this.deck.length - 1; i > 0; i--){
        int j = random.nextInt(i + 1);
        Card temp = this.deck[i];
        this.deck[i] = this.deck[j];
        this.deck[j] = temp;
    }
}


/** 
 * Adds a card to the deck if it's not null
 * @param card the card to add
 */
public void addCard(Card card){
    if (card == null){
        return;
    }
    Card[] newDeck = new Card[this.deck.length+1];
    for(int i = 0; i < this.deck.length; i++){
        newDeck[i] = this.deck[i];
    }
    newDeck[this.deck.length] = card;
    this.deck = newDeck;
}


/**
 * Reshuffle method: adds all of the cards in the provided card array into the deck
 * Ignore the null cards in the array
 */
public void reshuffle(Card[] cards){
    if (cards == null || cards.length == 0){
        return;
    }
    Card[] newDeck = new Card[this.deck.length + cards.length];
    for(int i = 0; i < this.deck.length; i++){
        newDeck[i] = this.deck[i];
    }
    for (int j = 0; j < cards.length; j++){
        newDeck[this.deck.length + j] = cards[j];
    }
    this.deck = newDeck;
    shuffle();
    }
}



