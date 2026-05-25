import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number: ");
		int n= s.nextInt();
		int f=0;
		for(int i=2; i<=n/2;i++){
		    if(n%i==0){
		        f=1;
		    }
		}if(n==1 || n==2){
		    f=1;
		}
		if(f==0){
		    System.out.println("Prime number");
		}else{
		    System.out.println("Not a prime");
		}
	}
}
