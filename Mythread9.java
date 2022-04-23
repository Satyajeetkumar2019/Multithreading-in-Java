class Mythread9  extends Thread{ 
int x;
Mythread9(int x){
this.x=x;
}//end constructor 
public void run(){
for(int i=0;i<=this.x;i++){
System.out.println(getName()+"Run :"+i);
}//end run method
}//end run method
}//end class
