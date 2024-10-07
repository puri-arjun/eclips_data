
public class methoddemo2 {
	
	public static void main(String[]args)
	{
		System.out.println("main method of methoddemo2");
		funC();  // only static methods should call without any object.
	//	funA(); // non-static methods we can't access with out object.
	//	funB();
	}
	void funA()
	{
		System.out.println("fun a of methoddemo2");
	}
	void funB()
	{
		System.out.println("fun b of methoddemo2");
	}
	static void funC()
	{
		System.out.println("fun C of methoddemo2");
	}

}
