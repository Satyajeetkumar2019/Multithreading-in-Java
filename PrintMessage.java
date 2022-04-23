//Application #40
class PrintMessage {
synchronized void printMsg(String msg){
	System.out.println("[ "+msg);
	try{Thread.sleep(1000);}catch(Exception e){e.printStackTrace();}
	System.out.println("]");
}//end of the method 
}//end of the class 