class M
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 20;
		switch ( i )
		{
			case 1 : 
				System.out.println("from case1");
				System.out.println("from case1");
				break;
			case 5 : 
				System.out.println("from case5");
				System.out.println("from case5");
				break;
			default:
				System.out.println("from default");
				System.out.println("from default");
				System.out.println("from default");
				break;
			case 10 : 
				System.out.println("from case10");
				System.out.println("from case10");
			default:
				System.out.println("abcxyz");
		}		
		System.out.println("main end");
	}
}
