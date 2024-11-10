class A
{
	private A()
	{
		System.out.println("A()");
	}
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class H extends A
{
	H()
	{
		//super(9);
		System.out.println("H()");
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
		System.out.println("done");
	}
}
