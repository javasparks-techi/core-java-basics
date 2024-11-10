package pack2;
import pack1.A;
class F extends A
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		//System.out.println(a1.x);
		//System.out.println(a1.y);
		System.out.println(a1.z);
		F f1 = new F();
		//System.out.println(f1.x);
		System.out.println(f1.y);
		System.out.println(f1.z);
	}
}
