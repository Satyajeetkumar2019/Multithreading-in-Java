class Mythread  extends Thread { 
public void run(){
System.out.println("run method :");
}//end run method
	public static void main(String[] args) {
	Mythread mt=new Mythread();
	mt.start();

		System.out.println("Hello World!");
	}//end mm
}//end class
