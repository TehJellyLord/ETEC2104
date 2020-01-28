/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author terio
 */
public class Card {
    //in Suit.java
    public enum Suit {
        HEARTS, CLUBS, DIAMONDS, SPADES
    }
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;
    private int rank;
    private Suit suit;
    public int getRank(){
        return this.rank;       //'this' is optional
    }
    public Suit getSuit(){
        return this.suit;
    }
    public Card(int rank, Suit suit){
        if( rank < 2 || rank > Card.ACE )
            throw new RuntimeException("Bad rank");
        this.rank = rank;
        this.suit = suit;
    }
    public boolean outranks(Card other_card)
    {
        if (this.rank>other_card.getRank())
        {
            return true;
        }
        return false;
    }
    public boolean matchesSuit(Suit other_suit)
    {
        return this.suit == other_suit;
    }
    
    @Override
    public String toString()
    {
        String s_out = "";
        if(this.rank < 11)
        {
            s_out += String.valueOf(this.rank);
        }
        else
        {
            if (this.rank == Card.ACE)
            {
                s_out += "Ace";
            }
            else if (this.rank == Card.JACK)
            {
                s_out += "Jack";
            }
            else if (this.rank == Card.QUEEN)
            {
                s_out += "Queen";
            }
            else if (this.rank == Card.KING)
            {
                s_out += "King";
            }
        }
        s_out += " of ";
        if (this.suit == suit.CLUBS)
        {
            s_out += "Clubs";
        }
        else if (this.suit == suit.SPADES)
        {
            s_out += "Spades";
        }
        else if (this.suit == suit.HEARTS)
        {
            s_out += "Hearts";
        }
        else if(this.suit == suit.DIAMONDS)
        {
            s_out += "Diamonds";
        }
        return s_out;
    }
}
