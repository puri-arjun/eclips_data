
public class methoddemo7a 
{
	public static void main(String[]args)
	{
		System.out.println("main method of methoddemo7a");
		methoddemo7a m1 =new methoddemo7a();
		m1.funb();
	}
	void funa()
	{
		System.out.println("funa of methoddemo7a");
		
	}
    void funb()
    {
    	System.out.println("funb of methoddemo7a");
    	funa();  // while calling nonstatic methods to non-static metods no need to create any object.
    	         //objct creation done by intrnally.
    }
	
}
