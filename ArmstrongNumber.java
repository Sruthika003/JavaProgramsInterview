package basicsProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
	// 153 = (1*1*1)+(5*5*5)+(3*3*3) = 1 +125 +27 = 153 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check it is armstrong number or not");
		int num = sc.nextInt();
		int i, j =0, temp ;
		temp = num;
		if(num <0) {
			System.out.println("not amrstrong");
		}else {
			while(temp>0){
				i = temp% 10;
				j = (int) (j + Math.pow(i,3));
				temp= temp/10;
			}
		}
		if(num == j) {
			System.out.println("the given number is armstrong");
		}else {
			System.out.println("not armstrong");
		}
		sc.close();
		}
	
	
	
//	
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("enter the number");
//	int num = scanner.nextInt();
//	int originalNumber, n=0, reminder, result=0;
//	originalNumber = num;
//	for(;originalNumber!=0; originalNumber /=10, ++n) ;
//	originalNumber =num;
//	for(;originalNumber!=0; originalNumber /=10) {
//		reminder = originalNumber%10;
//	result = (int) (result +Math.pow(reminder, n));
//	}
	

}
