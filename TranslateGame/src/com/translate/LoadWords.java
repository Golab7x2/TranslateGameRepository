package com.translate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadWords {

	final static char SEPARATOR = ';';
	private List<String> englishWords;
	private List<String> polishWords;
	private List<Integer> numbersOfWords;
	
	public LoadWords()
	{
		englishWords = new ArrayList<>();
		polishWords = new ArrayList<>();
		numbersOfWords = new ArrayList<>();
	}
	
	//Loads words to list and put them into separated lists
	public void loadWordsFromFile()
	{
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader("wordbase.csv"));
			List<String> loadedWords = new ArrayList<>();
			
			String s = reader.readLine();
			while(s != null)
			{
				loadedWords.add(s);
				s = reader.readLine();
			}			
			reader.close();
			
			for(String n : loadedWords)
			{
				int index = 0;
				
				//searching index of SEPARATOR
				while(n.charAt(index) != SEPARATOR)
				index++;
				
				polishWords.add(n.substring(0, index));
				englishWords.add(n.substring(index+1));
			}
			
		}
		catch (Exception e) 
		{
			System.out.println("Base of words cannot be loaded");
		}

	}
	
	
	public String getEnglishWords(int n)
	{
		return englishWords.get(n);
	}
	
	public String getPolishWords(int n)
	{
		return polishWords.get(n);
	}
	

	//Draws words to guess and checks if words do not repeat	
	public void drawWords()
	{
		Random rand = new Random();
		int check = (int)(rand.nextDouble()*(this.englishWords.size()-1));
		boolean loopControl = false;
		
		while(loopControl)
		{
			loopControl = false;
			
		for (int i : numbersOfWords)
			if (check == i)
			{
				loopControl = true;
				check = (int)(rand.nextDouble()*(this.englishWords.size()-1));
			}	
		}
		
		numbersOfWords.add(check);
		System.out.println(check);
	}
	
	public void clearWords()
	{
		numbersOfWords.clear();
	}
	
	public int getWord(int index)
	{
		return numbersOfWords.get(index);
	}
	
}
