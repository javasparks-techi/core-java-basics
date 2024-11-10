class L
{
	L()
	{
		this(90);
		System.out.println("L()");
	}
	L(int i)
	{
		this();
		System.out.println("L()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
