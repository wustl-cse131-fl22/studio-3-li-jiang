package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the maximum number: ");
		int maximumNumber = in.nextInt();
		int[] primeNumber = new int[maximumNumber - 1];
		
		for(int i = 2; i <= maximumNumber ; i++) {
			primeNumber[i-2] = i;
		}
		
		for (int n = 1; n < maximumNumber-1; n++){
			for (int k = 2 ; k < n + 2; k++) {
				if((n+2) % k == 0 && (n+2)!=2) {
					primeNumber[n] = 0;
				}
			}
		}
		
		for (int n = 0; n < maximumNumber-1; n++){
			if (primeNumber[n]!= 0) {
				System.out.print(primeNumber[n] + " ");
			}
		}
	}

}
