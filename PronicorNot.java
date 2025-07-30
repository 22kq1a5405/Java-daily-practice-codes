package pack;
import java.util.Scanner;
public class PronicorNot {
	public static void main(String [] qrgs) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag=0;
		for(int i=0;i<n;i++) {
			if(i*(i+1)==n) {
				flag=1;
				break;
			
		}}
			if(flag==1) {
				System.out.println("pronic");
			}
			else {
				System.out.println("not");
			}
		
	}

}
