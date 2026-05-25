import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number: ");
		int n= s.nextInt();
		int c=n,r=0,count=0,m=n,sum=0;
		while(c!=0){
		    r= c%10;
		    c=c/10;
		    count++;
		}
		r=0;
		while(m!=0){
		    r=m%10;
		    sum+=Math.pow(r,count);
		    m= m/10;
		}
		if(sum==n){
		    System.out.println("Armstrong number");
		}else{
		    System.out.println("Not an Armstrong number");
		}
	}
}
