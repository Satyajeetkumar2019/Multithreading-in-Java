//Application #26
//ThreadName.java
class MythreadName extends Thread {
MythreadName(){
super();
}
MythreadName(String name){
super(name);
}//end of the constructor 
public void run(){
	for(int i=0;i<=10;i++){
System.out.println(getName()+     "getName()    "+i);
}//end of the for loop
}//end of the run method 
}//end of the class
class A{
public static void main(String []args){
	System.out.println("start in main method :");
MythreadName mt1=new MythreadName();
MythreadName mt2=new MythreadName("satya");
System.out.println(" mt1 intial name and priority "+mt1.getName());
System.out.println("mt1 priority "+mt1.getPriority());
System.out.println();
System.out.println(" mt2 intial name and priority "+mt2.getName());
System.out.println("mt2 priority "+mt2.getPriority());
System.out.println();
//set priority and setnae below
mt1.setName("viswajeet");
mt1.setPriority(7);
mt2.setPriority(9);
System.out.println(" mt1 set name  "+mt1.getName());
System.out.println("mt1 set priority "+mt1.getPriority());
System.out.println();
System.out.println(" mt2 set name  "+mt2.getName());
System.out.println("mt2  priority "+mt2.getPriority());
System.out.println();
mt1.start();
mt2.start();
for(int i=0;i<=10;i++){
System.out.println("main i :"+i);
}
//System.out.println("mt2 intial name and prioority   "+mt2.getName());
System.out.println("end of the main method ");
}//end of the main method
}//end class 