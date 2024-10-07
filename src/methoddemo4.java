
public class methoddemo4 
{
	public static void main(String[]args)
	{
		System.out.println("main method of methoddemo4");
		func();
	}
	static void funa()
	{
		System.out.println("funa of methoddemo4");
		func();     //getting stack over flow error//
	}
	static void funb()
	{
		System.out.println("funb of methoddemo4");
		funa();
	}
	static void func()
	{
		System.out.println("func of methoddmo4");
		funb();
	}
	
}
	


