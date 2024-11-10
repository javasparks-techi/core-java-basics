class E 
{
	static byte test()
	{
		return 100;
	}
	public static void main(String[] args) 
	{
		int i = test();
		float j = (float) test();
		double k = test();
		System.out.println("done");
	}
}
