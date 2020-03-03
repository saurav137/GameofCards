package com.khosla.deck;

import com.khosla.cards.Card;
import com.khosla.cards.Suits;
import com.khosla.game.Statics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Card> CardList= new ArrayList<>();

    public Deck(){

        for(Suits s:Suits.values()){
            for(int i=1;i<=13;i++){
                Card card= new Card(i,s);
                CardList.add(card);
            }
        }
        this.shuffle();
    }
    public void shuffle(){   //method to suffle  card
        Random random= new Random();
        for(int i=CardList.size()-1;i>=0;i--){
            int randInt=random.nextInt(i+1);
            Card temp=CardList.get(randInt);
            CardList.set(randInt,CardList.get(i));
            CardList.set(i,temp);
        }
    }
    public void printAllCard(){
        System.out.println("cards present in deck....");
        Statics.showAll(CardList); //Using static method to show all cards
    }

    public List<Card> getTotalCardList() {
        return CardList;
    }

    public List<Card> getCardList(int listLength) {
        List<Card> retCardList=new ArrayList<>();
        for(int i=0;i<listLength;i++){
            Card tempo=this.CardList.get(i);  //when user request for card list, cards first removed the cardlist and then sent
            retCardList.add(tempo);
            this.CardList.remove(i);
        }
        return retCardList;
    }
    public Card getTopCard(){     //method to get the top most card
        Card ret= CardList.get(CardList.size()-1);
        CardList.remove(ret);
        return ret;
    }
    public void removeCard(Card card){
        CardList.add(card);
    }  //this methdd is called when a player is removed so card is added to the card list

    public void addCards(List<Card> cardList){
        for(int i=0;i<cardList.size();i++){
            this.CardList.add(cardList.get(i));
        }
    }  //this method can be called to add card in the deck
}
