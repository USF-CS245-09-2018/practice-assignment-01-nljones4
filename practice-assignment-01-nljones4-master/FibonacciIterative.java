
public class FibonacciIterative implements Fibonacci {
	
	public int fibonacci (int n){
		int num = 0;
		int temp = 0;
		int next = 1;
		
		if (n <= 1){
			return 1;
		}
		
		for (int i = 2; i <= n; i++){
			num = temp + next;
			temp = next;
			next = num;
		}
		return num;	
	}
	
		
}
	
