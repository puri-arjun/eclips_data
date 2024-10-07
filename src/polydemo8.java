
public class polydemo8 
{

	public static void main(String[] args) 
	{
		
		polydemo8 p1=new polydemo8();
	//	int i=20;
	//	long l=long(i);
		p1.funA(10,20l);
		p1.funA(100l,200);
		
		
		
	}
	void funA(int a, long b)
	{
		System.out.println("int long args of polydemo8");
	}
	void funA(long a, int b)
	{
		System.out.println("long int args of polydemo8");
	}

}
