package com.translate;

import java.util.Scanner;

public class TranslateGame {

	public static void main(String[] args) {

		LoadWords load = new LoadWords();
		load.loadWordsFromFile();
		
		GuessWords gw = new GuessWords();
		
		GameMenu gm = new GameMenu();
		Scanner in = new Scanner(System.in);
		
		int iterator = 0;
		int correct;
		//game loop
		while(true)
		{
		
		gm.showMenu();
		int n = in.nextInt();
		
		
		switch(n)
		{
		case 1:
			//new game
			load.clearWords();
			gw.clearWords();
			gm.question();
			int m = in.nextInt();
			gm.setNumberOfWords(m);
			for (int i = 0; i < gm.getNumberOfWords(); i++)
				load.drawWords();
			
			for (int i = 0; i < gm.getNumberOfWords(); i++)
			{
				gw.addWordsToGuess(load.getEnglishWords(load.getWord(i)));
				gw.addCorrectAnswers(load.getPolishWords(load.getWord(i)));
			}
			in.nextLine();
			correct = 0;
			for (int i = 0; i < gm.getNumberOfWords(); i++)
			{
				gw.question(i);
				int a = gw.checkAnswer(in.nextLine(), i);
				correct += a;
				gm.setBestRecord(correct);
			}
			gm.setGamesPlayed(++iterator);
		break;
		
		case 2:
			//try again
			if (iterator == 0)
				break;
			
			in.nextLine();
			correct = 0;
			for (int i = 0; i < gm.getNumberOfWords(); i++)
			{
				gw.question(i);
				int a = gw.checkAnswer(in.nextLine(), i);
				correct += a;
				gm.setBestRecord(correct);
			}
			gm.setGamesPlayed(++iterator);	
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
