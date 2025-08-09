package pack;
import java.util.Scanner;
public class Countof_Chars_digits_splchar {
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			String str=s.nextLine();
			int splchar=0;
			int digits=0;
			int alpha=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)>='a' &&str.charAt(i)<='z'  || str.charAt(i)>='A'  && str.charAt(i)<='Z') {
					alpha++;
				}
				else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
					digits++;
					
				}
				else {
					splchar++;
				}
			}
			System.out.println("alpabets: "+alpha);
			System.out.println("Digits: "+digits);
			System.out.println("Specialcharacters: "+splchar);

			
		}
		
	

}
