class Example extends Thread {
	public void run(){
	
	System.out.println("run method :");
	}
	public static void main(String[] args) {
	
Example ex=new Example();
ex.start();
System.out.println("main exceuted :");

		System.out.println("Hello World!");
	}//end mm
}//end class