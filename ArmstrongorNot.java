package pack;
import java.util.Scanner;
public class ArmstrongorNot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		int temp=n;
		int num=n;
		while(n>0) {
			int d=n%10;
			count++;
			
			n=n/10;
		}
		//int p=count;
		int armnum=0;
		while(temp>0) {
			int digit=temp%10;
			
			armnum+=Math.pow(digit, count);;
			//System.out.println(armnum);
			temp=temp/10;
		}
		if(num==armnum) {
			System.out.print("armstrong");
		}
		else {
			System.out.print("not");
		}
	}

}
