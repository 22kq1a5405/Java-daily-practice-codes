package pack;
import java.util.Scanner;
public class Biggestnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is bigger");
		}
		else if(b>a && b>c){
			
			System.out.println(b+" is bigger");
		}
		else {
			System.out.println(c+" is bigger");
		}

	}

}
