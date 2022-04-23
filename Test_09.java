class Test_09 
{
	public static void main(String[] args) 
	{
		MYthreads123 th=new MYthreads123();
		th.start();
		for(int j=20;j>=1;j--){
		System.out.println(" main method "+j);
		}
		System.out.println("Hello World!");
	}
}
