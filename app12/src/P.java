class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(args.length < 1)
		{
			System.out.println("supply one command line arg");
			return;
		}
		int i = Integer.parseInt(args[0]);
		switch ( i )
		{
			case 1 : 
				System.out.println("from case1");
				System.out.println("from case1");
				System.out.println("from case1");
				System.out.println("from case1");
				break;
			case 5 : 
				System.out.println("from case5");
				System.out.println("from case5");
				break;
			default : 
				System.out.println("from default");
				System.out.println("from default");
				break;
		}		
		System.out.println("main end");
	}
}
