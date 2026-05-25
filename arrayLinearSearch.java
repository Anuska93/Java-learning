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
		System.out.println("Element to search? ");
		int k=s.nextInt(); 
		for(int i=0;i<n;i++){
		    if(arr[i]==k){
		        System.out.println(k+" found at index: "+i);
		    }
		}
	}
}
