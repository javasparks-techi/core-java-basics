class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(false)
		{
			System.out.println("if-body");
		}
		else
		{
			if(true)
			{
				System.out.println("else if body");
			}
			else
			{
				System.out.println("else else body");
			}	
		}
		System.out.println("main end");
	}
}
