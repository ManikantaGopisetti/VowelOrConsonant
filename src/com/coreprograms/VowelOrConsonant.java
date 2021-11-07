package com.coreprograms;

import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		char vowel[]= {'a','e','i','o','u'};
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter alphabet : ");
		char alphabet=scan.next().charAt(0);
		int count=0;
		
		for(int i=0;i<vowel.length;i++) {
			if(vowel[i]==alphabet) {
				count++;
			}
			
		}
		if(count==1) {
			System.out.println("Given alphabet  "+alphabet+"  is vowel");
		}
		else {
			System.out.println("Given alphabet  "+alphabet+"  is consonant");
		}
	}

}
