package stringsProgram;

import java.util.Scanner;

public class TotalPunctuationInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence using punctuation");
		String str = sc.nextLine();
		int count =0;
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) =='.'|| str.charAt(i)==','||str.charAt(i) == ';'|| str.charAt(i) == ':'|| str.charAt(i) =='!'||str.charAt(i) == '?') {
				count ++;
			}
		}
		System.out.println(count);
sc.close();
	}

}
