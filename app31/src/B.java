abstract class B
{
	abstract void test();
	abstract void test(int i);
	abstract void test(double j);
	void test(boolean b1)
	{
	}
	static void test(int i, int j)
	{
	}
	public int test(double i, double j)
	{
		return 10;
	}
	final void test(byte b1)
	{
	}
}
