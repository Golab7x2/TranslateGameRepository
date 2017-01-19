package com.translate;

import java.util.ArrayList;
import java.util.List;

public class GuessWords {

	private List<String> wordsToGuess;
	private List<String> correctAnswers;
	
	public GuessWords()
	{
		wordsToGuess = new ArrayList<>();
		correctAnswers = new ArrayList<>();
	}
	

	public void addWordsToGuess(String word)
	{
		this.wordsToGuess.add(word);
	}
	
	public void addCorrectAnswers(String answer)
	{
		this.correctAnswers.add(answer);
	}

	
	public void clearWords()
	{
		wordsToGuess.clear();
		correctAnswers.clear();
	}

	public void question(int i)
	{
		System.out.println("What is the meaning of: "+wordsToGuess.get(i));
	}
	
	public int checkAnswer(String answer, int i)
	{
		if (this.correctAnswers.get(i).equals(answer))
			{
			System.out.println("Correct! Points added!");
			return 1;
			}
		else 
			{
			System.out.println("Wrong answer! :(");
			return 0;
			}
	}
		
		
}
