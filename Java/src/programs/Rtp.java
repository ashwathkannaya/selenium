package programs;

class Animal
{
	void noise()//Runtime polymorphisum
	{
		System.out.println("some noise");
	}
}

class Cat extends Animal
{
	void noise()
	{
		System.out.println("meow meow");
	}
}

class Dog extends Animal
{
	void noise()
	{
		System.out.println("bow bow");
	}
}


class Snake extends Animal
{
	void noise()
	{
		System.out.println("bush bush");
	}
}

class Stimulator
{
	static void ansim(Animal a1)
	{
		a1.noise();
	}
}


public class Rtp 
{

	public static void main(String[] args)
	   {
		Cat c=new Cat();
		Dog d=new Dog();
		Snake s=new Snake();
		
		Stimulator.ansim(c);
		Stimulator.ansim(d);
		Stimulator.ansim(s);

	}

}
