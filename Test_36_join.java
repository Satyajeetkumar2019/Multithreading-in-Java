//Application #36 join tast case method 
//Test_36_join
class Myjoin  extends Thread{
public void run(){
for(int i=0;i<10;i++){
System.out.println(getName()+":"+i);
if( i==5&&getName().equals("satya")){
try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
}
}
}//
}//end of the class
class Test_36_join {
public static void main(String []args)throws InterruptedException {
System.out.println("start main method :");

Myjoin mt=new Myjoin();
mt.setName("satya");
mt.start();
 Myjoin mt1=new Myjoin();
 mt1.setName("satya2");
 mt1.start();
 mt1.join();
 mt.join();
 System.out.println("end of the main method :");
}
}//end of the class