// mythread .java
class ExampleThread extends Thread {
public void run(){
System.out.println("Run method :");
}//end run method 
public void start(){
	System.out.println("start method :");
run();
	super.start();
}
public static void main(String []args){
ExampleThread  th=new ExampleThread ();
th.start();
System.out.println("main method ");



}



}//end class 