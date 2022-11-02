package com.day.four;
import java.util.Random;

public class SnakeLadder {
	int startposition = 0;
	int endposition = 100;
	int currentposition = 0; 
	int oldposition = 0;
	int newposition = 0;
	int diceroll = 0;

	public static void main(String[] args) {
		SnakeLadder sp = new SnakeLadder();
		System.out.println(sp.startposition);

		//dice roll
		Random rolladice = new Random();
		int diceroll = rolladice.nextInt(7);
		if (diceroll == 0) {
			diceroll++;
		}
		System.out.println(diceroll);
	}
}
