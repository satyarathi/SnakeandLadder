package com.day.four;
import java.util.Random;

public class SnakeLadder {
	int startposition = 0;
	int endposition = 100;
	int currentposition = 0; 
	int oldposition = 0;
	int newposition = 0;
	int diceroll = 0;
	
	//option
	public  int option(){
		int Noplay = 0;
		int Ladder = 1;
		int Snake = 2;
		Random opt = new Random();
		int n = opt.nextInt(3);
		if (n == Noplay) {
			System.out.println("noplay");
			return n;
		}
		if (n == Ladder) {
			System.out.println("ladder");
			return n;
		}
		if (n == Snake) {
			System.out.println("snake");
			return n;
		}
		return n;
	
		}

 

	public static void main(String[] args) {
		SnakeLadder sp = new SnakeLadder();
		System.out.println("Initialposition :" +sp.startposition);

		//dice roll
		Random rolladice = new Random();
		int diceroll = rolladice.nextInt(7);
		if (diceroll == 0) {
			diceroll++;
		}	
		System.out.println("Dice rolled :" +diceroll);
		
		// option
		SnakeLadder j = new SnakeLadder();
		j.option();
		
		
		
	}
	
	
		
		
	}
	


