import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("How many numbers? ");
		int n= s.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
		    arr[i]= s.nextInt();
		}
		for(int i=n-1;i>=0;i--){
		    System.out.print(arr[i]+" ");
		}
	}
}
