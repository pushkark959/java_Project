package day11;
class ABC
{
	void m1(int a)  
	{
		System.out.println(a);
	}
	void m2(int b)  
	{
		System.out.println(b);
	}
}

class XYZ extends ABC
{
	void m1(int a) // overrided method
	{
		System.out.println(a*a);
	}
	void m2 (int a, int b)
	{
		System.out.println(a+b); // Overloaded Method
	}
}


public class OverridingvsOverloading {

	public static void main(String[] args) {
		XYZ xyz = new XYZ();
		
		xyz.m1(100);
		xyz.m2(10);
		xyz.m2(10, 20);

	}

}
