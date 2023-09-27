// Recursive java program to 
// find sum of digits of a number 
import java.util.*; 

class p3 
{ 
	// Function to check sum 
	// of digit using recursion 
	static int sum_of_digit(int n) 
	{ 
		if (n == 0) 
			return 0; 
		return (n % 10 + sum_of_digit(n / 10)); 
	} 

	// Driven Program to check above 
	public static void main(String args[]) 
	{ 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
		int result = sum_of_digit(num); 
		System.out.println(result); 
	} 
} 

