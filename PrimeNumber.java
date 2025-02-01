package basicsProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check it is prime or not");
		int num =s.nextInt();
		boolean flag =true;
		for(int i =2; i<=num/2; i++) {
			if(num%i == 0) {
				
				flag = false;
				break;
			}else {
				flag = true;
			}
		}
		
if(flag) {
	System.out.println("the given number is prime");
}else {
	System.out.println("the given nymber is not prime");
}
s.close();
	}

}
