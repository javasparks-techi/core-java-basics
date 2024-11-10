class I 
{
	static int test()
	{
		return 100;
	}
	public static void main(String[] args) 
	{
		byte b1 = (byte) test();
		short i = (short) test();
		System.out.println("done");
	}
}
