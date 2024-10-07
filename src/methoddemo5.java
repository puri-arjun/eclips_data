
public class methoddemo5 
{
	public static void main(String[]args)
	{
		System.out.println("main method of methoddemo5");
		methoddemo5 m1 =new methoddemo5();
		m1.funb();
	}
	static void funa()
	{
		System.out.println("funa o methoddemo5");
	}
	void funb()
	{
		System.out.println("fun b of methoddemo5");
		funa();
	}

}
