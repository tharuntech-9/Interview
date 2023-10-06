package com.iq.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingChar {
	public void count(String loc) throws IOException {
		File file=new File(loc);
		FileInputStream fileInputStream=new FileInputStream(file);
		InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		String data;
		String [] wordscount;
		int charcount=0;
		int wordcount=0;
		while ((data = bufferedReader.readLine()) != null) {
			charcount = data.length();
			
			wordscount=data.split(" ");
			wordcount=wordscount.length;
			
		}
		System.out.println(charcount);
		System.out.println(wordcount);
	}
	
	
	
	public static void main(String[] args) throws IOException {
		String loc="D:\\tharun.txt";
		new CountingChar().count(loc);
	}
}
