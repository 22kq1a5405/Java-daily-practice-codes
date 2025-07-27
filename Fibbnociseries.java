package pack;
import java.util.Scanner;
public class Fibbnociseries {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			int a=0;
			int b=1;
			int c=0;
			System.out.print(a+" ");		
			System.out.print(b+" ");
			
	        while(c>=0) {
	        	
	        c=a+b;
			if(c<=n){
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
				
				
			}}
		}

	

}
