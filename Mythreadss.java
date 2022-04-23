class Mythreadss extends Thread {
	Mythreadss(){
	super();
	}
	Mythreadss(Runnable targate){
	
	super(targate);
	}
public void run(){
System.out.println("run method :");
}//end run method

}//end class