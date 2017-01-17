package com.translate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LoadWords {

	private char SEPARATOR = ';';
	private List<String> englishWords;
	private List<String> polishWords;
	
	//Loads words to list and sort them into separated lists
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
			
			englishWords = new ArrayList<>();
			polishWords = new ArrayList<>();
			
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
			e.printStackTrace();
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
	
	public int getSizeOfBase()
	{
		return englishWords.size();
	}

}
