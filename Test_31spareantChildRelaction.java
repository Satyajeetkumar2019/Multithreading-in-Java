class Test_31spareantChildRelaction extends Thread{
public static void main(String []args) throws  InterruptedException{
System.out.println("main start :");
Thread th=Thread.currentThread();
System.out.println(" main thread   priority :"+th.getPriority());
System.out.println("main thread daemon :"+th.isDaemon());
MyExample4 mt2=new MyExample4();
mt2.start();
System.out.println(" mythrads thread    priority :"+mt2.getPriority());
System.out.println("my thread  thread daemon :"+mt2.isDaemon());
mt2.setPriority(7);
mt2.setDaemon(true);
mt2.start();
try{
mt2.sleep(3000);
}catch( InterruptedException e){e.printStackTrace();}
System.out.println("main end :");
}//end mainn method 
}//end class 