class Mythread1 implements Runnable { 

public void run(){
System.out.println("run method :");
}//end run method 
	public static void main(String[] args) {
	Mythread1 th =new Mythread1();
	//th.start();//compile time error 
Thread th1=new Thread(th);
th1.start();
		
		System.out.println("Hello World!");
	}
}
