class MyRuneble implements Runnable {
public void run(){

System.out.println("run method ");
}//end run method 
public static void main(String[] args){
	System.out.println("main ");
MyRuneble obj=new MyRuneble();
//obj.start();

Thread th =new Thread(obj);
th.start();
System.out.println("main method ");

}





}//end class 