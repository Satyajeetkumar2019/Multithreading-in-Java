//DeadLockDemo.java
class DeadLocKDemo implements Runnable{
FirstClass fr=new FirstClass();
SecondClass sc=new SecondClass();
  DeadLocKDemo(){
Thread th=new Thread(this,"Reaching thread :");
th.start();
fr. firstClassMethod(sc);
System.out.println("Back in main method :");
}//end of the constructor 

public void run(){
sc.secondClassMethod(fr);
System.out.println("Back Other thread :");
}//end of the run method 
}//end of the classs
