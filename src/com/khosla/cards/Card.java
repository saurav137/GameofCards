package com.khosla.cards;

public class Card {

    private  Suits suit;
    private int faceValue;

    public Card(int faceValue,Suits suits){
        this.faceValue=faceValue;
        this.suit=suits;

    }
    public int getFaceValue(){
        return this.faceValue;
    }

    public Suits getSuit() {
        return this.suit;
    }
}
