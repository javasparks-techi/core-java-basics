class A
{
	static int i = 20;
	static
	{
		System.out.println("A.SIB");
	}
}
class B extends A
{
	static
	{
		System.out.println("B.SIB");
	}
}
class M4 
{
	public static void main(String[] args) 
	{
		System.out.println(B.i);
	}
}
