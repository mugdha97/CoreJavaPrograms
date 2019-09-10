/******************************************************************************
 *  Purpose: Program is for prime anagram numbers 0 to 1000.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   10-09-2019
 *
 ******************************************************************************/

package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;

public class P3PrimeAnagram {

	public static void main(String[] args) {
		AlgorithmUtility utility = new AlgorithmUtility();
		for (int i = 0; i <= 1000; i++) {
			if (utility.isPrime(i)) {
				for (int j = i; j < 1000; j++) {
					if (i != j) {
						if (utility.isPrime(j)) {
							if (utility.isAnagram(String.valueOf(i), String.valueOf(j))&&utility.isPalindrome(i)) {
								System.out.println(i + " " + j + " is prime and anagram and palindrome");
							}
						}
					}
				}

			}

		}

	}

}