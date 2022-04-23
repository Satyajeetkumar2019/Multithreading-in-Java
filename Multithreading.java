class Multithreading { 

	public static void main(String[] args) {
	Mythread12 th=new Mythread12();

th.setX(10);
th.start();

Mythread12 th1=new Mythread12();
th1.start();
for(int i=0;i<20;i++){
System.out.println("main "+i);

}

		//System.out.println("Hello World!");
	}//end main class
}//end class
