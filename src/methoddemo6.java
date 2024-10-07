
public class methoddemo6 
{
public static void main(String[]args)
{
	System.out.println("main method of methoddemo6");
	funb();
}
	void funa()
	{
		System.out.println("funa of methoddmo6");
	}
	static void funb()
	{
		System.out.println("funb of methoddmo6");
		methoddemo6 m1 =new methoddemo6();
		m1.funa();
	}
}
