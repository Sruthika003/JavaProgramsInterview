package basicsProgram;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check for palindrome");
		int num = sc.nextInt();
		int i, j =0, temp;
		temp = num;
		while(num>0) {
			i = num %10;
		    j = (j*10)+i;
		   num = num/10;
		}
if(temp == j) {
	System.out.println("the given number is palindrome");
}else {
	System.out.println("not palindrome");
}
sc.close();
	}

}
