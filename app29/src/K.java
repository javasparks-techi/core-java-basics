abstract class A
{
	A()
	{
		System.out.println("A()");
	}
}

abstract class B extends A
{
	B()
	{
		System.out.println("B()");
	}
}
class K extends B
{
	K()
	{
		System.out.println("K()");
	}
	public static void main(String[] args) 
	{
		K obj = new K();
		System.out.println("done");
	}
}
