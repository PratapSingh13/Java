//JAVA Program to demonstrate Overriding
public class Parent      //Base class
{
	void show()
	{
		System.out.println("Parent show()");
	}
	class Child extends Parent     //Inherited class
	{
		void show()
		{
			System.out.println("Child's show()");
		}
		class Main
		{
			public void main(String[] args)
			{
				Parent obj1 = new Parent();
				obj1.show();
				Parent obj2 = new Child();
				obj2.show();
			}
		}
	}

}
