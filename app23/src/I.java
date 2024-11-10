class I 
{
	static int count;
	I()
	{
		count ++;
	}
	public static void main(String[] args) 
	{
		I obj1 = new I();
		System.out.println("a:" + count);
		I obj2 = new I();
		System.out.println("b:" + count);
		I obj3 = new I();
		System.out.println("c:" + count);
		I obj4 = new I();
		System.out.println("d:" + count);
	}
}
