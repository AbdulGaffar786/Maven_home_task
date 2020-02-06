package home_task;

//over riding class
class Task1 
{
	void demo()
	{
		System.out.println("Over riding the demo method of Task class by demo method Task1 class");
	}
}
//main class
public class Task extends Task1{
//over loading method	
	void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("the sum is :"+c);
	}
	
	void sum()
	{
		System.out.println("the sum is over loaded with HELLO WORLD");
	}
//	over riding method
	void demo()
	{
		System.out.println("demo method of Task class");
	}
	public static void main(String arg[])
	{
//		Over loading
		Task obj=new Task();
		System.out.println("----------------Over loading-------------");
		obj.sum(10,20);
		obj.sum();
//		Over riding
		System.out.println();
		System.out.println("----------------Over riding-------------");
		obj.demo();
		Task1 obj1=new Task1();
		obj1.demo();
//		Encapsulation(public,private,protected,default)
		Encap obj2=new Encap();
		System.out.println();
		System.out.println("----------------Encapsulation-------------");
		obj2.encap(502,"Home task");
	}
}
//Encapsulation class 
class Encap
{
	private int rollno;
	protected String s;
	
	public void encap(int roll,String s1)
	{
		this.rollno=roll;
		this.s=s1;
		System.out.println(rollno+" "+s);
	}
}


