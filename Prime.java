package pack;
import java.util.Scanner;
public class Prime {
	static int isprime(int n) {
		if(n==1 || n==0) {
			return 0;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int count=0;
		for(int i=1;i<=n;i++) {
			if(isprime(i)==1) {
				sum+=i;
				count++;
			}
			
		}
		System.out.println("sum: "+sum);
		System.out.println("count: "+count);

	}

}
