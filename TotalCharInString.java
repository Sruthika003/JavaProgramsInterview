package stringsProgram;

import java.util.Scanner;

public class TotalCharInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter the word");	
		String word = sc.nextLine();
		// this is one method using array
		char arr[]=new char[word.length()];
		for(int i =0; i<word.length(); i++) {
			arr[i]=word.charAt(i);
		}
		System.out.println(arr.length);
		
        // this second method
		int count =0;
		for(int i=0; i<word.length();i++) {
			if(word.charAt(i) != ' ') {
			  count = count+1;
			}
		}
		System.out.println(count);

		sc.close();	
	}

}
