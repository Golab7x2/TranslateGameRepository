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

	
	public void clearToGuess()
	{
		wordsToGuess.clear();
	}
	
	public void clearCorrect()
	{
		correctAnswers.clear();
	}
	
}
