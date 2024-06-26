package variableDemo;

public class demo 
{

	public static void main(String[] args) 
	{
		demo d1 =new demo();
		//d1.funA();
		//d1.funA(10);
		
	//Main method	
		short a = 10;
		d1.funA(a);
		
		int b=15;
		d1.funB(b);
		
		long c= 234567;
		d1.funC(c);
		
		float f2=(float)10.5649;
		d1.funD(f2);
		
		double e=12345678;
		d1.funE(e);
		
		char f= '&';
		d1.funF(f);
		
		boolean m= true;
		d1.funG(m);
		
	}
	
	void funA(short a)
	{
		System.out.println(a);
	}
	
	
	void funB(int i)
	{
		System.out.println(i);
		
	}
	
	void funC(long l)
	{
		System.out.println(l);
	}
	
	void funD(float f)
	{
		System.out.println(f);
	}
	
	void funE(double d)
	{
		System.out.println(d);
	}
	
	void funF(char c)
	{
		System.out.println(c);
	}
	
	
	void funG(boolean b)
	{
		System.out.println(b);
	}

}
