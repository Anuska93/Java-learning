import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s= new Scanner(System.in);
	    int flag=0;
	    int[] arr= {1,2,3,50,111};
	    for(int i=0;i<arr.length-1;i++){
	        if(arr[i]>arr[i+1]){
	            flag=1;
	        }
	    }if(flag==0){
	    System.out.println("sorted");
	    }else{
	        System.out.print("Not sorted");
	    }
	}
}
