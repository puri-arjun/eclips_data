
public class methoddemo2a 
{

	public static void main(String[]args)
	{
		System.out.println("main method of methoddemo2a");
		func();
		methoddemo2a a1=new methoddemo2a();
		a1.funa();
		a1.funb();
	}
	void funa()
	{
		System.out.println("function a of methoddemo2a");
	}
	void funb()
	{
		System.out.println("function b of methoddemo2a");
	}
	static void func()
	{
		System.out.println("function c of methoddemo2a");
	}
}
