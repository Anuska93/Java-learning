/* a simple generic class with multi params*/

class Gen<T,V>{
    T ob;
    V ob1;
    Gen(T o,V i){
        ob=o;
        ob1= i;
    }
    
    T getob(){
        return ob;
    }
    V getob1(){
        return ob1;
    }
    void showobs(){
        System.out.println(ob+" , "+ob1);
    }
}

class Main{
    public static void main(String[]args){
        Gen<Integer,Double> iob= new Gen<Integer,Double>(880,88.0);
        iob.showobs();
    }
}


/* calculating average of any class like Integer, Double then using wildcard(?) checking if the average of Integer and Double is same or not */

class Stats<T extends Number>{
    T[] nums;
    
    Stats(T[] o){
        nums= o;
    }
    
    double getAvg(){
        double sum=0;
        for(T num:nums){
            sum+= num.doubleValue();
        }
        return (sum/nums.length);
    }
    Boolean sameAvg(Stats<?> ob){
        if(ob.getAvg()==getAvg())
            return true;
        return false;
    }
}
public class Main
{
	public static void main(String[] args) {
		Integer inum[]= {1,2,3,4,5};
		Double dnum[]={1.0,2.0,3.0,4.0,5.0};
		Stats<Integer> iob= new Stats<Integer>(inum);
		Stats<Double> dob= new Stats<Double>(dnum);
		iob.getAvg();
		dob.getAvg();
		System.out.println(iob.sameAvg(dob));
	}
}

// generic constructor

class GenCons{
    private double val;
    <T extends Number>GenCons(T args){
        val= args.doubleValue();
    }
    void showval(){
        System.out.println(val);
    }
}
class Main{
    public static void main(String[] args){
        GenCons ob= new GenCons(100.9);
        ob.showval();
    }
}
