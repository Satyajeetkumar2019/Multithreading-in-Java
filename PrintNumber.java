//PrintNumber.java
class PrintNumber {
public void printNum(){
for(int i=0;i<=50;i++){
	System.out.print(i+"|t");
try{
	Thread.sleep(400);
}catch (InterruptedException  e){
	e.printStackTrace();
}
}//end for loop
}
//Task 2
public void printNum2(){
for(int i=50;i>=1;i--){
	System.out.print(i+"|t");
try
{Thread.sleep(100);
}catch (InterruptedException  e){
	e.printStackTrace();
}//end catch block
}//end loop
}//end method

public static void main(String []args){
PrintNumber th=new PrintNumber();
//th.printNumber();
th.printNum();
System.out.println("middle way of the main method ");
th.printNum2();


}

}//end class