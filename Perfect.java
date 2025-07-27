package pack;
import java.util.Scanner;
public class Perfect {

	public static int perfectornot(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			return 1;
		}
		else {
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum1=0;
		int count=0;
		for(int i=1;i<n;i++) {
			if(perfectornot(i)==1) {
				sum1+=i;
				count++;
			}
		}
		System.out.println("sum: "+sum1);
		System.out.println("count: "+count);
	}

	

}
