package pack;
import java.util.Scanner;
public class MagicorNot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		int rev=0;
		int su=sum;
		while(sum>0) {
			int digit=sum%10;
			rev=rev*10+digit;
			sum=sum/10;
		}

		if(su*rev==temp) {
			System.out.print("magic number");
		}
		else {
			System.out.println("not");
		}
	}

}
