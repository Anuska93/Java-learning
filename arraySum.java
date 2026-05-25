import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("How many numbers? ");
		int n= s.nextInt();
		int sum=0;
		int[] arr= new int[n];
		for(int i=0;i<n;i++){
		    arr[i]= s.nextInt();
		}
		for(int i=0;i<n;i++){
		    sum += arr[i];
		}
		System.out.println("The sum of array is: "+sum);
	}
}
