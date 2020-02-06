package home_task;

//Multi-level inheritance
class child2 extends child1
{
	void child2Method()
	{
		System.out.println("child2");
	}
}
public class Multi_level_inheritance extends child2{
	void parent()
	{
		System.out.println("Parent");
	}
	public static void main(String arg[])
	{
		Multi_level_inheritance obj=new Multi_level_inheritance();
		obj.parent();
		obj.child1Method();
		obj.child2Method();
	}

}
