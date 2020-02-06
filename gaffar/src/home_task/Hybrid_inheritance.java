package home_task;
//class child3 extends child1
//{
//	System.out.println("Child3");
//}
//
//public class Hybrid_inheritance extends child3,child2{
//
//}
class ClassA 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
class ClassB extends ClassA 
{
    public void show()
    {
        System.out.println("show() method of ClassB");
    }
    public void dispB()
    {
        System.out.println("disp() method of ClassB");
    }
}
class ClassC extends ClassA
{
    public void show()
    {
        System.out.println("show() method of ClassC");
    }
    public void dispC()
    {
        System.out.println("disp() method of ClassC");
    }
}
class ClassD extends ClassB,ClassC
{
    void dispD()
    {
        System.out.println("disp() method of ClassD");
    }
    public static void main(String args[])
    {
          ClassD d = new ClassD();
          d.dispD();
          d.show();//Confusion happens here which show method to call
    }
}
