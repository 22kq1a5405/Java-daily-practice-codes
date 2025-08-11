package pack;

import java.util.Scanner;

public class AlphabetsPattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		char c='a';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
				c++;
			}
			
			System.out.println();
		}
	}
	

}
