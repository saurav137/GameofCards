package com.khosla.players;

import com.khosla.cards.Card;
import com.khosla.cards.Suits;

import java.util.ArrayList;
import java.util.List;

public class Players implements Comparable<Players>{   //implementing Comparable to sort players based on their card values
    private int Id;
    public Card card;

    public Players(int id,Card card){
        this.Id=id;
        this.card=card;

    }

    public Card getCard() {
        return card;
    }

    public int getId() {
        return Id;
    }

    public void setCard(Card card) {
        this.card = card;
    }
    @Override
    public int compareTo(Players per){
        Card tempCard=per.getCard();
        if(card.getFaceValue()==tempCard.getFaceValue()) //if face value is same compare their suits
            return compareSuits(card.getSuit(),tempCard.getSuit());
        else return card.getFaceValue()>tempCard.getFaceValue() ? 1: -1;
    }
    public int compareSuits(Suits s1,Suits s2){
       return s1.compareTo(s2);
    }


}
