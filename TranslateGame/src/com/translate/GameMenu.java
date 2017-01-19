package com.translate;

public class GameMenu {

	private int numberOfWords;
	private int gamesPlayed;
	private double bestRecord;
	
	public GameMenu()
	{
		bestRecord = 0;
		gamesPlayed = 0;
	}
	
	public void showMenu()
	{
		System.out.println("[1] New Game\n[2] Try Again\n[3] Show current best result\n[4] Exit");
	}
	
	
	public void question()
	{
		System.out.print("How many words?");
	}
	
	public void setNumberOfWords(int m)
	{
		this.numberOfWords = m;
	}
	
	//ZMIENIC NALICZANIE WYNIKOW
	public void setBestRecord(int correctAnswers)
	{
		double tempBest = correctAnswers/this.numberOfWords + 10 * this.numberOfWords;
		
		if (tempBest > this.bestRecord)
			bestRecord = tempBest;
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
	
	public int getNumberOfWords()
	{
		return numberOfWords;
	}
	
}
