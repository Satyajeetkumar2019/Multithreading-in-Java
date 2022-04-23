//Applicatio #31
//Test_31pareantChildRelaction
class Myexample1 extends Thread {
public void run(){
System.out.println("Mythread1 priority :"+this.getPriority());
System.out.println("Mythresd1 daemon :"+this.isDaemon());
}//end run method 
}//end classs 1

class MyExample2 extends Thread {
public void run(){
System.out.println("Mythread2  priority :"+this.getPriority());
System.out.println("Mythres2 daemon :"+this.isDaemon());
Myexample1 th1=new Myexample1();
th1.start();
}//end of the run method
}//end of the class 2

class Test_31pareantChildRelaction {
public static void main(String []args) throws  InterruptedException{
System.out.println("main start :");
Thread th=Thread.currentThread();
System.out.println(" main thread   priority :"+this.getPriority());
System.out.println("main thread daemon :"+this.isDaemon());
MyExample2 th3=new MyExample2();
th3.start();
System.out.println(" mythrads thread    priority :"+this.getPriority());
System.out.println("my thread  thread daemon :"+this.isDaemon());
th3.setPriority(7);
th3.setDaemon();
th3.sleep(3000);
System.out.println("main end :");
}//end mainn method 
}//end class 