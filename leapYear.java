import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Year: ");
		int y= s.nextInt();
		if(y%4==0){
		    if(y%400==0){
		        System.out.println("Leap yr.");
		    }else{
		        System.out.println("Not a leap yr.");
		    }
		}
		else{
		    System.out.println("Not a leap yr.");
		}
	}
}
