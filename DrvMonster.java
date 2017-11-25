/*The following code tests the interface extension feature of Java.*/

interface Bird
{
	void tweet();
	void fly();
}

interface Cat
{
	void meow();
	void sleep();
}

interface Dog
{
	void bark();
	void wagTail();
}

interface Abomination extends Bird, Cat, Dog
{
	void roar();	
}

class Animal 
{
	int numoflegs;
	
	public Animal(int numoflegs)
	{
		this.numoflegs = numoflegs;
	}
	
	void run()
	{
		System.out.println("Running with " + numoflegs + " legs!!!");
	}
}

class Monster extends Animal implements Abomination
{
	int numoflegs;
	
	public Monster(int numoflegs)
	{
		super(numoflegs);
	}
	
	public void tweet()
	{
		System.out.println("Tweet Tweet!!!");
	}
	
	public void fly()
	{
		System.out.println("Flying!!!");
	}
	
	public void meow()
	{
		System.out.println("Meow!!!");
	}
	
	public void sleep()
	{
		System.out.println("Zzz...");
	}
	
	public void bark()
	{
		System.out.println("Woof Woof!!!");
	}
	
	public void wagTail()
	{
		System.out.println("Wagging tail!!!");
	}
	
	public void roar()
	{
		System.out.println("Rawrrrr!!!");
	}
	
	void methodBird(Bird bird)
	{
		bird.tweet();
		bird.fly();
	}
	
	void methodCat(Cat cat)
	{
		cat.meow();
		cat.sleep();
	}
	
	void methodDog(Dog dog)
	{
		dog.bark();
		dog.wagTail();
	}
	
	void methodAbomination(Abomination abomination)
	{
		abomination.roar();
	}
}

class DrvMonster
{
	public static void main(String args[])
	{
		Monster monster = new Monster(12);
		monster.methodBird(monster);
		monster.methodCat(monster);
		monster.methodDog(monster);
		monster.methodAbomination(monster);
		monster.run();
	}
}
