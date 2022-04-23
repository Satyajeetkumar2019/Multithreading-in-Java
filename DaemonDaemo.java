//Aplication #30
//TestDaemon.jaav
class DaemonDaemo implements Runnable {
Thread th;
DaemonDaemo(){
th=new Thread(this);
th.setDaemon(true);
th.start();
th.setDaemon(true);
}//end constructor
public void run(){
System.out.println("Run this daemon "+th.isDaemon());
for(int i=1;i<=100;i++){
System.out.println(i);
}//end of the for loop 

}//end of the run method 

}//end class