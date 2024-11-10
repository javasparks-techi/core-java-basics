class M 
{
	int i;
	public static void main(String[] args) 
	{
		M m1 = new M();
		M m2 = m1;
		System.out.println(m1.i); // 0
		System.out.println(m2.i); // 0
		m1.i = 10;
		System.out.println(m1.i); // 10
		System.out.println(m2.i); // 10
		m2.i = 20;
		System.out.println(m1.i); //20
		System.out.println(m2.i); //20
	}
}
