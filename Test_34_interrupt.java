//Application #34 working with interrupt 
// Test_34_interrupt.java 
class Mythread34 extends Thread {
public void run(){
System.out.println("Run method :");
try{
	System.out.println("before passe-1");
	Thread.sleep(5000);
}catch (InterruptedException e){
	System.out.println("IE raise ");
e.printStackTrace();
}
try{
	System.out.println("before pause-2");
	Thread.sleep(2000);
}catch (InterruptedException ei) {
	System.out.println("ei rise ");
ei.printStackTrace();
}
System.out.println("after pause-2");
System.out.println("end of the run method :");
}//end of the run method 
}//end of the classs
class Test_34_interrupt {
public static void main(String []args )throws InterruptedException {
System.out.println("start main method :");
Mythread34 mt=new Mythread34();
mt.interrupt();

mt.start();
mt.interrupt();
mt.interrupt();
Thread.sleep(2000);
mt.interrupt();

System.out.println("main end ");
}
}//end of the Test class