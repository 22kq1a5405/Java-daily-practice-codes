package pack;
import java.util.Scanner;
public class LcmGcd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int gcd=0;
		for(int i=1;i<n1&&i<n2;i++) {
			if(n1%i==0&&n2%i==0) {
				gcd=i;
			}
		}
		System.out.println("GCD: "+gcd);
		System.out.println("LCM: "+(n1*n2)/gcd);

		
	}

}
