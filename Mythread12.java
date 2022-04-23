class Mythread12 extends Thread{ 
int x;
public void setX(int x){
this.x=x;
}
public void run(){
for(int i=0;i<=this.x;i++){
System.out.println(getName()+"run method :"+i);

}//end for loop
}//end run method 
}//end class
