interface myfunc{
    double val();
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		myfunc mfob= ()->9.99;
		System.out.print(mfob.getValue());
	}
}


interface myfunc{
    boolean val(int n);
}
public class Main
{
	public static void main(String[] args) {
		myfunc mfob= (n)->n%2==0;
		System.out.print(mfob.val(99));
	}
}


interface myfunc{
    boolean val(int n,int n1);
}
public class Main
{
	public static void main(String[] args) {
		myfunc mfob= (n,n1)->n%n1==0;
		System.out.print(!mfob.val(99,3));
	}
}


interface myfunc{
    int val(int n);
}
public class Main
{
	public static void main(String[] args) {
		myfunc mfob= (n)->{
		    int res=1;
		    for(int j=n;j>=1;j--)
		    res*= j;
		    return res;
		};
		System.out.println(mfob.val(3));
		System.out.print(mfob.val(5));
	}
}


interface myfunc{
    String val(String n);
}
public class Main
{
	public static void main(String[] args) {
		myfunc mfob= (n)->{
		    String res="";
		    for(int j=n.length()-1;j>=0;j--)
		    res+= n.charAt(j);
		    return res;
		};
		System.out.println(mfob.val("Hello"));
		System.out.print(mfob.val("Mee"));
	}
}
