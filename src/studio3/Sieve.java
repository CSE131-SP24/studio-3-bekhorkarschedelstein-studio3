package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What number n do you want to find prime numbers up to? ");
		int n = in.nextInt();
		boolean[] numbers = new boolean[n+1];

		for (int i = 0 ; i< numbers.length; i++ ) {
			numbers [i]= true;
		}

		for (int i = 2 ; i<= n ; i++) {
			if (numbers [i] == true) {
				for (int j = i+i ; j<= n ; j=j+i) {
					numbers [j] = false;
				}

			}

		}
		for (int i=2; i<=n; i++) {
			if (numbers [i] == true) {

				System.out.println ("The prime numbers are " + i);
			}
		}

	}
	
}
