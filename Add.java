//Application #37 object locking below application show develope aynchronize by using cynchronized method 
//add.java
class Add {
private  static int x,y;
 synchronized void add(int x,int y){
this.x=x;
this.y=y;
try{Thread.sleep(200);}catch(InterruptedException e){e.printStackTrace();}
int result=this.x+this.y;
System.out.println(Thread.currentThread().getName()+"Result of the add method :"+result);
}//end of the add method
}//end of the class add