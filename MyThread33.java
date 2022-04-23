//Application #33 working with sleep method
//Test_33_sleep
class MyThread33 extends Thread {
public void run(){
System.out.println("Run method :");
}//end of the run method 
}//end of the class 
class MyThread33 {
public static void main(String []args) throws InterruptedException {
System.out.println("main method :");
MyThread33 mt=new MyThread33();
mt.start();
Thread.sleep(5000);
System.out.println("end of the main method :");
}//end of main method 
}//end of the class 