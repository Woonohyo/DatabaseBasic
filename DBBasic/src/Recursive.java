
public class Recursive {
	public static void main(String[] args) {
		int n = 9;
		long result = Recur(n);
		System.out.println(result);
	}
	
	public static long Recur(int n) {
		if ( n == 1 ) 
			return 2;
		else if ( n == 2 )
			return 3;
		else
			return Recur(n - 1) * Recur(n - 2);
	}
}
