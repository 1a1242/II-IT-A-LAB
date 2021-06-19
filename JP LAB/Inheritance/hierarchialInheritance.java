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
	void sub()
	{
		System.out.println("Subtraction of c from b and a is : " +(a + b - c));
	}
}
class hierarchialInheritance
{
public static void main(String[] args)
{
		Child obj = new Child();
		obj.sum();
		ChildChild obj1 = new ChildChild();
		obj1.sub();
}
}