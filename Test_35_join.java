//Application #35
//Test_35_joine  
class Myjoin extends Thread {
public void run(){
System.out.println("run start :");
try{Thread.sleep(10000);}catch(InterruptedException e){e.printStackTrace();}
System.out.println("Run end :");
}//end of the run method 
}//end of the class
class Test_35_join{
public static  void main(String []args) throws InterruptedException {
	System.out.println("Start main method :");
	Myjoin mt=new Myjoin();
	mt.start();
mt.join();
mt.join(5000);
mt.join(15000);
mt.sleep(15000);
System.out.println("main end ");



}




}//end of the join class