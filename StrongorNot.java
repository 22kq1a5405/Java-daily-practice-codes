package pack;
import java.util.Scanner;
public class StrongorNot {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	    int sum=0;
	    int temp=n;
	    
	    while(n>0) {
	    	int fact=1;
	    	int d=n%10;
	    	for(int i=1;i<=d;i++) {
	    		fact=fact*i;
	    		
	    	}
	    	
	    	sum+=fact;
	    	
	    	n=n/10;
	    	
	    }
	    if(sum==temp) {
	    	System.out.print("Strong");
	    }
	    else {
	    	System.out.print("not");
	    }
	}

}
