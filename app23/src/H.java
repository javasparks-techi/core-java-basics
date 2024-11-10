class H 
{
	static int p = 10;

	public static void main(String[] args) 
	{
		System.out.println("a:" + p);
		System.out.println("b:" + H.p);
		H obj = new H();
		System.out.println("c:" + obj.p);
	}
}
