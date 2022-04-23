//some example 
class Myexample   extends Thread{
public static void main(String [] args){
Myexample  th=new Myexample ();
th.setDaemon(true);
th.start();
//th.setDaemon(true);//run time error

}//end main method 
}//end of the class