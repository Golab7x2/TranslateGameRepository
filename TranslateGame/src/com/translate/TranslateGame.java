package com.translate;

import java.util.Scanner;

public class TranslateGame {

	public static void main(String[] args) {

		LoadWords load = new LoadWords();
		load.loadWordsFromFile();
		
		GuessWords gw = new GuessWords();
		
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
			load.clearWords();
			gm.newGameSettings();
			for (int i = 0; i< gm.getNumberOfWords(); i++)
				load.drawWords();
			
			for (int i = 0; i< gm.getNumberOfWords(); i++)
			{
				gw.addWordsToGuess(load.getEnglishWords(load.getWord(i)));
				gw.addCorrectAnswers(load.getPolishWords(load.getWord(i)));
			}
			
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
