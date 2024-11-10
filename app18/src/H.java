class H
{
	static int i = test1();
	static int j = test2();

	static
	{
		System.out.println("from SIB " + i + ", " + j);  
		i += 1; // 27
		j += 2; //84
	}

	static int test1()
	{
		System.out.println("from test1 " + i + ", " + j);
		i += 3;
		j += 4;
		return i + j + 10;
	}

	static int test2()
	{
		System.out.println("from test2 " + i + ", " + j);
		i += j + 5; //26
		j += i + 6; //36
		return i + j + 20; //82
	}

	public static void main(String[] args) 
	{
		System.out.println("main:" + i + ", " + j);
	}
}
