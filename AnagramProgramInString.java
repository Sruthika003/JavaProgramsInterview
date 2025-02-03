package stringsProgram;

import java.util.Arrays;

public class AnagramProgramInString {

	public static void main(String[] args) {
		String s1 = "Who";
		String s2 = "How";
		
		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();
		
		if(str1.length() != str2.length()) {
			System.out.println("both string are not anagram");
		}else {
			char[] c1 = str1.toCharArray();
			char[] c2 = str2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1, c2)) {
            	System.out.println("both strings are anagram");
            }else {
            	System.out.println("both string are not anagram");
            }
            
		}
		
		
		

	}

}
