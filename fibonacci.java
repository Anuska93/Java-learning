import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("How many numbers? ");
		int n= s.nextInt();
		System.out.print("0 1 ");
		int a=0,b=1;
		int c=0;
		for(int i=1;i<=n-2;i++){
		    c=a+b;
		    System.out.print(c+" ");
		    a=b;
		    b=c;
		}
	}
}
