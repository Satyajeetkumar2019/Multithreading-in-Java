//Mythread.java
class Mythreadx extends Thread {

public void run(){
System.out.println("start run method :");
System.out.println(""+this.getState());
try{
Thread.sleep(500);
}catch(InterruptedException e){e.printStackTrace();}
System.out.println("end run method :");
}//end run method 

}//end of class for mythread


class Test_012 {
public static void main(String []args )throws InterruptedException{
Mythreadx mt=new Mythreadx();
System.out.println("From main method mt state after obj creation :"+mt.getState());
mt.start();
System.out.println("From main method mt call "+mt.getState());
Thread.sleep(500);
System.out.println("Fromr main method mt after sleep call "+mt.getState());
//Thread.Sleep(600);
System.out.println("From main method mt completed :"+mt.getState());

}//end main method 
}//end class 