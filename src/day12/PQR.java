package day12;

public class PQR extends MNO implements ABC, XYZ {
	public void m2()
	{
		System.out.println("This is m2 from XYZ");
		System.out.println(y);
	}
	public void m1()
	{
		System.out.println("This is M1 from ABC");
		System.out.println(x);
	}
	

	public static void main(String[] args){
			PQR obj = new PQR();
			obj.m1();
			obj.m2();
			obj.m3();
			
			
	

	}

}
