import java.util.Arrays;
import java.util.Scanner;


public class WordSorter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		char[] wordArray = word.toCharArray();
		Arrays.sort(wordArray);
		
		System.out.println(wordArray);
	}
}
