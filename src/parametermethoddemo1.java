
public class parametermethoddemo1 {

	public static void main(String[] args) 
	{
		parametermethoddemo1 p1 =new parametermethoddemo1();
		p1.fun1();
		p1.funA(10);
		p1.funB(15.0f);
		p1.funC('a');
		p1.funD(20.00);
		p1.funE(false);
		

	}
	void fun1()
	{
		System.out.println("fun1 of parametermethoddemo1");
	}
	void funA(int a)
	{
		System.out.println("funA of parametermethoddemo1");
		System.out.println(a);
	}
	void funB(float a)
	{
		System.out.println("funB of parametermethoddemo1");
		System.out.println(a);
	}
	void funC(char a)
	{
		System.out.println("funC of parametermethoddemo1");
		System.out.println(a);
	}
	void funD(double a)
	{
		System.out.println("funD of parametermethoddemo1");
		System.out.println(a);
	}
	void funE(boolean a)
	{
		System.out.println("funE of parametermethoddemo1");
		System.out.println(a);
	}

}
