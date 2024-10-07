
public class methoddemo7 
{
	public static void main(String[]args)
	{
		System.out.println("main mthod of methoddemo7");
		methoddemo7 m1 =new methoddemo7();
		m1.funb();
	}
	void funa()
	{
		System.out.println("funa of methoddemo7");
	}
	void funb()
	{
		System.out.println("funb of methoddmo7");
		methoddemo7 m1 =new methoddemo7();
		m1.funa();
	}

}
