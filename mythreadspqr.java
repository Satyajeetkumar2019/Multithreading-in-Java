class mythreadspqr  extends Thread{ 
public void run(){
for(int i=1;i<5;i++){
System.out.println(getName()+"Run :"+i);
}
}
	public static void main(String[] args) {
mythreadspqr mt1=new mythreadspqr();
mt1.start();
mythreadspqr mt2=new mythreadspqr();
mt2.start();
mythreadspqr mt3=new mythreadspqr();
mt3.start();





	}//end main 
}//end class
