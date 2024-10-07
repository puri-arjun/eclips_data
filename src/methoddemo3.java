
public class methoddemo3 {
	
	public static void main(String[]args)
	{         // static method calls static method
		System.out.println("main method of methoddmo3");
		funb();
	}
	static void funa()
	{
		System.out.println("function a of methoddemo3");
	}
	static void funb()
	{
		System.out.println("function b of methoddemo3");
		funa();
	}
	

}
