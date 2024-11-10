class L
{
	int i;
	L()
	{
		System.out.println("L()");
		i = 20;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		L obj1 = new L();
		System.out.println("---------");
		L obj2 = new L();
		System.out.println("---------");
		L obj3 = new L();
		System.out.println("---------");
		System.out.println(obj1.i + ", " + obj2.i + "," + obj3.i);
		System.out.println("main end");
	}
}
