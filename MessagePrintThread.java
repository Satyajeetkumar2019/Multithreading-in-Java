//MessagePrintThread.java
class MessagePrintThread implements Runnable{
	String msg;
	PrintMessage pn;
	Thread th;
	public MessagePrintThread(PrintMessage pn ,String msg){
this.pn=pn;
this.msg=msg;
th=new Thread(this);
th.start();
}//end of the constructor 
public void run(){
pn.printMsg(msg);
}
}//end of the classs