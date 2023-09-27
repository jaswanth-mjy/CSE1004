/**
 * Given two integers x and n, we need to find number of ways to express x as sum of n-th powers of unique natural numbers. It is given that 1 <= n <= 20.

Examples:

Input  : x = 100
         n = 2
Output : 3
Explanation: There are three ways to 
express 100 as sum of natural numbers
raised to power 2.
100 = 10^2 = 8^2+6^2 = 1^2+3^2+4^2+5^2+7^2

Input  : x = 100
         n = 3
Output : 1
Explanation : The only combination is,
1^3 + 2^3 + 3^3 + 4^3
 */
// Java program to count number of ways 
// to express x as sum of n-th power 
// of unique natural numbers. 
public class p2 { 

	// num is current num. 
	static int countWaysUtil(int x, int n, int num) 
	{ 
		// Base cases 
		int val = (int) (x - Math.pow(num, n));//x-num^n
		if (val == 0) 
			return 1; 
		if (val < 0) 
			return 0; 
	
		// Consider two possibilities, num is 
		// included and num is not included. 
		return countWaysUtil(val, n, num + 1) + 
			countWaysUtil(x, n, num + 1); 
	} 
	
	// Returns number of ways to express 
	// x as sum of n-th power of two. 
	static int countWays(int x, int n) 
	{ 
		return countWaysUtil(x, n, 1); 
	} 
	
	// Driver code 
	public static void main(String args[]) 
	{ 
		int x = 100, n = 2; 
		System.out.println(countWays(x, n)); 
	} 
} 
