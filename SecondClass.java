//SecondClass.java
class SecondClass {
synchronized void secondClassMethod(FirstClass  fr){
String name=Thread.currentThread().getName();
System.out.println(name+" Firstclass method :");
try{Thread.sleep(1000);}catch(Exception e){e.printStackTrace();}
System.out.println(name+"try to call last method :");
fr.lastMethod();
}//end of the method
synchronized void lastMethod(){
System.out.println("inside SC  lastMethod :");

}//end of the lastMethod
}//end of the second method 