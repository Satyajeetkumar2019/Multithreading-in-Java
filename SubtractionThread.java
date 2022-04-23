//SubtractionThread.java
class SubtractionThread  extends Thread{
int sub=0;
public void run(){
for(int i=50;i>=1;i--){
	sub-=i;
System.out.println("The subtraction "+sub);
}
}
}//end class