class MyExample4 extends Thread {
public void run(){
System.out.println("Mythread2  priority :"+this.getPriority());
System.out.println("Mythres2 daemon :"+this.isDaemon());
Myexample3 mt1=new Myexample3();
mt1.start();
}//end of the run method
}//end of the class 2
