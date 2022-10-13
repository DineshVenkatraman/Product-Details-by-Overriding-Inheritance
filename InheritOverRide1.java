class A
{
    void display()
    {
        System.out.println("A is display");
    }
}
class B extends A
{
    void display()
    {
        System.out.println("b is display-method overriding");
    }
}



public class InheritOverRide1 {
    public static void main(String args[])
    {
        A a=new B();
        a.display();
       // A c=new A();
       // c.display();
    }
}
