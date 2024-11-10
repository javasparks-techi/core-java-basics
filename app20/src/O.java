class O 
{
	int i;
	public static void main(String[] args) 
	{
		O ref1 = new O();
		ref1.i = 10;
		O ref2 = new O();
		ref2.i = 20;
		O ref3 = new O();
		ref3.i = 30;
		System.out.println(ref1.i); //10
		System.out.println(ref2.i); //20
		System.out.println(ref3.i); //30
		ref2.i = ref1.i + ref3.i; // 10 + 30 = 40
		System.out.println(ref1.i); //10
		System.out.println(ref2.i); //40
		System.out.println(ref3.i); //30
	}
}
