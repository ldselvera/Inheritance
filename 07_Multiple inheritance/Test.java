interface X
{
   public void myMethod();
}
interface Y
{
   public void myMethod();
}
class Z implements X, Y
{
   public void myMethod()
   {
       System.out.println(" Multiple inheritance example using interfaces");
   }
}

public class Test{

	public static void main(String args[]){

		Z z=new Z();
		z.myMethod();
	}

}
