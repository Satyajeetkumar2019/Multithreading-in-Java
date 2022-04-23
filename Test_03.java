class Test_03 { 

	public static void main(String[] args) {
	Thread th1=new Thread();
	th1.start();
	//test case 01
	Mythreadss mt=new Mythreadss();
	mt.start();
//test case 02
Runnables th=new Runnables();
//th.start();
//test case 03
Thread th2=new Thread(mt);
th2.start();
//test case 04
Mythreadss mt2=new Mythreadss();
Thread th4=new Thread(mt2);
th4.start();
//test case 05
Thread th5=new Mythreadss();
th5.start();
//test case 06
//Thread th6=new Runnables();
//th6.start();
//test case 07
//Runnables rn=new Mythreadss();
//rn.start();
//testb case 08
//Thread th7=new Thread(rn);
//th7.start();
//test case 09
Mythreadss mt3=new Mythreadss();

Runnables th9=new Runnables();

//th9.start();
mt3.start();



		System.out.println("Hello World!");
	}//end mm
}//end class
