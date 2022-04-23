class mythreadqr extends Thread {
public void run(){
for(int i=1;i<5;i++){
System.out.println(i+"run ");}
}//end run method
public static void main(String []args){
	mythreadqr th=new mythreadqr();
	//th.run();
	th.start();
	th.run();
for(int i=1;i<5;i++){
System.out.println(i+"main ");
}


}//end main method


}//end class