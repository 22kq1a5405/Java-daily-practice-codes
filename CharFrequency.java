package pack;

import java.util.Scanner;

public class CharFrequency {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        String str=s.next();
        
        for(int i=0;i<str.length();i++) {
        	char currentchar=str.charAt(i);
        	boolean alreadycounted=false;
        	for(int k=0;k<i;k++) {
        		if(str.charAt(k)==currentchar) {
        		alreadycounted=true;
        		break;
        		}
        	}
        	if(!alreadycounted) {
           	int count=1;
        	for(int j=i+1;j<str.length();j++) {
        		if(str.charAt(i)==str.charAt(j)) {
        			count++;
        			
        		}
        	}
        	System.out.print(str.charAt(i) + "-"+ count +",");
        }}
	}

}
