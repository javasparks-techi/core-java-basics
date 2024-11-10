class B
{
	B(double i)
	{
		System.out.println("B(double)");
	}
	B(int i)
	{
		System.out.println("B(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B obj1 = new B(90);
		System.out.println("-----------");
		B obj2 = new B(190);
		System.out.println("-----------");
		B obj3 = new B(1.9);
		System.out.println("-----------");
		System.out.println("main end");
	}
}
