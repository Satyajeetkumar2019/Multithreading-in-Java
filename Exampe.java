class Exampe extends Thread {
public static void main(String []args)throws InterruptedException{
Mythread mt=new Mythread();
System.out.println("main start :");
System.out.println(mt.isAlive());
mt.start();
System.out.println(" call start"+mt.isAlive());
System.out.println(" mt call "+mt.isAlive());
Thread.sleep(500);
System.out.println(" sleep call "+mt.isAlive());
//Thread.Sleep(600);
System.out.println("completed :"+mt.isAlive());


}//end of the class
}//end of the class
class Mythread  extends Thread { 
public void run(){
System.out.println("run method  Starte :");
System.out.println("run method Start "+this.isAlive());
try{
	Thread.sleep(500);
}catch (InterruptedException e){}
System.out.println("end of run method :");
}//end run method 
}//end of the  class 