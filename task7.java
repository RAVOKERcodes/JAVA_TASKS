package TASK;

import java.util.Scanner;

public class task7 {
	
	static boolean checkSum(String num) {
	int sum =0;
	// Traverse each digit
	int digit = 0;
	for (int i = 0; i < num.length(); i++)
	{												//converting a character to integer by
														// taking difference of their ASCII value
		digit = num.charAt(i) - '0';
		sum += digit;
	}

	// Check if sum is even and divisible by 4
	// or'if sum is odd and divisible by 3 then
	// return true, else return false
	if((sum%2==0&&sum%4==0) || (sum%2!=0&&sum%3==0))
		return true;
	return false;
}
	
	
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number: ");
		String num = scanner.next();
		System.out.println(checkSum(num));
		
}}