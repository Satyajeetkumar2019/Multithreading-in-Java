//Application #39 Another ecample of the synchonizen method 
class printNumbers {
synchronized void display(){
for(int i=0;i<=10;i++){
System.out.println(Thread.currentThread().getName()+"Run  "+i);

}//end of the for loop
}//end of the display method 
}//end of the clss 