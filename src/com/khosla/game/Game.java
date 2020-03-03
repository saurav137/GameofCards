package com.khosla.game;

import com.khosla.cards.Card;
import com.khosla.deck.Deck;
import com.khosla.players.Players;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private List<Players> playersList;
    private Deck deck;
    private int playerNo;

     public Game(int playerNo){    // Card gets distributed among players when game method is called
         this.playerNo=playerNo;
         deck = new Deck();
         playersList= new ArrayList<>();
        for(int i=0;i<playerNo;i++){
            Card tempCard= deck.getCardList(1).get(0);
            Players tempPlayer = new Players(i,tempCard);
            playersList.add(tempPlayer);
        }

     }

     public void  printWinner(){
         Collections.sort(playersList);  // To print winner sort players based on their card values
         System.out.println("Winner is "+ playersList.get(playersList.size()-1).getId());


     }
     public void addPlayer(int addPlayer){
         for(int i=0;i<addPlayer;i++){
             Players playerToAdd=new Players(playersList.size(),deck.getTopCard());
             playersList.add(playerToAdd);
         }
     }

     public void removePlayer(int removePlayer){
         for(int i=0;i<removePlayer;i++){
             Players playerToremove = playersList.get(playersList.size()-1);
             playersList.remove(playerToremove);
             deck.removeCard(playerToremove.getCard());
         }
     }
     public void suffleAndview(){
         deck.shuffle();
         deck.printAllCard();
     }
     public void viewCard(){
         deck.printAllCard();
     }
     public void viewPlayersCard(){
         Statics.showPlayersData(playersList);
     }

}
