import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number: ");
		int n= s.nextInt();
		int c=n,r=0,rev=0;
		while(c!=0){
		    r=c%10;
		    rev= (rev*10)+r;
		    c= c/10;
		}
		if(rev==n){
		    System.out.println("palindrome");
		}
		else{
		    System.out.println("not a palindrome");
		}
	}
}
