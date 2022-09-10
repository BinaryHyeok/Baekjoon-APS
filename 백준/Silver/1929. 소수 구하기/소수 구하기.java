
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		boolean[] arr = new boolean[N+1];
		
		arr[0] = arr[1] = true;
		
		for(int i = 2; i < arr.length; i++) {
			if(arr[i] == true)
				continue;
			for(int j = 2; i * j < arr.length; j++) {
				if(arr[i * j] == false)
					arr[i * j] = true;
			}
		}
		
		for(int i = M ; i <= N; i++) {
			if(arr[i] == false)
				System.out.println(i);
		}
	}
}
