package pack;
import java.util.Scanner;
public class Largest_element_in_Array {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int max=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
				
		}
		System.out.println(max);
	}

}
