package com.interviewassignment.util;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RunnerInput {
	/**
	 * reads user entered data
	 * @throws InterruptedException
	 */
	public static void readUserInput() throws InterruptedException {
		System.out.println(" **************** HOLA!!! *************************");
		System.out.println(" *****  Choose your numbers from  the Below Keypad ");
		System.out.println(" -------------");
		System.out.println(" | 1 | 2 | 3 |");
		System.out.println(" | 4 | 5 | 6 |");
		System.out.println(" | 7 | 8 | 9 |");
		System.out.println(" | * | 0 | # |");
		System.out.println(" -------------");
		
		TimeUnit.SECONDS.sleep(2);
		
		System.out.println(" Now!, How many numbers do you wish to enter ");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		if(count>=10) {
			System.out.println(" Thats a wrong input, try entering numbers equal to 9 in count");
			System.out.println(" Exiting ...");
			System.exit(0);
		}
		System.out.println(" Alright!, you choose to enter " + count + " numbers, ");
		
		int[] input = new int[count];
		for (int i = 0; i < input.length; i++) {
			if (i == 0) {
				System.out.print(" Press 1st key and press enter         :");
			} else if (i == 1) {
				System.out.print(" next, Press 2nd key and press enter   :");
			} else if (i == 2) {
				System.out.print(" now, Enter 3rd key and press enter    :");
			} else if (i == 3) {
				System.out.print(" you are doing Good, now press 4th key :");
			} else if (i == 4) {
				System.out.print(" Alright, now press 5th key            :");
			}else if (i == 5) {
				System.out.print(" amazing, now press 6th key            :");
			}else if (i == 6) {
				System.out.print(" you are so close, now press 7th key   :");
			}else if (i == 7) {
				System.out.print(" Wonderful, now press 8th key          :");
			}else if (i == 8) {
				System.out.print(" Last one now, press 9th key           :");
			}
			input[i] = scanner.nextInt();
		}
		System.out.print(" you entered " );
		for(int z : input) {
			System.out.print(z);
		}
		int number[] = input;
		System.out.println(" \n Here is all you we got it for you - Combination of all characters from numbers you entered \n");
		PrintCharacters.printWords(number);
	}

}
