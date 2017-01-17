package com.translate;

import java.util.Scanner;

public class GameMenu {

	private int numberOfWords;
	private double bestRecord;
	private int gamesPlayed;
	
	public GameMenu()
	{
		bestRecord = 0;
		gamesPlayed = 0;
	}
	
	public void showMenu()
	{
		System.out.println("[1] New Game\n[2] Try Again\n[3] Show current best result\n[4] Exit");
	}
	
	
	public void newGameSettings()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("How many words? ");
		numberOfWords = in.nextInt();
		in.close();
	}
	
	public void setBestRecord(int correctWords)
	{
		bestRecord = (correctWords/this.numberOfWords) * 100 + this.numberOfWords;
	}
	
	public double getBestRecord()
	{
		return bestRecord;
	}
	
	public void setGamesPlayed(int gamesPlayed)
	{
		this.gamesPlayed = gamesPlayed;
	}
	
	public int getGamesPlayed()
	{
		return gamesPlayed;
	}
	
}
