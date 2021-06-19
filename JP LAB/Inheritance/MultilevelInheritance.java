 class Base  
{
	int a = 10;
}
class Child extends Base
{
	int b = 20;
	void sum()
	{
		System.out.println("Sum of a and b is : " +(a + b));
	}
}

class ChildChild extends Child
{
	int c = 5;
	void mul()
	{
		System.out.println("Multiplication of a and b and c is : " +(a * b * c));
	}
}
class MultilevelInheritance
{
public static void main(String[] args)
{
		ChildChild obj = new ChildChild();
		obj.mul();
		Child obj1 = new Child();
		obj.sum();
}
}
