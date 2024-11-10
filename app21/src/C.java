class C
{
	int i;
	C()
	{
		System.out.println("C()");
		i = 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		C obj1 = new C();
		System.out.println("-------------");
		C obj2 = new C();
		System.out.println("-------------");
		C obj3 = new C();
		System.out.println("-------------");
		System.out.println(obj1.i + ", " + obj2.i + ", " + obj3.i);
		System.out.println("main end");
	}
}
