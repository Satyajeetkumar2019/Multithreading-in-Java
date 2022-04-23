class Test_13 { 

	public static void main(String[] args) {
	mythread13 mt1=new mythread13();
    mythread13 mt2=new mythread13();
mt1.setPriority(6);
mt2.setPriority(10);
mt1.start();
mt2.start();
System.out.println("end of the main method :");




		//System.out.println("Hello World!");
	}//end  of the main method 
}//end of the class

class mythread13 extends Thread{
public void run(){
System.out.println("Run method  executed    "+getName());
}//end of the run method 
}//end of the class