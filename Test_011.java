class Test_011 
{
	public static void main(String[] args) 
	{

		Mythread9 th=new Mythread9(10);
		th.start();

	Mythread9 th2=new Mythread9(20);
		th2.start();
	Mythread9 th3=new Mythread9(30);
		th3.start();




		//System.out.println("Hello World!");
	}
}
