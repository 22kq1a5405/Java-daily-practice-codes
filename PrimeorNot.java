package pack;
import java.util.*;
public class PrimeorNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("not prime");
				break;
			}
			System.out.println("prime");
			break;
		}
		

	}

}
