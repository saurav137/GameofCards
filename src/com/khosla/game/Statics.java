package com.khosla.game;

import com.khosla.cards.Card;
import com.khosla.players.Players;

import java.util.ArrayList;
import java.util.List;

public class Statics {

    public static void showAll(List<Card> cardList){   //static method to print cardlist
        for(int i=0;i<cardList.size();i++){
            Card presentCard=cardList.get(i);
            System.out.println(presentCard.getFaceValue()+"    "+presentCard.getSuit()+" "+i);;
        }
    }
    public static void showPlayersData(List<Players> playersList){ //static method to print playerlist
        for (int i=0;i<playersList.size();i++){
            Players player = playersList.get(i);
            System.out.println("ID: "+ player.getId()+" CARD VALUE: "+ player.getCard().getFaceValue()+" SUIT: "+ player.getCard().getSuit());
        }
    }

}
