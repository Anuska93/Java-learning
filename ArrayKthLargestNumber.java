import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
	    int n=s.nextInt();
		int a[]= new int[n];
		for(int i=0;i<a.length;i++){
		    a[i]=s.nextInt();
		}
		int k =s.nextInt();
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[n-k]);
	}
}
