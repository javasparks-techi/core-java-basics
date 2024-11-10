class N 
{
	int i;
	public static void main(String[] args) 
	{
		N n1 = new N();
		N n2 = n1;
		N n3 = n2;
		N n4 = n1;
		N n5 = n3;
		n4.i = 20;
		System.out.println(n1.i); //20
		System.out.println(n2.i); //20
		System.out.println(n3.i); //20
		System.out.println(n4.i); //20
		System.out.println(n5.i); //20
		n2.i += 20;
		System.out.println(n1.i); // 40
		System.out.println(n2.i); // 40
		System.out.println(n3.i); // 40
		System.out.println(n4.i); // 40
		System.out.println(n5.i); // 40
	}
}
