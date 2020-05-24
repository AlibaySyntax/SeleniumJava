package com.syntax.syntax08Loops;

public class Task1PrintNumbersFrom1to50 {

	public static void main(String[] args) {
		/*print number from 1 to 50 except those*/
		for (int i=1; i<51; i++ ) {
			if (i%3 == 0) {
				continue;
		}
			System.out.println(i);
}}}

