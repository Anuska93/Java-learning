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
		int max= arr[0];
		for(int i=0;i<n;i++){
		    if(max<arr[i]){
		        max=arr[i];
		    }
		}
		System.out.println("The largest element of array is: "+max);
	}
}
