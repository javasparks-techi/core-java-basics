class A
{
}
class B extends A
{
}
class C extends A
{
}

class I
{
	C test()
	{
		return null;
	}
}

class J extends I
{

	B test()
	{
		return null;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
