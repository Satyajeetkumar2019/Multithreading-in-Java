class Mythreads  extends Thread { 
	Mythreads(){
	super();
	}
	Mythreads(Runnable targate){
	
	super(targate);
	}
public void run(){
System.out.println("run method :");
}//end run method
}