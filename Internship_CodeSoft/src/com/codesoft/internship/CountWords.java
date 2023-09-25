package com.codesoft.internship;

import java.io.File;
import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text to count the words:");
		String input = sc.nextLine();
		String text = "";
		try {
			File file = new File(input);
			Scanner fileScanner = new Scanner(file);
			while (fileScanner.hasNextLine()) {
				text += fileScanner.nextLine() + "\n";
			}
			fileScanner.close();
		} catch (Exception e) {
			text = input;
		}
		String[] words = text.split(" |\\p{Punct}");
		int wordCount = 0;

		for (String word : words) {
			if (!word.isEmpty()) {
				wordCount++;
			}
		}
		System.out.println("The total number of words : " + wordCount);
	}

}
