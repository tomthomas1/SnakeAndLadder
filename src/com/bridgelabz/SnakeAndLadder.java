package com.bridgelabz;

public class SnakeAndLadder {
	public static void main(String[] args) {
		int position1 = 0;
		int position2 = 0;
		System.out.println(" Welcome to the Snake And Ladder Game ");

		int dice;
		int option;
		int roll = 0;
		int turn = 0;
		int oldTurn = 0;
     // to iterate till any player reaches pos 100 
		while (position1 < 100 && position2 < 100) {

			if (turn == 0)   //Player 1 plays
				System.out.println(" Player 1 is playing");
			else   // Player 2 plays 
				System.out.println(" Player 2 is playing");

			dice = (int) Math.floor((Math.random() * 10) % 6 + 1);   // to generate random num for dice
			System.out.println(" The dice was rolled to: " + dice);
			option = (int) Math.floor(Math.random() * 3);   //to generate random num for ladder or snake 

			switch (option) {
			case 0:
				System.out.println(" No play.");
				break;
			case 1:
				System.out.println(" Current position has ladder IIIIIII");
				if (turn == 0)
					position1 += dice;

				else
					position2 += dice;

				if (position1 > 100) {
					position1 -= dice;
					System.out.println(" Player1 exceeded 100 so not counting");
				}

				if (position2 > 100) {
					position2 -= dice;
					System.out.println(" Player2 exceeded 100 so not counting");
				}
				break;
			case 2:
				System.out.println(" Current position had snake ~~~~~~~~>>");
				if (turn == 0)
					position1 -= dice;

				else
					position2 -= dice;

				if (position1 < 0) {
					position1 = 0;
					System.out.println(" Player1 reset to 0");
				}

				if (position2 < 0) {
					position2 = 0;
					System.out.println(" Player2 reset to 0");
				}
				break;
			}

			turn = (turn + 1) % 2;    // to change the players

			if (oldTurn == 0) {
				System.out.println(" Current position for Player1: " + position1 + "\n");
			} else {
				System.out.println(" Current position for Player2: " + position2 + "\n");
			}
			roll++;
			oldTurn = turn;
		}

		System.out.println(" Congratulations Player" + (turn + 1));
		System.out.println("  You won the game in " + roll + " rolls");
	}

}
