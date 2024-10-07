
public class parametermethoddemo2 
{
	public static void main(String[]args)
	{
		parametermethoddemo2 p1 =new parametermethoddemo2();
		p1.fun1();
		p1.funA(10, 20);
		p1.funB(10,5.0f);
		p1.funC(20.0f, 5);
		p1.funD('a',true);
		p1.funE(100.00, 'b');
		p1.funF(false, 20);
	}
	void fun1()
	{
		System.out.println("fun1 of parametermethoddemo1");
	}
	void funA(int a, int b)
	{
		System.out.println("funA of parametermethoddemo1");
		
	}
	void funB(int a, float b)
	{
		System.out.println("funB of parametermethoddemo1");
		
	}
	void funC(float a, int b)
	{
		System.out.println("funC of parametermethoddemo1");
		
	}
	void funD(char a, boolean b)
	{
		System.out.println("funD of parametermethoddemo1");
		
	}
	void funE(double a, char b)
	{
		System.out.println("funE of parametermethoddemo1");
		
	}
	void funF(boolean a, int b)
	{
		System.out.println("funF of parametermethoddemo1");
		
	}

}
