package pack;
import java.util.Scanner;
public class P{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String res="";
		String consonantstr="bcdfghjklmnpqrstvwxyz"; //aeiou
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<consonantstr.length();j++) {
				if(str.charAt(i)==consonantstr.charAt(j)) {
					res+=str.charAt(i);
				}
			}
		}
		System.out.print(res+" ");
	}
}
