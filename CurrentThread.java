//Application #27
//CurrentThread.java
class CurrentThread extends Thread {
static {
System.out.println("SB ");
Thread th=Thread.currentThread();
System.out.println("SB is excution   "+th.getName());
}//end of the static BL
public static void main(String []args ){
System.out.println("main method ");
Thread th=Thread.currentThread();
System.out.println("Origanal thread is state :");
System.out.println("current thread name  :"+th.getName());
System.out.println("Current thread priority :"+th.getPriority());
th.setPriority(7);
th.setName("Satyajeet ");
System.out.println("modifying name and priority ");
System.out.println("modifining name "+th.getName());
System.out.println("Modifing priority "+th.getPriority());

}


}//end class 