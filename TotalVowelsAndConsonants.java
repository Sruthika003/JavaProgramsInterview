package stringsProgram;

import java.util.Scanner;

public class TotalVowelsAndConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sentence or String");
		String str = sc.nextLine();
		int vowel =0, consonants =0;
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) =='a'|| str.charAt(i) =='e'|| str.charAt(i) =='i'||str.charAt(i) =='o'||str.charAt(i) =='u'|| str.charAt(i) =='A'||
				str.charAt(i) =='E'||str.charAt(i) =='I'||str.charAt(i) =='O'|| str.charAt(i) =='U'){
					vowel++;
				}else {
					consonants++;
				}
		
		}
		System.out.println("vowels "+ vowel);	
		System.out.println("Consonants "+ consonants);
  sc.close();
	}

}
