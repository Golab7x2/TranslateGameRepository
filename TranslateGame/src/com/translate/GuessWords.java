package com.translate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GuessWords {

	private int sizeOfBase;
	private List<Integer> numbersOfWords;
	private List<String> wordsToGuess;
	private List<String> correctAnswers;
	
	public GuessWords()
	{
		numbersOfWords = new ArrayList<>();
		wordsToGuess = new ArrayList<>();
		correctAnswers = new ArrayList<>();
	}
	
	public void setSizeOfBase(int size)
	{
		this.sizeOfBase = size;
	}
	
	//Draws words to guess and checks if words do not repeat
	public int generateIndex()
	{
		Random rand = new Random();
		return (int)(rand.nextDouble()*(this.sizeOfBase-1));
	}
	
	public int drawWords()
	{
		Random rand = new Random();
		int check = (int)(rand.nextDouble()*(this.sizeOfBase-1));
		boolean loopControl = false;
		
		while(loopControl)
		{
			loopControl = false;
			
		for (int i : numbersOfWords)
			if (check == i)
			{
				loopControl = true;
				check = (int)(rand.nextDouble()*(this.sizeOfBase-1));
			}	
		}
		
		numbersOfWords.add(check);
		return numbersOfWords.get(check);
	}
	
}
