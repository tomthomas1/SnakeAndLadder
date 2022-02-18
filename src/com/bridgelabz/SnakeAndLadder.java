package com.bridgelabz;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println(" Welcome to the Snake And Ladder Game");

		int player_pos = 0;
		final int ladder = 1;
		final int snake = 2;

		System.out.println("Player starting position is: " + player_pos);

		int dice = (int) Math.floor((Math.random() * 7));
		System.out.println("Dice Value is : " + dice);

		int option = (int) Math.floor((Math.random() * 3));

		switch (option) {

		case ladder:
			System.out.println(" Current position has ladder");
			player_pos += dice;
			break;
		case snake:
			System.out.println(" Current position had snake");
			if(player_pos < 0) {
			player_pos -= dice;
			}
			break;
		default:
			System.out.println(" No play.");
		}
		System.out.println(" Current position is: " + player_pos);
	}

}
