class Z50
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		int j = test1(++i)  +  i  +  test2(i++)  +  i  +  test3(i++)  +  i  +  test4(++i) +  i  + 
//results		   3           2       2            3       3            4         4         5
//i value		   2           2       3            3       4            4         5         5
				test1(i++)  +  i  +  test2(++i)  +   i   +   test3(++i)  +   i  +  test4(i++) +  i;
//results		   6           6       7             7       8               8         7         9
//i value		   6           6       7             7       8               8         9         9

		
		System.out.println("main end:" + i + "," + j);
	}
	public static int test1(int i)
	{
		return ++i;
	}
	public static int test2(int i)
	{
		return i++;
	}
	public static int test3(int i)
	{
		return i--;
	}
	public static int test4(int i)
	{
		return --i;
	}
}
