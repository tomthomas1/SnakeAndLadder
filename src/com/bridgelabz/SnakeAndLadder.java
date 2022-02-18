package com.bridgelabz;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println(" Welcome to the Snake And Ladder Game");

		int player_pos = 0;
		System.out.println("Player position is: " + player_pos);

		int dice = (int) Math.floor((Math.random() * 7));
		System.out.println("Position after dice rolled is : " + dice);

	}

}
