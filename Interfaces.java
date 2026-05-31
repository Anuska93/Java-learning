interface CallBack{
    public void callme();
    public void check();
}

class Server implements CallBack{
    public void callme(){
        System.out.println("Call me early");
    }
    public void check(){
        System.out.println("All checked... fine");
    }
    public String server(){
        return "I am Server.";
    }
}

class Client implements CallBack{
    public void callme(){
        System.out.println("Do not call");
    }
    public void check(){
        System.out.println("Not ready yet");
    }
    public String client(){
        return "I am client.";
    }
}

public class Main
{
	public static void main(String[] args) {
		CallBack c= new Client();
		c.callme();
		Server s= new Server();
		s.callme();
		c=s;
		c.callme();
	}
}


/*
o/p:
  
Do not call
Call me early
Call me early
  */
