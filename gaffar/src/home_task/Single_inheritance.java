package home_task;

//single inheritance
class child1
{
	void child1Method()
	{
		System.out.println("Child1");
	}
}
public class Single_inheritance extends child1{
	void parent1()
	{
		System.out.println("Parent");
	}
	public static void main(String arg[])
	{
		Single_inheritance obj=new Single_inheritance();
		obj.parent1();
		obj.child1Method();
	}
}



