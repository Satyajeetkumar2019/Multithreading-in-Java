class mythreadq { 
public void run(){
for(int i=1;i<5;i++){
System.out.println("Run :"+i);
}//end for loop
}//end run method 
	public static void main(String[] args) {
	Thread th=new Thread();
	th.start();
	System.out.println("main thread :");
	}//end main method
}//end class
