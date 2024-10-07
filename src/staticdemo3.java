
public class staticdemo3
{
	int a =funa();
	static int b=funb();

	public static void main(String[] args) 
	{
		
		
		new staticdemo3();
		new staticdemo3();
		new staticdemo3();
		
	}
	int funa()
	{
		System.out.println("fun a");
		return 10;
	}
	static int funb()
	{
		System.out.println("fun b");
	     return 20;	
	}
	

}
