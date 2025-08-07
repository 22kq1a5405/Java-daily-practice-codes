package pack;
import java.util.Scanner;
public class Sri {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] !=0) {
				System.out.print(arr[i]+" ");
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] ==0) {
				System.out.print(arr[i]+" ");
			}
			
		}

}
}