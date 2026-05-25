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
		System.out.println("Which element? ");
		int k=s.nextInt(); 
		int count=0;
		for(int i=0;i<n;i++){
		    if(arr[i]==k){
		        count++;
		     }
		}
		System.out.print("Frequency of "+k+" is: "+count);
	}
}
