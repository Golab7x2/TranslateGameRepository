package com.translate;

import java.util.Scanner;

public class TranslateGame {

	public static void main(String[] args) {

		LoadWords load = new LoadWords();
		load.loadWordsFromFile();
		
		GameMenu gm = new GameMenu();
		Scanner in = new Scanner(System.in);
		
		//game loop
		while(true)
		{
		gm.showMenu();
		int n = in.nextInt();
		
		switch(n)
		{
		case 1:
			//new game
		break;
		case 2:
			//try again
		break;
		case 3:
			//show best
			System.out.println("Your current best result is: "+gm.getBestRecord()+"\nTimes played: "+gm.getGamesPlayed());
		break;
		case 4:
			//exit game
			in.close();
			System.exit(0);
		break;
		}
		
		}

		//end of game loop
	}

}
