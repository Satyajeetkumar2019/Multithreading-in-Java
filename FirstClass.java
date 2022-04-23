//First.java
class FirstClass {
synchronized void firstClassMethod(SecondClass sc){
String name=Thread.currentThread().getName();
System.out.println(name+" Firstclass method :");
try{Thread.sleep(1000);}catch(Exception e){e.printStackTrace();}
System.out.println(name+"try to call last method :");
sc.lastMethod();
}//end of the method
synchronized void lastMethod(){
System.out.println("inside FC lastMethod :");
}//end of the lastMethod
}//end of the class 