enum Color{
    RED, GREEN, BLUE;
}

public class Main{
    
    public static void main(String[] args){
        
        Color c1=Color.RED;
        System.out.println(c1);    // RED
        for(Color c:Color.values()){
            System.out.println(c);    // RED GREEN BLUE
        }
    }
}

//  https://www.geeksforgeeks.org/java/enum-in-java/
