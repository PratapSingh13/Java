public class Animal 
{
	public void sound()
	{
		System.out.println("Animals are making Sound");
	}
	class Horse extends Animal
	{
		public void Sound()
		{
			System.out.println("Neigh");
		}
	}
	public static void main(String[] args) 
	{
		Animal obj = new Horse();
		obj.sound();
	}
}
