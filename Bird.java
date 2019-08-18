//Java Program to show MultiLevel Inheritance
class Animal
{
	void eat() 
	{
		System.out.println("Animals are eating");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dogs are Barking");
	}
}
class Bird extends Dog
{
	void fly() 
	{
		System.out.println("Birds are Flying");
	}

	public static void main(String[] args) 
	{
		Bird obj=new Bird();
		obj.eat();
		obj.sound();
		obj.fly();
	}
}
