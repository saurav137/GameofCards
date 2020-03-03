package com.khosla;

import com.khosla.cards.Card;
import com.khosla.game.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("No. of players want to join the Game?");
        Scanner sc= new Scanner(System.in);
        int noOfPlayers= sc.nextInt();

        Game game= new Game(noOfPlayers);

        System.out.println("Card distributed among "+noOfPlayers+ " players");


        int count=0;
        while (true) {
            System.out.println("Choose one from the menu...");
            System.out.println("To add player......... .........1");
            System.out.println("To remove player...... .........2");
            if(count>0){
                System.out.println("To reStart game....... .....3");

            }else {
                System.out.println("To start game.........       3");
            }
            System.out.println("To exit game.................... .4");
            System.out.println("To suffle existing deck and view..5");
            System.out.println("To  view existing deck............6");
            System.out.println("To  view existing Each players Card..7");

            int chosenValue=sc.nextInt();
            switch (chosenValue) {
                case 1:
                    System.out.println("How many players to do you want add..");
                    int numToadd=sc.nextInt();
                    game.addPlayer(numToadd);
                    System.out.println("players succusfully added");
                    break;
                case 2:
                    System.out.println("How many players to do you want to remove ");
                    int numToremove=sc.nextInt();
                    game.removePlayer(numToremove);
                    System.out.println("players succusfully removed");
                    break;
                case 3:
                    game.printWinner();
                    count++;
                    break;
                case 5:
                    game.suffleAndview();
                    break;
                case 6:
                    game.viewCard();
                    break;
                case 7:
                    game.viewPlayersCard();
                    break;
            }
            if(chosenValue==4)
            {
                System.out.println("Exiting game");
                break;
            }
        }


    }
}
