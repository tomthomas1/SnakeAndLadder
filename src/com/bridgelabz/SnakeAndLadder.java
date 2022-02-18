package com.bridgelabz;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println(" Welcome to the Snake And Ladder Game");

		int player_pos = 0;
		final int ladder = 1;
		final int snake = 2;
		int option;
		int totalmoves=0;
          //initalize the starting position.
		System.out.println("Player starting position is: " + player_pos);

		while (player_pos < 100) {
			int dice = (int) Math.floor((Math.random() * 7));   // random function for dice
			System.out.println("Dice Value is : " + dice);

			option = (int) Math.floor((Math.random() * 3)); // random function for moves

			switch (option) {
                // if random function is 1 then it is ladder and will increment the position.
			case ladder:
				System.out.println(" Current position has ladder H");
				System.out.println("                             H");
				player_pos = player_pos + dice;
				//if the position is greater that 100 then it will not take any move.
				if (player_pos > 100) {
					player_pos = player_pos - dice;
					System.out.println(" NOT VALID. Please continue to play as current position greater that 100.");
				}
				totalmoves++;
				break;
			case snake:
				// if random function is 2 then it is snake and will decrement the position.
				System.out.println(" Current position had snake ~~~~~~~~>>");
				player_pos = player_pos - dice;
				player_pos = player_pos < 0 ? 0 : player_pos;
				totalmoves++;
				break;
			default:
				// else there will be no moves and will be in the current position.
				System.out.println(" No play.");
				totalmoves++;
			}
			System.out.println(" Current position is: " + player_pos);
		}
		System.out.println("Total moves taken to win the game is : " + totalmoves);
		System.out.println(" Congratulations. You have won the game..");
	}

}
