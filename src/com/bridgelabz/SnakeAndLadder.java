package com.bridgelabz;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println(" Welcome to the Snake And Ladder Game");

		int player_pos = 0;
		final int ladder = 1;
		final int snake = 2;
		int option;
		int totalmoves=0;

		System.out.println("Player starting position is: " + player_pos);

		while (player_pos < 100) {
			int dice = (int) Math.floor((Math.random() * 7));
			System.out.println("Dice Value is : " + dice);

			option = (int) Math.floor((Math.random() * 3));

			switch (option) {

			case ladder:
				System.out.println(" Current position has ladder");
				player_pos = player_pos + dice;
				totalmoves++;
				break;
			case snake:
				System.out.println(" Current position had snake");
				player_pos = player_pos - dice;
				player_pos = player_pos < 0 ? 0 : player_pos;
				totalmoves++;
				break;
			default:
				System.out.println(" No play.");
				totalmoves++;
			}
			System.out.println(" Current position is: " + player_pos);
		}
		System.out.println("Total moves taken to win the game is : " + totalmoves);
		System.out.println(" Congratulations. You have won the game..");
	}

}
