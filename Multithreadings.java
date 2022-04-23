//Multiplethreade with diffrent logi
class Multithreadings {
public static void main(String[] args){
System.out.println("main start :");
SubtractionThread th=new SubtractionThread();
th.start();
AddThread th1=new AddThread();
th1.start();


System.out.println("main end ");

}





}