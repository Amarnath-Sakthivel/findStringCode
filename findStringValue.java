package com.wipro.practice;
import java.util.Scanner;

public class findStringValue {
  static int findCodeValue(String input1) {
		input1 = input1.toUpperCase();
		String finalResult = "";
		for (String split : input1.split(" ")) {
			int sum = 0;
			if (split.length() % 2 == 1) {
				for (int i = 0; i <= split.length() / 2; i++) {
					sum += (split.charAt(i) == split.charAt(split.length() - i - 1))
							? Math.abs(split.charAt(i) - 'A' + 1)
							: Math.abs((split.charAt(i) - 'A' + 1) - (split.charAt(split.length() - i - 1) - 'A' + 1));
				}
			} else if (split.length() % 2 == 0) {
				for (int i = 0; i < split.length() / 2; i++) {
					sum += Math.abs((split.charAt(i) - 'A' + 1) - (split.charAt(split.length() - i - 1) - 'A' + 1));
				}
			}
			finalResult += sum;
		}
		//System.out.println(finalResult);
		return finalResult;
	}
}
